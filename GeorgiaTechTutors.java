import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.util.Date;
import

public class GeorgiaTechTutors {

	public static JFrame frame;
	public static JPanel main;

	public static void updateMain(JPanel panel) {
		main = panel;
		main.repaint();
		frame.repaint();
		System.out.println("Main panel updated");
		frame.pack();
	}
	
	public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
            getConnection("jdbc:h2:~/GTT", "sa", "");
        // add application code here
        conn.close();

	    frame = new JFrame ("Georgia Tech Tutors");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);

        main = new JPanel();
        main.add(new Login());

        frame.add(main);
        frame.setVisible(true);

	}
}