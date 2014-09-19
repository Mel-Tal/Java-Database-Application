import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ProfRecommend extends JPanel {
	
	public ProfRecommend() {

		setLayout (new GridLayout (4, 1));

		JPanel studentID = new JPanel();
		studentID.setLayout(new GridLayout(1,2));
		studentID.add(new JLabel("Student GTID"));
		studentID.add(new JTextField(10));
		add(studentID);

        JPanel descPanel = new JPanel();
        descPanel.setLayout(new GridLayout(2,1));
        descPanel.add(new JLabel("Descriptive Evaluation"));
        descPanel.add(new JTextArea());
        add(descPanel);

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(2,1));
        numPanel.add(new JLabel("Numeric Evaluation"));
        JPanel boxHolder = new JPanel();
        boxHolder.setLayout(new GridLayout(4,1));
        boxHolder.add(new Checkbox("4 - Highly Recommend"));
        boxHolder.add(new Checkbox("3 - Recommend"));
        boxHolder.add(new Checkbox("2 - Recommend with reservations"));
        boxHolder.add(new Checkbox("1 - Do not Recommend"));
        numPanel.add(boxHolder);
        add(numPanel);

        JButton ok = new JButton("OK");
        ok.addActionListener(new okButton());
        add(ok);


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