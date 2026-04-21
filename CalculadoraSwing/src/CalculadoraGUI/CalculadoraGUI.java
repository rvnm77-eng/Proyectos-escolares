package CalculadoraGUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class CalculadoraGUI extends JFrame implements KeyListener {

    // Variables para la calculadora
    //double tipo de dato flotante 
    public double numero1 = 0;
    public double numero2 = 0;
    public double resultado = 0;
    
    //string dato para cadena 
    //operacion almacena el simbolo de la operacion 
    //=inicializacion de cadena vacia 
    public String operacion = "";
    //boolean dato ligico que tiene valores true o false 
    //nueva operacion bandera que indica si se debe iniciar una nueva operacion 
    //true valor inicial verdadero
    private boolean nuevaOperacion = true;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName());

    /**
     * Creates new form CalculadoraGUI
     */
    public CalculadoraGUI() {
        initComponents();
        addKeyListener(this);
        setFocusable(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 153, 204));
        jTextField1.setForeground(new java.awt.Color(204, 0, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextField1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.columnWeights = new double[] {5.0};
        jPanel1.setLayout(jPanel1Layout);

        jButton26.setText("<--");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 0, 0);
        jPanel1.add(jButton26, gridBagConstraints);

        jButton25.setText("CE");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        jPanel1.add(jButton25, gridBagConstraints);

        jButton24.setText("C");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        jPanel1.add(jButton24, gridBagConstraints);

        jButton23.setText("±");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 18, 0, 0);
        jPanel1.add(jButton23, gridBagConstraints);

        jButton22.setText("√");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 18, 0, 7);
        jPanel1.add(jButton22, gridBagConstraints);

        jButton21.setText("7");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanel1.add(jButton21, gridBagConstraints);

        jButton5.setText("8");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton5, gridBagConstraints);

        jButton17.setText("9");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton17, gridBagConstraints);

        jButton18.setText("/");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jButton18, gridBagConstraints);

        jButton19.setText("%");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 7);
        jPanel1.add(jButton19, gridBagConstraints);

        jButton20.setText("4");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanel1.add(jButton20, gridBagConstraints);

        jButton27.setText("5");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton27, gridBagConstraints);

        jButton28.setText("6");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton28, gridBagConstraints);

        jButton29.setText("*");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jButton29, gridBagConstraints);

        jButton30.setText("1/x");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 7);
        jPanel1.add(jButton30, gridBagConstraints);

        jButton31.setText("1");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanel1.add(jButton31, gridBagConstraints);

        jButton32.setText("2");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton32, gridBagConstraints);

        jButton34.setText("-");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jButton34, gridBagConstraints);

        jButton35.setText("=");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 7, 7);
        jPanel1.add(jButton35, gridBagConstraints);

        jButton36.setText("    0     ");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(12, 7, 7, 0);
        jPanel1.add(jButton36, gridBagConstraints);

        jButton38.setText("+");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 7, 0);
        jPanel1.add(jButton38, gridBagConstraints);

        jButton37.setText(".");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 7, 0);
        jPanel1.add(jButton37, gridBagConstraints);

        jButton1.setText("3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//boton <-- Elimina el ultimo digito ingresado
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        String textoActual = jTextField1.getText();//obtener el texto actual del display
        if (textoActual.length() > 1) {//verifica si hay mas de un caracter
            jTextField1.setText(textoActual.substring(0, textoActual.length() - 1));//elinina el ultimo caracter
        } else {
            jTextField1.setText(" ");//si solo queda un digito 
            nuevaOperacion = true;//marca la proxima enttrada de nueva operacion
        }

    }//GEN-LAST:event_jButton26ActionPerformed
//boton CE borra lo que esta en la pantalla pero mantiene la operacion pendiente
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        jTextField1.setText(" ");
        nuevaOperacion = true;//la proxima entrada remplaza el numero 
    }//GEN-LAST:event_jButton25ActionPerformed

//boton c borra todo
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        jTextField1.setText(" ");//no mestra nada en la pantalla
        //resetea todos los nuemeros almacenados
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        operacion = "";//borra cualquier operacion pediente 
        nuevaOperacion = true;//nueva entrada
    }//GEN-LAST:event_jButton24ActionPerformed

//cambio de signo
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        String textoActual = jTextField1.getText();
        if (!textoActual.equals("0")) {//solo funciona si no es 0
            double valor = Double.parseDouble(textoActual);//convierte el texto a numero
            valor = -valor;//multiplica por -1 cambia el signo 
            if (valor == (long) valor) {//verifica si es numero entero
                jTextField1.setText(String.format("%.0f", valor));/*formatear texto de manera controlada
            numero entero sin decimal
                 */
            } else {
                jTextField1.setText(String.valueOf(valor));//muestra el decimal
            }
        }
    }//GEN-LAST:event_jButton23ActionPerformed

//boton de raiz
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

        try {
            double valor = Double.parseDouble(jTextField1.getText());
            if (valor >= 0) {//solo permite numeros positivos
                double resultado = Math.sqrt(valor);//calcula la raiz cuadrada 
                if (resultado == (long) resultado) {
                    jTextField1.setText(String.format("%.0f", resultado));
                } else {
                    jTextField1.setText(String.valueOf(resultado));
                }
            } else {
                jTextField1.setText("Error");
            }
            nuevaOperacion = true;
        } catch (NumberFormatException e) {//se dispara si el texto no se puede convertir a numero
            jTextField1.setText("Error");
            nuevaOperacion = true;//error si el texto no es un numero valido
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    //boton 7
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "7");
        this.requestFocus();
    }//GEN-LAST:event_jButton21ActionPerformed

    //boton8
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "8");
        this.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    //boton 9
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "9");
        this.requestFocus();
    }//GEN-LAST:event_jButton17ActionPerformed

    //boton 4
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "4");
        this.requestFocus();
    }//GEN-LAST:event_jButton20ActionPerformed

    //boton 5
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "5");
        this.requestFocus();
    }//GEN-LAST:event_jButton27ActionPerformed

    //boton 6
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "6");
        this.requestFocus();
    }//GEN-LAST:event_jButton28ActionPerformed

    //boton 1
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "1");
        this.requestFocus();
    }//GEN-LAST:event_jButton31ActionPerformed

    //boton 2
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "2");
        this.requestFocus();
    }//GEN-LAST:event_jButton32ActionPerformed

    //boton 3
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(this.jTextField1.getText() + "3");
        this.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    //boton 0
    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed

        jTextField1.setText(this.jTextField1.getText() + "0");
        this.requestFocus();
    }//GEN-LAST:event_jButton36ActionPerformed

    //suma
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
     numero1 = Double.parseDouble(this.jTextField1.getText());
     operacion = "+";
     jTextField1.setText(" ");
    }//GEN-LAST:event_jButton38ActionPerformed

//boton =
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

        try {
            if (!operacion.isEmpty()) {
                numero2 = Double.parseDouble(jTextField1.getText());

                switch (operacion) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            jTextField1.setText("Error");
                            return;
                        }
                        break;
                }

                // Mostrar resultado
                if (resultado == (long) resultado) {
                    jTextField1.setText(String.format("%.0f", resultado));
                } else {
                    jTextField1.setText(String.valueOf(resultado));
                }

                // Reiniciar variables
                numero1 = resultado;
                operacion = "";
                nuevaOperacion = true;
            }
        } catch (NumberFormatException e) {
            jTextField1.setText("Error");
            operacion = "";
            nuevaOperacion = true;
        }

    }//GEN-LAST:event_jButton35ActionPerformed

    //boton /
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        numero1 = Double.parseDouble(this.jTextField1.getText());
     operacion = "/";
     jTextField1.setText(" ");
    }//GEN-LAST:event_jButton18ActionPerformed

    //boton *
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        numero1 = Double.parseDouble(this.jTextField1.getText());
     operacion = "*";
     jTextField1.setText(" ");
    }//GEN-LAST:event_jButton29ActionPerformed

    //boton -
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

        numero1 = Double.parseDouble(this.jTextField1.getText());
     operacion = "-";
     jTextField1.setText(" ");
    }//GEN-LAST:event_jButton34ActionPerformed

    //boton .
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed

        String textoActual = jTextField1.getText();
        if (nuevaOperacion) {
            jTextField1.setText("0.");
            nuevaOperacion = false;
        } else if (!textoActual.contains(".")) {
            jTextField1.setText(textoActual + ".");
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    //boton %
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        try {
            double valor = Double.parseDouble(jTextField1.getText());
            double resultado = valor / 100;
            if (resultado == (long) resultado) {
                jTextField1.setText(String.format("%.0f", resultado));
            } else {
                jTextField1.setText(String.valueOf(resultado));
            }
            nuevaOperacion = true;
        } catch (NumberFormatException e) {
            jTextField1.setText("Error");
            nuevaOperacion = true;
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    //boton 1/x
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed

        try {
            double valor = Double.parseDouble(jTextField1.getText());
            if (valor != 0) {
                double resultado = 1 / valor;
                if (resultado == (long) resultado) {
                    jTextField1.setText(String.format("%.0f", resultado));
                } else {
                    jTextField1.setText(String.valueOf(resultado));
                }
            } else {
                jTextField1.setText("Error");
            }
            nuevaOperacion = true;
        } catch (NumberFormatException e) {
            jTextField1.setText("Error");
            nuevaOperacion = true;
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        this.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CalculadoraGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case '0':
                jButton36.doClick();
                break;
            case '1':
                jButton31.doClick();
                break;
            case '2':
                jButton32.doClick();
                break;
            case '3':
                jButton1.doClick();
                break;
            case '4':
                jButton20.doClick();
                break;
            case '5':
                jButton27.doClick();
                break;
            case '6':
                jButton28.doClick();
                break;
            case '7':
                jButton21.doClick();
                break;
            case '8':
                jButton5.doClick();
                break;
            case '9':
                jButton17.doClick();
                break;
            case '+':
                jButton38.doClick();
                break;
            case '-':
                jButton34.doClick();
                break;
            case '*':
                jButton29.doClick();
                break;
            case '/':
                jButton18.doClick();
                break;
            case 'p'://%
                jButton19.doClick();
                break;
            case 'r'://raiz
                jButton22.doClick();
                break;
            case 'z'://1/x
                jButton30.doClick();
                break;
            case 'c'://c
                jButton24.doClick();
                break;    
            case 'b'://ce
                jButton25.doClick();
                break; 
             
        }
       
    }

    @Override
    public void keyPressed(KeyEvent e) { //comprueba si la tecla presionada es la tecla de retroceso backspace
        //VK_BACK_SPACE es la constante para la tecla Backspace
        if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){//simula un clic en el boton con el indice nombre 26
            jButton26.doClick(); //borrar
        }
        
        if(e.getKeyCode() == KeyEvent.VK_ENTER){//simula un clic en la tecla enter 
            jButton35.doClick(); //igual
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
