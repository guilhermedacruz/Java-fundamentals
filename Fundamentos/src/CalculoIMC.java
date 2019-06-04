import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.text.DecimalFormat;

public class CalculoIMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtIMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculoIMC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoIMC.class.getResource("/icones/iconfinder_09_Calculator_1871426.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(26, 30, 48, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(26, 66, 48, 14);
		contentPane.add(lblAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(70, 27, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(70, 63, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblimc = new JLabel("IMC:");
		lblimc.setBounds(207, 43, 48, 14);
		contentPane.add(lblimc);
		
		txtIMC = new JTextField();
		txtIMC.setBounds(227, 63, 96, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);
		
		JButton btnPeso = new JButton("");
		btnPeso.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/imc.png")));
		btnPeso.setBounds(26, 133, 100, 100);
		contentPane.add(btnPeso);
		
		JButton btnAltura = new JButton("");
		btnAltura.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/limpar.png")));
		btnAltura.setBounds(223, 133, 100, 100);
		contentPane.add(btnAltura);
	}
	
	private void calcular() {
		DecimalFormat formatar = new DecimalFormat("0.0");
		double nota1,nota2,media;
		//A linha abaixo captura o conteúdo da caixa de texto, converte para o tipo Double e armazena na Variavel
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
		media = (nota1 + nota2) / 2;
		txtMedia.setText(formatar.format(media));
			if (media < 5) {
			JOptionPane.showMessageDialog(null, "REPROVADO","Status",JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "APROVADO","Status",JOptionPane.INFORMATION_MESSAGE);
			}
	}
	private void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtIMC.setText(null);
		
		
	}
	
}
