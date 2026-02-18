package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int colorR = in.nextInt();
		int colorG = in.nextInt();
		int colorB = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextInt();
		double y = in.nextInt();
		double semiMajorAxis = in.nextInt();
		double semiMinorAxis = in.nextInt();
		StdDraw.setPenColor(colorR, colorG, colorB);
		StdDraw.filledEllipse (x, y, semiMajorAxis, semiMinorAxis);


	}
}
