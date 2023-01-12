import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String adress;
   protected static boolean A = false;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public boolean hasAge() {
        return A;
    }
    public boolean hasAddress() {
        if (this.adress != null){
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }
    public String getAddress(){
        return this.adress;
    }
    public void setAddress(String adress) {
        this.adress = adress;
    }
    public void happyBirthday() {
       this.age++;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAdress(this.adress)
                .setAge(0);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + adress;
    }

    @Override
    public int hashCode() {
         return Objects.hash(this.age);
    }
}