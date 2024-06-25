package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Main Person = new Main();
        System.out.println(Person.height);
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }
}
