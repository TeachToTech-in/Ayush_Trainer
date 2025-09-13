package Day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calculator extends Frame {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button sum, sub, mul, div;

    TextField screen;

    Calculator() {
        TextField screen = new TextField();
        screen.setBounds(30, 30, 400, 40);

        b0 = new Button("0");
        b0.setBounds(30, 30, 10, 10);

        b1 = new Button("1");
        b1.setBounds(30, 30, 10, 10);

        b2 = new Button("2");
        b2.setBounds(30, 30, 10, 10);

        b3 = new Button("3");
        b3.setBounds(30, 30, 10, 10);

        b4 = new Button("4");
        b4.setBounds(30, 30, 10, 10);

        b5 = new Button("5");
        b5.setBounds(30, 30, 10, 10);

        b6 = new Button("6");
        b6.setBounds(30, 30, 10, 10);

        b7 = new Button("7");
        b7.setBounds(30, 30, 10, 10);

        b8 = new Button("8");
        b8.setBounds(30, 30, 10, 10);

        b9 = new Button("9");
        b9.setBounds(30, 30, 10, 10);

        sum = new Button("+");
        sum.setBounds(30, 30, 10, 10);
        sum.setFont(new Font("Arial", Font.BOLD, 40));
        sum.setForeground(Color.RED);
        sum.setBackground(Color.lightGray);

        sub = new Button("-");
        sub.setBounds(30, 30, 10, 10);
        sub.setFont(new Font("Arial", Font.BOLD, 40));
        sub.setForeground(Color.RED);
        sub.setBackground(Color.lightGray);

        mul = new Button("x");
        mul.setBounds(30, 30, 10, 10);
        mul.setFont(new Font("Arial", Font.BOLD, 40));
        mul.setForeground(Color.RED);
        mul.setBackground(Color.lightGray);

        div = new Button("/");
        div.setBounds(30, 30, 10, 10);
        div.setFont(new Font("Arial", Font.BOLD, 40));
        div.setForeground(Color.RED);
        div.setBackground(Color.lightGray);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));

        p.add(sum);
        p.add(sub);
        p.add(mul);
        p.add(div);

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);

        Frame f = new Frame("Calculator");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setBackground(Color.LIGHT_GRAY);
        f.setLayout(new GridLayout(2, 0));

        f.add(screen);
        f.add(p);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
