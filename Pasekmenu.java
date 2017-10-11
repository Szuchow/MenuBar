package pasekmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Pasekmenu extends JFrame {
    
    public Pasekmenu()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Pasek Menu");
        this.setBounds(300, 300, 300, 200);
        this.setJMenuBar(pasekMenu);
        
        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        JMenuItem podMenuNowy = menuPlik.add("Nowy");
        podMenuNowy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        menuPlik.addSeparator();
        JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("Zapisz"));
        menuPlik.addSeparator();
        menuPlik.add(new JMenuItem("Wczytaj"));
        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);
        
        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));
        menuOpcje.add(tylkoDoOdczytu);
        
        tylkoDoOdczytu.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                if (tylkoDoOdczytu.isSelected())
                    podMenuZapisz.setEnabled(false);
                else
                    podMenuZapisz.setEnabled(true);
                    }
        });
        
        
        JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
        menuPomoc.add(new JMenuItem("FAQ"));
        
        
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu");
    
    public static void main(String[] args) {
        new Pasekmenu().setVisible(true);
    }
    
}