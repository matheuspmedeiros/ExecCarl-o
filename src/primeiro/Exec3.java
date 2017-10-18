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



public class Exec3 extends JFrame {

	// 
	JLabel lblDig1 = new JLabel ("Cálculo - MUV");
	JLabel lblDig2 = new JLabel ("v=5+10t");
	//JLabel lblDig3 = new JLabel ("Digite o Valor C");
	
	JButton btnRESULT = new JButton ("Resultado");
	
	JLabel lblResultM = new JLabel ("");
	JLabel lblResultD = new JLabel ("");
	JLabel lblResultP = new JLabel ("");

double V,t,Vi,A;

public Exec3(){

	super("Calculadora - MUV");
	Container paine = this.getContentPane();
	
	//primeiro label 
		paine.add(lblDig1);
		lblDig1.setBounds(80, 20, 200, 25);
		
	//segundo numero
		paine.add(lblDig2);
		lblDig2.setBounds(80, 40, 200, 25);
		
		paine.add(btnRESULT);
		btnRESULT.setBounds(80,100, 100, 25);
		btnRESULT.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Vi=5;
				
				A=10;
				
				t=6;
								
				V=Vi+A*6;
				
				lblResultM.setText ("Velocidade incial: "+ Vi +" m/s");
				lblResultD.setText ("Aceleração : "+ A + " m/s²");
				lblResultP.setText ("Velocidade do instante 6s : "+ V + " m/s");			
			}
		});
		
		
		paine.add(lblResultM);
		lblResultM.setBounds(80, 140, 200, 25);
		
		paine.add(lblResultD);
		lblResultD.setBounds(80, 160, 200, 25);
		
		paine.add(lblResultP);
		lblResultP.setBounds(80, 180, 200, 25);
		
		
	paine.setLayout(null); // posicionamento dos objetos do layout
	this.setSize(350,300); // tamanho da tela
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

		public static void main (String[] args){
	Exec3 exec1 = new Exec3();
	}
}