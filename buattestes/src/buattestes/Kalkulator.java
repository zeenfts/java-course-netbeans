package buattestes;
import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Kalkulator extends JFrame{
    private JLabel hasilCalc;
    private JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    private JButton tambah, kurang, kali, bagi, mod, equal, dec, clear, bSpace;
    private JRadioButton onOff;
    private JPanel panelAtas, panelBawah;
    
    public Kalkulator() {
        super("Calculator");
        setLayout(new BorderLayout(1, 1));
        setSize(400, 300);
        
        hasilCalc = new JLabel("0.0");
        panelAtas = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBawah = new JPanel(new GridLayout(4, 4));
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
        clear = new JButton("C");
        equal = new JButton("=");
        
        panelAtas.add(hasilCalc);
        panelBawah.add(clear);
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
        panelBawah.add(num0);
        panelBawah.add(equal);
        panelBawah.add(bagi);
        add(panelAtas, BorderLayout.NORTH);
        add(panelBawah, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        try{
                new Kalkulator();
            
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
