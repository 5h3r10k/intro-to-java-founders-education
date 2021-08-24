package code;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToe extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel panel = new JPanel();
	private XOButtons[] buttons = new XOButtons[9];
	
	private int turn = 0;
	
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		XOButtons source = (XOButtons)actionEvent.getSource();
		
		if(turn == 0){
			source.toggleX();
			setTitle("O's Turn");
		} else if(turn == 1){
			source.toggleO();
			setTitle("X's Turn");
		}
		
		turn = (turn + 1) % 2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicTacToe();

	}
	
	public TicTacToe() {
		
		setTitle("Tic Tac Toe");
		setSize(600,600);
		setLocation(100,100);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.setLayout(new GridLayout(3,3,5,5));
		panel.setBackground(Color.BLUE);
		
		for(int i=0; i < buttons.length; i++) {
			buttons[i] = new XOButtons();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		
		add(panel);
		
		
		setVisible(true);
		
	}

}
