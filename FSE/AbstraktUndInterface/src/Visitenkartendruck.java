public class Visitenkartendruck {
    private Mitarbeiter mitarbeiter;
    private Druckbar drucker;

    public Visitenkartendruck(Mitarbeiter mitarbeiter, Druckbar drucker) throws Exception {
        if (mitarbeiter == null) {
            throw new Exception("Mitarbeiter ist NULL!");
        }
        else {
            this.mitarbeiter = mitarbeiter;
        }
        this.drucker = drucker;
    }

    public void drucken() {
        drucker.drucken(this.mitarbeiter);
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public void setDrucker(Druckbar drucker) {
        this.drucker = drucker;
    }
    
}
