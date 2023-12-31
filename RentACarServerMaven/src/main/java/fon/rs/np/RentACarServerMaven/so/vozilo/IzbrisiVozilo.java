package fon.rs.np.RentACarServerMaven.so.vozilo;

import fon.rs.np.RentACarServerMaven.baza.DbBroker;
import fon.rs.np.RentACarZajednickiMaven.domen.OpstiObjekat;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import fon.rs.np.RentACarServerMaven.so.OpstaSistemskaOperacija;
import fon.rs.np.RentACarZajednickiMaven.transfer.Odgovor;

/**
 * Sistemska operacija za brisanje vozila.
 * 
 * @author Boris Zivanovic
 */

public class IzbrisiVozilo extends OpstaSistemskaOperacija{

	/**
     * Izvršava operaciju brisanja vozila.
     *
     * @param objekat Objekat koji predstavlja vozilo koje treba obrisati.
     * @return Odgovor koji sadrži informaciju o uspešnosti brisanja vozila ili poruku o neuspešnom izvršavanju operacije.
     */
	
    @Override
    public Odgovor izvrsiOperaciju(OpstiObjekat objekat) {
        Odgovor odgovor = new Odgovor();
        
        try {
            DbBroker.getInstance().izbrisi(objekat);
            odgovor.setUspesno(true);
            odgovor.setPoruka(null);
        } catch (SQLException ex) {
            Logger.getLogger(IzbrisiVozilo.class.getName()).log(Level.SEVERE, null, ex);
            odgovor.setUspesno(false);
            odgovor.setPoruka(ex.getMessage());
        }
        
        return odgovor;
    }
    
}
