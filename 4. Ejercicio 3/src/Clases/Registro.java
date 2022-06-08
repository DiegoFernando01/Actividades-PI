/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Fecha de elaboración: Jueves, 8 de abril de 2021
Programación interactiva - Universidad del Valle
 */
package Clases;

import javax.swing.JOptionPane;
import java.io.*;

public class Registro extends javax.swing.JFrame { //Inicio clase Registro

    Empleado ObjetoEmpleado = new Empleado("", "", 0, "", 0.0, 0.0, false, false, false, false);
    int contadorDiabetes = 0, contadorHipertension = 0, contadorObesidad = 0, contadorEmbarazo = 0, poblacion = 0, contador = 0;
    Facultad List = new Facultad();

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        Jl_Embarazo.setEnabled(false);
        JRb_Embarazo_Si.setEnabled(false);
        JRb_Embarazo_No.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtGroup_Genero = new javax.swing.ButtonGroup();
        BtGroup_Diabetes = new javax.swing.ButtonGroup();
        BtGroup_Hipertension = new javax.swing.ButtonGroup();
        BtGroup_Embarazo = new javax.swing.ButtonGroup();
        BtGroup_Obecidad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JPanel_Principal = new javax.swing.JPanel();
        JPanel_Superior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JT_Peso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JT_Edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JRb_Masculino = new javax.swing.JRadioButton();
        JRb_Femenino = new javax.swing.JRadioButton();
        JRb_Otro = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JRb_Diabetes_Si = new javax.swing.JRadioButton();
        JRb_Diabetes_No = new javax.swing.JRadioButton();
        JRb_Hipertension_Si = new javax.swing.JRadioButton();
        JRb_Hipertension_No = new javax.swing.JRadioButton();
        Jl_Embarazo = new javax.swing.JLabel();
        JRb_Embarazo_Si = new javax.swing.JRadioButton();
        JRb_Embarazo_No = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jC_Faultad = new javax.swing.JComboBox<>();
        Jl_Obecidad = new javax.swing.JLabel();
        JRb_Obecidad_Si = new javax.swing.JRadioButton();
        JRb_Obecidad_No = new javax.swing.JRadioButton();
        JB_Registrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JT_Nombre1 = new javax.swing.JTextField();
        JT_Estatura = new javax.swing.JTextField();
        JL_Error = new javax.swing.JLabel();
        JPanel_Inferior = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        JB_ListarDiabeticos = new javax.swing.JButton();
        JB_ListarHipertension = new javax.swing.JButton();
        JB_ListarCuidadoPrenatal = new javax.swing.JButton();
        JB_ListarObesidad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jta_Listado = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JB_Actualizar = new javax.swing.JButton();
        JL_porcentajeEmbarzadas = new javax.swing.JLabel();
        JL_porcentajeObesidad = new javax.swing.JLabel();
        JL_porcentajeDiabeticos = new javax.swing.JLabel();
        JL_porcentajeHipertensos = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro empleados");
        setMinimumSize(new java.awt.Dimension(850, 600));
        setName("RegistroFrame"); // NOI18N
        setResizable(false);

        JPanel_Principal.setBackground(new java.awt.Color(153, 153, 255));
        JPanel_Principal.setForeground(new java.awt.Color(0, 0, 0));

        JPanel_Superior.setBackground(new java.awt.Color(204, 204, 255));
        JPanel_Superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro empleados:");
        JPanel_Superior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre completo:");
        JPanel_Superior.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, -1, -1));

        JT_Peso.setBackground(new java.awt.Color(204, 204, 255));
        JT_Peso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_Peso.setForeground(new java.awt.Color(0, 0, 0));
        JT_Peso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        JT_Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_PesoKeyTyped(evt);
            }
        });
        JPanel_Superior.add(JT_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 40, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad:");
        JPanel_Superior.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 78, -1, -1));

        JT_Edad.setBackground(new java.awt.Color(204, 204, 255));
        JT_Edad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_Edad.setForeground(new java.awt.Color(0, 0, 0));
        JT_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT_Edad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        JT_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_EdadKeyTyped(evt);
            }
        });
        JPanel_Superior.add(JT_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 74, 90, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Género:");
        JPanel_Superior.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 78, -1, -1));

        JRb_Masculino.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Genero.add(JRb_Masculino);
        JRb_Masculino.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Masculino.setText("Masculino");
        JRb_Masculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRb_Masculino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRadioButton2FocusLost(evt);
            }
        });
        JRb_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb_MasculinoActionPerformed(evt);
            }
        });
        JPanel_Superior.add(JRb_Masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 75, -1, -1));

        JRb_Femenino.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Genero.add(JRb_Femenino);
        JRb_Femenino.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Femenino.setText("Femenino");
        JRb_Femenino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRb_Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb_FemeninoActionPerformed(evt);
            }
        });
        JPanel_Superior.add(JRb_Femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 75, -1, -1));

        JRb_Otro.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Genero.add(JRb_Otro);
        JRb_Otro.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Otro.setText("Otro");
        JRb_Otro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRb_Otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb_OtroActionPerformed(evt);
            }
        });
        JPanel_Superior.add(JRb_Otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 75, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Facultad:");
        JPanel_Superior.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 105, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("¿Sufre de hipertensión?");
        JPanel_Superior.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        JRb_Diabetes_Si.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Diabetes.add(JRb_Diabetes_Si);
        JRb_Diabetes_Si.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Diabetes_Si.setText("Sí");
        JRb_Diabetes_Si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Diabetes_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 103, -1, -1));

        JRb_Diabetes_No.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Diabetes.add(JRb_Diabetes_No);
        JRb_Diabetes_No.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Diabetes_No.setText("No");
        JRb_Diabetes_No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Diabetes_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 103, -1, -1));

        JRb_Hipertension_Si.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Hipertension.add(JRb_Hipertension_Si);
        JRb_Hipertension_Si.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Hipertension_Si.setText("Sí");
        JRb_Hipertension_Si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Hipertension_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 126, -1, -1));

        JRb_Hipertension_No.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Hipertension.add(JRb_Hipertension_No);
        JRb_Hipertension_No.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Hipertension_No.setText("No");
        JRb_Hipertension_No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Hipertension_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 126, -1, -1));

        Jl_Embarazo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Jl_Embarazo.setForeground(new java.awt.Color(0, 0, 0));
        Jl_Embarazo.setText("¿Está en embarazo?");
        JPanel_Superior.add(Jl_Embarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        JRb_Embarazo_Si.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Embarazo.add(JRb_Embarazo_Si);
        JRb_Embarazo_Si.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Embarazo_Si.setText("Sí");
        JRb_Embarazo_Si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Embarazo_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 151, -1, -1));

        JRb_Embarazo_No.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Embarazo.add(JRb_Embarazo_No);
        JRb_Embarazo_No.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Embarazo_No.setText("No");
        JRb_Embarazo_No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Embarazo_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estado de salud.png"))); // NOI18N
        JPanel_Superior.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 190, 170));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        JPanel_Superior.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 10, 110));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("¿Sufre de diabetes?");
        JPanel_Superior.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, -1, -1));

        jC_Faultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Artes Integradas", "Ciencias Naturales y Exactas", "Ciencias de la Administración", "Salud", "Ciencias Sociales y Económicas", "Humanidades", "Ingeniería" }));
        JPanel_Superior.add(jC_Faultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 125, 200, -1));

        Jl_Obecidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Jl_Obecidad.setForeground(new java.awt.Color(0, 0, 0));
        Jl_Obecidad.setText("¿Presenta obecidad?");
        JPanel_Superior.add(Jl_Obecidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, 20));

        JRb_Obecidad_Si.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Obecidad.add(JRb_Obecidad_Si);
        JRb_Obecidad_Si.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Obecidad_Si.setText("Sí");
        JRb_Obecidad_Si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Obecidad_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        JRb_Obecidad_No.setBackground(new java.awt.Color(204, 204, 255));
        BtGroup_Obecidad.add(JRb_Obecidad_No);
        JRb_Obecidad_No.setForeground(new java.awt.Color(0, 0, 0));
        JRb_Obecidad_No.setText("No");
        JRb_Obecidad_No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Superior.add(JRb_Obecidad_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        JB_Registrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_Registrar.setText("Guardar empleado");
        JB_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistrarActionPerformed(evt);
            }
        });
        JPanel_Superior.add(JB_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 300, 20));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Estatura:");
        JPanel_Superior.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Peso:");
        JPanel_Superior.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        JT_Nombre1.setBackground(new java.awt.Color(204, 204, 255));
        JT_Nombre1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_Nombre1.setForeground(new java.awt.Color(0, 0, 0));
        JT_Nombre1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        JPanel_Superior.add(JT_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 48, 320, 20));

        JT_Estatura.setBackground(new java.awt.Color(204, 204, 255));
        JT_Estatura.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JT_Estatura.setForeground(new java.awt.Color(0, 0, 0));
        JT_Estatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        JT_Estatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_EstaturaKeyTyped(evt);
            }
        });
        JPanel_Superior.add(JT_Estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 40, 20));

        JL_Error.setBackground(new java.awt.Color(255, 0, 51));
        JL_Error.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        JL_Error.setForeground(new java.awt.Color(204, 0, 51));
        JPanel_Superior.add(JL_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 340, 30));

        JPanel_Inferior.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setToolTipText("");

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jTextPane2.setEditable(false);
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Listado prioridad covid-19", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        JB_ListarDiabeticos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_ListarDiabeticos.setText("Diabeticos PYP");
        JB_ListarDiabeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ListarDiabeticosActionPerformed(evt);
            }
        });

        JB_ListarHipertension.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_ListarHipertension.setText("Hipertensión Arterial PYP");
        JB_ListarHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ListarHipertensionActionPerformed(evt);
            }
        });

        JB_ListarCuidadoPrenatal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_ListarCuidadoPrenatal.setText(" Cuidado Prenatal  PYP");
        JB_ListarCuidadoPrenatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ListarCuidadoPrenatalActionPerformed(evt);
            }
        });

        JB_ListarObesidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_ListarObesidad.setText("Obesidad PYP");
        JB_ListarObesidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ListarObesidadActionPerformed(evt);
            }
        });

        Jta_Listado.setText("Junto a cada botón, se encuentra el número de personas asociado a cada listado.\nPara conocer el listado de personas asociado a cada caso, seleccione el botón respectivo para listar las personas que presentan cada patología o mujeres en embarazo.");
        jScrollPane1.setViewportView(Jta_Listado);

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Consulta de personas registradas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel18)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("0");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JB_ListarObesidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_ListarCuidadoPrenatal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_ListarDiabeticos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_ListarHipertension, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JB_ListarDiabeticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_ListarHipertension)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_ListarCuidadoPrenatal)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_ListarObesidad)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Búsqueda ", jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estadística  de empleados registrados: ");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Embarazadas: ");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Obesos:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Diabeticos:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Hipertenso:");

        JB_Actualizar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_Actualizar.setText("Actualizar");
        JB_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ActualizarActionPerformed(evt);
            }
        });

        JL_porcentajeEmbarzadas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_porcentajeEmbarzadas.setText("...");

        JL_porcentajeObesidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_porcentajeObesidad.setText("...");

        JL_porcentajeDiabeticos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_porcentajeDiabeticos.setText("...");

        JL_porcentajeHipertensos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_porcentajeHipertensos.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(JB_Actualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_porcentajeDiabeticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_porcentajeObesidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_porcentajeEmbarzadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_porcentajeHipertensos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(614, 614, 614))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JL_porcentajeEmbarzadas))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JL_porcentajeObesidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JL_porcentajeDiabeticos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JL_porcentajeHipertensos))
                .addGap(45, 45, 45)
                .addComponent(JB_Actualizar)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estadística", jPanel2);

        javax.swing.GroupLayout JPanel_InferiorLayout = new javax.swing.GroupLayout(JPanel_Inferior);
        JPanel_Inferior.setLayout(JPanel_InferiorLayout);
        JPanel_InferiorLayout.setHorizontalGroup(
            JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        JPanel_InferiorLayout.setVerticalGroup(
            JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_InferiorLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanel_PrincipalLayout = new javax.swing.GroupLayout(JPanel_Principal);
        JPanel_Principal.setLayout(JPanel_PrincipalLayout);
        JPanel_PrincipalLayout.setHorizontalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanel_Inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanel_PrincipalLayout.setVerticalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_PrincipalLayout.createSequentialGroup()
                .addComponent(JPanel_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel_Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2FocusLost

    private void JRb_FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb_FemeninoActionPerformed
        if (JRb_Femenino.isSelected()) {
            Jl_Embarazo.setEnabled(true);
            JRb_Embarazo_Si.setEnabled(true);
            JRb_Embarazo_No.setEnabled(true);
        }
    }//GEN-LAST:event_JRb_FemeninoActionPerformed

    private void JRb_OtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb_OtroActionPerformed
        Jl_Embarazo.setEnabled(false);
        JRb_Embarazo_Si.setEnabled(false);
        JRb_Embarazo_No.setEnabled(false);
    }//GEN-LAST:event_JRb_OtroActionPerformed

    private void JRb_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb_MasculinoActionPerformed
        Jl_Embarazo.setEnabled(false);
        JRb_Embarazo_Si.setEnabled(false);
        JRb_Embarazo_No.setEnabled(false);
    }//GEN-LAST:event_JRb_MasculinoActionPerformed

    private void JB_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistrarActionPerformed
        if (JT_Edad.getText().equals("") || JT_Nombre1.getText().equals("") || JT_Peso.getText().equals("") || JT_Estatura.getText().equals("") || BtGroup_Genero.getSelection() == null
                || BtGroup_Hipertension.getSelection() == null || BtGroup_Diabetes.getSelection() == null || BtGroup_Obecidad.getSelection() == null || jC_Faultad.getSelectedItem().equals("Seleccione...")) {
            JL_Error.setText("POR FAVOR LLENE TODAS LAS CASILLAS");
        } else {
            poblacion++;
            JL_Error.setText("");
            ObjetoEmpleado.SetNombre(JT_Nombre1.getText());
            ObjetoEmpleado.SetEdad(Integer.parseInt(JT_Edad.getText()));
            ObjetoEmpleado.SetFacultad(jC_Faultad.getSelectedItem().toString());
            ObjetoEmpleado.SetPeso(Double.parseDouble(JT_Peso.getText()));
            ObjetoEmpleado.SetEstatura(Double.parseDouble(JT_Estatura.getText()));
            if (JRb_Masculino.isSelected()) {
                ObjetoEmpleado.SetGenero("Masculino");
            }
            if (JRb_Femenino.isSelected()) {
                ObjetoEmpleado.SetGenero("Femenino");
            }
            if (JRb_Otro.isSelected()) {
                ObjetoEmpleado.SetGenero("Otro");
            }
            if (JRb_Hipertension_Si.isSelected()) {
                ObjetoEmpleado.SetHipertencion(true);
                contadorHipertension++;
                EscribirListados("src\\Listados\\Hipertensión.txt", JT_Nombre1.getText());
            } else {
                ObjetoEmpleado.SetHipertencion(false);
            }
            if (JRb_Diabetes_Si.isSelected()) {
                ObjetoEmpleado.Setdiabetes(true);
                contadorDiabetes++;
                EscribirListados("src\\Listados\\Diabeticos.txt", JT_Nombre1.getText());
            } else {
                ObjetoEmpleado.Setdiabetes(false);
            }
            if (JRb_Embarazo_Si.isSelected()) {
                ObjetoEmpleado.SetEmbarazo(true);
                contadorEmbarazo++;
                EscribirListados("src\\Listados\\Cuidado prenatal.txt", JT_Nombre1.getText());
            } else {
                ObjetoEmpleado.SetEmbarazo(false);
            }
            if (JRb_Obecidad_Si.isSelected()) {
                ObjetoEmpleado.SetObesidad(true);
                contadorObesidad++;
                EscribirListados("src\\Listados\\Obesidad.txt", JT_Nombre1.getText());
            } else {
                ObjetoEmpleado.SetObesidad(false);
            }
            if (ObjetoEmpleado.getEdad() > 80) {
                List.addEmpleadoPrioridad(ObjetoEmpleado.getNombre(), ObjetoEmpleado.getFacultad());
            }
            if (ObjetoEmpleado.getEdad() <= 80 && ObjetoEmpleado.getEdad() >= 65) {
                List.addEmpleadoSegundaPrioridad(ObjetoEmpleado.getNombre(), ObjetoEmpleado.getFacultad());
            }
            if (ObjetoEmpleado.getEdad() < 65) {
                List.addEmpleadoTerceraPrioridad(ObjetoEmpleado.getNombre(), ObjetoEmpleado.getFacultad());
            }
            jTextPane2.setText(jTextPane2.getText() + List.getEmpleado(contador) + "\n");
            contador++;
            JT_Nombre1.setText(null);
            JT_Peso.setText(null);
            JT_Edad.setText(null);
            JT_Estatura.setText(null);
            JT_Peso.setText(null);
            BtGroup_Genero.clearSelection();
            BtGroup_Diabetes.clearSelection();
            BtGroup_Embarazo.clearSelection();
            BtGroup_Obecidad.clearSelection();
            BtGroup_Hipertension.clearSelection();
            jC_Faultad.setSelectedIndex(0);
            jLabel16.setText("#" + contadorDiabetes);
            jLabel17.setText("#" + contadorHipertension);
            jLabel19.setText("#" + contadorEmbarazo);
            jLabel20.setText("#" + contadorObesidad);
        }
    }//GEN-LAST:event_JB_RegistrarActionPerformed

    private void JB_ListarDiabeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ListarDiabeticosActionPerformed
        LeerListados("src\\Listados\\Diabeticos.txt");
    }//GEN-LAST:event_JB_ListarDiabeticosActionPerformed

    private void JT_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_EdadKeyTyped
        char validar = evt.getKeyChar();
        if (validar < '0' || validar > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_JT_EdadKeyTyped

    private void JB_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ActualizarActionPerformed
        if (poblacion != 0) {
            int porcentajeEmabarazo = Math.round((contadorEmbarazo * 100) / poblacion);
            int porcentajeDiabetes = Math.round((contadorDiabetes * 100) / poblacion);
            int porcentajeObesidad = Math.round((contadorObesidad * 100) / poblacion);
            int porcentajeHipertension = Math.round((contadorHipertension * 100) / poblacion);
            String a = String.valueOf(porcentajeEmabarazo);
            String b = String.valueOf(porcentajeDiabetes);
            String c = String.valueOf(porcentajeObesidad);
            String d = String.valueOf(porcentajeHipertension);
            JL_porcentajeEmbarzadas.setText(a + "  %");
            JL_porcentajeObesidad.setText(c + "  %");
            JL_porcentajeHipertensos.setText(d + "  %");
            JL_porcentajeDiabeticos.setText(b + "  %");
        }
    }//GEN-LAST:event_JB_ActualizarActionPerformed

    private void JT_EstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_EstaturaKeyTyped
        char validar = evt.getKeyChar();
        if (validar < '0' || validar > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_JT_EstaturaKeyTyped

    private void JT_PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_PesoKeyTyped
        char validar = evt.getKeyChar();
        if (validar < '0' || validar > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_JT_PesoKeyTyped

    private void JB_ListarHipertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ListarHipertensionActionPerformed
        LeerListados("src\\Listados\\Hipertensión.txt");
    }//GEN-LAST:event_JB_ListarHipertensionActionPerformed

    private void JB_ListarCuidadoPrenatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ListarCuidadoPrenatalActionPerformed
        LeerListados("src\\Listados\\Cuidado prenatal.txt");
    }//GEN-LAST:event_JB_ListarCuidadoPrenatalActionPerformed

    private void JB_ListarObesidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ListarObesidadActionPerformed
        LeerListados("src\\Listados\\Obesidad.txt");
    }//GEN-LAST:event_JB_ListarObesidadActionPerformed

    public void EscribirListados(String Ubicacion, String Nombre) {
        File Archivo = new File(Ubicacion);
        if (!Archivo.exists()) {
            JOptionPane.showMessageDialog(null, "No ha sido posible encontrar el listado a modificar", "Error", 2);
        } else {
            try {
                FileWriter Escribir = new FileWriter(Archivo, true);
                PrintWriter Linea = new PrintWriter(Escribir);
                Linea.println(Nombre); //Aquí se enviarían al archivo, los nombres de las personas.
                Linea.close();
                Escribir.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No fue posible modificar el listado\nRuta actual: " + Ubicacion, "Error", 2);
            }
        }
    }

    public void LeerListados(String Ubicacion) { //Inicio método para leer los listados
        try {
            FileInputStream Fstream = new FileInputStream(Ubicacion);
            DataInputStream Entrada = new DataInputStream(Fstream);
            BufferedReader bf = new BufferedReader(new InputStreamReader(Entrada));
            String TextoProv = "", BfRead;
            while ((BfRead = bf.readLine()) != null) {
                TextoProv = TextoProv + BfRead + "\n";
            }
            Jta_Listado.setText(TextoProv);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el archivo\nCompruebe la ubicación del archivo\nRuta actual: " + Ubicacion, "Error", 2);
        }
    } //Fin método para leer los listados

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtGroup_Diabetes;
    private javax.swing.ButtonGroup BtGroup_Embarazo;
    private javax.swing.ButtonGroup BtGroup_Genero;
    private javax.swing.ButtonGroup BtGroup_Hipertension;
    private javax.swing.ButtonGroup BtGroup_Obecidad;
    private javax.swing.JButton JB_Actualizar;
    private javax.swing.JButton JB_ListarCuidadoPrenatal;
    private javax.swing.JButton JB_ListarDiabeticos;
    private javax.swing.JButton JB_ListarHipertension;
    private javax.swing.JButton JB_ListarObesidad;
    private javax.swing.JButton JB_Registrar;
    private javax.swing.JLabel JL_Error;
    private javax.swing.JLabel JL_porcentajeDiabeticos;
    private javax.swing.JLabel JL_porcentajeEmbarzadas;
    private javax.swing.JLabel JL_porcentajeHipertensos;
    private javax.swing.JLabel JL_porcentajeObesidad;
    private javax.swing.JPanel JPanel_Inferior;
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel JPanel_Superior;
    private javax.swing.JRadioButton JRb_Diabetes_No;
    public javax.swing.JRadioButton JRb_Diabetes_Si;
    private javax.swing.JRadioButton JRb_Embarazo_No;
    private javax.swing.JRadioButton JRb_Embarazo_Si;
    public javax.swing.JRadioButton JRb_Femenino;
    private javax.swing.JRadioButton JRb_Hipertension_No;
    private javax.swing.JRadioButton JRb_Hipertension_Si;
    public javax.swing.JRadioButton JRb_Masculino;
    private javax.swing.JRadioButton JRb_Obecidad_No;
    private javax.swing.JRadioButton JRb_Obecidad_Si;
    public javax.swing.JRadioButton JRb_Otro;
    public javax.swing.JTextField JT_Edad;
    public javax.swing.JTextField JT_Estatura;
    public javax.swing.JTextField JT_Nombre1;
    public javax.swing.JTextField JT_Peso;
    private javax.swing.JLabel Jl_Embarazo;
    private javax.swing.JLabel Jl_Obecidad;
    private javax.swing.JTextPane Jta_Listado;
    private javax.swing.JComboBox<String> jC_Faultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
} //Fin clase Registro