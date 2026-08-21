import java.awt.event.*;
import javax.swing.*;

public class QuizBattleGUI  extends JFrame implements ActionListener {
    
    // to initialize the class, but what class?
    Questions question = new Questions();
    
    JLabel lblQuestion;
    JLabel lblResult;
    
    JButton btn1;
    JButton btn2;
    
    public QuizBattleGUI() {
        // name appropriate title
        setTitle("Programming Quiz Battle");
        
        // set the size, find out the suitable size
        setSize(400, 250);
        
        setLayout(null);
        
        // by default set to close method
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(30, 20, 320, 30);
        
        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 80, 120, 40);
        btn1.addActionListener(this); // Needs an Action Listener for clicks
        
        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 80, 120, 40);
        btn2.addActionListener(this); // Needs an Action Listener for clicks
        
        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(30, 150, 300, 30);
        
        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton)e.getSource();
        
        if(question.isCorrect(button.getText())){
            lblResult.setText("Correct! You defeated the Code Boss!");
        }
        else{
            lblResult.setText("Wrong! Try Again!");
        }
    }
    
    // the main entry point to open the app, what is it? 
    public static void main(String[] args) {
        new QuizBattleGUI().setVisible(true); // to run the app;
    }

    /** Supplies the question and answers displayed by the quiz. */
    private static class Questions {
        private final String question = "Which language is used to build this GUI?";
        private final String option1 = "Java";
        private final String option2 = "Python";

        String getQuestion() {
            return question;
        }

        String getOption1() {
            return option1;
        }

        String getOption2() {
            return option2;
        }

        boolean isCorrect(String answer) {
            return option1.equals(answer);
        }
    }
}