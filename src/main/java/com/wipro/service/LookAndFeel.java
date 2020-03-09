package com.wipro.service;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;

public class LookAndFeel {
	
	
	public static void messageInput() throws Exception {
	    UIManager.setLookAndFeel(new NimbusLookAndFeel());
	    SwingUtilities.invokeAndWait(new Runnable() {
	        public void run() {
	            //new bug6937798();
	        }
	    });
	}

}
