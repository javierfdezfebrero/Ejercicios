package intefaces_swing;


import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface () {
       Container c= getContentPane();

       JPanel fSuperior= new JPanel(new FlowLayout());
        JPanel fInferior= new JPanel(new FlowLayout());
        JPanel fCentrado= new JPanel(new FlowLayout());
        JPanel fOeste= new JPanel(new FlowLayout());

        fInferior.add(new JButton("Cancel"));
        fInferior.add(new JButton("OK"));



        fSuperior.add(new JLabel("Superior"));
        fCentrado.add(new JLabel("centrado"));
        //fInferior.add(new JLabel("Inferior"));
        fOeste.add(new JLabel("Oeste"));

        c.add(fSuperior, BorderLayout.NORTH);
        c.add(fCentrado, BorderLayout.CENTER);
        c.add(fInferior, BorderLayout.SOUTH);
        c.add(fOeste, BorderLayout.WEST);

        //pack();
        setSize(600,400);
        setTitle("Interface Javier");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {

    new Interface();

    }

}
