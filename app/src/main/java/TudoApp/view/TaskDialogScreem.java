/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package TudoApp.view;

import TudoApp.controller.TaskController;
import TudoApp.model.Project;
import TudoApp.model.Task;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TaskDialogScreem extends javax.swing.JDialog {

    TaskController controller;
    Project projeto;

    /**
     * Creates new form UltimaTela
     */
    public TaskDialogScreem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new TaskController();
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
        jPanel1 = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelSaveTitle = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldDescriptionName = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricaoDescription = new javax.swing.JTextField();
        jLabelPrazoTitle = new javax.swing.JLabel();
        jFormattedTextFieldPrazoDescription = new javax.swing.JFormattedTextField();
        jLabelNotaTitle = new javax.swing.JLabel();
        jScrollPaneNotaDescription = new javax.swing.JScrollPane();
        jTextAreaNotasDeescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitle.setBackground(new java.awt.Color(0, 153, 102));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Tarefas");

        jLabelSaveTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novos/check5.png"))); // NOI18N
        jLabelSaveTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveTitleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSaveTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addComponent(jLabelSaveTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jLabelName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelName.setText("Nome:");

        jTextFieldDescriptionName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDescriptionName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldDescriptionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriptionNameActionPerformed(evt);
            }
        });

        jLabelDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descri��o:");

        jTextFieldDescricaoDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDescricaoDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabelPrazoTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPrazoTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPrazoTitle.setText("Prazo:");

        jFormattedTextFieldPrazoDescription.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldPrazoDescription.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldPrazoDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPrazoDescriptionActionPerformed(evt);
            }
        });

        jLabelNotaTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNotaTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNotaTitle.setText("Notas:");

        jTextAreaNotasDeescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaNotasDeescription.setColumns(20);
        jTextAreaNotasDeescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaNotasDeescription.setRows(5);
        jScrollPaneNotaDescription.setViewportView(jTextAreaNotasDeescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldPrazoDescription)
                    .addComponent(jScrollPaneNotaDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDescriptionName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDescricaoDescription, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrazoTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNotaTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescriptionName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDescricaoDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrazoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldPrazoDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNotaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotaDescription)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescriptionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriptionNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescriptionNameActionPerformed

    private void jLabelSaveTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveTitleMouseClicked
        // TODO add your handling code here:

        try {
            Task task = new Task();

            task.setIdPreoject(9);
           

            task.setName(jTextFieldDescriptionName.getText());
            task.setDescription(jTextFieldDescricaoDescription.getText());
            task.setNotes(jTextAreaNotasDeescription.getText());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline ;
            deadline = dateFormat.parse(jFormattedTextFieldPrazoDescription.getText());
            task.setDeadline(deadline);

            controller.save(task);
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_jLabelSaveTitleMouseClicked

    private void jFormattedTextFieldPrazoDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPrazoDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPrazoDescriptionActionPerformed

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
            java.util.logging.Logger.getLogger(TaskDialogScreem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreem dialog = new TaskDialogScreem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldPrazoDescription;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNotaTitle;
    private javax.swing.JLabel jLabelPrazoTitle;
    private javax.swing.JLabel jLabelSaveTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneNotaDescription;
    private javax.swing.JTextArea jTextAreaNotasDeescription;
    private javax.swing.JTextField jTextFieldDescricaoDescription;
    private javax.swing.JTextField jTextFieldDescriptionName;
    // End of variables declaration//GEN-END:variables

    public void setProjeto(Project projeto) {
        this.projeto = projeto;
    }

}
