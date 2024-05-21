/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import model.EscalaDeComa;
import model.Paciente;
import persistence.Conexao;
import persistence.Paciente_JDBC;

/**
 *
 * @author Igor
 */
public class Registrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxAberturaOcular = new javax.swing.JComboBox<>();
        cbxVerbal = new javax.swing.JComboBox<>();
        cbxRespostaMotora = new javax.swing.JComboBox<>();
        cbxRespostaOcular = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtIdade = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Sobrenome:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel5.setText("Registrar Paciente");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Escala de Coma");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Variáveis");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Score");

        jLabel11.setText("Abertura Ocular");

        jLabel12.setText("Resposta Verbal");

        jLabel13.setText("Resposta Motora");

        jLabel14.setText("Resposta Ocular");

        cbxAberturaOcular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espontânea - 4", "À voz - 3 ", "À dor - 2", "Nenhuma - 1" }));
        cbxAberturaOcular.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAberturaOcularItemStateChanged(evt);
            }
        });

        cbxVerbal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orientada - 5", "Confusa - 4", "Palavras inapropriadas - 3", "Palavras incompreensiveis - 2", "Nenhuma - 1" }));

        cbxRespostaMotora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Obedece a comandos - 6", "Localiza a dor - 5", "Movimentos de retirada - 4", "Flexão normal - 3", "Extensão anormal - 2 ", "Nenhuma - 1" }));

        cbxRespostaOcular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma - 2", "Apenas uma - 1 ", "Reação bilateral - 0" }));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Voltar");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdade)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel9)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxRespostaOcular, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbxRespostaMotora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxVerbal, 0, 193, Short.MAX_VALUE)
                                        .addComponent(cbxAberturaOcular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(174, 174, 174))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(175, 175, 175)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxAberturaOcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxVerbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxRespostaMotora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxRespostaOcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EscalaDeComa calcularEscalaDeComa = new EscalaDeComa();

        Integer valorAberturaOcular  = 0;
        Integer valorRespostaVerbal  = 0;
        Integer valorRespostaMotora  = 0;
        Integer valorRespostaPupilar = 0;

        String aberturaOcular = (String) cbxAberturaOcular.getSelectedItem();
        System.out.println(aberturaOcular);
        switch (aberturaOcular) {
            case "Espontânea - 4" -> valorAberturaOcular = 4;
            case "À voz - 3" -> valorAberturaOcular = 3;
            case "À dor - 2" -> valorAberturaOcular = 2;
            case "Nenhuma - 1" -> valorAberturaOcular = 1;
            default -> System.out.println("erro no primeiro switch");
        }

        String respostaVerbal = (String) cbxVerbal.getSelectedItem();
        System.out.println(respostaVerbal);
        switch (respostaVerbal) {
            case "Orientada - 5" -> valorRespostaVerbal = 5;
            case "Confusa - 4" -> valorRespostaVerbal = 4;
            case "Palavras inapropriadas - 3" -> valorRespostaVerbal = 3;
            case "Palavras imcompreensiveis - 2" -> valorRespostaVerbal = 2;
            case "Nenhuma - 1" -> valorRespostaVerbal = 1;
            default -> System.out.println("erro no segundo switch");
        }
        String respostaMotora = (String) cbxRespostaMotora.getSelectedItem();
        System.out.println(respostaMotora);
        switch (respostaMotora) {
            case "Obedece a comandos - 6" -> valorRespostaMotora = 6;
            case "Localiza a dor - 5" -> valorRespostaMotora = 5;
            case "Movimentos de retirada - 4" -> valorRespostaMotora = 4;
            case "Flexão normal - 3" -> valorRespostaMotora = 3;
            case "Extensão anormal - 2" -> valorRespostaMotora = 2;
            case "Nenhuma - 1" -> valorRespostaMotora = 1;
            default -> System.out.println("erro no terceiro switch");
        }
        String respostaPupilar = (String) cbxRespostaOcular.getSelectedItem();
        System.out.println(respostaPupilar);
        switch (respostaPupilar) {
            case "Nenhuma - 2" -> valorRespostaPupilar = 2;
            case "Apenas uma - 1" -> valorRespostaPupilar = 1;
            case "Reação bilateral - 0" -> valorRespostaPupilar = 0;
            default -> System.out.println("erro no quarto switch");
        }

        String nome = txtNome.getText();
        String sobrenome = txtSobrenome.getText();
        String idade = txtIdade.getText();
        String cpf = txtCpf.getText();

        Integer resultado = calcularEscalaDeComa.calcularScore(valorAberturaOcular, valorRespostaVerbal, valorRespostaMotora, valorRespostaPupilar);
        String escalaDeComa = "";

        if (resultado >= 13 && resultado <= 15) {
            escalaDeComa = "LEVE";
        }else if(resultado >= 9 && resultado <= 12){
            escalaDeComa = "MODERADA";
        }else if(resultado >= 3 && resultado <= 8){
            escalaDeComa = "GRAVE";
        }else{
            escalaDeComa = "COMA";
        }

        Paciente paciente = new Paciente(nome, sobrenome, idade, cpf, escalaDeComa);

        Conexao conexao = new Conexao();
        Paciente_JDBC pacienteDAO;
        try {
            pacienteDAO = new Paciente_JDBC(conexao.abrirConexao());
            System.out.println("abriu");
            pacienteDAO.inserirPaciente(paciente);
            
            txtNome.setText("");
            txtSobrenome.setText("");
            txtIdade.setText("");
            txtCpf.setText("");
            txtNome.requestFocus();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxAberturaOcularItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAberturaOcularItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAberturaOcularItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAberturaOcular;
    private javax.swing.JComboBox<String> cbxRespostaMotora;
    private javax.swing.JComboBox<String> cbxRespostaOcular;
    private javax.swing.JComboBox<String> cbxVerbal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
