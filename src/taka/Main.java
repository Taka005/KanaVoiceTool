package taka;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Main extends JFrame{

	public static void main(String[] args){
		Main frame = new Main();
		frame.setVisible(true);
	}

	public Main(){
		setResizable(false);
		setBackground(new Color(255,255,255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/assets/icon.png")));
		setTitle("KanaVoiceTool");
		setBounds(300,300,700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Kana Voice Tool");
		title.setFont(new Font("MV Boli",Font.PLAIN, 30));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(title,BorderLayout.NORTH);
		
		JTextArea message = new JTextArea();
		message.setTabSize(5);
		message.setToolTipText("読み上げるテキスト");
		getContentPane().add(message, BorderLayout.CENTER);
		
		JButton send = new JButton("読み上げ");
		send.setToolTipText("音声を生成");
		send.setVerticalAlignment(SwingConstants.TOP);
		getContentPane().add(send, BorderLayout.SOUTH);
		
		send.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(message.getText());
			}
		});
	}

}
