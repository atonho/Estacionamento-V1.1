/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Adriano Zanette
 */
public class TelaConsultaVeiculos extends javax.swing.JFrame {
    
    PreparedStatement ST = null;
    ResultSet         RS = null;
    DefaultTableModel model;
    Connection conexao = null;
    
    
    
    /**
     * Creates new form TelaConsultaVTR
     */
    public TelaConsultaVeiculos() {
        initComponents();
        listarVeiculos();
        ContarRegistros();
    }

    
    
    // metodo para contar registros da tabela
    public void ContarRegistros(){
    
    int linhas=jTableViaturas.getRowCount();
    txtRegistros.setText(" " + linhas);
    
    }
    
    
    
    
    
  // digita no campo pesquisar e aparece na tabela
     public void pesquisarVeiculos()
    {
        String sql = "Select *from veiculos where placa like ?";
        
        try
        {
            ST = Conexao.conector().prepareStatement(sql);
            ST.setString(1,txtPesquisar.getText()+"%");
            RS = ST.executeQuery();
            jTableViaturas.setModel(DbUtils.resultSetToTableModel(RS));
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(null,error);
        }
    }  
    
        
    // lista os usuarios na tabela de forma ordenada por codigo
     public void listarVeiculos()
    {
        String sql = "Select Placa,DataEntrada,DataSaida from veiculos order by codigo";
        try
        {
            ST = Conexao.conector().prepareStatement(sql);
            RS = ST.executeQuery();
            jTableViaturas.setModel(DbUtils.resultSetToTableModel(RS));
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(null,error);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        samu2PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("samu2PU").createEntityManager();
        documentoQuery = java.beans.Beans.isDesignTime() ? null : samu2PUEntityManager.createQuery("SELECT d FROM Documento d");
        documentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : documentoQuery.getResultList();
        documentoQuery1 = java.beans.Beans.isDesignTime() ? null : samu2PUEntityManager.createQuery("SELECT d FROM Documento d");
        documentoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : documentoQuery1.getResultList();
        documentoQuery2 = java.beans.Beans.isDesignTime() ? null : samu2PUEntityManager.createQuery("SELECT d FROM Documento d");
        documentoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : documentoQuery2.getResultList();
        btvoltar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViaturas = new javax.swing.JTable();
        txtRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Pesquisa Veiculos");

        btvoltar1.setBackground(java.awt.Color.white);
        btvoltar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btvoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/salir.png"))); // NOI18N
        btvoltar1.setText("Sair");
        btvoltar1.setToolTipText("Sair");
        btvoltar1.setOpaque(false);
        btvoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltar1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Neou", 1, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Search.png"))); // NOI18N
        jLabel13.setText("Buscar");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Total de Veiculos Cadastrados:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela de Veiculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, documentoList2, jTableViaturas);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableViaturas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtRegistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRegistros.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 303, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btvoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btvoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(1113, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btvoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltar1ActionPerformed
        //Pergunta se o usuário deseja realmente sair do sistema
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja retornar a tela principal ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btvoltar1ActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased

        pesquisarVeiculos();
    }//GEN-LAST:event_txtPesquisarKeyReleased

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btvoltar1;
    private java.util.List<Telas.Documento> documentoList;
    private java.util.List<Telas.Documento> documentoList1;
    private java.util.List<Telas.Documento> documentoList2;
    private javax.persistence.Query documentoQuery;
    private javax.persistence.Query documentoQuery1;
    private javax.persistence.Query documentoQuery2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViaturas;
    private javax.persistence.EntityManager samu2PUEntityManager;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JLabel txtRegistros;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
