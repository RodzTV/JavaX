import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class trying {

    public static void main(String[] args) {

        

        JLabel label = new JLabel();
        label.setText("wanna play some game??");
        label.setHorizontalTextPosition(JLabel.CENTER);// set  the text position to center 
        label.setVerticalTextPosition(JLabel.TOP); // set the vertical

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("LOGO.png");
        image.setImage(null);

    }
}