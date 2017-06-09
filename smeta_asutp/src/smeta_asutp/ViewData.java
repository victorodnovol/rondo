package smeta_asutp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import TwoButtons.ColorListener;
import TwoButtons.LabelListener;

public class ViewData {
	JFrame frame;
	JLabel label;
	
	public void createInputForm (Smeta s){
		// create JForm for user to enter initial data to smeta

		
		public void go(){
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton labelButton = new JButton ("Сменить лэйбл");
			labelButton.addActionListener(new LabelListener());
			
			JButton colorButton = new JButton ("Сминить цвет");
			colorButton.addActionListener(new ColorListener());
			
			label = new JLabel("Новый лэйбл");
			MyDrawPanel drawPanel = new MyDrawPanel();
			
			frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
			frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
			frame.getContentPane().add(BorderLayout.EAST, labelButton);
			frame.getContentPane().add(BorderLayout.WEST, label);
			
			frame.setSize(300, 300);
			frame.setVisible(true);
			
		}
		
		class LabelListener implements ActionListener{
			public void actionPerformed(ActionEvent event){
				label.setText("Туц-туц!");
			}
		}
		class ColorListener implements ActionListener{
			public void actionPerformed(ActionEvent event){
				frame.repaint();
			}
		}
		

	}
}
