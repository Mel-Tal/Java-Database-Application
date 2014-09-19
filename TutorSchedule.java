import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TutorSchedule extends JPanel {
	
	public TutorSchedule() {

		setLayout (new GridLayout (1,2));
		
        JPanel gtidPanel = new JPanel();
        gtidPanel.setLayout(new GridLayout(3,1));
        gtidPanel.add(new JLabel("Enter your GTID"));
        gtidPanel.add(new JTextField(10));
        JButton ok = new JButton("OK");
        ok.addActionListener(new okButton());
        gtidPanel.add(ok);

        add(gtidPanel);
	}

	private class okButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            JPanel content = new Home("Tutor");

            GeorgiaTechTutors.main.add(content);

            setVisible(false);

//            GeorgiaTechTutors.frame.pack();

        }
    }
}