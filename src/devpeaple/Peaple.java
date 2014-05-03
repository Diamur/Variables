package devpeaple;
import devcat.Cat;

public class Peaple {

    private String fName;
    private String lName;
    private int age;
    private Cat cat;

    public Peaple(String fName, String lName, int age, Cat cat) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.cat = cat;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "devpeaple.Peaple[Имя: " + fName +", Фамилия: " + lName + ", Возраст: " + age + " года(а), Есть Кот:" + cat + "]";
    }
}
