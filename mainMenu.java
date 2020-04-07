/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectConway;

/**
 *
 * @author nathanhansen
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public mainMenu() {
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

        conwaytitle = new java.awt.Label();
        creditsbutton = new java.awt.Button();
        playbutton = new java.awt.Button();
        quitbutton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        conwaytitle.setFont(new java.awt.Font("Copperplate", 0, 48)); // NOI18N
        conwaytitle.setForeground(new java.awt.Color(0, 0, 0));
        conwaytitle.setText("PROJECT CONWAY");
        getContentPane().add(conwaytitle);
        conwaytitle.setBounds(21, 0, 458, 200);

        creditsbutton.setActionCommand("QUIT");
        creditsbutton.setLabel("CREDITS");
        creditsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(creditsbutton);
        creditsbutton.setBounds(140, 300, 210, 40);

        playbutton.setLabel("PLAY");
        playbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playbuttonMouseClicked(evt);
            }
        });
        playbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(playbutton);
        playbutton.setBounds(140, 200, 210, 40);

        quitbutton.setActionCommand("QUIT");
        quitbutton.setLabel("QUIT");
        quitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(quitbutton);
        quitbutton.setBounds(140, 250, 210, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void creditsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditsbuttonActionPerformed

    private void playbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbuttonActionPerformed
        // TODO add your handling code here:
        levelSelect lvlSel = new levelSelect();
        lvlSel.setVisible(true);
    }//GEN-LAST:event_playbuttonActionPerformed

    private void quitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbuttonActionPerformed
        // TODO add your handling code here:
        //make it stop
    }//GEN-LAST:event_quitbuttonActionPerformed

    private void playbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_playbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label conwaytitle;
    private java.awt.Button creditsbutton;
    private java.awt.Button playbutton;
    private java.awt.Button quitbutton;
    // End of variables declaration//GEN-END:variables
}
