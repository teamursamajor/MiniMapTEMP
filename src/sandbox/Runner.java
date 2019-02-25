package sandbox;

//https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html


import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class Runner {
	
	static Border blackLine = BorderFactory.createLineBorder(Color.BLACK);
	static Border raisedEtched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	static Border loweredEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	static Border raisedBevel = BorderFactory.createRaisedBevelBorder();
	static Border loweredBevel = BorderFactory.createLoweredBevelBorder();
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		
		JMenuBar menuBar = new JMenuBar();
//		Border compound1 = BorderFactory.createCompoundBorder(loweredEtched, loweredBevel);
//		Border compound1 = BorderFactory.createCompoundBorder(loweredEtched, loweredEtched);
		Border compound1 = BorderFactory.createCompoundBorder(loweredBevel, blackLine);
		menuBar.setBorder(compound1);
//		menuBar.setBorder(loweredBevel);
		
		JMenu menu1 = new JMenu("Menu 1");
		menu1.setBorder(raisedBevel);
//		menu1.getAccessibleContext().setAccessibleDescription(
//        "A Filler Menu Baby");
		JMenu menu2 = new JMenu("Items Menu");
		menu2.setBorder(raisedBevel);
		JMenu menu3 = new JMenu("Action Menu");
		menu3.setBorder(raisedBevel);
		
		JMenuItem m1 = new JMenuItem("Menu Item 1");
		JMenuItem m2 = new JMenuItem("Menu Item 2");
		
		menu1.add(m1);
		menu1.add(m2);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		
		
		frame.setJMenuBar(menuBar);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}

}
