import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class GUIRadio {

	private JFrame frame;
	private JRadioButton rdbtnFm, rdbtnAm;
	private JButton btnGuardar;
	private JComboBox<String> comboBox;
	private JButton btnCanal6, btnCanal5, btnCanal4, btnCanal3, btnCanal1, btnCanal2;
	private JLabel lblSintoniza;
	private JSlider sintonizador;
	private JButton btnEncendidoapagado;
	private JSlider manejoVolumen;
	private JButton btnCanal7;
	private JButton btnCanal8;
	private JButton btnCanal9;
	private Component btnCanal10;
	private JButton btnCanal11;
	private JButton btnCanal12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRadio window = new GUIRadio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIRadio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @param manejoVolumen 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sintonizador = new JSlider();
		sintonizador.setBounds(10, 81, 537, 33);
		frame.getContentPane().add(sintonizador);
		sintonizador.setPaintTrack(true);
		sintonizador.setMajorTickSpacing(108);
		sintonizador.setMinorTickSpacing(88);
		sintonizador.setPaintLabels(true);
		Hashtable tabla = sintonizador.createStandardLabels(10);
	    sintonizador.setLabelTable(tabla);
		sintonizador.addChangeListener(new slider());
		
		btnEncendidoapagado = new JButton("Encender/Apagar");
		btnEncendidoapagado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEncendidoapagado.setBounds(196, 13, 162, 23);
		frame.getContentPane().add(btnEncendidoapagado);
		btnEncendidoapagado.addActionListener(new botones());
		
		JLabel lblEstacin = new JLabel("Estaci\u00F3n:");
		lblEstacin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstacin.setBounds(26, 47, 105, 33);
		frame.getContentPane().add(lblEstacin);
		
		lblSintoniza = new JLabel("");
		lblSintoniza.setBounds(276, 47, 171, 33);
		frame.getContentPane().add(lblSintoniza);
		
		JLabel lblVolumen = new JLabel("Volumen:");
		lblVolumen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVolumen.setBounds(71, 365, 73, 14);
		frame.getContentPane().add(lblVolumen);
		
		manejoVolumen = new JSlider();
		manejoVolumen.setBounds(26, 390, 154, 23);
		frame.getContentPane().add(manejoVolumen);
		manejoVolumen.addChangeListener(new slider());
		
		btnCanal1 = new JButton("Canal 1");
		btnCanal1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCanal1.setBounds(10, 126, 73, 23);
		frame.getContentPane().add(btnCanal1);
		btnCanal1.addActionListener(new botones());
		
		btnCanal2 = new JButton("Canal 2");
		btnCanal2.setBounds(89, 127, 79, 23);
		frame.getContentPane().add(btnCanal2);
		btnCanal2.addActionListener(new botones());
		
		btnCanal3 = new JButton("Canal 3");
		btnCanal3.setBounds(183, 126, 79, 23);
		frame.getContentPane().add(btnCanal3);
		btnCanal3.addActionListener(new botones());
		
		btnCanal4 = new JButton("Canal 4");
		btnCanal4.setBounds(272, 125, 79, 23);
		frame.getContentPane().add(btnCanal4);
		btnCanal4.addActionListener(new botones());
		
		btnCanal5 = new JButton("Canal 5");
		btnCanal5.setBounds(361, 125, 86, 23);
		frame.getContentPane().add(btnCanal5);
		btnCanal5.addActionListener(new botones());
		
		btnCanal6 = new JButton("Canal 6");
		btnCanal6.setBounds(461, 125, 86, 23);
		frame.getContentPane().add(btnCanal6);
		btnCanal6.addActionListener(new botones());
		
		JLabel lblCanales = new JLabel("Canales:");
		lblCanales.setBounds(26, 221, 46, 14);
		frame.getContentPane().add(lblCanales);
		
		String[] canales = {"Canal 1","Canal 2","Canal 3","Canal 4","Canal 5","Canal 6","Canal 7","Canal 8","Canal 9","Canal 10","Canal 11","Canal 12",};
		comboBox = new JComboBox (canales);
		comboBox.setBounds(82, 218, 73, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new botones());
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(171, 217, 73, 23);
		frame.getContentPane().add(btnGuardar);
		btnGuardar.addActionListener(new botones());
		
		JLabel lblFrencuencia = new JLabel("Frencuencia:");
		lblFrencuencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFrencuencia.setBounds(328, 349, 92, 14);
		frame.getContentPane().add(lblFrencuencia);
		
		rdbtnAm = new JRadioButton("AM");
		rdbtnAm.setBounds(309, 370, 56, 33);
		frame.getContentPane().add(rdbtnAm);
		
		rdbtnFm = new JRadioButton("FM");
		rdbtnFm.setBounds(375, 375, 86, 23);
		frame.getContentPane().add(rdbtnFm);
		
		btnCanal7 = new JButton("Canal 7");
		btnCanal7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCanal7.setBounds(10, 161, 73, 23);
		frame.getContentPane().add(btnCanal7);
		
		btnCanal8 = new JButton("Canal 8");
		btnCanal8.setBounds(92, 161, 79, 23);
		frame.getContentPane().add(btnCanal8);
		
		btnCanal9 = new JButton("Canal 9");
		btnCanal9.setBounds(183, 160, 79, 23);
		frame.getContentPane().add(btnCanal9);
		
		btnCanal10 = new JButton("Canal 10");
		btnCanal10.setBounds(272, 159, 79, 23);
		frame.getContentPane().add(btnCanal10);
		
		btnCanal11 = new JButton("Canal 11");
		btnCanal11.setBounds(361, 161, 86, 23);
		frame.getContentPane().add(btnCanal11);
		
		btnCanal12 = new JButton("Canal 12");
		btnCanal12.setBounds(461, 159, 86, 23);
		frame.getContentPane().add(btnCanal12);
	}
	
	public class slider implements ChangeListener{

		public void stateChanged(ChangeEvent movimiento) {
			
			
		}
		
	}
	
	public class botones implements ActionListener{

		public void actionPerformed(ActionEvent evento) {
			
			
		}
		
		
	}	
}
