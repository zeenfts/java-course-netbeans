package View;
import Controller.InternalFrameHandler;
import Controller.MainFrameHandler;
import com.jgoodies.looks.common.PopupMenuLayout;
import com.seaglasslookandfeel.icons.FloppyDiskIcon;
import com.seaglasslookandfeel.icons.FolderIcon;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.ParseException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class MainAppTubes extends JFrame {
    private static MainAppTubes mats;
    private MainFrameHandler thn;
    public JDesktopPane desktopTubes;
    public JPanel mainPanel, bottomPanel, leftPanel, rightPanel;
    private JLabel borderTb[];
    public JLabel lUserN, timeShow, mouseCordinate, wordsCount;
    public JMenuBar menuBar;
    public JMenu mnFile, mnEdit, mnHelp;
    public JMenuItem miNew, miOpen, miSave, miExit;
    public JMenuItem miCut, miCopy, miPaste;
    public JMenuItem miContact, miAbout;
    public JMenuItem puQuit;
    public JToolBar toolBar;
    public JButton bNew, bSave, bOpen, bLogin, bLogout, bInsert, hurufLeft, hurufCenter, hurufRight;
    public JComboBox fontName, fontSize, fontColor, textAreaColor;
    private String[] FONTS_NAME = 
        {"Times New Roman", "Algerian", "Arial", "Calibri","Vivaldi" ,"Magneto", 
            "Blackadder ITC", "Brush Script MT", "CASTELLAR"},
            FONTS_SIZE = {"8", "9", "10", "11", "12", "14", "16", "18", "20",
                        "22", "24", "26", "28", "36", "48", "72"};
    public String[] COLOR_NAMES = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green",
                "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    public Color[] TEXT_COLOR = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
        Color.GRAY, Color.GREEN,Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, 
        Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    public JCheckBox hurufBold, hurufItalic, hurufUnderline;
    public JList wordsGenerate;
    private final Object wordList[] = {"saya", "kamu", "aku", "kalian", "kami", 
                    "kita", "mereka", "ingin", "suka", "sedang", "mau", "akan", 
                    "pergi", "datang", "pulang", "tidur"};
    public JTextField userNameField, findField;
    public JPasswordField passwordField;
    public JRadioButton seePass;
    public JPopupMenu klikKanan;
    
    private MainAppTubes() {
        thn = new MainFrameHandler(this);
        settingFrame();
        createObjek();
        insertToFrame();
        setFunc();
        addActionHandler();
    }

    private void settingFrame(){
        setTitle("Open Word 2019");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(640, 680);
    }
    
    private void createObjek(){
        desktopTubes = new JDesktopPane();
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.GRAY);
        bottomPanel = new JPanel(new GridLayout(1, 7));
        bottomPanel.setBackground(Color.DARK_GRAY);
        rightPanel = new JPanel(new GridLayout(15, 3));
        rightPanel.setBackground(Color.DARK_GRAY);
        leftPanel = new JPanel(new GridLayout(10, 1));
        leftPanel.setBackground(Color.DARK_GRAY);
        
        menuBar = new JMenuBar();
        mnFile = new JMenu("File");
        mnFile.setMnemonic('F');
        miNew = new JMenuItem("New", 'N');
        miOpen = new JMenuItem("Open", 'O');
        miSave = new JMenuItem("Save", 'v');
        miExit = new JMenuItem("Exit", 'X');
        mnEdit = new JMenu("Edit");
        mnEdit.setMnemonic('E');
        miCut = new JMenuItem("Cut", 't');
        miCopy = new JMenuItem("Copy", 'y');
        miPaste = new JMenuItem("Paste", 'P');
        mnHelp = new JMenu("Help");
        mnHelp.setMnemonic('H');
        miContact = new JMenuItem("Contact", 'o');
        miAbout = new JMenuItem("About", 'b');
        lUserN = new JLabel("Hi, username");
        bLogout =  new JButton("[-->");
        bLogout.setBackground(Color.RED);
        bLogout.setToolTipText("Logout");
        
        borderTb = new JLabel[3];
        borderTb[0] = new JLabel(" | ");
        borderTb[0].setFont(new Font("Algerian", Font.BOLD, 16){});
        borderTb[1] = new JLabel(" | ");
        borderTb[1].setFont(new Font("Algerian", Font.BOLD, 16){});
        borderTb[2] = new JLabel(" | ");
        borderTb[2].setFont(new Font("Algerian", Font.BOLD, 16){});
        toolBar = new JToolBar();
        bNew = new JButton(new FileIcon16());
        bNew.setToolTipText("New");
        bOpen = new JButton(new FolderIcon());
        bOpen.setToolTipText("Open");
        bSave = new JButton(new FloppyDiskIcon());
        bSave.setToolTipText("Save");
        for (String fN : FONTS_NAME) {
            fontName = new JComboBox(FONTS_NAME);
        }
        fontName.setPreferredSize(new Dimension(30, 25));
        fontName.setEditable(true);
        for(String fS : FONTS_SIZE){
            fontSize = new JComboBox(FONTS_SIZE);
        }
        fontSize.setSelectedIndex(7);
        fontSize.setPreferredSize(new Dimension(1, 1));
        fontSize.setEditable(true);
        for(String cN : COLOR_NAMES){
            fontColor = new JComboBox(COLOR_NAMES);
            textAreaColor = new JComboBox(COLOR_NAMES);
        }
        fontColor.setPreferredSize(new Dimension(15, 15));
        textAreaColor.setPreferredSize(new Dimension(15, 15));
        hurufBold = new JCheckBox("B");
        hurufBold.setFont(new Font("Times New Roman", Font.BOLD, 12){});
        hurufItalic = new JCheckBox("I");
        hurufItalic.setFont(new Font("Times New Roman", Font.ITALIC, 12){});
        hurufUnderline = new JCheckBox("U");
        hurufUnderline.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 12){});
        hurufLeft = new JButton("L");
        hurufCenter = new JButton("C");
        hurufRight = new JButton("R");
        
        userNameField = new JTextField("Username", 7);
        passwordField = new JPasswordField("Password", 9);
        passwordField.setEchoChar('*');
        seePass = new JRadioButton("See Password");
        seePass.setForeground(Color.WHITE);
        bLogin = new JButton("Start");
        bLogin.setBackground(Color.GREEN);
        wordsGenerate = new JList(wordList);
        wordsGenerate.setSelectionMode(MULTIPLE_INTERVAL_SELECTION);
        wordsGenerate.setSelectionBackground(Color.LIGHT_GRAY);
        bInsert = new JButton("Insert Word");
        
        puQuit = new JMenuItem("Quit..");
        klikKanan = new JPopupMenu();
        timeShow = new JLabel();
        timeShow.setForeground(Color.LIGHT_GRAY);
        mouseCordinate = new JLabel();
        mouseCordinate.setForeground(Color.LIGHT_GRAY);
        wordsCount = new JLabel();
        wordsCount.setForeground(Color.LIGHT_GRAY);
        
        new Thread(thn).start();
   }
    
    private void insertToFrame(){
        mnFile.add(miNew);
        mnFile.add(miOpen);
        mnFile.add(miSave);
        mnFile.add(miExit);
        
        mnEdit.add(miCut);
        mnEdit.add(miCopy);
        mnEdit.add(miPaste);
        
        mnHelp.add(miContact);
        mnHelp.add(miAbout);
        
        menuBar.add(mnFile);
        menuBar.add(mnEdit);
        menuBar.add(mnHelp);
        menuBar.add(Box.createGlue());
        menuBar.add(lUserN);
        menuBar.add(bLogout);
        setJMenuBar(menuBar);
        
        toolBar.add(bNew);
        toolBar.add(bOpen);
        toolBar.add(bSave);
        toolBar.add(borderTb[0]);
        toolBar.add(fontName);
        toolBar.add(borderTb[1]);
        toolBar.add(hurufBold);
        toolBar.add(hurufItalic);
        toolBar.add(hurufUnderline);
        toolBar.add(borderTb[2]);
        toolBar.add(fontColor);
        toolBar.add(textAreaColor);
        toolBar.add(fontSize);
        toolBar.add(hurufLeft);
        toolBar.add(hurufCenter);
        toolBar.add(hurufRight);
        
        klikKanan.add(puQuit);
        rightPanel.add(userNameField);
        rightPanel.add(passwordField);
        rightPanel.add(seePass);
        rightPanel.add(bLogin);
        leftPanel.add(new JScrollPane(wordsGenerate));
        leftPanel.add(bInsert);
        bottomPanel.add(timeShow);
        bottomPanel.add(Box.createGlue());
        bottomPanel.add(Box.createGlue());
//        bottomPanel.add(wordsCount);
        bottomPanel.add(Box.createGlue());
        bottomPanel.add(mouseCordinate);
        add(toolBar, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);
        add(desktopTubes, BorderLayout.CENTER);
    }
    
    private void setFunc(){
        mnFile.setEnabled(false);
        mnEdit.setEnabled(false);
        mnHelp.setEnabled(false);
        toolBar.setEnabled(false);
        bNew.setEnabled(false);
        bOpen.setEnabled(false);
        bSave.setEnabled(false);
        fontName.setEnabled(false);
        fontSize.setEnabled(false);
        hurufBold.setEnabled(false);
        hurufItalic.setEnabled(false);
        hurufUnderline.setEnabled(false);
        fontColor.setEnabled(false);
        textAreaColor.setEnabled(false);
        wordsGenerate.setEnabled(false);
        bInsert.setEnabled(false);
        bLogout.setEnabled(false);
        hurufLeft.setEnabled(false);
        hurufCenter.setEnabled(false);
        hurufRight.setEnabled(false);
    }
    
    private void addActionHandler(){
        miNew.addActionListener(thn);
        miOpen.addActionListener(thn);
        miSave.addActionListener(thn);
        miExit.addActionListener(thn);
        miCut.addActionListener(thn);
        miCopy.addActionListener(thn);
        miPaste.addActionListener(thn);
        miContact.addActionListener(thn);
        miAbout.addActionListener(thn);
        bLogout.addActionListener(thn);
        bNew.addActionListener(thn);
        bOpen.addActionListener(thn);
        bSave.addActionListener(thn);
        fontName.addActionListener(thn);
        fontSize.addActionListener(thn);
        hurufBold.addItemListener(thn);
        hurufItalic.addItemListener(thn);
        hurufUnderline.addItemListener(thn);
        fontColor.addActionListener(thn);
        textAreaColor.addActionListener(thn);
        seePass.addItemListener(thn);
        puQuit.addActionListener(thn);
        userNameField.addMouseListener(thn);
        passwordField.addMouseListener(thn);
        bLogin.addActionListener(thn);
        bInsert.addActionListener(thn);
        hurufLeft.addActionListener(thn);
        hurufCenter.addActionListener(thn);
        hurufRight.addActionListener(thn);
        addMouseListener(thn);
    }
    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
            new MainAppTubes().setVisible(true);
        }
        catch(ParseException | UnsupportedLookAndFeelException ex){
            JOptionPane.showMessageDialog(mats, "Error");
        }
    }
   
    
}


