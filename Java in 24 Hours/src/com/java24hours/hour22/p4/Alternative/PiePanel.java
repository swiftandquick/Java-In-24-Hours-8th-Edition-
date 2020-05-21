package com.java24hours.hour22.p4.Alternative;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

@SuppressWarnings("serial")
public class PiePanel extends JPanel {

	private PieSlice[] slice;
	
	private int current = 0;
	
	private float totalSize = 0;
	private Color background; 
	
	class PieSlice {
		
		Color color;
		float size;
		
		PieSlice() {
			color = Color.lightGray;
			size = 0;
		}
		
		PieSlice(Color rColor, float rSize) {
			color = rColor;
			size = rSize;
		}
	}
	
	
	PiePanel(int sliceCount) {
		slice = new PieSlice[sliceCount];
		background = getBackground();
	}
	
	
	public void addSlice(Color rColor, float rSize) {
		if (current <= slice.length) {
			slice[current] = new PieSlice(rColor, rSize);
			totalSize = totalSize + rSize;
			current++;
		}
		
	}
	
	
	public void paintComponent(Graphics comp) {
		
		Graphics2D comp2D = (Graphics2D) comp;
		
		int width = getSize().width - 10;
		int height = getSize().height - 15;
		int xInset = 5;
		int yInset = 5;
		
		comp2D.setColor(background);
		comp2D.fillRect(0,  0, getSize().width, getSize().height);
		comp2D.setColor(Color.lightGray);
		Ellipse2D.Float pie = new Ellipse2D.Float(xInset, yInset, width, height);
		comp2D.fill(pie);
		float start = 0;
		
		for (int i = 0; i < slice.length; i++) {
			float extent = slice[i].size * 360F / totalSize;
			comp2D.setColor(slice[i].color);
			Arc2D.Float drawSlice = new Arc2D.Float
					(xInset, yInset, width, height, start, extent, Arc2D.Float.PIE);
			comp2D.fill(drawSlice);
			start = start + extent;
		}
		
	}
	
}
