/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package appointmentmanagementsystem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class TimeSlotsPanel extends javax.swing.JPanel {

    private final JFrame previousFrame;
    private final String[] headersForTimeSlotsTable = {"ID", "Category", "Date", "Time From", "Time To", "Status"};
    List<String> timeSlots = new ArrayList<>();

    /**
     * Creates new form TimeSlotsPanel
     *
     * @param prevFrame - parent frame
     */
    public TimeSlotsPanel(JFrame prevFrame) {
        this.previousFrame = prevFrame;
        initComponents();

        typeCombo.setModel(new DefaultComboBoxModel<>(AppointmentManagementSystem.getEnumNames(AppointmentTypeEnum.class)));

        initializeTimeSlotTables();
        
        timeSlotsTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                final int selectedRow = timeSlotsTable.getSelectedRow();
                final String timeSlot = timeSlots.get(selectedRow);
                final String[] timeSlotArray = timeSlot.split(AppointmentManagementSystem.FILE_DELIMITER);
                idLabel.setText(timeSlotArray[0]); // set id
                statusCombo.setSelectedItem(timeSlotArray[5]);
                typeCombo.setSelectedItem(timeSlotArray[4]);
                txtDate.setText(timeSlotArray[2]);
                
                final String timeFrom = timeSlotArray[1].replaceAll("\\s+", "");
                final String timeTo = timeSlotArray[3].replaceAll("\\s+", "");
                
                final Integer hourFrom = Integer.valueOf(timeFrom.split(":")[0]);
                final Integer minuteFrom = Integer.valueOf(timeFrom.split(":")[1]);
                
                final Integer hourTo = Integer.valueOf(timeTo.split(":")[0]);
                final Integer minuteTo = Integer.valueOf(timeTo.split(":")[1]);
                
                System.out.println(hourFrom);
                System.out.println(minuteFrom);
                
                hourFromSpinner.setValue(hourFrom);
                minutesFromSpinner.setValue(minuteFrom);
                
                hourToSpinner.setValue(hourTo);
                minutesToSpinner.setValue( minuteTo);
            }
        });
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        typeCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hourFromSpinner = new javax.swing.JSpinner();
        minutesFromSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        hourToSpinner = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        minutesToSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        timeSlotsTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1563, 885));
        setMinimumSize(new java.awt.Dimension(1563, 885));
        setPreferredSize(new java.awt.Dimension(1563, 885));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time Slots");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Add/Edit time slots");

        typeCombo.setBackground(new java.awt.Color(255, 255, 255));
        typeCombo.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        typeCombo.setForeground(new java.awt.Color(0, 0, 0));
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Category/Type");

        txtDate.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Date:");

        btnDate.setText("select");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Time From");

        hourFromSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        hourFromSpinner.setFocusable(false);

        minutesFromSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(":");

        save.setBackground(new java.awt.Color(204, 102, 0));
        save.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID:");

        idLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Status");

        statusCombo.setBackground(new java.awt.Color(255, 255, 255));
        statusCombo.setForeground(new java.awt.Color(0, 0, 0));
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "CLOSED" }));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Time To");

        hourToSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        hourToSpinner.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText(":");

        minutesToSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(hourToSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(hourFromSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel9))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(minutesToSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(minutesFromSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutesFromSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourFromSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutesToSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourToSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hourFromSpinner, minutesFromSpinner});

        timeSlotsTable.setBackground(new java.awt.Color(255, 255, 255));
        timeSlotsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timeSlotsTable.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        timeSlotsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Category", "Date", "Time From", "Time To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(timeSlotsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        txtDate.setText(new DatePicker(previousFrame).setPickedDate());
    }//GEN-LAST:event_btnDateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        final String id = idLabel.getText();
        if (id.isEmpty() && id.isBlank()) {
            final int nextId = AppointmentManagementSystem.getNextId(AppointmentManagementSystem.TIME_SLOTS_TXT_FILE);
            String newRecord = "\n" +nextId + AppointmentManagementSystem.FILE_DELIMITER +
                    hourFromSpinner.getValue() + ":" +minutesFromSpinner.getValue() + AppointmentManagementSystem.FILE_DELIMITER +
                    txtDate.getText() + AppointmentManagementSystem.FILE_DELIMITER + 
                    hourToSpinner.getValue() + ":" + minutesToSpinner.getValue() + AppointmentManagementSystem.FILE_DELIMITER +
                    typeCombo.getSelectedItem() + AppointmentManagementSystem.FILE_DELIMITER + 
                    statusCombo.getSelectedItem() + AppointmentManagementSystem.FILE_DELIMITER + AppointmentManagementSystem.loggedInUserId;
            AppointmentManagementSystem.writeLineToFile(AppointmentManagementSystem.TIME_SLOTS_TXT_FILE, newRecord);
            clearFields();
             initializeTimeSlotTables();
            
            JOptionPane.showMessageDialog(null, "Time slot saved successfully", "Time Slot - Saved", JOptionPane.PLAIN_MESSAGE);
        } else {
            String updatedRecord = id + AppointmentManagementSystem.FILE_DELIMITER +
                    hourFromSpinner.getValue() + ":" +minutesFromSpinner.getValue() + AppointmentManagementSystem.FILE_DELIMITER +
                    txtDate.getText() + AppointmentManagementSystem.FILE_DELIMITER + 
                    hourToSpinner.getValue() + ":" + minutesToSpinner.getValue() + AppointmentManagementSystem.FILE_DELIMITER +
                    typeCombo.getSelectedItem() + AppointmentManagementSystem.FILE_DELIMITER + 
                    statusCombo.getSelectedItem() + AppointmentManagementSystem.FILE_DELIMITER + AppointmentManagementSystem.loggedInUserId;
            
            AppointmentManagementSystem.updateRecord(Integer.valueOf(id), updatedRecord, AppointmentManagementSystem.TIME_SLOTS_TXT_FILE);
            clearFields();
            initializeTimeSlotTables();
            JOptionPane.showMessageDialog(null, "Time slot updated successfully", "Time Slot - Updated", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDate;
    private javax.swing.JSpinner hourFromSpinner;
    private javax.swing.JSpinner hourToSpinner;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner minutesFromSpinner;
    private javax.swing.JSpinner minutesToSpinner;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JTable timeSlotsTable;
    private javax.swing.JTextField txtDate;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables

    private void initializeTimeSlotTables() {
        timeSlots = AppointmentManagementSystem.getData(AppointmentManagementSystem.TIME_SLOTS_TXT_FILE);

        if (timeSlots.isEmpty()) {

        } else {
            timeSlots.remove(0); // remove the headersForAppointmentTable
            if (timeSlots.isEmpty()) {

            } else {

                String[][] tableData = new String[timeSlots.size()][headersForTimeSlotsTable.length];

                int[] count = {0};
                timeSlots.forEach(item -> {
                    String[] i = item.split(AppointmentManagementSystem.FILE_DELIMITER);
                    tableData[count[0]][0] = i[0];
                    tableData[count[0]][1] = i[4]; // category
                    tableData[count[0]][2] = i[2]; // date
                    tableData[count[0]][3] = i[1]; // time from
                    tableData[count[0]][4] = i[3]; // time to
                    tableData[count[0]][5] = i[5]; // status

                    // between dates
                    count[0] += 1;
                });

                DefaultTableModel model = new DefaultTableModel(tableData, headersForTimeSlotsTable);
                timeSlotsTable.setModel(model);
            }
        }
    }
    
    private void clearFields() {
        idLabel.setText("");
        txtDate.setText("");
        hourFromSpinner.setValue(0);
        minutesFromSpinner.setValue(0);
        hourToSpinner.setValue(0);
        minutesToSpinner.setValue(0);
    }
}
