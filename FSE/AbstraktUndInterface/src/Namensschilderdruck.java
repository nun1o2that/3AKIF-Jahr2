public class Namensschilderdruck implements Druckbar {

    public void drucken(Person person) {
        System.out.println(person.getId() + ", " + person.getName());
        if (person instanceof Mitarbeiter) {
            // typecasting, type Person does not have method getPosition()
            Mitarbeiter m = (Mitarbeiter)person;
            if (m.getPosition().equals("Mitarbeiter")) {
                System.out.println("*");
            }
            else if (m.getPosition().equals("Abteilungsleiter")) {
                System.out.println("***");
            }
            else if (m.getPosition().equals("CEO")) {
                System.out.println("*****");
            }
        }
    }
    
}
