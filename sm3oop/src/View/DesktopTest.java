package View;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DesktopTest extends JFrame {

    public DesktopTest() {
        super("Demonstrasi Penggunaan JDesktopPane");
        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu("Add");
        JMenuItem newFrame = new JMenuItem("Internal Frame");
        addMenu.add(newFrame);
        bar.add(addMenu);
        setJMenuBar(bar);
        final JDesktopPane theDesktop = new JDesktopPane();
        getContentPane().add(theDesktop);
        newFrame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame frame = new MyFrame();
                theDesktop.add(frame);
            }
        });
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        DesktopTest app = new DesktopTest();
    }

    private class MyFrame extends JInternalFrame {

        private JTextArea t1, t2;
        private JButton copy;

        public MyFrame() {
            super("JTextArea", true, true, true, true);
            setLayout(new BorderLayout(1, 1));
            setSize(500, 500);
            Box b = Box.createHorizontalBox();
            String s = "Sistem Informasi \n Institut Teknologi Telkom";
            t1 = new JTextArea(s, 10, 15);
            t2 = new JTextArea(10, 15);
            t2.setEditable(false);
            copy = new JButton("Copy >>>");
            copy.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    t2.setText(t1.getText());
                }
            });
            
            b.add(new JScrollPane(t1));
            b.add(copy);
            b.add(new JScrollPane(t2));
            add(b);
            setVisible(true);
        }
    }
}
