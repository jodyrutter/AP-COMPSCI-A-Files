import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @purpose Start GUI building.
 * 
 * @author Jody Rutter
 * @version 9/27/2015
 */
public class GUI1 extends JFrame
{
    private static final int WIDTH = 1600;
    private static final int HEIGHT = 1000;
    
    private JLabel lengthL, widthL, areaL, perimeterL;
    private JTextField lengthTF, widthTF, areaTF, perimeterTF;
    private JButton calculateB, exitB;
    
    //Button handlers:
    private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
    
    /**
     * Constructor for objects of type GUI1
     */
    public GUI1()
    {
        //Instantiate the labels:
        lengthL = new JLabel("Enter the length: ", SwingConstants.RIGHT);
        widthL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
        areaL = new JLabel("Area: ", SwingConstants.RIGHT);
        perimeterL = new JLabel("Perimeter: ", SwingConstants.RIGHT);
        
        //Text fields next:
        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimeterTF = new JTextField(10);
        
        //Buttons:
        calculateB = new JButton("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        //Window title:
        setTitle("Area of a Rectangle");
        Container pane = getContentPane();
        
        //Set the layout:
        pane.setLayout(new GridLayout(4, 2));
        
        //Get the content pane (CP):
        pane.add(lengthL);
        pane.add(lengthTF);
        pane.add(widthL);
        pane.add(widthTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(calculateB);
        pane.add(exitB);
        
        //JFrame:
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private class CalculateButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double width, length, area;
            length = Double.parseDouble(lengthTF.getText());
            width = Double.parseDouble(widthTF.getText());
            area = length*width;
            
            areaTF.setText("" + area);
        }
    }
    
    public class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    public static void main(String[] args)
    {
            GUI1 a = new GUI1();
    }
}