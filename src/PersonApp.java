public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Agus Sugiono";
        person1.address = "Magelang";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        //Person person2 = new Person();
        Person person3;
        person3 = new Person();
        person3.name ="Joni";
        person3.sayHello("Joko");


    }
}
