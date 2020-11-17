package BukuPraktikum6;
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame{
    private JLabel hasilCalc;
    private JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    private JButton tambah, kurang, kali, bagi, mod, equal, dec, clear, bSpace;
    private JRadioButton onOff;
    private JPanel panelAtas, panelBawah;
    
    public CalculatorGUI() {
        launchCalculator();
    }
            
    private void launchCalculator(){
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1, 1));
        setResizable(false);
        setLocation(450, 200);
        setSize(400, 300);
        
        hasilCalc = new JLabel("0.0");
        panelAtas = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelAtas.setBackground(Color.WHITE);
        panelBawah = new JPanel(new GridLayout(5, 4));
        panelBawah.setBackground(Color.DARK_GRAY);
        onOff = new JRadioButton("On", false);
        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        mod = new JButton("%");
        dec = new JButton(".");
        clear = new JButton("C");
        bSpace = new JButton("->");
        equal = new JButton("=");
        
        panelAtas.add(hasilCalc);
        panelBawah.add(onOff);
        panelBawah.add(bSpace);
        panelBawah.add(clear);
        panelBawah.add(mod);
        panelBawah.add(num7);
        panelBawah.add(num8);
        panelBawah.add(num9);
        panelBawah.add(tambah);
        panelBawah.add(num4);
        panelBawah.add(num5);
        panelBawah.add(num6);
        panelBawah.add(kurang);
        panelBawah.add(num1);
        panelBawah.add(num2);
        panelBawah.add(num3);
        panelBawah.add(kali);
        panelBawah.add(dec);
        panelBawah.add(num0);
        panelBawah.add(equal);
        panelBawah.add(bagi);
        add(panelAtas, BorderLayout.NORTH);
        add(panelBawah, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        try{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
        }
        catch(Exception e){
            System.exit(0);
        }
    }
    
}
