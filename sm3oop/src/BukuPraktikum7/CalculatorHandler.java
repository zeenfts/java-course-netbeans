package BukuPraktikum7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorHandler implements ActionListener{
    private CalculatorGUI cg;
    
    public CalculatorHandler(CalculatorGUI cg) {
        this.cg = cg;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource().equals(cg.rbOn)){
            cg.num0.setEnabled(true);
            cg.num1.setEnabled(true);
            cg.num2.setEnabled(true);
            cg.num3.setEnabled(true);
            cg.num4.setEnabled(true);
            cg.num5.setEnabled(true);
            cg.num6.setEnabled(true);
            cg.num7.setEnabled(true);
            cg.num8.setEnabled(true);
            cg.num9.setEnabled(true);
            cg.tambah.setEnabled(true);
            cg.kurang.setEnabled(true);
            cg.kali.setEnabled(true);
            cg.bagi.setEnabled(true);
            cg.mod.setEnabled(true);
            cg.dec.setEnabled(true);
            cg.clear.setEnabled(true);
            cg.bSpace.setEnabled(true);
            cg.equal.setEnabled(true);
        }
        else if(ae.getSource().equals(cg.rbOff)){
            cg.num0.setEnabled(false);
            cg.num1.setEnabled(false);
            cg.num2.setEnabled(false);
            cg.num3.setEnabled(false);
            cg.num4.setEnabled(false);
            cg.num5.setEnabled(false);
            cg.num6.setEnabled(false);
            cg.num7.setEnabled(false);
            cg.num8.setEnabled(false);
            cg.num9.setEnabled(false);
            cg.tambah.setEnabled(false);
            cg.kurang.setEnabled(false);
            cg.kali.setEnabled(false);
            cg.bagi.setEnabled(false);
            cg.mod.setEnabled(false);
            cg.dec.setEnabled(false);
            cg.clear.setEnabled(false);
            cg.bSpace.setEnabled(false);
            cg.equal.setEnabled(false);
        }
        else if(ae.getSource().equals(cg.num0)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"0");
        }
        else if(ae.getSource().equals(cg.num1)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"1");
        }
        else if(ae.getSource().equals(cg.num2)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"2");
        }
        else if(ae.getSource().equals(cg.num2)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"2");
        }
        else if(ae.getSource().equals(cg.num3)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"3");
        }
        else if(ae.getSource().equals(cg.num4)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"4");
        }
        else if(ae.getSource().equals(cg.num5)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"5");
        }
        else if(ae.getSource().equals(cg.num6)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"6");
        }
        else if(ae.getSource().equals(cg.num7)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"7");
        }
        else if(ae.getSource().equals(cg.num8)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"8");
        }
        else if(ae.getSource().equals(cg.num9)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+"9");
        }
        else if(ae.getSource().equals(cg.tambah)){
            cg.num = Double.parseDouble(cg.hasilCalc.getText());
            cg.param = 'a';
            cg.hasilCalc.setText("");
            cg.opCal.setText("+");
        }
        else if(ae.getSource().equals(cg.kurang)){
             cg.num = Double.parseDouble(cg.hasilCalc.getText());
            cg.param = 'b';
            cg.hasilCalc.setText("");
            cg.opCal.setText("-");
        }
        else if(ae.getSource().equals(cg.kali)){
            cg.num = Double.parseDouble(cg.hasilCalc.getText());
            cg.param = 'c';
            cg.hasilCalc.setText("");
            cg.opCal.setText("*");
        }
        else if(ae.getSource().equals(cg.bagi)){
            cg.num = Double.parseDouble(cg.hasilCalc.getText());
            cg.param = 'd';
            cg.hasilCalc.setText("");
            cg.opCal.setText("/");
        }
        else if(ae.getSource().equals(cg.mod)){
            cg.num = Double.parseDouble(cg.hasilCalc.getText());
            cg.param = 'e';
            cg.hasilCalc.setText("");
            cg.opCal.setText("%");
        }
        else if(ae.getSource().equals(cg.dec)){
            cg.hasilCalc.setText(cg.hasilCalc.getText()+".");
        }
        else if(ae.getSource().equals(cg.clear)){
            cg.hasilCalc.setText("");
            cg.opCal.setText("");
        }
        else if(ae.getSource().equals(cg.bSpace)){
            int length = cg.hasilCalc.getText().length();
            int num = cg.hasilCalc.getText().length()-1;
            StringBuilder back;
            String save;
            
            if(length > 0){
                back = new StringBuilder(cg.hasilCalc.getText());
                back.deleteCharAt(num);
                save = back.toString();
                cg.hasilCalc.setText(save);
            }
        }
        else if(ae.getSource().equals(cg.equal)){
            cg.perhitungan();
        }
    }
    
}
