/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class Exercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio3
     */
    public Exercicio3() {
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

        jLabel1 = new javax.swing.JLabel();
        Produto1Combo = new javax.swing.JComboBox<>();
        Produto2Combo = new javax.swing.JComboBox<>();
        Produto3Combo = new javax.swing.JComboBox<>();
        Produto4Combo = new javax.swing.JComboBox<>();
        Produto5Combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Quantidade1Text = new javax.swing.JTextField();
        Quantidade2Text = new javax.swing.JTextField();
        Quantidade3Text = new javax.swing.JTextField();
        Quantidade4Text = new javax.swing.JTextField();
        FecharPedidoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Preco1Text = new javax.swing.JTextField();
        Preco2Text = new javax.swing.JTextField();
        Preco3Text = new javax.swing.JTextField();
        Preco4Text = new javax.swing.JTextField();
        Preco5Text = new javax.swing.JTextField();
        Quantidade5Text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Produtos:");

        Produto1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alface", "Tomate", "Cebola", "Arroz", "Feijão" }));
        Produto1Combo.setToolTipText("");
        Produto1Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CarregarPreco(evt);
            }
        });
        Produto1Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produto1ComboActionPerformed(evt);
            }
        });

        Produto2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alface", "Tomate", "Cebola", "Arroz", "Feijão" }));
        Produto2Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CarregarPreco2(evt);
            }
        });

        Produto3Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alface", "Tomate", "Cebola", "Arroz", "Feijão" }));
        Produto3Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CarregarPreco3(evt);
            }
        });

        Produto4Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alface", "Tomate", "Cebola", "Arroz", "Feijão" }));
        Produto4Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CarregarPreco4(evt);
            }
        });

        Produto5Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alface", "Tomate", "Cebola", "Arroz", "Feijão" }));
        Produto5Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CarregarPreco5(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        Quantidade1Text.setText("0");
        Quantidade1Text.setToolTipText("");

        Quantidade2Text.setText("0");

        Quantidade3Text.setText("0");

        Quantidade4Text.setText("0");

        FecharPedidoButton.setText("Fechar Pedido");
        FecharPedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharPedidoButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço Unit:");

        Preco1Text.setEditable(false);

        Preco2Text.setEditable(false);

        Preco3Text.setEditable(false);

        Preco4Text.setEditable(false);

        Preco5Text.setEditable(false);

        Quantidade5Text.setText("0");
        Quantidade5Text.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Produto1Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto2Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto3Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto4Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto5Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Preco1Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Preco5Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(Preco4Text, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel3)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Preco2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Preco3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Quantidade5Text)
                                .addComponent(Quantidade4Text)
                                .addComponent(Quantidade3Text)
                                .addComponent(Quantidade2Text)
                                .addComponent(Quantidade1Text, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FecharPedidoButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Preco1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Preco2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Preco3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Preco4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto4Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Quantidade1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantidade2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantidade3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantidade4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Preco5Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Produto5Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantidade5Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(FecharPedidoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Produto1Combo.getAccessibleContext().setAccessibleName("");
        Produto1Combo.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Produto1ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produto1ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produto1ComboActionPerformed

    private void CarregarPreco(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CarregarPreco
        Preco1Text.setText(String.valueOf(PrecoItens(Produto1Combo.getSelectedIndex())));
    }//GEN-LAST:event_CarregarPreco

    private void CarregarPreco2(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CarregarPreco2
        Preco2Text.setText(String.valueOf(PrecoItens(Produto2Combo.getSelectedIndex())));
    }//GEN-LAST:event_CarregarPreco2

    private void CarregarPreco3(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CarregarPreco3
        Preco3Text.setText(String.valueOf(PrecoItens(Produto3Combo.getSelectedIndex())));
    }//GEN-LAST:event_CarregarPreco3

    private void CarregarPreco4(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CarregarPreco4
        Preco4Text.setText(String.valueOf(PrecoItens(Produto4Combo.getSelectedIndex())));
    }//GEN-LAST:event_CarregarPreco4

    private void CarregarPreco5(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CarregarPreco5
        Preco5Text.setText(String.valueOf(PrecoItens(Produto5Combo.getSelectedIndex())));
    }//GEN-LAST:event_CarregarPreco5

    private void FecharPedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharPedidoButtonActionPerformed
        double totalPedido = 0;
        totalPedido = Double.parseDouble(Preco1Text.getText()) * Double.parseDouble(Quantidade1Text.getText());
        totalPedido += Double.parseDouble(Preco2Text.getText()) * Double.parseDouble(Quantidade2Text.getText());
        totalPedido += Double.parseDouble(Preco3Text.getText()) * Double.parseDouble(Quantidade3Text.getText());
        totalPedido += Double.parseDouble(Preco4Text.getText()) * Double.parseDouble(Quantidade4Text.getText());
        totalPedido += Double.parseDouble(Preco5Text.getText()) * Double.parseDouble(Quantidade5Text.getText());
        
        JOptionPane.showMessageDialog(this, "O Total do Seu Pedido é: "+totalPedido);
    }//GEN-LAST:event_FecharPedidoButtonActionPerformed

    private double PrecoItens(int PosicaoIndex) {
        double valor = 0;
        switch (PosicaoIndex) {
            case 1:
                valor = 5.0;
                break;
            case 2:
                valor = 3.0;
                break;
            case 3:
                valor = 7.0;
                break;
            case 4:
                valor = 10.0;
                break;
            case 5:
                valor = 6.0;
                break;
            default:
                valor = 0;
        }
        return valor;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FecharPedidoButton;
    private javax.swing.JTextField Preco1Text;
    private javax.swing.JTextField Preco2Text;
    private javax.swing.JTextField Preco3Text;
    private javax.swing.JTextField Preco4Text;
    private javax.swing.JTextField Preco5Text;
    private javax.swing.JComboBox<String> Produto1Combo;
    private javax.swing.JComboBox<String> Produto2Combo;
    private javax.swing.JComboBox<String> Produto3Combo;
    private javax.swing.JComboBox<String> Produto4Combo;
    private javax.swing.JComboBox<String> Produto5Combo;
    private javax.swing.JTextField Quantidade1Text;
    private javax.swing.JTextField Quantidade2Text;
    private javax.swing.JTextField Quantidade3Text;
    private javax.swing.JTextField Quantidade4Text;
    private javax.swing.JTextField Quantidade5Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
