package devcat;


import devpeaple.Peaple;

public class Sportsman extends Peaple {

    private String typeSport;

    public Sportsman(String fName, String lName, int age, Cat cat) {
        super(fName, lName, age, cat);
    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }
}
