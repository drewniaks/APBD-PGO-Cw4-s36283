public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public double obliczKosztMiesieczny() {
        double koszt = super.obliczKosztMiesieczny();
        if (czyAutomatyzujacy) {
            koszt += 1500.0;
        }
        return koszt;
    }

    public String przedstawSie() {
        String typTestera = czyAutomatyzujacy ? "Automatyzujący" : "Manualny";
        return super.przedstawSie() + " Jestem Testerem (" + typTestera + "). Napisałem " + liczbaScenariuszy + " scenariuszy.";
    }

    public void uruchomRaportTestow() {
        System.out.println("Tester " + getImie() + " generuje raport dla " + liczbaScenariuszy + " scenariuszy.");
    }

    public String toString() {
        return super.toString() + " | Rola: Tester (Automatyzujący: " + czyAutomatyzujacy + ")";
    }
}