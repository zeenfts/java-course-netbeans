package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGuiAwal extends JFrame{
    private JLabel lblUserName, lblPassWord;
    private JTextField tfUserName;
    private JPasswordField pfPassword;
    private JButton btnRegister, btnLogin, btnLupaPass;
    private JPanel btnPanel;
    
    public LoginGuiAwal() {
        komponen();
    }

    private void komponen(){
       setTitle("Aplikasi Login");
       setResizable(false);
       setLayout(new GridLayout(3, 2));
       setSize(500, 150);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       lblUserName = new JLabel("     Username");
       add(lblUserName);

       tfUserName = new JTextField(10);
       add(tfUserName);
       
       lblPassWord = new JLabel("     Password");
       add(lblPassWord);
       
       pfPassword = new JPasswordField(20);
       add(pfPassword);
       
       btnRegister = new JButton("Register");
       add(btnRegister);
  
       btnPanel = new JPanel();
       btnPanel.setLayout(new FlowLayout());
       
       btnLogin =  new JButton("Login");
       btnPanel.add(btnLogin);
       
       btnLupaPass = new JButton("Lupa Password");
       btnPanel.add(btnLupaPass);
       
       add(btnPanel);
    }
    
    public static void main(String[] args) {
        try{
        new LoginGuiAwal().setVisible(true);
        }
        catch(Exception ec){
            JOptionPane.showMessageDialog(null, ec);
        }
    }
    
}
