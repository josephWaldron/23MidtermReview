package MidtermReview.classPractice;

public class Person {
    private String name, profession;
    private int age;

    public Person() {
        name = "";
        profession = "Unemployed";
        age = 0;
    }

    public Person(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //Unique methods
}
