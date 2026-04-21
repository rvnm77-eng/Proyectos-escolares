
public class ConversorMonedas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConversorMonedas.class.getName());

    
    public ConversorMonedas() {
        initComponents();
        configurarEstadoInicial();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbMonedas = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbMonedas = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de monedas");

        jLabel2.setText("Pesos Mexicanos");

        txtCantidad.setColumns(10);
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Convertir a:");

        cmbMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la moneda", "Dolares (USD)", "Euros (EUR)", "Yenes (JPY)" }));
        cmbMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonedasActionPerformed(evt);
            }
        });

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 153, 153));
        lblResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConvertir)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(lblResultado))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonedasActionPerformed
        
        String monedaSeleccionada = (String) cmbMonedas.getSelectedItem();
       
       if (monedaSeleccionada.equals("Seleccione la moneda")) {
           // Deshabilitar el botón convertir si no hay moneda seleccionada
           btnConvertir.setEnabled(false);
           lblResultado.setText("Resultado aparecera aqui");
       } else {
           // Habilitar el botón convertir
           btnConvertir.setEnabled(true);
           lblResultado.setText("Ingrese cantidad y presione Convertir");
       }
    }//GEN-LAST:event_cmbMonedasActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        
        try {
           String monedaSeleccionada = (String) cmbMonedas.getSelectedItem();
           
           // Validar que se haya seleccionado una moneda
           if (monedaSeleccionada.equals("Seleccione la moneda")) {
               javax.swing.JOptionPane.showMessageDialog(this,
                   "Por favor, seleccione una moneda destino.",
                   "Moneda no seleccionada",
                   javax.swing.JOptionPane.WARNING_MESSAGE);
               return;
           }
           
           // Validar que se haya ingresado una cantidad
           if (txtCantidad.getText().trim().isEmpty()) {
               javax.swing.JOptionPane.showMessageDialog(this,
                   "Por favor, ingrese la cantidad en pesos mexicanos.",
                   "Campo vacío",
                   javax.swing.JOptionPane.WARNING_MESSAGE);
               return;
           }
           
           // Obtener la cantidad en pesos
           double cantidadPesos = Double.parseDouble(txtCantidad.getText().trim());
           
           if (cantidadPesos < 0) {
               javax.swing.JOptionPane.showMessageDialog(this,
                   "La cantidad debe ser un número positivo.",
                   "Valor inválido",
                   javax.swing.JOptionPane.ERROR_MESSAGE);
               return;
           }
           
           // Realizar la conversión
           realizarConversion(cantidadPesos, monedaSeleccionada);
           
       } catch (NumberFormatException ex) {
           javax.swing.JOptionPane.showMessageDialog(this,
               "Por favor, ingrese un número válido.",
               "Formato inválido",
               javax.swing.JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void realizarConversion(double cantidadPesos, String monedaDestino) {
    double resultado = 0;
    String simboloMoneda = "";
    String nombreMoneda = "";
    
    // Tasas de cambio (estos valores pueden cambiar, son aproximados)
    double tasaDolar = 0.059;    // 1 peso = 0.058 dólares aproximadamente
    double tasaEuro = 0.054;     // 1 peso = 0.053 euros aproximadamente  
    double tasaYen = 8.80;       // 1 peso = 8.50 yenes aproximadamente
    
    // Realizar conversión según la moneda seleccionada
    switch (monedaDestino) {
        case "Dolares (USD)":
            resultado = cantidadPesos * tasaDolar;
            simboloMoneda = "$";
            nombreMoneda = "USD";
            break;
            
        case "Euros (EUR)":
            resultado = cantidadPesos * tasaEuro;
            simboloMoneda = "€";
            nombreMoneda = "EUR";
            break;
            
        case "Yenes (JPY)":
            resultado = cantidadPesos * tasaYen;
            simboloMoneda = "¥";
            nombreMoneda = "JPY";
            break;
    }
    
    // Mostrar el resultado
       // Usar diferentes formatos según la moneda
   String formato;
   if (nombreMoneda.equals("JPY")) {
       formato = "$%.2f MXN = %s%.0f %s"; // Yenes sin decimales
   } else {
       formato = "$%.2f MXN = %s%.4f %s"; // Dólares y euros con 4 decimales
   }
   
   String textoResultado = String.format(formato,
                                         cantidadPesos,
                                         simboloMoneda,
                                         resultado,
                                         nombreMoneda);
   
   lblResultado.setText(textoResultado);
    
    } 
    
    
   
    
    public static void main(String args[]) {
        
    }
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
       java.awt.EventQueue.invokeLater(() -> new ConversorMonedas().setVisible(true));
}    
        
        
         
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cmbMonedas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
    private void configurarEstadoInicial() {
        // Configurar el estado inicial de los componentes
    btnConvertir.setEnabled(false);
    lblResultado.setText("Seleccione una moneda para comenzar");
    txtCantidad.setText("");
    cmbMonedas.setSelectedIndex(0);
       
    }
    

