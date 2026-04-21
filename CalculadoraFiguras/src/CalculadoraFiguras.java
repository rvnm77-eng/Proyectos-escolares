/* 
public: modificador de acceso. Significa que la clase puede ser utilizada desde cualquier otro paquete o clase.
class: palabra reservada en Java, define que vas a crear una clase.
CalculadoraFiguras: nombre de la clase. Por convención, inicia con mayúscula y debe coincidir con el nombre del archivo .java.
extends javax.swing.JFrame: indica que esta clase hereda de la clase JFrame (ventana de Swing). Esto convierte tu clase en una ventana gráfica.
*/
public class CalculadoraFiguras extends javax.swing.JFrame {
    
    /*
    private: solo se puede usar dentro de esta clase.

    static: pertenece a la clase, no a un objeto en particular.

    final: el valor no puede cambiar (constante).

    java.util.logging.Logger: clase que sirve para registrar errores o mensajes en consola/archivos.

    getLogger(...): obtiene un logger asociado al nombre de esta clase.
    */
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculadoraFiguras.class.getName());

     CalculadoraFiguras() {//constructor de la clase se ejecuta al crear un objeto
        initComponents();//creado por netbeans crea y organiza los componentes basicos 
        configurarEstadoInicial();//metodo propio donde se define los estados iniciales
  
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblFigura = new javax.swing.JLabel();
        lblCalcular = new javax.swing.JLabel();
        lblDimensiones = new javax.swing.JLabel();
        cmbFiguras = new javax.swing.JComboBox<>();
        chkArea = new javax.swing.JCheckBox();
        chkPerimetro = new javax.swing.JCheckBox();
        panelDimensiones = new javax.swing.JPanel();
        txtDimension1 = new javax.swing.JTextField();
        txtDimension2 = new javax.swing.JTextField();
        lblDimension2 = new javax.swing.JLabel();
        lblDimension1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de figuras geometricas");
        setPreferredSize(new java.awt.Dimension(500, 600));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora figuras geometricas");

        lblFigura.setText("Selecciona la figura");

        lblCalcular.setText("Que desea calcular?");

        lblDimensiones.setText("Dimensiones:");

        cmbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una figura", "Cuadrado", "Rectangulo", "Circulo", "Triangulo" }));
        cmbFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFigurasActionPerformed(evt);
            }
        });

        chkArea.setText("Area");

        chkPerimetro.setText("Perimetro");

        txtDimension1.setColumns(10);
        txtDimension1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDimension2.setColumns(10);
        txtDimension2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblDimension2.setText("Ancho/Altura:");

        lblDimension1.setText("Largo/Lado/Radio:");

        javax.swing.GroupLayout panelDimensionesLayout = new javax.swing.GroupLayout(panelDimensiones);
        panelDimensiones.setLayout(panelDimensionesLayout);
        panelDimensionesLayout.setHorizontalGroup(
            panelDimensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDimensionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDimensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDimensionesLayout.createSequentialGroup()
                        .addComponent(lblDimension1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txtDimension1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDimensionesLayout.createSequentialGroup()
                        .addComponent(lblDimension2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDimension2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelDimensionesLayout.setVerticalGroup(
            panelDimensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDimensionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDimensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDimension1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDimension1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDimensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDimension2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDimension2))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtResultados.setEditable(false);
        txtResultados.setColumns(35);
        txtResultados.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtResultados.setRows(8);
        scrollPane.setViewportView(txtResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblDimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblCalcular)
                                .addGap(28, 28, 28)
                                .addComponent(chkArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCalcular)
                                .addGap(39, 39, 39)
                                .addComponent(btnLimpiar))
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFigura)
                    .addComponent(cmbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalcular)
                    .addComponent(chkArea)
                    .addComponent(chkPerimetro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDimensiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDimensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCalcular))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
-private: Es un modificador de acceso, significa que este método solo puede ser usado dentro de la misma clase.
No puede ser llamado desde otra clase externa.
Se pone aquí porque este método es interno a la lógica de la interfaz gráfica.

-void: es el tipo de retorno del método.
void significa “no devuelve nada”.
Cuando se llama este método, ejecuta acciones, pero no regresa un valor como un número o texto.

-cmbFigurasActionPerformed: Es el nombre del método, el nombre indica que este método se ejecuta cuando ocurre una acción sobre el componente cmbFiguras (el comboBox de figuras).

-(java.awt.event.ActionEvent evt): esto es la lista de parámetros que recibe el método
java.awt.event.ActionEvent es la clase del evento.
Representa la acción que ocurrió (en este caso, el usuario cambió la opción en el comboBox).
La clase está dentro del paquete java.awt.event.
evt es el nombre de la variable que va a contener ese evento.
Puedes llamarlo como quieras (ejemplo: evento), pero por convención se usa evt. 
    */
    private void cmbFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFigurasActionPerformed
        
        /*
        -String: es el tipo de dato de la variable, va a guardar texto (el nombre de la figura).
        -figuraSeleccionada: es el nombre de la variable que declaramos, se usa para saber qué figura eligió el usuario.
        -= : es el operador de asignación, significa "guarda lo que está a la derecha en la variable de la izquierda".
        -(String): es un cast. getSelectedItem() devuelve un objeto Object, y necesitamos convertirlo explícitamente a String.
        -cmbFiguras: es el nombre del comboBox en la interfaz, ya está declarado como un componente de tipo JComboBox<String>.
        -.getSelectedItem(): método que obtiene el elemento seleccionado actualmente en el comboBox.
        */
       String figuraSeleccionada = (String) cmbFiguras.getSelectedItem();
       
       // Limpiar campos
       txtDimension1.setText("");/*txtDimension1 es un campo de texto  .setText(""); metodo que cambia el contenido
       del campo de texto, "" pasa a una cadena vacia, limpia el campo*/
       txtDimension2.setText("");
       txtResultados.setText("");
       
       /*
       -if: condicional
       -(figuraSeleccionada.equals("Seleccione una figura"))
         -figuraSeleccionada: texto elegido en el comboBox.
         -.equals("Seleccione una figura"): compara si el texto es exactamente "Seleccione una figura".
         -para comparar textos se usa .equals()
       */
       if (figuraSeleccionada.equals("Seleccione una figura")) {
           // Deshabilitar todo
           /*
           -.setEnabled(false): deshabilita el componente, no permite escribir en él.
           -false: significa "desactivado"
           -todo queda bloqueado hasta que elija una figura
           -.setEnabled: sirve para activar o desactivar un componente, no se puede escribir ni presionar botones si esta desactivado
           */
           txtDimension1.setEnabled(false);
           txtDimension2.setEnabled(false);
           btnCalcular.setEnabled(false);
           /*
           setVisible: sirve para mostrar u ocultar un componente, si esta en false desaparece de la ventana 
           si esta en true aparece en la ventana 
           */
           lblDimension2.setVisible(false);
           txtDimension2.setVisible(false);
           lblDimension1.setText("Largo/Lado/Radio:");//poner un texto generico en la etiqueta
         
           /*
           -else if: si la otra condicion anterior no se cumplio, pero esta si, entonces se ejecta este bloque
           -(figuraSeleccionada.equals("Círculo")): compara si el texto seleccionado en el comboBox es "Círculo"
           */
       } else if (figuraSeleccionada.equals("Círculo")) {
           // Solo pedir radio
           lblDimension1.setText("Radio:");//cambia el texto de la etiqueta para que el usuario sepa qué ingresar
           lblDimension2.setVisible(false);//oculta la segunda etiqueta 
           txtDimension2.setVisible(false);//oculta el segundo campo
           txtDimension1.setEnabled(true);//activa el primer campo para que el usuario escriba el radio
           btnCalcular.setEnabled(true);//habilita el botón para poder calcular
           
       } else if (figuraSeleccionada.equals("Cuadrado")) {
           // Solo pedir lado
           lblDimension1.setText("Lado:");
           lblDimension2.setVisible(false);
           txtDimension2.setVisible(false);
           txtDimension1.setEnabled(true);
           btnCalcular.setEnabled(true);
           
       } else if (figuraSeleccionada.equals("Rectángulo")) {
           // Pedir largo y ancho
           lblDimension1.setText("Largo:");
           lblDimension2.setText("Ancho:");
           lblDimension2.setVisible(true);
           txtDimension2.setVisible(true);
           txtDimension1.setEnabled(true);
           txtDimension2.setEnabled(true);
           btnCalcular.setEnabled(true);
           
       } else if (figuraSeleccionada.equals("Triángulo")) {
           // Pedir base y altura
           lblDimension1.setText("Base:");
           lblDimension2.setText("Altura:");
           lblDimension2.setVisible(true);
           txtDimension2.setVisible(true);
           txtDimension1.setEnabled(true);
           txtDimension2.setEnabled(true);
           btnCalcular.setEnabled(true);
       }
   
    }//GEN-LAST:event_cmbFigurasActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
       try {//inicio de bloque donde ocurren ecepciones 
           /*
           String: tipo de dato texto.
           figuraSeleccionada: variable que guarda qué figura eligió el usuario.
           =: asignación.
           (String): conversión de tipo (cast), porque getSelectedItem() devuelve un objeto Object.
           cmbFiguras.getSelectedItem(): obtiene la opción seleccionada en el comboBox cmbFiguras.
           */
           String figuraSeleccionada = (String) cmbFiguras.getSelectedItem();
           
           // Validar que se haya seleccionado una figura
           if (figuraSeleccionada.equals("Seleccione una figura")) {
               javax.swing.JOptionPane.showMessageDialog(this,//this referencia a la vetana actual
                   "Por favor, seleccione una figura.",//mensaje que vera el usuario
                   "Figura no seleccionada",//titulo de la ventana emergente
                   javax.swing.JOptionPane.WARNING_MESSAGE);//cuadro de dialogo emergente
               return;//termina el metodo
           }
           
           // Validar que se haya seleccionado al menos una opción
           /*
           if:condición
           chkArea.isSelected():revisa si el checkbox de "Área" está marcado
           chkPerimetro.isSelected(): revisa si el checkbox de "Perímetro" está marcado
           !: negación (NO)
           &&: operador lógico Y (las dos condiciones deben cumplirse)
           */
           if (!chkArea.isSelected() && !chkPerimetro.isSelected()) {
               javax.swing.JOptionPane.showMessageDialog(this,
                   "Por favor, seleccione si desea calcular el área, perímetro o ambos.",
                   "Opción no seleccionada",
                   javax.swing.JOptionPane.WARNING_MESSAGE);
               return;
           }
           
           // Validar campos de entrada
           /*
           if:(txtDimension1.getText().trim().isEmpty()) {
           txtDimension1.getText():obtiene lo que escribió el usuario en el campo 1.
           .trim(): elimina espacios en blanco al inicio y al final.
           .isEmpty(): verifica si la cadena está vacía.
           if (...) {: si está vacío, ejecuta el bloque.
           */
           if (txtDimension1.getText().trim().isEmpty()) {
               javax.swing.JOptionPane.showMessageDialog(this,
                   "Por favor, ingrese la primera dimensión.",
                   "Campo vacío",
                   javax.swing.JOptionPane.WARNING_MESSAGE);
               return;
           }
           
           // Obtener primera dimensión
           /*
           double dimension1 = Double.parseDouble(txtDimension1.getText().trim());
           double: tipo de dato numérico con decimales (ejemplo: 5.2, 3.0, etc.)
           dimension1: variable que guardará el número ingresado
           =: asignación
           Double.parseDouble(...): método de la clase Double que convierte un texto (String) en un número decimal (double).
           txtDimension1.getText(): obtiene lo que escribió el usuario en el campo de texto.
           .trim(): quita espacios en blanco al inicio y al final.
           */
           double dimension1 = Double.parseDouble(txtDimension1.getText().trim());
           
           /*
           if (dimension1 <= 0) {
           Valida que el número ingresado sea mayor que cero.
           <= significa "menor o igual que".
           Si dimension1 es 0 o negativo, no tiene sentido como medida de una figura geométrica.
           Ejemplo: Si el usuario escribe -5 o 0, entrará en este if.
           */
           if (dimension1 <= 0) {
               javax.swing.JOptionPane.showMessageDialog(this,
                   "Las dimensiones deben ser números positivos.",
                   "Valor inválido",
                   javax.swing.JOptionPane.ERROR_MESSAGE);
               return;
           }
           
           // Realizar cálculos según la figura
           /*
           calcularSegunFigura(figuraSeleccionada, dimension1);
           Llama al método calcularSegunFigura.
           Le pasa dos parámetros:
           figuraSeleccionada: la figura que eligió el usuario (ejemplo: "Círculo").
           dimension1: la medida validada (ejemplo: radio, lado, base, etc.).
           Aquí es donde el programa decide qué fórmula aplicar dependiendo de la figura.
           */
           calcularSegunFigura(figuraSeleccionada, dimension1);
           
           /*
           } catch (NumberFormatException ex) {
           catch: parte del bloque try-catch.
           Aquí se capturan los errores si falló la conversión de texto a número.
           NumberFormatException: excepción que ocurre cuando intentas convertir letras en número.
           ex: variable que guarda el error (no se usa, pero está ahí por si quieres imprimirlo en consola).
           */
       } catch (NumberFormatException ex) {
           javax.swing.JOptionPane.showMessageDialog(this,
               "Por favor, ingrese números válidos.",
               "Formato inválido",
               javax.swing.JOptionPane.ERROR_MESSAGE);
       }
   
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        // Resetear ComboBox
       cmbFiguras.setSelectedIndex(0);
       
       // Limpiar campos de texto
       txtDimension1.setText("");
       txtDimension2.setText("");
       txtResultados.setText("");
       
       // Desmarcar checkboxes
       chkArea.setSelected(false);
       chkPerimetro.setSelected(false);
       
       // Resetear estado inicial de los componentes
       txtDimension1.setEnabled(false);
       txtDimension2.setEnabled(false);
       btnCalcular.setEnabled(false);
       lblDimension2.setVisible(false);
       txtDimension2.setVisible(false);
       lblDimension1.setText("Largo/Lado/Radio:");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void calcularSegunFigura(String figura, double dimension1) throws NumberFormatException {
    double area = 0;
    double perimetro = 0;
    double dimension2 = 0;
    
    // Para figuras que necesitan segunda dimensión
    if (figura.equals("Rectángulo") || figura.equals("Triángulo")) {
        if (txtDimension2.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor, ingrese la segunda dimensión.",
                "Campo vacío",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        dimension2 = Double.parseDouble(txtDimension2.getText().trim());
        if (dimension2 <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Las dimensiones deben ser números positivos.",
                "Valor inválido",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    // Calcular según la figura
    switch (figura) {
        case "Círculo":
            area = Math.PI * dimension1 * dimension1;
            perimetro = 2 * Math.PI * dimension1;
            break;
            
        case "Cuadrado":
            area = dimension1 * dimension1;
            perimetro = 4 * dimension1;
            break;
            
        case "Rectángulo":
            area = dimension1 * dimension2;
            perimetro = 2 * (dimension1 + dimension2);
            break;
            
        case "Triángulo":
            area = (dimension1 * dimension2) / 2;
            perimetro = calcularPerimetroTriangulo(dimension1, dimension2);
            break;
    }
    
    // Mostrar resultados
    mostrarResultados(figura, area, perimetro, dimension1, dimension2);
}

private double calcularPerimetroTriangulo(double base, double altura) {
    // Para un triángulo rectángulo, calculamos la hipotenusa
    double hipotenusa = Math.sqrt((base * base) + (altura * altura));
    return base + altura + hipotenusa;
}

private void mostrarResultados(String figura, double area, double perimetro, double dim1, double dim2) {
    StringBuilder resultado = new StringBuilder();
    resultado.append("=== ").append(figura.toUpperCase()).append(" ===\n");
    
    // Mostrar dimensiones
    switch (figura) {
        case "Círculo":
            resultado.append("Radio: ").append(String.format("%.2f", dim1)).append("\n");
            break;
        case "Cuadrado":
            resultado.append("Lado: ").append(String.format("%.2f", dim1)).append("\n");
            break;
        case "Rectángulo":
            resultado.append("Largo: ").append(String.format("%.2f", dim1)).append("\n");
            resultado.append("Ancho: ").append(String.format("%.2f", dim2)).append("\n");
            break;
        case "Triángulo":
            resultado.append("Base: ").append(String.format("%.2f", dim1)).append("\n");
            resultado.append("Altura: ").append(String.format("%.2f", dim2)).append("\n");
            break;
    }
    
    // Mostrar cálculos solicitados
    if (chkArea.isSelected()) {
        resultado.append("Área: ").append(String.format("%.2f", area)).append(" unidades²\n");
    }
    
    if (chkPerimetro.isSelected()) {
        resultado.append("Perímetro: ").append(String.format("%.2f", perimetro)).append(" unidades\n");
    }
    
    resultado.append("\n");
    txtResultados.append(resultado.toString());
}

private void configurarEstadoInicial() {
       // Deshabilitar campos y botones al inicio
       txtDimension1.setEnabled(false);
       txtDimension2.setEnabled(false);
       btnCalcular.setEnabled(false);
       
       // Ocultar el segundo campo inicialmente
       lblDimension2.setVisible(false);
       txtDimension2.setVisible(false);
       
       // Asegurar que no haya nada seleccionado en los checkboxes
       chkArea.setSelected(false);
       chkPerimetro.setSelected(false);
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
        java.awt.EventQueue.invokeLater(() -> new CalculadoraFiguras().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkArea;
    private javax.swing.JCheckBox chkPerimetro;
    private javax.swing.JComboBox<String> cmbFiguras;
    private javax.swing.JLabel lblCalcular;
    private javax.swing.JLabel lblDimension1;
    private javax.swing.JLabel lblDimension2;
    private javax.swing.JLabel lblDimensiones;
    private javax.swing.JLabel lblFigura;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelDimensiones;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField txtDimension1;
    private javax.swing.JTextField txtDimension2;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
