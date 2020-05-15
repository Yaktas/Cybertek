package Ex02;
import java.time.*;
public class test {

    public static void main(String[] args) {


        System.out.println(Person.enrolled);


        Person employee1 = new Person();

        employee1.setName("mukremin");
        employee1.setSurname("ozkul");
        employee1.setAge(LocalDate.of(1980,01,01));

        System.out.println(employee1.enrolled);


        System.out.println(Person.enrolled);
        System.out.println(Person.className);
        //UML software design




        employee1.setName("Mukremin");
        //employee1.setName("Selahaddin");

        System.out.println(employee1);

        Person employee2 = new Person("ersen", "ozcan");

        employee2.setAge(LocalDate.of(1990,05,01));

        System.out.println(employee2);

        System.out.println(Person.enrolled);

        //encapsulation

    }
}
