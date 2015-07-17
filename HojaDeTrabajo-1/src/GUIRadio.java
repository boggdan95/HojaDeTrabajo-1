import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.ButtonGroup;
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
	private JButton btnCanal6, btnCanal5, btnCanal4, btnCanal3, btnCanal1, btnCanal2, btnCanal7, btnCanal8, btnCanal9, btnCanal10, btnCanal11, btnCanal12;
	private JLabel lblSintoniza;
	private JButton btnEncendidoapagado;
	private JButton btnRegresar;
	private JButton btnAvanzar;
	private JButton btnSubirVolumen;
	private JButton btnBajarVolumen;
	private radioBBP radio;
	private JLabel lblVolumen;
	private ButtonGroup amfm;
	private JLabel lblVol;

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
		radio = new radioBBP();
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
		lblSintoniza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSintoniza.setBounds(183, 47, 171, 33);
		frame.getContentPane().add(lblSintoniza);
		
		lblVolumen = new JLabel("Volumen:");
		lblVolumen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVolumen.setBounds(42, 278, 73, 14);
		frame.getContentPane().add(lblVolumen);
		
		btnCanal1 = new JButton("Canal 1");
		btnCanal1.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
		
		btnCanal7 = new JButton("Canal 7");
		btnCanal7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCanal7.setBounds(10, 161, 73, 23);
		frame.getContentPane().add(btnCanal7);
		btnCanal7.addActionListener(new botones());
		
		btnCanal8 = new JButton("Canal 8");
		btnCanal8.setBounds(92, 161, 79, 23);
		frame.getContentPane().add(btnCanal8);
		btnCanal8.addActionListener(new botones());
		
		btnCanal9 = new JButton("Canal 9");
		btnCanal9.setBounds(183, 160, 79, 23);
		frame.getContentPane().add(btnCanal9);
		btnCanal9.addActionListener(new botones());
		
		btnCanal10 = new JButton("Canal 10");
		btnCanal10.setBounds(272, 159, 79, 23);
		frame.getContentPane().add(btnCanal10);
		btnCanal10.addActionListener(new botones());

		btnCanal11 = new JButton("Canal 11");
		btnCanal11.setBounds(361, 161, 86, 23);
		frame.getContentPane().add(btnCanal11);
		btnCanal11.addActionListener(new botones());
		
		btnCanal12 = new JButton("Canal 12");
		btnCanal12.setBounds(461, 159, 86, 23);
		frame.getContentPane().add(btnCanal12);
		btnCanal12.addActionListener(new botones());		
		JLabel lblCanales = new JLabel("Canales:");
		lblCanales.setBounds(10, 221, 62, 14);
		frame.getContentPane().add(lblCanales);
		
		String[] canales = {"Canal 1","Canal 2","Canal 3","Canal 4","Canal 5","Canal 6","Canal 7","Canal 8","Canal 9","Canal 10","Canal 11","Canal 12",};
		comboBox = new JComboBox (canales);
		comboBox.setBounds(82, 218, 120, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new botones());
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(224, 217, 85, 23);
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
		rdbtnFm.setSelected(true);
		
		amfm = new ButtonGroup();
		amfm.add(rdbtnAm);
		amfm.add(rdbtnFm);
		
		btnRegresar = new JButton("<<");
		btnRegresar.setBounds(136, 80, 89, 23);
		frame.getContentPane().add(btnRegresar);
		btnRegresar.addActionListener(new botones());
		
		btnAvanzar = new JButton(">>");
		btnAvanzar.setBounds(286, 80, 89, 23);
		frame.getContentPane().add(btnAvanzar);
		btnAvanzar.addActionListener(new botones());
		
		btnSubirVolumen = new JButton("+");
		btnSubirVolumen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubirVolumen.setBounds(36, 318, 79, 45);
		frame.getContentPane().add(btnSubirVolumen);
		btnSubirVolumen.addActionListener(new botones());
		
		btnBajarVolumen = new JButton("-");
		btnBajarVolumen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBajarVolumen.setBounds(146, 318, 79, 45);
		frame.getContentPane().add(btnBajarVolumen);
		
		lblVol = new JLabel("");
		lblVol.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVol.setBounds(140, 279, 73, 14);
		frame.getContentPane().add(lblVol);
		btnBajarVolumen.addActionListener(new botones());
	}
	
	public class botones implements ActionListener{

		private boolean status;
		public void actionPerformed(ActionEvent evento) {
			if (btnEncendidoapagado == evento.getSource()){
					btnCanal6.setEnabled(false);
					btnCanal5.setEnabled(false);
					btnCanal4.setEnabled(false);
					btnCanal3.setEnabled(false);
					btnCanal1.setEnabled(false);
					btnCanal2.setEnabled(false);
					btnCanal7.setEnabled(false);
					btnCanal8.setEnabled(false);
					btnCanal9 .setEnabled(false);
					btnCanal10.setEnabled(false);
					btnCanal11.setEnabled(false);
					btnCanal12.setEnabled(false);

				/*	btnCanal6.setEnabled(true);
					btnCanal5.setEnabled(true);
					btnCanal4.setEnabled(true);
					btnCanal3.setEnabled(true);
					btnCanal1.setEnabled(true);
					btnCanal2.setEnabled(true);
					btnCanal7.setEnabled(true);
					btnCanal8.setEnabled(true);
					btnCanal9 .setEnabled(true);
					btnCanal10.setEnabled(true);
					btnCanal11.setEnabled(true);
					btnCanal12.setEnabled(true); */
				}
				
			if (btnAvanzar == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.adelantarEmisora()));
			}
			if (btnRegresar == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.retrocederEmisora()));
			}
			if (btnSubirVolumen == evento.getSource()){
				lblVol.setText(String.valueOf(radio.subirVolumen()));
			}
			if (btnBajarVolumen == evento.getSource()){
				lblVol.setText(String.valueOf(radio.bajarVolumen()));
			}
			
			if(btnGuardar == evento.getSource()){
				radio.guardarEmisora(Double.parseDouble(lblSintoniza.getText()), comboBox.getSelectedIndex());
			}

			if(btnCanal1 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(1)));
			}
			if(btnCanal2 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(2)));
			}
			if(btnCanal3 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(3)));
			}
			if(btnCanal4 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(4)));
			}
			if(btnCanal5 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(5)));
			}
			if(btnCanal6 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(6)));
			}
			if(btnCanal7 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(7)));
			}
			if(btnCanal8 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(8)));
			}
			if(btnCanal9 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(9)));
			}
			if(btnCanal10 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(10)));
			}
			if(btnCanal11 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(11)));
			}
			if(btnCanal12 == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.cargarEmisora(12)));
			}
			//Agregar lógica AM / FM
			if (rdbtnFm == evento.getSource()){
				
			}
			if (rdbtnAm == evento.getSource()){
				lblSintoniza.setText(String.valueOf(radio.adelantarEmisora()));
			}
		}
	}	
}
