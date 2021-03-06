/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author garima
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {
    public RestaurantDirectory restaurantDirectory;
    public JPanel container;
    public EcoSystem system;
    public EmployeeDirectory employeeDirectory;

    public ManageRestaurantJPanel(JPanel container, EcoSystem system, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.container = container;
        this.restaurantDirectory = restaurantDirectory;
        this.system = system;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        restaurantJTable = new javax.swing.JTable();
        addRestaurantBtn = new javax.swing.JButton();
        viewRestaurantDetailsBtn = new javax.swing.JButton();
        deleteRestaurantBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Restaurants");

        restaurantJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Restaurant Id", "Restaurant Name", "Username", "Manager Name", "Restaurant Address", "Restaurant Contact No", "License No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(restaurantJTable);

        addRestaurantBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addRestaurantBtn.setText("Add Restaurant");
        addRestaurantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRestaurantBtnActionPerformed(evt);
            }
        });

        viewRestaurantDetailsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewRestaurantDetailsBtn.setText("View Details");
        viewRestaurantDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRestaurantDetailsBtnActionPerformed(evt);
            }
        });

        deleteRestaurantBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteRestaurantBtn.setText("Delete Restaurant");
        deleteRestaurantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRestaurantBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/animation_300_kw8g3umn.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(387, 387, 387)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addRestaurantBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewRestaurantDetailsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteRestaurantBtn)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRestaurantBtn)
                    .addComponent(viewRestaurantDetailsBtn)
                    .addComponent(deleteRestaurantBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) restaurantJTable.getModel();

        model.setRowCount(0);
        for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountDirectory()) {
            for (Restaurant r : restaurantDirectory.getRestaurantDirectory()) {
                if (r.getRestaurantId().equalsIgnoreCase(userAccount.getEmployee().getName())) {
                    Object[] row = new Object[7];
                    row[0] = r.getRestaurantId();
                    row[1] = r.getRestaurantName();
                    row[2] = userAccount.getUsername();
                    row[3] = r.getRestaurantManagerName();
                    row[4] = r.getRestaurantPhoneNo();
                    row[5] = r.getRestaurantAddress();
                    row[6] = r.getRestaurantLicenseNo();
                    model.addRow(row);
                }
            }
        }
    }

    private void addRestaurantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRestaurantBtnActionPerformed
        CardLayout layout = (CardLayout) container.getLayout();
        CreateRestaurantJPanel createRest = new CreateRestaurantJPanel(container, system, restaurantDirectory);
        container.add(createRest);
        layout.next(container);
    }//GEN-LAST:event_addRestaurantBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] compnents = container.getComponents();
        Component component = compnents[compnents.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteRestaurantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRestaurantBtnActionPerformed
        int selectedRow = restaurantJTable.getSelectedRow();
        int count = restaurantJTable.getSelectedRowCount();
        if(count == 1){
            if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                restaurantDirectory.deleteRestaurant(selectedRow,system);
                populateTable();
            }
        }
        }
         else {
            JOptionPane.showMessageDialog(null, "Please select valid row from the table!!");
        }
    }//GEN-LAST:event_deleteRestaurantBtnActionPerformed

    private void viewRestaurantDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRestaurantDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = restaurantJTable.getSelectedRow();
        int count = restaurantJTable.getSelectedRowCount();
        if(count == 1){
        if (selectedRow >= 0) {
            CardLayout layout = (CardLayout) container.getLayout();
            Restaurant r = restaurantDirectory.getRestaurantId(selectedRow);
            ViewRestaurantsJPanel view = new ViewRestaurantsJPanel(container, r, restaurantDirectory);
            container.add(view);
            layout.next(container);
        }
        }else {
            JOptionPane.showMessageDialog(null, "Please select valid row from the table");
        }
    }//GEN-LAST:event_viewRestaurantDetailsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRestaurantBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteRestaurantBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable restaurantJTable;
    private javax.swing.JButton viewRestaurantDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
