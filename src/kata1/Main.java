package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Person pepe = new Person("PEPE", new Date(84,2,10));
        System.out.println(pepe.getName());
        System.out.println(pepe.getAge());
    }
    
}