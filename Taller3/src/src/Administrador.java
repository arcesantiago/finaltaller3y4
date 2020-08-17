package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JTable;

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
	 */
	public Administrador() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(
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
        JTable table = new JTable(rec, header);
        panel.add(new JScrollPane(table));
        frame.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        frame.getContentPane().add(panel_1, BorderLayout.NORTH);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setPrototypeDisplayValue("Seleccione un restoran");
        comboBox.addItem("Seleccione un restoran");
        comboBox.addItem("asdasdasdasdasdasdasdasdasd");
        comboBox.addItem("asdasdasdasdasdasdasdasdasd");
        comboBox.setMaximumSize( comboBox.getPreferredSize() );
        comboBox.addItem("asdasdasdasdasdasdasdasdasd");
        
        panel_1.add(comboBox);
        
        JButton btnNewButton = new JButton("Agregar");
        panel_1.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Eliminar");
        panel_1.add(btnNewButton_1);
        
        panel_1.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Restoranes", TitledBorder.LEFT,
                TitledBorder.TOP));
        frame.setSize(1000, 700);
        frame.setVisible(true);
    }

}
