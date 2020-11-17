package View;
import Controller.ItemHandler;
import Controller.StyleHandler;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    private final Controller.ItemHandler ih;
    private final Controller.StyleHandler sh;
    public final JPopupMenu popupMenu;
    public Color warna[] = {Color.black, Color.blue, Color.red, Color.green};
    public JRadioButtonMenuItem colorItems[], fonts[];
    public JCheckBoxMenuItem styleItems[];
    public JLabel display;
    public ButtonGroup fontGroup, colorGroupp;
    public int style;
    public JMenuItem aboutItem;
    public JMenuItem exitItem;
    public JRadioButtonMenuItem items[];
    public Color colorValues[] = {Color.MAGENTA, Color.yellow, Color.cyan, Color.BLACK, Color.PINK};

    public Menu() {
        super("Demonstrasi JMenus dan JPopUp");
        ih = new ItemHandler(this);
        sh = new StyleHandler(this);
        
        popupMenu = new JPopupMenu();
        String colors[] = {"Magenta", "Kuning", "Cyan", "Hitam", "Merah Muda"};
        ButtonGroup colorGroup = new ButtonGroup();
        items = new JRadioButtonMenuItem[5];
        for (int i = 0; i < items.length; i++) {
            items[i] = new JRadioButtonMenuItem(colors[i]);
            popupMenu.add(items[i]);
            colorGroup.add(items[i]);
            items[i].addActionListener(ih);
        }
        addMouseListener(sh); 
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        aboutItem = new JMenuItem("About..");
        aboutItem.setMnemonic('A');
        aboutItem.addActionListener(ih); 
        
        fileMenu.add(aboutItem);
        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('x');
        exitItem.addActionListener(ih); 
        
        fileMenu.add(exitItem);
        bar.add(fileMenu);
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('r');
        String colorss[] = {"Hitam", "Biru", "Merah", "Hijau"};
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');
        colorItems = new JRadioButtonMenuItem[colorss.length];
        colorGroupp = new ButtonGroup();
        for (int i = 0; i < colorss.length; i++) {
            colorItems[i] = new JRadioButtonMenuItem(colorss[i]);
            colorMenu.add(colorItems[i]);
            colorGroupp.add(colorItems[i]);
            colorItems[i].addActionListener(ih);
        }
        colorItems[0].setSelected(true);
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();
        String fontNames[] = {"Times New Roman", "Algerian", "Calibri","Vivaldi" ,"Magneto", "Blackadder ITC", "Brush Script MT"};
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('n');
        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontGroup = new ButtonGroup();
        for (int i = 0; i < fonts.length; i++) {
            fonts[i] = new JRadioButtonMenuItem(fontNames[i]);
            fontMenu.add(fonts[i]);
            fontGroup.add(fonts[i]);
            fonts[i].addActionListener(ih);
        }
       
        fonts[0].setSelected(true);
        fontMenu.addSeparator();
        String styleNames[] = {"Bold", "Italic"};
        styleItems = new JCheckBoxMenuItem[styleNames.length];
        for (int i = 0; i < styleNames.length; i++) {
            styleItems[i] = new JCheckBoxMenuItem(styleNames[i]);
            fontMenu.add(styleItems[i]);
            styleItems[i].addItemListener(sh);
        }
        formatMenu.add(fontMenu);
        bar.add(formatMenu);
        Icon icon = new ImageIcon("./image/logo.png");
        display = new JLabel("Sample Text", SwingConstants.CENTER);
        display.setIcon(icon);
        display.setHorizontalTextPosition(SwingConstants.CENTER);
        display.setVerticalTextPosition(SwingConstants.BOTTOM);
        display.setForeground(warna[0]);
        display.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        getContentPane().setBackground(Color.CYAN);
        add(popupMenu);
        getContentPane().add(display, BorderLayout.CENTER);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Menu app = new Menu();
    }


}
