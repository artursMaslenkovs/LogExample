import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World");
        Square square = new Square(5);
        square.perimeter();
        square.square();
        System.out.println(square.divide(0));
    }
}
