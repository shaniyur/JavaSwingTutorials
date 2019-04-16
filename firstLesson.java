/*
 * Author: Sameer Haniyur
 * Date: 4/15/19
 * Description: Basic outline of java swing/gui
 * From Derek Banas Java tutorial 20
 */


package javaSwing1;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class firstLesson extends JFrame
{
	public firstLesson()
	{
		this.setSize(400,400);
		/*
		 * centers screen, alternative approach below to center 
		this.setLocationRelativeTo(null);
		*/
		//provides additional methods
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		//this.getWidth refers to this jframe, d is this screen
		int xPos = (d.width/2) - (this.getWidth() / 2);
		int yPos = (d.height/2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);
		this.setResizable(true);
		
		//allows user to close frame with one click(termination of program)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Frame1");
		
		//panels-surrounds componenets in gui, goes on frames
		JPanel p = new JPanel();
		JLabel label1 = new JLabel("Tell me something");
		
		//when you hover cursor over text in label
		label1.setToolTipText("Doesnt do anything");
		p.add(label1);
		
		//Buttons
		JButton b1 = new JButton("Push this");
		b1.setToolTipText("this is a button");
		p.add(b1);
		
		//Textfields, 10 defines width of field
		JTextField txt = new JTextField("Type here", 10);
		txt.setText("Type again");
		txt.setToolTipText("this is a textfield");
		p.add(txt);
		
		//Textarea- giant textfield w scrollbars
		JTextArea tArea = new JTextArea(15,20);
		tArea.setText("Just a whole bunch of text");
		tArea.setLineWrap(true);
		
		//scrollbars for text area
		JScrollPane scrollbar = new JScrollPane(tArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		p.add(scrollbar);
		this.add(p);
		this.setVisible(true);
		tArea.requestFocus();
		txt.requestFocus();
	}
	public static void main(String[] args)
	{
		new firstLesson();
	}

}
