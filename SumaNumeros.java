import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SumaNumeros extends JFrame implements ActionListener {

	private JLabel mensaje;
	private JButton boton;
	private JTextField caja1;
	private JTextField caja2;
	
	public SumaNumeros() {
		super();
		configurarVentana();
		crearComponentes();
	}

	private void configurarVentana(){
		this.setTitle("Hello world");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponentes() {
		mensaje = new JLabel();
		mensaje.setText("Suma de dos números");
		mensaje.setBounds(50, 10, 130, 30);
		mensaje.setForeground(Color.RED);
		this.add(mensaje);
		
		boton = new JButton();
		boton.setText("Click");
		boton.setBounds(50, 110, 100, 30);
		boton.addActionListener(this);
		this.add(boton);
		
		caja1 = new JTextField();
		caja1.setBounds(50, 40, 100, 30);
		this.add(caja1);
		
		caja2 = new JTextField();
		caja2.setBounds(50, 70, 100, 30);
		this.add(caja2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str1 = caja1.getText();
		String str2 = caja2.getText();
		int sum1, sum2;
		sum1 = Integer.parseInt(str1);
		sum2 = Integer.parseInt(str2);
		int resultado = sum1 + sum2;
		JOptionPane.showMessageDialog(this,  "El valor es: " + resultado  );
	}
	
	public static void main(String[] args) {
		SumaNumeros ventana = new SumaNumeros();
		ventana.setVisible(true);
	}
}
