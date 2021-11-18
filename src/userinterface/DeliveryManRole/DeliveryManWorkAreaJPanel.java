/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Orders;
import Business.Order.OrdersDirectory;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author garima
 */

public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private DeliveryManDirectory deliveryManDirectory;
    private OrdersDirectory orderDirectory;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrdersDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
      
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(Orders orders: business.getOrderDirectory().getOrderDirectory()){
            if(orders.getDeliveryMan() != null){
                if(orders.getDeliveryMan().getDeliveryId().equalsIgnoreCase(userAccount.getEmployee().getName())){
                Object[] row = new Object[7];
                    row[0] = orders.getMessage();
                    row[1] = orders.getSender();
                    row[2] = orders.getReceiver();
                    row[3] = orders.getStatus();
                    row[4] = orders.getOrderId();
                    row[5] = orders.getCustomer().getCustomerAddress();
                    row[6] = orders.getRestaurant().getRestaurantAddress();
                    model.addRow(row);
            }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Order Id", "Customer Address", "Restaurant Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 920, 96));

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        processJButton.setText("Confirm");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Update Delivery Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Confirm Result:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Pickup Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
        
        String selectedId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Orders orders = business.getOrderDirectory().getOrderByOrderId(selectedId);
     
        if(orders.getStatus().trim().equalsIgnoreCase("Out For Delivery")){
            orders.setResult(resultJTextField.getText());
            orders.setStatus("Completed");
            resultJTextField.setText("");
            JOptionPane.showMessageDialog(null, "Orders Details updated!");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Confirm order pick up before confirming delivery!");
        }
//        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, orders);
//        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a valid row!");
            return;
        }
        
        String selectedId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Orders order = business.getOrderDirectory().getOrderByOrderId(selectedId);
     
        order.setStatus("Out For Delivery");
        JOptionPane.showMessageDialog(null, "Order Details updated!");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
