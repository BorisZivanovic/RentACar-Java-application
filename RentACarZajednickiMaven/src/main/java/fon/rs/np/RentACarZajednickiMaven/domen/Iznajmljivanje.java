package fon.rs.np.RentACarZajednickiMaven.domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Predstavlja objekat iznajmljivanja.
 */

public class Iznajmljivanje extends OpstiObjekat {

    private Long id;
    private Korisnik korisnik;
    private Vozilo vozilo;
    private Date datumIznajmljivanja;
    private Date datumVracanja;

    /**
     * Konstruktor koji inicijalizuje objekat iznajmljivanja sa prosleđenim identifikatorom, korisnikom, vozilom,
     * datumom iznajmljivanja i datumom vraćanja.
     *
     * @param id                  identifikator iznajmljivanja
     * @param korisnik            korisnik koji je iznajmio vozilo
     * @param vozilo              iznajmljeno vozilo
     * @param datumIznajmljivanja datum iznajmljivanja
     * @param datumVracanja       datum vraćanja vozila
     */
    
    public Iznajmljivanje(Long id, Korisnik korisnik, Vozilo vozilo, Date datumIznajmljivanja, Date datumVracanja) {
        this.id = id;
        this.korisnik = korisnik;
        this.vozilo = vozilo;
        this.datumIznajmljivanja = datumIznajmljivanja;
        this.datumVracanja = datumVracanja;
    }
    
    /**
     * Konstruktor koji inicijalizuje objekat iznajmljivanja sa prosleđenim korisnikom, vozilom,
     * datumom iznajmljivanja i datumom vraćanja.
     *
     * @param korisnik            korisnik koji je iznajmio vozilo
     * @param vozilo              iznajmljeno vozilo
     * @param datumIznajmljivanja datum iznajmljivanja
     * @param datumVracanja       datum vraćanja vozila
     */
    
    public Iznajmljivanje(Korisnik korisnik, Vozilo vozilo, Date datumIznajmljivanja, Date datumVracanja) {
        this.korisnik = korisnik;
        this.vozilo = vozilo;
        this.datumIznajmljivanja = datumIznajmljivanja;
        this.datumVracanja = datumVracanja;
    }

    /**
     * Konstruktor koji inicijalizuje objekat iznajmljivanja sa prosleđenim identifikatorom,
     * datumom iznajmljivanja i datumom vraćanja.
     *
     * @param id                  identifikator iznajmljivanja
     * @param datumIznajmljivanja datum iznajmljivanja
     * @param datumVracanja       datum vraćanja vozila
     */
    
    public Iznajmljivanje(Long id, Date datumIznajmljivanja, Date datumVracanja) {
        this.id = id;
        this.datumIznajmljivanja = datumIznajmljivanja;
        this.datumVracanja = datumVracanja;
    }

    /**
     * Prazan konstruktor koji inicijalizuje objekat iznajmljivanja sa podrazumevanim vrednostima.
     */
    
    public Iznajmljivanje() {
    }

    /**
     * Vraća identifikator iznajmljivanja.
     *
     * @return identifikator iznajmljivanja
     */
    
    public Long getId() {
        return id;
    }

    /**
     * Postavlja identifikator iznajmljivanja.
     *
     * @param id identifikator iznajmljivanja
     */
    
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Vraća korisnika koji je iznajmio vozilo.
     *
     * @return korisnik koji je iznajmio vozilo
     */
    
    public Korisnik getKorisnik() {
        return korisnik;
    }

    /**
     * Postavlja korisnika koji iznajmljuje vozilo.
     *
     * @param korisnik korisnik koji iznajmljuje vozilo
     */
    
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    /**
     * Vraća vozilo koje se iznajmljuje.
     *
     * @return vozilo koje se iznajmljuje
     */
    
    public Vozilo getVozilo() {
        return vozilo;
    }

    /**
     * Postavlja vozilo koje se iznajmljuje.
     *
     * @param vozilo vozilo koje se iznajmljuje
     */
    
    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    /**
     * Vraća datum iznajmljivanja.
     *
     * @return datum iznajmljivanja
     */
    
    public Date getDatumIznajmljivanja() {
        return datumIznajmljivanja;
    }

    /**
     * Postavlja datum iznajmljivanja.
     *
     * @param datumIznajmljivanja datum iznajmljivanja
     */
    
    public void setDatumIznajmljivanja(Date datumIznajmljivanja) {
        this.datumIznajmljivanja = datumIznajmljivanja;
    }

    /**
     * Vraća datum vraćanja vozila.
     *
     * @return datum vraćanja vozila
     */
    
    public Date getDatumVracanja() {
        return datumVracanja;
    }

    /**
     * Postavlja datum vraćanja vozila.
     *
     * @param datumVracanja datum vraćanja vozila
     */
    
    public void setDatumVracanja(Date datumVracanja) {
        this.datumVracanja = datumVracanja;
    }
    
    @Override
    public String vratiTabelu() {
        return "iznajmljivanje";
    }

    @Override
    public String insertKolone() {
        return "id_korisnika, id_vozila, datum_iznajmljivanja, datum_vracanja";
    }

    @Override
    public String dajVrednosti() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "(" + getKorisnik().getId() + "," + getVozilo().getId() + ",'"
                + sdf.format(getDatumIznajmljivanja()) + "','" + 
                sdf.format(getDatumVracanja()) + "')";
    }

    @Override
    public List<OpstiObjekat> dajListu(ResultSet rs) {
        List<OpstiObjekat> iznajmljeno = new ArrayList<>();

        try {
            while (rs.next()) {
                iznajmljeno.add(new Iznajmljivanje(rs.getLong("i.idIznajmljivanja"),
                        new Korisnik(rs.getString("k.ime"), rs.getString("k.prezime")),
                        new Vozilo(rs.getString("v.registarski_broj")),
                        rs.getDate("i.datum_iznajmljivanja"),
                        rs.getDate("i.datum_vracanja")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Iznajmljivanje.class.getName()).log(Level.SEVERE, null, ex);
        }

        return iznajmljeno;
    }

    @Override
    public String whereUslov() {
        return "";
    }

    @Override
    public String whereSelectUslov() {
        return " "
                + " JOIN stavka_racuna sr ON i.idIznajmljivanja = sr.id_iznajmljivanja"
                + " JOIN korisnik k ON i.id_korisnika = k.id_korisnika"
                + " JOIN vozilo v ON v.id_vozila = i.id_vozila";
    }

    @Override
    public String izmenaObjekta() {
        return "";
    }

    @Override
    public String vratiKolone() {
        return "i.idIznajmljivanja, k.ime, k.prezime, v.registarski_broj, i.datum_iznajmljivanja, i.datum_vracanja, sr.iznos_sa_pdv";
    }

}
