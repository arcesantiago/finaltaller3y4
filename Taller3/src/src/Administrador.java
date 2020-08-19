package src;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Administrador extends JFrame {
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Administrador();
					
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Administrador() throws IOException {

        JFrame frame = new JFrame();
        JPanel productosPanel = new JPanel();
        productosPanel.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "Productos", TitledBorder.LEFT,
        TitledBorder.TOP));
        String[][] rec = {
           { "001", "David", "AUS" },
           { "002", "Steve", "AUS" },
           { "003", "Yuvraj", "IND" },
           { "004", "Kane", "NZ" },
           { "005", "Ben", "ENG" },
           { "006", "Eion", "ENG" },
           { "007", "Miller", "SA" },
           { "008", "Rohit", "IND" },
           { "006", "Eion", "ENG" },
           { "007", "Miller", "SA" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" },
           { "008", "Rohit", "IND" }
           
        };
        String[] header = { "Codigo", "Nombre", "Precio" };
        
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        productosPanel.add(splitPane);
        JTable table_1 = new JTable(rec, header);
        JScrollPane scrollPane = new JScrollPane(table_1);
        splitPane.setLeftComponent(scrollPane);
        
        JSplitPane splitPane_1 = new JSplitPane();
        splitPane_1.setResizeWeight(0.5);
        splitPane.setRightComponent(splitPane_1);
        
        JButton agregarProducto = new JButton("Agregar");
        splitPane_1.setLeftComponent(agregarProducto);
        
        JButton eliminarProducto = new JButton("Eliminar");
        splitPane_1.setRightComponent(eliminarProducto);
        frame.getContentPane().add(productosPanel, BorderLayout.SOUTH);
        
        JPanel restoranPanel = new JPanel();
        frame.getContentPane().add(restoranPanel, BorderLayout.CENTER);

        restoranPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Restoranes", TitledBorder.LEFT,
                TitledBorder.TOP));
        restoranPanel.setLayout(new BoxLayout(restoranPanel, BoxLayout.X_AXIS));
        
        JSplitPane splitPane_2 = new JSplitPane();
        splitPane_2.setResizeWeight(1.0);
        restoranPanel.add(splitPane_2);
        
        JSplitPane splitPane_3 = new JSplitPane();
        splitPane_2.setRightComponent(splitPane_3);
        
        JButton agregarRestoran = new JButton("Agregar");
        splitPane_3.setLeftComponent(agregarRestoran);
        
        JButton eliminarRestoran = new JButton("Eliminar");
        splitPane_3.setRightComponent(eliminarRestoran);
        
        JComboBox comboBox = new JComboBox();
        splitPane_2.setLeftComponent(comboBox);
        comboBox.setPrototypeDisplayValue("Seleccione un restoran");
        comboBox.addItem("Seleccione un restoran");
        comboBox.addItem("asdasdasdasdasdasdasdasdasd");
        comboBox.addItem("asdasdasdasdasdasdasdasdasd");

        comboBox.addItem("asdasdasdasdasdasdasdasdasd");
        
        JPanel panel = new JPanel();
        
        
        ImageIcon i = new ImageIcon(Administrador.class.getResource("/src/logo.png"));
        Image scaled = i.getImage().getScaledInstance(100, 100, i.getImage().SCALE_SMOOTH);
        JLabel jl=new JLabel(new ImageIcon(scaled));

        panel.add(jl);
    
 
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.setSize(600, 725);
        frame.setVisible(true);
    }

}
