package ch.fhnw.oop.exercise03;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;




public class TestMigLayout {

//	Deklarieren der Controls
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4; 
	
	private JTextArea textArea;
	
	private JButton button_left;
	private JButton button_right;
	
//	Was bedeutet das in der MainMethode ???
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new TestMigLayout().createAndShowUI();
			}
		});
	}
	
	private void createAndShowUI(){
		initializeComponents();
		final JPanel content = layoutComponents();
		
		final JFrame fenster = new JFrame("Beispiel mit MigLayout");
		fenster.add(content);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(300, 300);
		
		fenster.setVisible(true);
	}
	
	//	Initialisieren der Controls
	private void initializeComponents(){
		
		button_1 = new JButton ("1");
		button_2 = new JButton ("2");
		button_3 = new JButton ("3");
		button_4 = new JButton ("4");
		
		textArea = new JTextArea("Textfeld");
		
		button_left = new JButton ("left");
		button_right = new JButton ("right");
	}

	//Layouten der Controls
	private JPanel layoutComponents(){
	
	JPanel panel = new JPanel();
	panel.setLayout(new MigLayout("wrap 3","[][grow][]","top"));
	
	
	panel.add(button_1);
	panel.add(textArea, "span 2 4, grow" );
	panel.add(button_2, "wrap");
	panel.add(button_3, "wrap");
	panel.add(button_4, "wrap");
	
	panel.add(button_left, "skip");
	panel.add(button_right, "right");
	
	return panel;
	
	}

}
