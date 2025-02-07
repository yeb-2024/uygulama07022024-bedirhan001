import javax.swing.*;
import java.awt.*;

public class profilSayfa {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel imageLabel = new JLabel();

    public profilSayfa(){
        label.setText("Bedirhan Karaman");
        label.setFont(new Font("arial",Font.PLAIN,25));


        ImageIcon icon = new ImageIcon("1.png");
        Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        frame.add(imageLabel);
        frame.add(label);

        frame.setSize(500,500);
        frame.setTitle("Profil sayfası");
        frame.setLayout(new GridLayout(2,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
