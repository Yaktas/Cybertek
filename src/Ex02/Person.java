package Ex02;

import java.time.LocalDate;

public class Person {

    static int enrolled = 0;

    static String className = " TASOM";

    String name ;
    String surname;
    LocalDate dob = LocalDate.of(1850, 01, 01);

    Person(){
        //do nothing
        enrolled++;
    }

    Person(String name){
        this.name = name;
        enrolled++;
    }

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        enrolled++;
    }

    Person(String name, String surname, LocalDate dob){
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        enrolled++;
    }

    public void setName(String name ){
        this.name = name;
    }

    public void setSurname(String surname ){
        this.surname = surname;
    }


    public void setAge(LocalDate dob ){
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return LocalDate.now().getYear() - dob.getYear();
    }

    public String toString(){
        return "Employee name: " + name + " Surname: " + surname + " Age " + getAge();
    }
}

