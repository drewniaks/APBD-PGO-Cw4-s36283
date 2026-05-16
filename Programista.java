public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny() + (liczbaRepozytoriow * 100);
    }


    public String przedstawSie() {
        return super.przedstawSie() + " Jestem Programistą, piszę w: " + glownyJezyk + ".";
    }

    public void wypiszTechnologie() {
        System.out.println("Główny język programisty " + getImie() + " to: " + glownyJezyk);
    }

    public String toString() {
        return super.toString() + " | Rola: Programista (" + glownyJezyk + ")";
    }
}