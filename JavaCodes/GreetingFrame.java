import javax.swing.*;
import java.time.LocalTime;
import java.util.*; 

public class GreetingFrame   extends JFrame {

    public GreetingFrame() {
        // Set the title of the JFrame
        setTitle("Greeting Program");
        
        // Set the size of the JFrame
        setSize(300, 200);
        
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Determine the greeting message based on the current time
        String message = getGreetingMessage();
        
        // Create a JLabel to display the greeting
        JLabel label = new JLabel(message, SwingConstants.CENTER);
        
        // Add the label to the JFrame
        add(label);



        //JLabel label1 = new JLabel("Batch1-6CSN", SwingConstants.CENTER);
        
        // Add the label to the JFrame
        add(label);
		//add(label1);
        
        // Make the JFrame visible
        setVisible(true);
    }

    private String getGreetingMessage() {
        // Get the current time
        Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		if(timeOfDay >= 0 && timeOfDay < 12){
        return("Good Morning");
		}else if(timeOfDay >= 12 && timeOfDay < 16){
        return("Good Afternoon");
		}else if(timeOfDay >= 16 && timeOfDay < 21){
        return("Good Evening");
		}else if(timeOfDay >= 21 && timeOfDay < 24){
        return("Good Morning");
		}
		return "Welcome to Mars";
    }

    public static void main(String[] args) {
        // Create and display the JFrame
        new GreetingFrame();
    }
}
