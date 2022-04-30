import java.awt.EventQueue;

import javax.swing.JFrame;

public class login {

	private JFrame Login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.setBounds(100, 100, 450, 500);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
