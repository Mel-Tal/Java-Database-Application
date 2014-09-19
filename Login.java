import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JPanel {
    
    private JLabel gtidLabel;
    private JTextField gtidBox;
    private JLabel passLabel;
    private JPasswordField passBox;
    private JButton ok;

    public Login() {

        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        gtidLabel = new JLabel ("Enter GTID");
        gtidBox = new JTextField(9);
        passLabel = new JLabel ("Enter Password");
        passBox = new JPasswordField(20);
        ok = new JButton ("OK");
        ok.addActionListener(new TextGetter());

        JPanel inputs = new JPanel();
        inputs.setLayout (new GridLayout (2, 2));

        inputs.add(gtidLabel);
        inputs.add(gtidBox);
        inputs.add(passLabel);
        inputs.add(passBox);

        add(inputs);
        add(ok);
    }

    private class TextGetter implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println("Button Clicked");

            String input = gtidBox.getText();

            System.out.println("Input: " + input);

            JPanel content = new Home(input);

            GeorgiaTechTutors.main.add(content);

            setVisible(false);

//            GeorgiaTechTutors.frame.pack();

        }
    }

}