package intefaces_swing;


import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface () {
       Container c= getContentPane();

       /*
       creo os panles con Flowlayout e posicionos
        */

        FlowLayout fS= new FlowLayout();
        fS.setAlignment(FlowLayout.LEFT);
        FlowLayout fI= new FlowLayout();
        fI.setAlignment(FlowLayout.RIGHT);

        /*
        Creo os paneles e introduzco os flowlayouts
         */


       JPanel fSuperior= new JPanel(fS);
        JPanel fInferior= new JPanel(fI);
        JPanel fCentrado= new JPanel(new FlowLayout());
        JPanel fOeste= new JPanel(new FlowLayout());

        fSuperior.setAlignmentX(FlowLayout.LEFT);


        /*
        Añado os botons eas etiquetas os paneles
         */

        fInferior.add(new JButton("Cancel"));
        fInferior.add(new JButton("OK"));


        ImageIcon icono1 = new ImageIcon("j.png");

        /*
        Metodo para reescalar imagenes
         */
        Image image = icono1.getImage(); // transform it
        Image newimg = image.getScaledInstance(20, 15,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        icono1 = new ImageIcon(newimg);


        fSuperior.add(new JLabel(icono1));
        fSuperior.add(new JLabel(icono1));
        fSuperior.add(new JLabel(icono1));
        fSuperior.add(new JLabel(icono1));
        fSuperior.add(new JLabel(icono1));

        fCentrado.add(new JLabel("Texto no centrooo"));


        //fInferior.add(new JLabel("Inferior"));
        fOeste.add(new JLabel("Oeste"));


        /*
        Añado o contendor principal que é un border os paneles creados con Flowlayout
         */

        c.add(fSuperior, BorderLayout.NORTH);
        c.add(fCentrado, BorderLayout.CENTER);
        c.add(fInferior, BorderLayout.SOUTH);
        c.add(fOeste, BorderLayout.WEST);


        //Estilo

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
