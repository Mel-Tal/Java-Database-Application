import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TutorApply extends JPanel {
	
	public TutorApply(ArrayList<String> courses) {

		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		
        JPanel sInfoPanel = new JPanel();
        sInfoPanel.setLayout(new GridLayout(2, 1));
        sInfoPanel.add(new JLabel("Student Information"));
        JPanel sInfoInputs = new JPanel();
        sInfoInputs.setLayout(new GridLayout(3,3));
        sInfoInputs.add(new JTextField("gtID", 10));
        sInfoInputs.add(new JTextField("First Name", 10));
        sInfoInputs.add(new JTextField("Last Name", 10));
        sInfoInputs.add(new JTextField("Email", 10));
        sInfoInputs.add(new JTextField("Cell Phone", 10));
        sInfoInputs.add(new JTextField("GPA", 10));
        JPanel boxHolder = new JPanel();
        boxHolder.setLayout(new GridLayout(2,1));
        boxHolder.add(new Checkbox("Undergraduate"));
        boxHolder.add(new Checkbox("Graduate"));
        sInfoInputs.add(boxHolder);
        sInfoPanel.add(sInfoInputs);

        JPanel sCoursePanel = new JPanel();
        sCoursePanel.setLayout(new GridLayout(2,1));
        sCoursePanel.add(new JLabel("Courses"));
        JPanel courseList = new JPanel();
        courseList.setLayout(new GridLayout(courses.size() + 1, 1));
        JPanel listHeader = new JPanel();
        listHeader.setLayout(new GridLayout(1,2));
        listHeader.add(new JLabel("Course"));
        listHeader.add(new JLabel("GTA?"));
        courseList.add(listHeader);
        for (String course: courses) {
            JPanel row = new JPanel();
            row.setLayout(new GridLayout(1,2));
            row.add(new JLabel(course));
            row.add(new Checkbox());
            courseList.add(row);
        }
        sCoursePanel.add(courseList);

        JButton ok = new JButton("OK");
        ok.addActionListener(new okButton());
        ok.setPreferredSize(new Dimension(50, 20));


        add(sInfoPanel);
        add(sCoursePanel);
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