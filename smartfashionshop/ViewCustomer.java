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
public class ViewCustomer extends javax.swing.JFrame {

    private static void setRowHeight(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form ViewCustomer
     */
    public ViewCustomer() {
        initComponents();
        DefaultTableModel dtm=(DefaultTableModel)viewCustomerReportsTable.getModel();;
        String[] cNumber=new String[0];
		double[] AMOUNTTEMP=new double[0];
		int[]QTYTEMP=new int[0];
		
		L1:for(int i=0;i<DBconnection.getDBConnection().getOrderList().size();i++){
			 for (int j= 0; j < cNumber.length; j++){
					if(cNumber[j].equals (DBconnection.getDBConnection().getOrderList().get(i).getCustomerId())){
						QTYTEMP[j]+=DBconnection.getDBConnection().getOrderList().get(i).getQty();
						AMOUNTTEMP[j]+=DBconnection.getDBConnection().getOrderList().get(i).getAmount();
							continue L1;
			} 
		}
		String [] cNumber2=new String [cNumber.length+1];
		cNumber2[cNumber2 .length-1]=DBconnection.getDBConnection().getOrderList().get(i).getCustomerId();
		int[] tempqty2=new int [QTYTEMP.length+1];
		tempqty2[tempqty2.length-1]=DBconnection.getDBConnection().getOrderList().get(i).getQty();
		double [] Amount2=new double[AMOUNTTEMP.length+1] ;
		Amount2[Amount2.length-1]=DBconnection.getDBConnection().getOrderList().get(i).getAmount();
	 
		for (int c = 0; c <cNumber.length ; c++){
			cNumber2[c]=cNumber[c];
			tempqty2[c]=QTYTEMP[c];
			Amount2[c]=AMOUNTTEMP[c];
			}
		
		cNumber=cNumber2;
		QTYTEMP=tempqty2;
		AMOUNTTEMP=Amount2;
		}
                
                viewCustomerReportsTable.setRowHeight(40);
		
		dtm.setRowCount(0);
	for (int i = 0; i < cNumber.length; i++){
	
		
		Object[] rowData={cNumber[i],QTYTEMP[i],AMOUNTTEMP[i]};
		dtm.addRow(rowData);
		
	}
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
        viewCustomerReportsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setBackground(new java.awt.Color(102, 0, 0));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        viewCustomerReportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerId", "QTY", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewCustomerReportsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
                    ViewCustomer.this.dispose();
			new ViewForm().setVisible(true);   // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewCustomerReportsTable;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
