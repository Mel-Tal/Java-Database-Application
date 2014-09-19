import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AdminRep2 extends JPanel {
	
	public AdminRep2() {

		setLayout (new GridLayout (3,1));
        
        JPanel semesterSelect = new JPanel();
        semesterSelect.setLayout(new GridLayout(1,5));
        semesterSelect.add(new JLabel("Academic Year 2014"));
        semesterSelect.add(new Checkbox("Fall"));
        semesterSelect.add(new Checkbox("Spring"));
        semesterSelect.add(new Checkbox("Summer"));
        JButton formSubmit = new JButton("OK");
        semesterSelect.add(formSubmit);
        add(semesterSelect);

        JButton ok = new JButton("OK");
        ok.addActionListener(new okButton());
        add(ok);

    }

    private class okButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            JPanel content = new Home("Administrator");

            GeorgiaTechTutors.main.add(content);

            setVisible(false);

//            GeorgiaTechTutors.frame.pack();

        }
    }
}