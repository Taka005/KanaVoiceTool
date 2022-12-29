package taka;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main extends JFrame{

	public static void main(String[] args){
		try{
			Main frame = new Main();
			frame.setVisible(true);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Main(){
		setBackground(new Color(255,255,255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/assets/icon.png")));
		setTitle("KanaVoiceTool");
		setBounds(100,100,800,511);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Kana Voice Tool");
		title.setFont(new Font("MV Boli",Font.PLAIN, 30));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(title,BorderLayout.NORTH);

	}

}
