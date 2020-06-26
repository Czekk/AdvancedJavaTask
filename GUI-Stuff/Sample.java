import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sample extends JFrame {
	public Sample() {
		super();
		this.setTitle("HelloApp");
		this.getContentPane().setLayout(null);
		this.setBounds(250, 250, 400, 400);
		this.add(makeButton());
		this.add(makeButton2());
		this.add(makeButton3());
		this.add(makeButton4());
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private JButton makeButton() {
		final JButton b = new JButton();
		b.setText("utf-16 hex)");
		b.setBounds(40, 40, 100, 40);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b, "0xD83D 0xDE00 ");
			}
		});
		return b;
	}

	private JButton makeButton2() {
		final JButton b2 = new JButton();
		b2.setText("utf-16 bin");
		b2.setBounds(40, 90, 100, 40);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, "11011000 00111101 11011110 00000000");
			}
		});
		return b2;
	}

	private JButton makeButton3(){
		final JButton b3 = new JButton();
		b3.setText("utf- 8 hex");
		b3.setBounds(40, 140, 100, 40);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3, "0xF0 0x9F 0x98 0x80");
			}
		});
		return b3;
	}

	private JButton makeButton4(){
		final JButton b4 = new JButton();
		b4.setText("utf- 8 bin");
		b4.setBounds(40, 190, 100, 40);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b4, "11110000 10011111 10011000 10000000");
			}
		});
		return b4;
	}


	public static void main(String[] args) {
		// Swing calls must be run by the event dispatching thread.
		try{
			SwingUtilities.invokeAndWait(() -> new Sample());
		}
		catch( Exception e ){
			System.out.println("error");
		}
	}
}
