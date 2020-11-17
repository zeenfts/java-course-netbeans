package View;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DisplayQueryResults extends JFrame {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData rsMetaData;
    private JTable table;
    private JTextArea inputQuery;
    private JButton submitQuery;

    public DisplayQueryResults() {
        super("Enter Query. Click submit ti see result.");
        String url = "jdbc:odbc:Books";
        String username = "anonymous";
        String password = "guest";
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            connection = DriverManager.getConnection(url, username, password);
        }
        catch (ClassNotFoundException cnfex) {
            System.err.println("Failed to load JDBC/ODBC driver.");
            cnfex.printStackTrace();
            System.exit(1);
        }
        catch (SQLException sqlex) {
            System.err.println("Unable to connect");
            sqlex.printStackTrace();
            System.exit(1);
        }
        inputQuery = new JTextArea("SELECT * FROM Authors", 4, 30);
        submitQuery = new JButton("Submit query");
        submitQuery.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitQuery) {
                    getTable();
                }
            }
        });
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.add(new JScrollPane(inputQuery), BorderLayout.CENTER);
        topPanel.add(submitQuery, BorderLayout.SOUTH);
        table = new JTable(4, 4);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(topPanel, BorderLayout.NORTH);
        c.add(table, BorderLayout.CENTER);
        getTable();
        setSize(450, 150);
        setVisible(true);
    }

    private void getTable() {
        try {
            String query = inputQuery.getText();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            displayResultSet(resultSet);
        }
        catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    private void displayResultSet(ResultSet rs) throws SQLException {
        boolean moreRecords = rs.next();
        if (!moreRecords) {
            JOptionPane.showMessageDialog(this, "ResultSet contained no records");
            setTitle("No records to display");
            return;
        }
        Vector columnHeads = new Vector();
        Vector rows = new Vector();
        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
                columnHeads.addElement(rsmd.getColumnName(i));
            }
            do {
                rows.addElement(getNextRow(rs, rsmd));
            } while (rs.next());
            table = new JTable(rows, columnHeads);
            JScrollPane scroller = new JScrollPane(table);
            Container c = getContentPane();
            c.remove(1);
            c.add(scroller, BorderLayout.CENTER);
            c.validate();
        }
        catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    private Vector getNextRow(ResultSet rs, ResultSetMetaData rsmd) throws SQLException {
        Vector currentRow = new Vector();
        for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
            switch (rsmd.getColumnType(i)) {
                case Types.VARCHAR:
                    currentRow.addElement(rs.getString(i));
                    break;
                case Types.INTEGER:
                    currentRow.addElement(new Long(rs.getLong(i)));
                    break;
                default:
                    System.out.println("Type was: " + rsmd.getColumnTypeName(i));
            }
        }
        return currentRow;
    }

    public void shutDown() {
        try {
            connection.close();
        }
        catch (SQLException sqlex) {
            System.err.println("Unable to disconnect");
            sqlex.printStackTrace();
        }
    }
    
    public static void main(String args[]) throws SQLException {
        final TableDisplay app = new TableDisplay();
        app.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                app.shutDown();
                System.exit(0);
            }
        });
    }
}
