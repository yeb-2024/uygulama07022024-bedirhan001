import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anaSayfa implements ActionListener {

    JFrame frame = new JFrame("Anasayfa");
    JButton button = new JButton("Profili Göster");

    public anaSayfa(){

        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        button.setBounds(200,200,150,50);
        frame.add(button);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
