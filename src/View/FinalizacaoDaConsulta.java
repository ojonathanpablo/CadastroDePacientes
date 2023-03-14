package View;

import Model.ListaPaciente;
import Model.Paciente;

public class FinalizacaoDaConsulta extends javax.swing.JFrame {

    public FinalizacaoDaConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jrbConsultaRealizada = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhe da consulta"));

        jrbConsultaRealizada.setText("Consulta realizada");
        jrbConsultaRealizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaRealizadaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtObservacao);

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Receita e observação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbConsultaRealizada)
                            .addComponent(jLabel1))
                        .addGap(0, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jrbConsultaRealizada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        finalizar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jrbConsultaRealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaRealizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbConsultaRealizadaActionPerformed
    private TelaInicial telaInicial;
    private Paciente paciente;
    private int posPaciente;
 

    public void MostraTela(TelaInicial obj, int posPaciente) {
        this.telaInicial = obj;
        this.posPaciente = posPaciente;
        this.paciente = ListaPaciente.getPaciente(posPaciente);
        System.out.print("mostra  dados:"+ paciente.getNome());
        carregarFormulario();
        setVisible(true); 
    }
    
    public void finalizar(){
        if(jrbConsultaRealizada.isSelected()){    
        this.paciente.setConsultaRealizada("Sim");
        }else {
        this.paciente.setConsultaRealizada("Não");
        }
        paciente.setObservacao(txtObservacao.getText());
        
        ListaPaciente.atualizar(posPaciente, paciente);
        telaInicial.AtualizerTabela();
        dispose();  
    }
    
    public void carregarFormulario(){
        jrbConsultaRealizada.setSelected(false);
        
        if (this.paciente.getConsultaRealizada().equals("Sim")){
            jrbConsultaRealizada.setSelected(true);
        }
        txtObservacao.setText(this.paciente.getObservacao());
        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FinalizacaoDaConsulta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbConsultaRealizada;
    private javax.swing.JTextPane txtObservacao;
    // End of variables declaration//GEN-END:variables
}
