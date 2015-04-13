package com.github.sbugat.executablejarskeleton;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * Main class of the Executable jar
 * 
 * @author Sylvain Bugat
 * 
 */
public class ExecutableMainClass {

	/**
	 * Main program launched in the jar file
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(final String args[]) {

		try {
			JOptionPane.showMessageDialog(null, "It works!", "Your skill is great!!", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
		}
		catch (final HeadlessException headlessException) {
			System.out.println("No display mode: It works! Your skill is great!!");
		}
	}
}
