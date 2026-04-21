
public class ConversorTemperatura extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName());

    
    public ConversorTemperatura() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoConversiones = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        rbCelsiusToFahrenheit = new javax.swing.JRadioButton();
        rbFahrenheitToCelsius = new javax.swing.JRadioButton();
        rbCelsiusToKelvin = new javax.swing.JRadioButton();
        btnConvertir = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");
        setBackground(new java.awt.Color(255, 0, 255));
        setForeground(new java.awt.Color(255, 204, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 400));

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Conversor de Temperatura");

        lblTemperatura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTemperatura.setText("Ingrese temperatura");

        txtTemperatura.setColumns(15);
        txtTemperatura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemperatura.setText("Temperatura");

        grupoConversiones.add(rbCelsiusToFahrenheit);
        rbCelsiusToFahrenheit.setSelected(true);
        rbCelsiusToFahrenheit.setText("Celsius --> Fahrenheit");

        grupoConversiones.add(rbFahrenheitToCelsius);
        rbFahrenheitToCelsius.setText("Fahrenheit --> Celsius");

        grupoConversiones.add(rbCelsiusToKelvin);
        rbCelsiusToKelvin.setText("Celsius --> Kelvin");

        btnConvertir.setBackground(new java.awt.Color(255, 51, 153));
        btnConvertir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConvertir.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 102, 204));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado ");
        lblResultado.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbCelsiusToFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbFahrenheitToCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbCelsiusToKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConvertir))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addComponent(lblTemperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbCelsiusToFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFahrenheitToCelsius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCelsiusToKelvin)
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultado)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
                                                     
    try {
        // Obtener temperatura ingresada
        /*String textoTemp almacena el texto del usuario eliminando
        eliminando el espacio en blanco con .trim() elimina espacios en 
        blanco al inicio y al final de una cadena de texto*/
        String textoTemp = txtTemperatura.getText().trim();
        
        if (textoTemp.isEmpty()) {//isEmpty verifica que string esta vacio
            mostrarError("Por favor, ingrese una temperatura.");
            return;
        }
        //Double.parse... convirte string a un numero decimal
        double temperatura = Double.parseDouble(textoTemp);
        double resultado = 0;
        String unidad = "";
        
        // Determinar conversión según RadioButton seleccionado
        if (rbCelsiusToFahrenheit.isSelected()) {//isSelectd verifica si un radio esta seleccionado
            resultado = (temperatura * 9.0/5.0) + 32;
            unidad = "°F";
        } else if (rbFahrenheitToCelsius.isSelected()) {
            resultado = (temperatura - 32) * 5.0/9.0;
            unidad = "°C";
        } else if (rbCelsiusToKelvin.isSelected()) {
            resultado = temperatura + 273.15;
            unidad = "K";
        }
        
        // Mostrar resultado
        //string.format formatea el resultado con 2 decimales 
        lblResultado.setText(String.format("%.2f %s", resultado, unidad));
        //Cambia el color del resultado
        lblResultado.setForeground(new java.awt.Color(204, 0, 102));
        
    } catch (NumberFormatException ex) {
        mostrarError("Por favor, ingrese un número válido.");
    }

    }//GEN-LAST:event_btnConvertirActionPerformed

    private void mostrarError(String mensaje) {
    lblResultado.setForeground(java.awt.Color.RED);
    
    // Mostrar también un cuadro de diálogo
    javax.swing.JOptionPane.showMessageDialog(this, mensaje, "Error", 
        javax.swing.JOptionPane.ERROR_MESSAGE);
}
    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> new ConversorTemperatura().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.ButtonGroup grupoConversiones;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCelsiusToFahrenheit;
    private javax.swing.JRadioButton rbCelsiusToKelvin;
    private javax.swing.JRadioButton rbFahrenheitToCelsius;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
