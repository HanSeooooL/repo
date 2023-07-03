import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame{
    GUI() {
        setTitle("첫번째 프레임");
        setSize(300, 400);
        setVisible(true);
    }
    public static void GUI(int MAX_Y, int MAX_X) {
        JFrame omokmain = new GUI();
        JPanel[][] Lines = null;

        Lines = new JPanel[MAX_Y][];

        for(int i = 0; i < MAX_Y; i++) {
            Lines[i] = new JPanel[MAX_X];
        }
    }
}
