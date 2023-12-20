/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartfashionshop;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author waths
 */
public class SorteByQuantity extends javax.swing.JFrame {

    /**
     * Creates new form SorteByQuantity
     */
    public SorteByQuantity() {
        initComponents();
           DefaultTableModel dtm=(DefaultTableModel)shortedByQtyTable.getModel();
        
        String[] sizes = {"xs", "s", "m", "l", "xl", "xxl"};
        int[] qtytemp2 = new int[6];
        double[] amounttemp2 = new double[6];

        for (int i = 0; i < DBconnection.getDBConnection().getOrderList().size(); i++) {
            if (DBconnection.getDBConnection().getOrderList().get(i).getSize().equals("xs")) {
                qtytemp2[0] += DBconnection.getDBConnection().getOrderList().get(i).getQty();
                amounttemp2[0] += DBconnection.getDBConnection().getOrderList().get(i).getAmount();
            } else if (DBconnection.getDBConnection().getOrderList().get(i).getSize().equals("s")) {
                qtytemp2[1] += DBconnection.getDBConnection().getOrderList().get(i).getQty();
                amounttemp2[1] += DBconnection.getDBConnection().getOrderList().get(i).getAmount();
            } else if (DBconnection.getDBConnection().getOrderList().get(i).getSize().equals("m")) {
                qtytemp2[2] += DBconnection.getDBConnection().getOrderList().get(i).getQty();
                amounttemp2[2] += DBconnection.getDBConnection().getOrderList().get(i).getAmount();
            } else if (DBconnection.getDBConnection().getOrderList().get(i).getSize().equals("l")) {
                qtytemp2[3] += DBconnection.getDBConnection().getOrderList().get(i).getQty();
                amounttemp2[3] += DBconnection.getDBConnection().getOrderList().get(i).getAmount();
            } else if (DBconnection.getDBConnection().getOrderList().get(i).getSize().equals("xl")) {
                qtytemp2[4] += DBconnection.getDBConnection().getOrderList().get(i).getQty();
                amounttemp2[4] += DBconnection.getDBConnection().getOrderList().get(i).getAmount();
            } else if (DBconnection.getDBConnection().getOrderList().get(i).getSize().equals("xxl")) {
                qtytemp2[5] += DBconnection.getDBConnection().getOrderList().get(i).getQty();
                amounttemp2[5] += DBconnection.getDBConnection().getOrderList().get(i).getAmount();
            }
        }

        Controller.sortByQty(sizes, qtytemp2, amounttemp2);
        dtm.setRowCount(0);
        for (int i = 0; i < sizes.length; i++) {
            Object[] data = {sizes[i], qtytemp2[i], amounttemp2[i]};
            dtm.addRow(data);
        }
        shortedByQtyTable.setRowHeight(40);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shortedByQtyTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setBackground(new java.awt.Color(153, 0, 51));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        shortedByQtyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Size", "QTY", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shortedByQtyTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
                        SorteByQuantity.this.dispose();
			new ViewForm().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SorteByQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SorteByQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SorteByQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SorteByQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SorteByQuantity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shortedByQtyTable;
    // End of variables declaration//GEN-END:variables
}