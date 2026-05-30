import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {
        System.out.println("=== Skład zespołu dla projektu: " + nazwaProjektu + " ===");
        for (Pracownik p : pracownicy) {

            System.out.println(p); 
        }
        System.out.println("=============================================");
    }

    public double policzLacznyKoszt() {
        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma += p.obliczKosztMiesieczny();
        }
        return suma;
    }

    public void wypiszTesterowAutomatyzujacych() {
        System.out.println("--- Testerzy Automatyzujący w zespole ---");
        for (Pracownik p : pracownicy) {
            if (p instanceof Tester) {
                Tester tester = (Tester) p; 
                if (tester.isCzyAutomatyzujacy()) {
                    System.out.println(tester.przedstawSie());
                }
            }
        }
    }
}