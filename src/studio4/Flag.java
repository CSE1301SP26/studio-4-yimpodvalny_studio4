package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;
import java.io.FileNotFoundException;

import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		  StdDraw.clear();
  	StdDraw.setPenColor(255, 175, 175);
	StdDraw.filledRectangle(0.025, 1, 0.1, 1);
  	StdDraw.filledRectangle(0.975, 1, 0.1, 1);
	StdDraw.filledRectangle(0.5,0.95,0.5,0.1);
	StdDraw.setPenColor(175,214,255);
	StdDraw.filledCircle(0.3, 0.6, 0.1);
	StdDraw.filledCircle(0.7, 0.6, 0.1);
	double [] x = {0.4, 0.5, 0.6};
	double [] y = {0.4, 0.3, 0.4};
	StdDraw.setPenColor(255,140,75);
	StdDraw.filledPolygon(x, y);
	StdDraw.setPenColor(0,0,0);
	StdDraw.rectangle (0.5, 0.55, 0.5, 0.3);


		
	}
}
