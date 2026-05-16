import java.util.Objects;

public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
    public double getStawkaBazowa() { return stawkaBazowa; }

    public final String pobierzIdPracownika() {
        return idPracownika;
    }

    public double obliczKosztMiesieczny() {
        return stawkaBazowa;
    }

    public String przedstawSie() {
        return "Nazywam się " + imie + " " + nazwisko + " (ID: " + idPracownika + ").";
    }

    public String toString() {
        return "Pracownik[" + idPracownika + "] " + imie + " " + nazwisko + ", stawka: " + stawkaBazowa + " PLN";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }

    public int hashCode() {
        return Objects.hash(idPracownika);
    }
}