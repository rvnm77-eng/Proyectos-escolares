/*-public: Modificador de acceso. Permite que esta clase sea visible desde cualquier parte del programa.
- class CalculadoraFactorial: Define una clase llamada CalculadoraFactorial.
- extends javax.swing.JFrame: Hereda de la clase JFrame, lo que convierte esta clase en una ventana gráfica
 */
public class CalculadoraFactorial extends javax.swing.JFrame {
   
/*- private static final: Define una constante privada y estática.
- Logger: Clase para registrar eventos, errores o mensajes.
- getLogger(...): Obtiene una instancia del logger para esta clase.
 */
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculadoraFactorial.class.getName());

    /* */
    public CalculadoraFactorial() {
        initComponents();
        configurarEventos();
    }
    
    private void configurarEventos() {
    // Evento para el botón Calcular
    btnCalcular.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            calcularFactorial();
        }
    });
    
    // Evento para el botón Limpiar
    btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            limpiarCampos();
        }
    });
    
    // Permitir calcular con Enter
    txtNumero.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            calcularFactorial();
        }
    });
}
    private void calcularFactorial() {
    try {
        String input = txtNumero.getText().trim();
        
        // Validar que no esté vacío
        if (input.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Por favor, ingrese un número.", 
                "Campo vacío", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Convertir a entero
        int numero = Integer.parseInt(input);
        
        // Validar que sea positivo y mayor a 0
        if (numero < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "El número debe ser positivo (mayor o igual a 0).", 
                "Número inválido", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validar límite razonable para evitar overflow
        if (numero > 20) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "El número debe ser menor o igual a 20 para evitar overflow.", 
                "Número muy grande", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Calcular factorial
        long factorial = calcularFactorialRecursivo(numero);
        
        // Agregar resultado al JTextArea
        String resultado = String.format("Factorial de %d = %d\n", numero, factorial);
        txtResultados.append(resultado);
        
        // Limpiar campo de entrada
        txtNumero.setText("");
        txtNumero.requestFocus();
        
    } catch (NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Por favor, ingrese un número entero válido.", 
            "Formato inválido", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}

    //limpia la entrada, historial de resultados, pone el cursor en el campo de entrada
private void limpiarCampos() {
    txtNumero.setText("");
    txtResultados.setText("");
    txtNumero.requestFocus();
}

//es el algoritmo para calcular el factorial, recursion se llama a si mismo
private long calcularFactorialRecursivo(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * calcularFactorialRecursivo(n - 1);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblInstruccion = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de factorial");
        setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        lblTitulo.setBackground(new java.awt.Color(255, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora de factorial");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(0, 0, 437, 22);

        lblInstruccion.setText("Ingrese el numero entero positivo");
        getContentPane().add(lblInstruccion);
        lblInstruccion.setBounds(10, 30, 190, 16);

        txtNumero.setColumns(15);
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNumero);
        txtNumero.setBounds(10, 50, 180, 22);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(10, 80, 75, 23);

        btnLimpiar.setText("Limpiar");
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(100, 80, 72, 23);

        txtResultados.setEditable(false);
        txtResultados.setColumns(30);
        txtResultados.setRows(8);
        scrollPane.setViewportView(txtResultados);

        getContentPane().add(scrollPane);
        scrollPane.setBounds(200, 50, 150, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

//punto de entrada del programa    
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
        java.awt.EventQueue.invokeLater(() -> new CalculadoraFactorial().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
