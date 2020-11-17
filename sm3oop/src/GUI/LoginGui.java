package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGui extends JFrame {
    private JLabel lblUserName, lblPassWord;
    private JTextField tfUserName;
    private JPasswordField pfPassword;
    private JButton btnRegister, btnLogin, btnLupaPass;
    private JPanel btnPanel, fldPanel, wPanel, ePanel, nPanel;
    
    public LoginGui() {
       komponenGui();
    }
    
    private void komponenGui(){
       setTitle("Aplikasi Login New");
       setResizable(false);
       setLayout(new BorderLayout());
       setSize(500, 150);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       wPanel = new JPanel();
       ePanel = new JPanel();
       nPanel = new JPanel();
       fldPanel = new JPanel(new GridLayout(2, 2));
       lblUserName = new JLabel("     Username");
       fldPanel.add(lblUserName);

       tfUserName = new JTextField(10);
       fldPanel.add(tfUserName);
       
       lblPassWord = new JLabel("     Password");
       fldPanel.add(lblPassWord);
       
       pfPassword = new JPasswordField(20);
       fldPanel.add(pfPassword);
       add(fldPanel, BorderLayout.CENTER);
       
       btnPanel = new JPanel();
       btnPanel.setLayout(new FlowLayout());
       
       btnRegister = new JButton("Register");
       btnPanel.add(btnRegister);
  
       btnLogin =  new JButton("Login");
       btnPanel.add(btnLogin);
       
       btnLupaPass = new JButton("Lupa Password");
       btnPanel.add(btnLupaPass);
//       btnPanel.setPreferredSize(getSize());
//       ePanel.setPreferredSize(getSize());
//       wPanel.setPreferredSize(getSize());
//       add(wPanel, BorderLayout.WEST);
//       add(ePanel, BorderLayout.EAST);
//       add(nPanel, BorderLayout.NORTH);
       add(btnPanel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        try{
            new LoginGui().setVisible(true);
        }
        catch(Exception ec){
            JOptionPane.showMessageDialog(null, ec);
        }
    }
    
}
