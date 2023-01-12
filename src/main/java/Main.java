
public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAdress("Сидней")
                .setAge(31)
                .build();
        System.out.println(mom.hasAge());
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        son.happyBirthday();
        System.out.println(son.hasAge());

        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
