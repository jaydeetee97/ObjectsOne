package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person person1 = new Person()
        System.out.println(person1.height);
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }
}
