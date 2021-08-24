package code;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButtons extends JButton {
	
	private static final long serialVersionUID = 1L;
	
	private ImageIcon xIcon = new ImageIcon(getClass().getResource("x.png"));
	private ImageIcon oIcon = new ImageIcon(getClass().getResource("o.png"));
	
	public void toggleX() {
		if(getIcon() == null) {
			setIcon(xIcon);
		} else {
			setIcon(null);
		}
	}
	
	public void toggleO() {
		if(getIcon() == null) {
			setIcon(oIcon);
		} else {
			setIcon(null);
		}
	}
	
}
