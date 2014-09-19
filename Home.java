import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Home extends JPanel {

	    private String userType;
        private ArrayList<String> courses;

        public Home(String userType) {

        	this.userType = userType;
            courses = new ArrayList();
            courses.add("CS 4400");
            courses.add("MATH 3012");
            courses.add("CS 1331");
            courses.add("PHYS 1101");

            setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

	        if (userType.equals("Student")) {
	        	System.out.println("Input .equals Student");
	        	JButton searchTutors = new JButton("Search/Schedule a Tutor");
	        	searchTutors.addActionListener(new ButtonListener(new TutorSearch(courses)));
	        	add(searchTutors);
	        	JButton rate = new JButton("Rate a Tutor");
	        	rate.addActionListener(new ButtonListener(new RateTutor(courses)));
	        	add(rate);
	        } else if (userType.equals("Tutor")) {
	        	System.out.println("Input .equals Tutor");
	        	JButton apply = new JButton("Apply");
	        	apply.addActionListener(new ButtonListener(new TutorApply(courses)));
	        	add(apply);
	        	JButton findSchedule = new JButton("Find my Schedule");
	        	findSchedule.addActionListener(new ButtonListener(new TutorSchedule()));
	        	add(findSchedule);
	        } else if (userType.equals("Professor")) {
	        	System.out.println("Input .equals Professor");
	        	JButton recommend = new JButton("Add Recommendation");
	        	recommend.addActionListener(new ButtonListener(new ProfRecommend()));
	        	add(recommend);
	        } else if (userType.equals("Administrator")) {
	        	System.out.println("Input .equals Administrator");
	        	JButton rep1 = new JButton("Summary 1");
	        	rep1.addActionListener(new ButtonListener(new AdminRep1()));
	        	add(rep1);
	        	JButton rep2 = new JButton("Summary 2");
	        	rep2.addActionListener(new ButtonListener(new AdminRep2()));
	        	add(rep2);
	        }

	        JButton exit = new JButton ("Exit");
	        exit.addActionListener(new exitButton());
	        add(exit);

	        System.out.println("Home panel created");

        }

        private class ButtonListener implements ActionListener {
        
        private JPanel toOpen;

        public ButtonListener(JPanel toOpen) {
            this.toOpen = toOpen;
        }

        public void actionPerformed(ActionEvent e) {

            GeorgiaTechTutors.main.add(toOpen);

            setVisible(false);

//            GeorgiaTechTutors.frame.pack();

        }
    }

    private class exitButton implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}