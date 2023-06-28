package fon.rs.np.RentACarKlijentMaven.form;

import fon.rs.np.RentACarZajednickiMaven.domen.KategorijaVozila;
import fon.rs.np.RentACarZajednickiMaven.domen.StatusVozila;
import fon.rs.np.RentACarZajednickiMaven.domen.Vozilo;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import fon.rs.np.RentACarKlijentMaven.komunikacija.Komunikacija;
import fon.rs.np.RentACarKlijentMaven.kontroler.Kontroler;
import fon.rs.np.RentACarZajednickiMaven.operacija.Operacija;
import fon.rs.np.RentACarKlijentMaven.tabele.ModelTabeleVozila;
import fon.rs.np.RentACarZajednickiMaven.transfer.Odgovor;
import fon.rs.np.RentACarZajednickiMaven.transfer.Zahtev;

public class GlavnaForma extends javax.swing.JFrame {

    ModelTabeleVozila mtv;

    public GlavnaForma() {
        initComponents();
        Kontroler.getInstance().setGf(this);

        setBounds(250, 250, getWidth(), getHeight());
        txtID.setEnabled(false);
        srediFormu();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JFrame frame = (JFrame) e.getSource();
                try {
                    Komunikacija.getInstance().posaljiZahtev(new Zahtev(null, Operacija.IZLOGUJ));
                } catch (Exception ex) {
                    Logger.getLogger(GlavnaForma.class.getName()).log(Level.SEVERE, null, ex);
                }
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

        jPanel1 = new javax.swing.JPanel();
        lblPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnKorisnik = new javax.swing.JButton();
        btnIznajmi = new javax.swing.JButton();
        btnVratiKola = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVozila = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtMarka = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        txtModel = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnSacuvaj = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnIzbrisi = new javax.swing.JButton();
        btnOcisti = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbKategorija = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtRegistarskiBroj = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Glavna forma");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/rent-a-car.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Rent-a-car");

        btnKorisnik.setBackground(new java.awt.Color(255, 255, 255));
        btnKorisnik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKorisnik.setForeground(new java.awt.Color(102, 0, 153));
        btnKorisnik.setText("Korisnik");
        btnKorisnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKorisnikActionPerformed(evt);
            }
        });

        btnIznajmi.setBackground(new java.awt.Color(255, 255, 255));
        btnIznajmi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIznajmi.setForeground(new java.awt.Color(102, 0, 153));
        btnIznajmi.setText("Iznajmi");
        btnIznajmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIznajmiActionPerformed(evt);
            }
        });

        btnVratiKola.setBackground(new java.awt.Color(255, 255, 255));
        btnVratiKola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVratiKola.setForeground(new java.awt.Color(102, 0, 153));
        btnVratiKola.setText("Vrati kola");
        btnVratiKola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVratiKolaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnKorisnik)
                            .addComponent(btnIznajmi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVratiKola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnKorisnik)
                .addGap(18, 18, 18)
                .addComponent(btnIznajmi)
                .addGap(18, 18, 18)
                .addComponent(btnVratiKola)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblVozila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVozila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVozilaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVozila);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Marka:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Status:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Model:");

        btnSacuvaj.setText("Sačuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnIzbrisi.setText("Izbriši");
        btnIzbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzbrisiActionPerformed(evt);
            }
        });

        btnOcisti.setText("Očisti polja");
        btnOcisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Registarski broj:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Kategorija:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSacuvaj)
                                .addGap(38, 38, 38)
                                .addComponent(btnIzmeni)
                                .addGap(38, 38, 38)
                                .addComponent(btnIzbrisi)
                                .addGap(40, 40, 40)
                                .addComponent(btnOcisti))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel6)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel8)
                                    .addGap(51, 51, 51)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(txtRegistarskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistarskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj)
                    .addComponent(btnIzmeni)
                    .addComponent(btnIzbrisi)
                    .addComponent(btnOcisti))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        if (proveraValidacije()) {
            JOptionPane.showMessageDialog(this, "Molimo unesite marku i model automobila");
            return;
        }
        Vozilo novoVozilo = new Vozilo(txtRegistarskiBroj.getText().trim(),
                txtMarka.getText().trim(), txtModel.getText().trim(),
                StatusVozila.valueOf(cbStatus.getSelectedItem().toString()),
                (KategorijaVozila) cbKategorija.getSelectedItem());
        if (Kontroler.getInstance().sacuvajVozilo(novoVozilo).isUspesno()) {
            mtv.dodajVozilo(novoVozilo);
            reset();
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void btnIzbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzbrisiActionPerformed
        if (tblVozila.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(this, "Molimo izaberite zeljeno vozilo");
        else {
            Vozilo v = mtv.vratiVozilo(tblVozila.getSelectedRow());
            if (Kontroler.getInstance().izbrisiVozilo(v).isUspesno()) {
                mtv.izbrisiVozilo(tblVozila.getSelectedRow());
                reset();
            }
        }
    }//GEN-LAST:event_btnIzbrisiActionPerformed

    private void btnKorisnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKorisnikActionPerformed
        (new KorisnickaForma(this, false)).setVisible(true);
    }//GEN-LAST:event_btnKorisnikActionPerformed

    private void btnIznajmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIznajmiActionPerformed
        (new IznajmljivanjeForma(this, false)).setVisible(true);
    }//GEN-LAST:event_btnIznajmiActionPerformed

    private void btnOcistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiActionPerformed
        reset();
    }//GEN-LAST:event_btnOcistiActionPerformed

    private void btnVratiKolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVratiKolaActionPerformed
        (new VratiKolaForma(this, false)).setVisible(true);
    }//GEN-LAST:event_btnVratiKolaActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        if (tblVozila.getSelectedRow() != -1) {
            Vozilo novo = new Vozilo(Long.parseLong(txtID.getText()),
                    txtRegistarskiBroj.getText().trim(),
                    txtMarka.getText().trim(),
                    txtModel.getText().trim(), 
                    StatusVozila.valueOf(cbStatus.getSelectedItem().toString()),
                    (KategorijaVozila) cbKategorija.getSelectedItem());
            Odgovor o = Kontroler.getInstance().izmeniVozilo(novo);
            if (o.isUspesno()) {
                JOptionPane.showMessageDialog(this, o.getPoruka());
                mtv.izmeniVozilo(novo);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, o.getPoruka());
            }
        } else
            JOptionPane.showMessageDialog(this, "Molimo izaberite neko vozilo");
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void tblVozilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVozilaMouseClicked
        if(tblVozila.getSelectedRow() != -1) {
            Vozilo v = mtv.vratiVozilo(tblVozila.getSelectedRow());
            txtID.setText("" + v.getId());
            txtRegistarskiBroj.setText(v.getRegistarskiBroj());
            txtMarka.setText(v.getMarka());
            txtModel.setText(v.getModel());
            cbKategorija.setSelectedItem(v.getKategorijaVozila());
        }
    }//GEN-LAST:event_tblVozilaMouseClicked

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
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzbrisi;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnIznajmi;
    private javax.swing.JButton btnKorisnik;
    private javax.swing.JButton btnOcisti;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JButton btnVratiKola;
    private javax.swing.JComboBox<KategorijaVozila> cbKategorija;
    private javax.swing.JComboBox<StatusVozila> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTable tblVozila;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtRegistarskiBroj;
    // End of variables declaration//GEN-END:variables

    private boolean proveraValidacije() {
        return txtRegistarskiBroj.getText().equals("")
                || txtMarka.getText().equals("") || txtModel.getText().equals("");
    }

    private void srediFormu() {

        cbStatus.addItem(StatusVozila.SLOBODNO);
        cbStatus.addItem(StatusVozila.ZAUZETO);

        List<KategorijaVozila> kategorije = Kontroler.getInstance().vratiKategorijeVozila();

        for (KategorijaVozila kv : kategorije) {
            cbKategorija.addItem(kv);
        }

        List<Vozilo> vozila = Kontroler.getInstance().vratiVozila(new Vozilo());
        mtv = new ModelTabeleVozila(vozila);
        tblVozila.setModel(mtv);
    }

    private void reset() {
        txtID.setText("");
        txtRegistarskiBroj.setText("");
        txtMarka.setText("");
        txtModel.setText("");
    }

    public void azuriraj(Vozilo vozilo) {
        mtv.iznajmi(vozilo);
    }

    public void azurirajVrati(Vozilo vozilo) {
        mtv.vratiIznajmljeno(vozilo);
    }

}