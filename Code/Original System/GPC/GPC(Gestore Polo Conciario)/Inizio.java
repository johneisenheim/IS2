import javax.swing.ImageIcon;

import javax.swing.JWindow;


import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.JDesktopPane;
import javax.swing.JProgressBar;
public class Inizio {

	public Inizio() throws Exception{
		getJWindow();
	}
	private JWindow jWindow = null;  //  @jve:decl-index=0:visual-constraint="331,88"
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabel = null;
	private JProgressBar jProgressBar = null;
	/**
	 * This method initializes jWindow	
	 * 	
	 * @return javax.swing.JWindow	
	 * @throws InterruptedException 
	 */
	public JWindow getJWindow() throws InterruptedException {
		if (jWindow == null) {
			
			Toolkit t = Toolkit.getDefaultToolkit();
			Dimension screenSize = t.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;

			jWindow = new JWindow();
			jWindow.setSize(new Dimension(460, 305));
			jWindow.setContentPane(getJDesktopPane());  // Generated
			jWindow.setLocation(height /2 , width / 6);
			jWindow.setVisible(true);
			for (double i = 0.00; i < 100; i++){
				Thread.sleep(30);
				jProgressBar.setValue(jProgressBar.getValue()+1);
				
			}
			
			jWindow.setVisible(false);
			
			//new Autenticazione();
			new Principale();
		}
		return jWindow;
	}
	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 * @throws InterruptedException 
	 */
	private JDesktopPane getJDesktopPane() throws InterruptedException {
		if (jDesktopPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(-2, -5, 473, 293));
			jLabel.setText("JLabel");
			jLabel.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().getImage("GPC.JPG")));
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabel, null);
			jDesktopPane.add(getJProgressBar(), null);
			
		}
		return jDesktopPane;
	}
	/**
	 * This method initializes jProgressBar	
	 * 	
	 * @return javax.swing.JProgressBar	
	 * @throws InterruptedException 
	 */
	private JProgressBar getJProgressBar() throws InterruptedException {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
			jProgressBar.setBounds(new Rectangle(-1, 289, 465, 15));
			jProgressBar.setStringPainted(true);

		}
		return jProgressBar;
	}

}
