package fon.rs.np.RentACarServerMaven.forma;

import javax.swing.JOptionPane;
import fon.rs.np.RentACarServerMaven.server.PokreniServer;

/**
 * Klasa koja predstavlja serversku formu.
 * 
 * @author Boris Zivanovic
 */

public class ServerskaForma extends javax.swing.JFrame {

	/**
	 * instanca klase koja pokrece serversku formu
	 */
    PokreniServer ps;
    
    /**
     * Konstruktor klase ServerskaForma.
     * Inicijalizuje komponente forme i kreira instancu PokreniServer.
     */
    
    public ServerskaForma() {
        initComponents();
        ps = new PokreniServer(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnd = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 300, 541, 226));

        btnEnd.setText("Ugasi server");
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        btnStart.setText("Pokreni server");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Bamiron Rent-a-car Agencija");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva prilikom klika na dugme "Pokreni server".
     * Ako je server već pokrenut, prikazuje se odgovarajuća poruka.
     * Inače, kreira se nova instanca PokreniServer i pokreće se.
     * 
     * @param evt događaj klika na dugme
     */
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        if(ps.isAlive())
            JOptionPane.showMessageDialog(this, "Server je pokrenut...");
        else {
            ps = new PokreniServer(this);
            ps.start();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    /**
     * Metoda koja se poziva prilikom klika na dugme "Ugasi server".
     * Ako je server pokrenut, zaustavlja se.
     * Inače, prikazuje se odgovarajuća poruka.
     * 
     * @param evt događaj klika na dugme
     */
    
    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        if(ps.isAlive())
            ps.stopServer();
        else
            JOptionPane.showMessageDialog(this, "Server je ugasen");
    }//GEN-LAST:event_btnEndActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
