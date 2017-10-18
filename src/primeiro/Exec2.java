package primeiro;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;



public class Exec2 extends JFrame {

	//numeros 
	JTextField txtNum1 = new JTextField();
	JTextField txtNum2 = new JTextField();
	
	
	// 
	JLabel lblDig1 = new JLabel ("Digite o Valor A");
	JLabel lblDig2 = new JLabel ("Digite o Valor B");
	
	
	JButton btnRESULT = new JButton ("Resultado");
	
	JLabel lblResultM = new JLabel ("");
	JLabel lblResultD = new JLabel ("");
	JLabel lblResultP = new JLabel ("");

double A,B,C,C1;

public Exec2(){

	super("Calcular Hipotenusa");
	Container paine = this.getContentPane();
	
	//primeiro label 
		paine.add(lblDig1);
		lblDig1.setBounds(120, 20, 200, 25);
		
		paine.add(txtNum1);
		txtNum1.setBounds(70, 50, 200, 25);
		
		
	//segundo numero
		paine.add(lblDig2);
		lblDig2.setBounds(120, 80, 200, 25);
		
		paine.add(txtNum2);
		txtNum2.setBounds(70, 110, 200, 25);
		
			
		
		
		paine.add(btnRESULT);
		btnRESULT.setBounds(70, 400, 100, 25);
		btnRESULT.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				A = Double.parseDouble(txtNum1.getText());
				B = Double.parseDouble(txtNum2.getText());
				
				
				C=(A*A)+(B*B);
				C1=Math.sqrt(C);
				
				
				lblResultM.setText ("Hipotenusa C: "+ C1);
				
				
			}
		});
		
		
		paine.add(lblResultM);
		lblResultM.setBounds(70, 200, 200, 25);
		
				
	paine.setLayout(null); // posicionamento dos objetos do layout
	this.setSize(350,500); // tamanho da tela
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

	public static void main (String[] args){
	Exec2 exec1 = new Exec2();
	}
}
