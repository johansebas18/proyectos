import javax.swing.*;
import java.util.*;

public class Formulario extends JFrame {

private JLabel label1, label2;

public Formulario(){


    setLayout(null);
    label1=JLabel("formulario de prueba");
    label1.setBounds(10,20,300,30);
    add(label1);
    label2=JLabel("version 1.0");
    label2.setBounds(10,100,100,30);
    add(label2);

}

public static void main(String [] ar){



    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,300,200);
    formulario1.setResizable(false);
    formulario1.setVisible(true);
}

}