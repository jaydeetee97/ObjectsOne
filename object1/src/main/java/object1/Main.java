package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        
        Person person2 = new Person("John", 30, 70);
        System.out.println(person2.height);

        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }
}
