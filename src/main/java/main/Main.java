package main;

import java.awt.Dimension;

import gui.MainWindow;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
	    {
	      public void run()
	      {
	    	  MainWindow window = new MainWindow();
	    	  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	  window.setPreferredSize(new Dimension(726, 600));
	    	  window.pack();
	    	  window.setVisible(true);
	      }
	    });

	}

}
