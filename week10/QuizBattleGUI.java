import javax.swing.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    // The class being initialised here is Questions: it holds the question data.
    Questions question;

    JLabel lblQuestion;
    JLabel lblResult;

    JButton btn1;
    JButton btn2;

    public QuizBattleGUI() {

        question = new Questions("Which keyword creates an object?",
                "new", "class", "new");

        setTitle("Programming Quiz Battle");
        setSize(390, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(30, 20, 320, 30);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 80, 120, 40);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 80, 120, 40);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(30, 150, 300, 30);

        // Both buttons report back to this class when they are clicked.
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {

            lblResult.setText("Correct! You defeated the Code Boss!");

        } else {

            lblResult.setText("Wrong! Try Again!");
        }
    }

    // The main entry point that opens the app.
    public static void main(String[] args) {

        new QuizBattleGUI();
    }
}
