import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
 
public class Exam2 extends JFrame {
 
    private JPanel contentPane;
    private int coffees;
    private JLabel lblNewLabel;
    private JButton btnNewButton;
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Exam2 frame = new Exam2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    public Exam2() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src\\coffee_icon.jpg"));
        setTitle("Red Devil Coffee Rewards");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 365, 185);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        btnNewButton = new JButton("Buy Coffee");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coffees++;
                lblNewLabel.setText("Number of coffees: " + coffees);
                
                if (coffees >= 10) {
                    PrintWriter coupon = null;
                    try {
                        coupon = new PrintWriter("coupon.txt");
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    coupon.println("CONGRATULATIONS! \n" + "With the purchase of your tenth coffee you have earned a free coffee!");
                    coupon.close();
                }
                else {
                    
                }
                
            }
        });
        btnNewButton.setBounds(120, 50, 115, 25);
        contentPane.add(btnNewButton);
        
        lblNewLabel = new JLabel();
        lblNewLabel.setBounds(10, 91, 333, 14);
        contentPane.add(lblNewLabel);
    }
            
}
