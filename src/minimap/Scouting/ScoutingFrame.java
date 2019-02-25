package minimap.Scouting;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.*;


public class ScoutingFrame extends JFrame implements ScoutPlan {
	//private JButton newBtn,editBtn,saveBtn,deleteBtn;
	
	public ScoutingFrame(){
		//TODO - move to an interfact
		JPanel panel = new JPanel();
		
		JTextField number = new JTextField("Team Number");
		JTextField name = new JTextField("Team Name");
		
		
		for(int i = 0; i < ScoutPlan.actions.length; i++){
			panel.add(new JCheckBox(ScoutPlan.actions[i]));
		}
		this.add(panel);
		
		JButton save = new JButton();
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		
		JMenuBar menuBar = this.getJMenuBar();
		menuBar.add(save);
		this.setJMenuBar(menuBar);
		this.setSize(500, 500);
	}
	
	//New

	
	//Edit
	
	//Save
	
	//Delete
	
	//Frame
	
	
}
