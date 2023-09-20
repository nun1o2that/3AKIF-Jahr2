public class Standarddruck implements Druckbar {

    public void drucken(Person person) {
        System.out.println(person.getId() + ", " + person.getName());

        if (person instanceof Mitarbeiter) {
            // typecasting, type Person does not have method getPosition()
            Mitarbeiter m = (Mitarbeiter)person;
            System.out.println(m.getEmail() + ", " + m.getPosition());
        }
    }
    
}
