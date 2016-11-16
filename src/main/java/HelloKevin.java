import static spark.Spark.*;
/**
 * Created by kevinmccarthy on 16/11/2016.
 */
public class HelloKevin {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World <a href='/bye'>Goodbye</a>");
        get("/bye", (req, res) -> "Goodbye World");
    }
}

