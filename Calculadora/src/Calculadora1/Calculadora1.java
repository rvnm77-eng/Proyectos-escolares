package calculadora1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculadora1 extends JFrame implements ActionListener {

    JLabel lblN1, lblN2, lblR;
    JTextField txtN1, txtN2, txtR;
    JButton btnSumar, btnSalir;

    public Calculadora1() {
        super("Calculadora");
        setLayout(new GridLayout(4, 2));
        //Crear los objetos
        lblN1 = new JLabel("Numero 1 : ");
        lblN2 = new JLabel("Numero 2 : ");
        lblR = new JLabel("Restultado : ");
        txtN1 = new JTextField("0");
        txtN2 = new JTextField("0");
        txtR = new JTextField("         ");
        btnSumar = new JButton("Sumar");
        btnSalir = new JButton("Salir");
        //agregarlos a la ventana
        add(lblN1);
        add(txtN1);
        add(lblN2);
        add(txtN2);
        add(lblR);
        add(txtR);
        add(btnSumar);
        add(btnSalir);
        pack();
        //Agregar los eventos
        btnSumar.addActionListener(this);
        btnSalir.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculadora1();
    }

    //Eventos
    public void actionPerformed(ActionEvent ev) {
        //Si se pulso el boton salir
        if (ev.getSource().equals(btnSalir)) {
            System.exit(0);
        }
        if (ev.getSource().equals(btnSumar)) { //fue el otro
            //aqui se va a hacer la operacion de suma
            //si no se puede convertir a entero marca una exception
            try {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int res = n1 + n2;
                txtR.setText(Integer.toString(res));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                          "Escribe algo valido, no te pases");
            }
        }
    }
}
