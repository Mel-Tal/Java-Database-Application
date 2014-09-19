import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TutorSearch extends JPanel {
	
	public TutorSearch(ArrayList<String> courses) {

		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
		JLabel course = new JLabel("Course");

		JComboBox courseList = new JComboBox();

		for (String c: courses) {
			courseList.addItem(c);
		}

		JPanel coursePanel = new JPanel();
		coursePanel.add(course);
		coursePanel.add(courseList);

		JLabel note = new JLabel("Availability: Note - tutor sessions can only be scheduled one hour a week for a given course.");

		JButton ok = new JButton("OK");
        ok.addActionListener(new okButton());

		add(coursePanel);
		add(note);
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