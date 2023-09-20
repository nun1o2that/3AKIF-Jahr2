public class Rahmendruck implements Druckbar {

    public void drucken(Person person) {
        int totalLength = 46;
        String firstRow = "* " + person.getId() + ", " + person.getName();
        int firstRowLength = firstRow.length();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        while (firstRowLength < totalLength) {
            firstRow += " ";
            firstRowLength++;
        }
        firstRow += "*";
        System.out.println(firstRow);

        if (person instanceof Mitarbeiter) {
            // typecasting, type Person does not have method getPosition()
            Mitarbeiter m = (Mitarbeiter)person;
            String secondRow = "* " + m.getEmail() + ", " + m.getPosition();
            int secondRowLength = secondRow.length();
            while (secondRowLength < totalLength) {
                secondRow += " ";
                secondRowLength++;
            }
            secondRow += "*";
            System.out.println(secondRow);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }

}
