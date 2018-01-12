import java.awt.*;
import javax.swing.*;
public class Dog_Gif_Label {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Dog Gif");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon dog_gif = new ImageIcon("dog.jpg");
		
		JLabel first_label, second_label, third_label;
		
		first_label= new JLabel("Dog Gif",dog_gif, SwingConstants.CENTER);
		//first_label.setHorizontalTextPosition(SwingConstants.RIGHT);
		//first_label.setVerticalTextPosition(SwingConstants.CENTER);
		
		second_label= new JLabel("Dog Gif",dog_gif, SwingConstants.CENTER);
		second_label.setHorizontalTextPosition(SwingConstants.LEFT);
		second_label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		third_label= new JLabel("Dog Gif",dog_gif, SwingConstants.CENTER);
		third_label.setHorizontalTextPosition(SwingConstants.CENTER);
		third_label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setPreferredSize(new Dimension(300,800));
		panel.add(first_label);
		panel.add(second_label);
		panel.add(third_label);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
