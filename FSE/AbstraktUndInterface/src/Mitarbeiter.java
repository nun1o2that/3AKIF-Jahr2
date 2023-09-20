public class Mitarbeiter extends Person{
    private String email;
    private String position;

    public Mitarbeiter(int id, String name, String email, String position) {
        super(id, name);
        this.email = email;
        this.position = position;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
