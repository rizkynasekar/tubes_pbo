/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AplikasiPenjualan;

/**
 *
 * @author ACER
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /** Creates new form OptionMenu */
    public OptionMenu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showDataButton = new javax.swing.JButton();
        toPaymentButton = new javax.swing.JButton();

        setTitle("OPTION MENU");

        showDataButton.setText("TAMPILKAN DATA");
        showDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataButtonActionPerformed(evt);
            }
        });

        toPaymentButton.setText("PENJUALAN RUMAH");
        toPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPaymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toPaymentButton)
                    .addComponent(showDataButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPaymentButtonActionPerformed
        PaymentForm paymentForm = new PaymentForm();
        paymentForm.setVisible(true);
        this.getDesktopPane().add(paymentForm);
        this.dispose();
    }//GEN-LAST:event_toPaymentButtonActionPerformed

    private void showDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataButtonActionPerformed
    DataForm dataForm = new DataForm();
    dataForm.setVisible(true);
    this.getDesktopPane().add(dataForm);
    this.dispose();
    }//GEN-LAST:event_showDataButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton showDataButton;
    private javax.swing.JButton toPaymentButton;
    // End of variables declaration//GEN-END:variables

}
