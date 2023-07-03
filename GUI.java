import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame{
    GUI() {
        setTitle("첫번째 프레임");
        setSize(300, 400);
        setVisible(true);
    }
    public static void GUI() {
        JFrame omokmain = new GUI();
        JPanel Lines = new JPanel();
    }
}
