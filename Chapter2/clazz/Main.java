package Chapter2.clazz;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Person personA = new Person("minky",25);
        Person personB = new Person("steve",19);


        String name = personA.getName();
        System.out.println("name = " + name);

        personB.setAddress("서울");
        System.out.println(personB.address);




    }
}
