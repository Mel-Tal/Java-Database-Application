import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RateTutor extends JPanel {
	
	public RateTutor(ArrayList<String> courses) {

		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
		JLabel course = new JLabel("Course");

		JComboBox courseList = new JComboBox();

		for (String c: courses) {
			courseList.addItem(c);
		}

		JPanel coursePanel = new JPanel();
		coursePanel.add(course);
		coursePanel.add(courseList);

		JLabel tutName = new JLabel("Tutor Name");
		JTextField nameInput = new JTextField(10);

		JPanel tutNamePanel = new JPanel();
		tutNamePanel.add(tutName);
		tutNamePanel.add(nameInput);

        JLabel descLabel = new JLabel("Descriptive Evaluation");
        JTextArea descEval = new JTextArea();
//        JScrollPane scroll = new JScrollPane(descEval, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JLabel numLabel = new JLabel("Numeric Evaluation");
        JPanel boxHolder = new JPanel();
        boxHolder.setLayout(new GridLayout(4,1));
        boxHolder.add(new Checkbox("4 - Highly Recommend"));
        boxHolder.add(new Checkbox("3 - Recommend"));
        boxHolder.add(new Checkbox("2 - Recommend with reservations"));
        boxHolder.add(new Checkbox("1 - Do not Recommend"));

        JButton ok = new JButton("OK");
        ok.addActionListener(new okButton());


		add(coursePanel);
		add(tutNamePanel);
		add(descLabel);
		add(descEval);
		add(numLabel);
		add(boxHolder);
		add(ok);
	}

	private class okButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            JPanel content = new Home("Student");

            GeorgiaTechTutors.main.add(content);

            setVisible(false);

//            GeorgiaTechTutors.frame.pack();

        }
    }
}