package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTest  extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel  panel1;
    private JPanel  panel2;



    public MyTest(){
        initData();
        setInitLayout();
        addEventListener();
    }
    private void initData(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton("click1");
        button2 = new JButton("click2");
        button3 = new JButton("click3");
        button4 = new JButton("click4");

    }
    private void setInitLayout() {
        setLayout(new BorderLayout());

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLACK);
        add(panel1, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.EAST);
        add(button3, BorderLayout.SOUTH);
        add(button4, BorderLayout.WEST);


        setVisible(true);
    }
        private void addEventListener() {
            button1.addActionListener(this); // 다형성
            button2.addActionListener(this);
            button3.addActionListener(this);
            button4.addActionListener(this);

        }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        // JButton -> 다운 캐스팅
        JButton selectedButton = (JButton) e.getSource();
        System.out.println(selectedButton);
        System.out.println(selectedButton.getText());

        if(selectedButton == button1){
            panel1.setBackground(Color.YELLOW);
        }else if(selectedButton == button2){
            panel1.setBackground(Color.PINK);
        }else if(selectedButton == button3){
            panel1.setBackground(Color.BLUE);
        }else if(selectedButton == button4){
            panel1.setBackground(Color.CYAN);
        }
    }
    public static void main(String[] args) {
        new MyTest();
    }
}
