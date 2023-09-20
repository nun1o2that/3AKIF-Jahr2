public class App {

    public static void main(String[] args) throws Exception {
        Mitarbeiter me = new Mitarbeiter(1, "Stefanie", "skarov@tsn.at", "Mitarbeiter");
        Druckbar drucker = new Namensschilderdruck();

        // namensschild
        Visitenkartendruck visiten = new Visitenkartendruck(
            me,
            drucker
        );
        System.out.println("\n");
        visiten.drucken();

        // rahmen
        visiten.setDrucker(new Rahmendruck());
        System.out.println("\n");
        visiten.drucken();

        // standard
        visiten.setDrucker(new Standarddruck());
        System.out.println("\n");
        visiten.drucken();
    }

}
