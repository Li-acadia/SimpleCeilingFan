import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Ariel", Font.BOLD, 20);
    JLabel fanState;
    Model model = new Model();
    public void initialize(){
        /*************** Fan State Panel *******************/
        fanState = new JLabel();
        fanState.setFont(mainFont);
        fanState.setText(model.toString());

        /*************** Buttons Panel *********************/
        JButton btnSpeed = new JButton("Change Speed");
        btnSpeed.setFont(mainFont);
        btnSpeed.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                new PullSpeedCordCommand().execute(model);
                fanState.setText(model.toString());

            }

        });

        JButton btnDirection = new JButton("Change Direction");
        btnDirection.setFont(mainFont);
        btnDirection.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                new PullReverseCordCommand().execute(model);
                fanState.setText(model.toString());
                
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnSpeed);
        buttonsPanel.add(btnDirection);

        /*************** Main Panel *******************/
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(200,200,225));
        mainPanel.add(fanState, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        add(mainPanel);
        setTitle("Simple Ceiling Fan");
        setSize(1000,200);
        setMinimumSize(new Dimension(500,100));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}