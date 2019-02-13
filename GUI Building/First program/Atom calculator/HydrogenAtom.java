import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @purpose Find how many hydrogen atoms could compose a given weight.
 * 
 * @author Jody Rutter
 * @version vCode.
 */
public class HydrogenAtom extends JFrame
{
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 720;
    
    private JLabel weightG, numAtoms;
    private JTextField weightGTF, numAtomsTF;
    private JButton calculateNum, exitB;
    
    //Button handlers:
    private findNumAtomsButtonHandler faHandler;
    private exitButtonHandler ebHandler;
    
    /**
     * Constructor for objects of type HydrogenAtom
     */
    public HydrogenAtom()
    {
        //Instantiate the labels:
        weightG = new JLabel("Enter the weight of the specimen: ", SwingConstants.RIGHT);
        numAtoms = new JLabel("Number of atoms in the specimen: ", SwingConstants.RIGHT);
        
        //Text fields next:
        weightGTF = new JTextField(10);
        numAtomsTF = new JTextField(10);
        
        //Buttons
        calculateNum = new JButton("Calculate");
        faHandler = new findNumAtomsButtonHandler();
        calculateNum.addActionListener(faHandler);
        exitB = new JButton("Exit");
        ebHandler = new exitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        //Window title:
        setTitle("Hydrogen Atoms");
        Container pane = getContentPane();
        
        //Set the layout:
        pane.setLayout(new GridLayout(3, 2));
        
        //Get the content pane (CP):
        pane.add(weightG);
        pane.add(weightGTF);
        pane.add(numAtoms);
        pane.add(numAtomsTF);
        pane.add(calculateNum);
        pane.add(exitB);
        
        //JFrame
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private class findNumAtomsButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double weight, numAtoms;
            weight = Double.parseDouble(weightGTF.getText());
            numAtoms = weight*(6.02*Math.pow(10, 23));
            
            numAtomsTF.setText("" + numAtoms);
        }
    }
    
    public class exitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    public static void main(String[] args)
    {
        HydrogenAtom a = new HydrogenAtom();
    }
}