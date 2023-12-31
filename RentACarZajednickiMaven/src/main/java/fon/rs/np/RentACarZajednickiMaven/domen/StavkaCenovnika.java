package fon.rs.np.RentACarZajednickiMaven.domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Predstavlja stavku cenovnika u sistemu Rent-A-Car.
 * Stavka cenovnika sadrži informacije o nazivu, opisu, ceni i pripadajućem cenovniku.
 * Svaka stavka cenovnika ima jedinstveni identifikator (ID) koji je automatski generisan prilikom kreiranja.
 * 
 * Klasa StavkaCenovnika nasleđuje apstraktnu klasu OpstiObjekat i implementira metode za rad sa bazom podataka.
 * Takođe, omogućava validaciju podataka prilikom postavljanja vrednosti za naziv, opis, cenu i cenovnik.
 * 
 * @author Boris Zivanovic
 */

public class StavkaCenovnika extends OpstiObjekat {
    /**
     * Identifikator stavke cenovnika
     */
    private Long id;
    /**
     * Naziv stavke cenovnika
     */
    private String naziv;
    /**
     * Opis stavke cenovnika
     */
    private String opis;
    /**
     * Cena stavke cenovnika
     */
    private double cena;
    /**
     * Cenovnik za koji se vezuje stavka cenovnika
     */
    private Cenovnik cenovnik;

    /**
     * Konstruktor sa svim parametrima.
     *
     * @param id        ID stavke cenovnika
     * @param naziv     naziv stavke cenovnika
     * @param opis      opis stavke cenovnika
     * @param cena      cena stavke cenovnika
     * @param cenovnik  cenovnik kojem stavka pripada
     */
    
    public StavkaCenovnika(Long id, String naziv, String opis, double cena, Cenovnik cenovnik) {
        setId(id);
        setNaziv(naziv);
        setOpis(opis);
        setCena(cena);
        setCenovnik(cenovnik);
    }
    
    /**
     * Konstruktor sa nazivom, cenom i cenovnikom.
     *
     * @param naziv     naziv stavke cenovnika
     * @param cena      cena stavke cenovnika
     * @param cenovnik  cenovnik kojem stavka pripada
     */
    
    public StavkaCenovnika(String naziv, double cena, Cenovnik cenovnik) {
    	setNaziv(naziv);
        setCena(cena);
        setCenovnik(cenovnik);
    }
    
    /**
     * Prazan konstruktor.
     */
    
    public StavkaCenovnika() {
    }

    @Override
    public String toString() {
        return getCenovnik().getNaziv() + " - " + getNaziv();
    }
    
    /**
     * Vraća ID stavke cenovnika.
     *
     * @return ID stavke cenovnika
     */
    
    public Long getId() {
        return id;
    }

    /**
     * Postavlja ID stavke cenovnika.
     *
     * @param id ID stavke cenovnika
     * @throws IllegalArgumentException ako je Id negativan broj
     */
    
    public void setId(Long id) {
    	if(id < 0)
            throw new IllegalArgumentException("Id ne sme biti negativan broj");
        this.id = id;
    }

    /**
     * Vraća naziv stavke cenovnika.
     *
     * @return naziv stavke cenovnika
     */
    
    public String getNaziv() {
        return naziv;
    }

    /**
     * Postavlja naziv stavke cenovnika.
     *
     * @param naziv naziv stavke cenovnika
     * @throws NullPointerException ako je naziv null
     * @throws IllegalArgumentException ako je naziv kraći od 2 karaktera
     */
    
    public void setNaziv(String naziv) {
    	if(naziv == null)
    		throw new NullPointerException("naziv ne sme biti null");
    	if(naziv.length() < 2)
            throw new IllegalArgumentException("Naziv stavke cenovnika ne sme biti kraci od 2 karaktera");
        this.naziv = naziv;
    }

    /**
     * Vraća opis stavke cenovnika.
     *
     * @return opis stavke cenovnika
     */
    
    public String getOpis() {
        return opis;
    }

    /**
     * Postavlja opis stavke cenovnika.
     *
     * @param opis opis stavke cenovnika
     * @throws NullPointerException ako je opis null
     * @throws IllegalArgumentException ako je opis kraći od 2 karaktera
     */
    
    public void setOpis(String opis) {
    	if(opis == null)
    		throw new NullPointerException("opis ne sme biti null");
    	if(opis.length() < 2)
            throw new IllegalArgumentException("Opis stavke cenovnika ne sme biti kraci od 2 karaktera");
        this.opis = opis;
    }

    /**
     * Vraća cenu stavke cenovnika.
     *
     * @return cena stavke cenovnika
     */
    
    public double getCena() {
        return cena;
    }

    /**
     * Postavlja cenu stavke cenovnika.
     *
     * @param cena cena stavke cenovnika
     * @throws IllegalArgumentException ako je cena manja ili jednaka nuli
     */
    
    public void setCena(double cena) {
    	if(cena <= 0)
            throw new IllegalArgumentException("Cena mora biti pozitivan broj");
        this.cena = cena;
    }

    /**
     * Vraća cenovnik kojem stavka pripada.
     *
     * @return cenovnik kojem stavka pripada
     */
    
    public Cenovnik getCenovnik() {
        return cenovnik;
    }

    /**
     * Postavlja cenovnik kojem stavka pripada.
     *
     * @param cenovnik cenovnik kojem stavka pripada
     * @throws IllegalArgumentException ako je cenovnik null ili sadrži neispravne podatke
     */
    
    public void setCenovnik(Cenovnik cenovnik) {
    	if(cenovnik == null || cenovnik.getId() == 0 || cenovnik.getNaziv().equals("") || cenovnik.getOpis().equals(""))
    		throw new IllegalArgumentException("Cenovnik ne sme biti null");
        this.cenovnik = cenovnik;
    }

    @Override
    public String vratiTabelu() {
        return "stavka_cenovnika";
    }

    @Override
    public String insertKolone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String dajVrednosti() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<OpstiObjekat> dajListu(ResultSet rs) {
        List<OpstiObjekat> lista = new ArrayList<>();

        try {
            while (rs.next()) {
                lista.add(new StavkaCenovnika(rs.getString("sc.naziv"),
                        rs.getDouble("cena"),
                        new Cenovnik(rs.getLong("c.id_cenovnika"), 
                                rs.getString("c.naziv"), rs.getString("c.opis"))));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cenovnik.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public String whereUslov() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String whereSelectUslov() {
        return " sc JOIN cenovnik c ON c.id_cenovnika = sc.id_cenovnika";
    }

    @Override
    public String izmenaObjekta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiKolone() {
        return "*";
    }
    
}
