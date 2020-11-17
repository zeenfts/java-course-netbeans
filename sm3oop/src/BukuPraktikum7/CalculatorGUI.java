package BukuPraktikum7;
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame{
    private CalculatorHandler calHandler;
    protected JLabel hasilCalc, opCal;
    protected JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    protected JButton tambah, kurang, kali, bagi, mod, equal, dec, clear, bSpace;
    protected JRadioButton rbOff, rbOn;
    private ButtonGroup bgOnOff;
    private JPanel panelAtas, panelAtas1, panelBawah, panelOnOff;
    protected char param;
    protected double num, ans;
    
    public CalculatorGUI() {
        launchCalculator();
    }
            
    private void launchCalculator(){
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1, 1));
        setResizable(false);
        setLocation(430, 180);
        setSize(400, 420);
        
        calHandler = new CalculatorHandler(this);
        hasilCalc = new JLabel("0.0");
        opCal = new JLabel("");
        panelAtas = new JPanel(new BorderLayout());
        panelAtas.setBackground(Color.WHITE);
        panelAtas1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelAtas1.setBackground(Color.WHITE);
        panelBawah = new JPanel(new GridLayout(5, 4));
        panelOnOff = new JPanel(new GridLayout(1, 1));
        rbOn = new JRadioButton("On", false);
        rbOff = new JRadioButton("Off", true);
        bgOnOff = new ButtonGroup();
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
        
        num0.setEnabled(false);
        num1.setEnabled(false);
        num2.setEnabled(false);
        num3.setEnabled(false);
        num4.setEnabled(false);
        num5.setEnabled(false);
        num6.setEnabled(false);
        num7.setEnabled(false);
        num8.setEnabled(false);
        num9.setEnabled(false);
        tambah.setEnabled(false);
        kurang.setEnabled(false);
        kali.setEnabled(false);
        bagi.setEnabled(false);
        mod.setEnabled(false);
        dec.setEnabled(false);
        clear.setEnabled(false);
        bSpace.setEnabled(false);
        equal.setEnabled(false);
        
        rbOn.addActionListener(calHandler);
        rbOff.addActionListener(calHandler);
        num0.addActionListener(calHandler);
        num1.addActionListener(calHandler);
        num2.addActionListener(calHandler);
        num3.addActionListener(calHandler);
        num4.addActionListener(calHandler);
        num5.addActionListener(calHandler);
        num6.addActionListener(calHandler);
        num7.addActionListener(calHandler);
        num8.addActionListener(calHandler);
        num9.addActionListener(calHandler);
        tambah.addActionListener(calHandler);
        kurang.addActionListener(calHandler);
        kali.addActionListener(calHandler);
        bagi.addActionListener(calHandler);
        mod.addActionListener(calHandler);
        dec.addActionListener(calHandler);
        clear.addActionListener(calHandler);
        bSpace.addActionListener(calHandler);
        equal.addActionListener(calHandler);
        
        panelAtas1.add(hasilCalc);
        panelAtas.add(panelAtas1, BorderLayout.CENTER);
        panelAtas.add(opCal, BorderLayout.WEST);
        panelOnOff.add(rbOn);
        panelOnOff.add(rbOff);
        bgOnOff.add(rbOn);
        bgOnOff.add(rbOff);
        panelBawah.add(panelOnOff);
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
    
    protected void perhitungan(){
        switch(param){
            case 'a': //add
                ans = num + Double.parseDouble(hasilCalc.getText());
                hasilCalc.setText(Double.toString(ans));
                opCal.setText("");
                break;
            case 'b': //subtr
                ans = num - Double.parseDouble(hasilCalc.getText());
                hasilCalc.setText(Double.toString(ans));
                opCal.setText("");
                break;
            case 'c': //Multi
                ans = num * Double.parseDouble(hasilCalc.getText());
                hasilCalc.setText(Double.toString(ans));
                opCal.setText("");
                break;
            case 'd': //Div
                ans = num / Double.parseDouble(hasilCalc.getText());
                hasilCalc.setText(Double.toString(ans));
                opCal.setText("");
                break;
            case 'e': //mod
                ans = num % Double.parseDouble(hasilCalc.getText());
                hasilCalc.setText(Double.toString(ans));
                opCal.setText("");
                break;
        }
    }
    
    public static void main(String[] args) {
        try{
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorGUI().setVisible(true);
        });
        }
        catch(Exception e){
            System.exit(0);
        }
    }
    
}
