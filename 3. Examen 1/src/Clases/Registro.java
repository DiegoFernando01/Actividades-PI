/* Miércoles, 14 de abril de 2021
Hecho por: Diego Fernando Victoria
Código: 201941366
Programación interactiva - Universidad del Valle
*/

package Clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame { //Inicio clase Registro

    Tabla Objeto = new Tabla();
    String nombre, sectortrabajo, fechavacunacion;
    int edad, fase;
    long identificación;
    boolean enfermedades;
    Icon ImagenVacuna = new ImageIcon(getClass().getResource("/Imagenes/Vacuna.jpg"));

    public Registro() { //Inicio constructor clase Registro
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bt_ConsultarR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JT_NombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JT_Edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JT_Id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Rb_Enfermedades = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Cb_Trabajo = new javax.swing.JComboBox<>();
        Bt_Registrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JL_FechaV = new javax.swing.JLabel();
        JL_Fase = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vacunación Covid-19");
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        Panel1.setName("Panel1"); // NOI18N
        Panel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Registro vacunación Covid-19");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre completo:");

        Bt_ConsultarR.setBackground(new java.awt.Color(255, 255, 255));
        Bt_ConsultarR.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        Bt_ConsultarR.setForeground(new java.awt.Color(0, 0, 0));
        Bt_ConsultarR.setText("Consultar registros");
        Bt_ConsultarR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        Bt_ConsultarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ConsultarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(Bt_ConsultarR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Bt_ConsultarR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        Panel1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_NombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        JT_NombreUsuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_NombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JT_NombreUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        jPanel3.add(JT_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        JT_Edad.setBackground(new java.awt.Color(255, 255, 255));
        JT_Edad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_Edad.setForeground(new java.awt.Color(0, 0, 0));
        JT_Edad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        jPanel3.add(JT_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Presenta comorbilidades:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        JT_Id.setBackground(new java.awt.Color(255, 255, 255));
        JT_Id.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_Id.setForeground(new java.awt.Color(0, 0, 0));
        JT_Id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        jPanel3.add(JT_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sector de trabajo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        Rb_Enfermedades.setBackground(new java.awt.Color(255, 255, 255));
        Rb_Enfermedades.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        Rb_Enfermedades.setForeground(new java.awt.Color(0, 0, 0));
        Rb_Enfermedades.setText("Sí");
        jPanel3.add(Rb_Enfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Número de identificación:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 59, -1, 20));

        Cb_Trabajo.setBackground(new java.awt.Color(255, 255, 255));
        Cb_Trabajo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        Cb_Trabajo.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Trabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Salud - Línea principal", "Salud - Segunda línea", "Educativo, militar y policial", "Bomberos, socorristas, pilotos, auxiliares de vuelo", "Otros..." }));
        jPanel3.add(Cb_Trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, -1));

        Bt_Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Registrar.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        Bt_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        Bt_Registrar.setText("Registrar candidato");
        Bt_Registrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        Bt_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_RegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacuna.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 280, 200));

        JL_FechaV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_FechaV.setForeground(new java.awt.Color(0, 0, 0));
        JL_FechaV.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_FechaV.setFocusable(false);
        JL_FechaV.setPreferredSize(new java.awt.Dimension(198, 19));
        jPanel3.add(JL_FechaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 210, -1));

        JL_Fase.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_Fase.setForeground(new java.awt.Color(0, 0, 0));
        JL_Fase.setPreferredSize(new java.awt.Dimension(114, 19));
        jPanel3.add(JL_Fase, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Clasificación: Fase #");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Inicio de la fase de vacunación:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setFocusable(false);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 210, -1));

        Panel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_ConsultarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ConsultarRActionPerformed
        Objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Bt_ConsultarRActionPerformed

    private void Bt_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_RegistrarActionPerformed
        nombre = JT_NombreUsuario.getText();
        edad = Integer.parseInt(JT_Edad.getText());
        identificación = Long.parseLong(JT_Id.getText());
        enfermedades = Rb_Enfermedades.isSelected();
        sectortrabajo = Cb_Trabajo.getSelectedItem().toString();
        SelecionFase();
        Objeto.LlenarTabla(nombre, sectortrabajo, edad, identificación, enfermedades, fase, fechavacunacion);
        JOptionPane.showMessageDialog(null, "Comprobante de registro:\n"
                + "Nombre: " + nombre + "\nEdad: " + edad + "\nNúmero de identificación: " + identificación + "\n"
                + "Sector trabajo: " + sectortrabajo + "\nFase de vacunación: " + fase + "\nFecha de vacunación: " + fechavacunacion + "\n", "Vacunación Covid-19", JOptionPane.PLAIN_MESSAGE, ImagenVacuna);
    }//GEN-LAST:event_Bt_RegistrarActionPerformed

    public static void main(String args[]) { //Método principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    public void SelecionFase() { //Inicio método Selección de fase vacunación
        if ((Integer.parseInt(JT_Edad.getText()) >= 80) || (sectortrabajo.equals("Salud - Línea principal"))) { //Fase #1
            fechavacunacion = "Febrero 17 de 2021";
            fase = 1;
            JL_Fase.setText("1");
            JL_FechaV.setText("Febrero 17 de 2021");
        } else if ((Integer.parseInt(JT_Edad.getText()) >= 60) || (sectortrabajo.equals("Salud - Segunda línea"))) { //Fase #2
            fechavacunacion = "Marzo 6 de 2021";
            fase = 2;
            JL_Fase.setText("2");
            JL_FechaV.setText("Marzo 6 de 2021");
        } else if ((Integer.parseInt(JT_Edad.getText()) >= 16 && Integer.parseInt(JT_Edad.getText()) < 60) && (Rb_Enfermedades.isSelected() == true) || sectortrabajo.equals("Educativo, militar y policial")) { //Fase #3
            fechavacunacion = "Marzo 24 de 2021";
            fase = 3;
            JL_Fase.setText("3");
            JL_FechaV.setText("Marzo 24 de 2021");
        } else if (sectortrabajo.equals("Bomberos, socorristas, pilotos, auxiliares de vuelo")) { //Fase #4
            fechavacunacion = "Abril 17 de 2021";
            fase = 4;
            JL_Fase.setText("4");
            JL_FechaV.setText("Abril 17 de 2021");
        } else { //Fase #5
            fechavacunacion = "Mayo 8 de 2021";
            fase = 5;
            JL_Fase.setText("5");
            JL_FechaV.setText("Mayo 8 de 2021");
        }
    } //Fin método Selección de fase vacunación

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_ConsultarR;
    private javax.swing.JButton Bt_Registrar;
    private javax.swing.JComboBox<String> Cb_Trabajo;
    private javax.swing.JLabel JL_Fase;
    private javax.swing.JLabel JL_FechaV;
    private javax.swing.JTextField JT_Edad;
    private javax.swing.JTextField JT_Id;
    private javax.swing.JTextField JT_NombreUsuario;
    private javax.swing.JPanel Panel1;
    private javax.swing.JRadioButton Rb_Enfermedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
} //Fin clase Registro
