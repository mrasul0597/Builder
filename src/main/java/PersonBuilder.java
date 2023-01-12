public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String adress;

    Person person ;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        person.A = true;
      if (age < 0){
          throw new IllegalArgumentException ("нельзя меньше нуля");
      }else if (age >= 0 ){
          this.age = age;
      }
      return this;
    }

    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("заполните имя и фамилию");
        }

        return new Person(name, surname, age, adress);
    }
}