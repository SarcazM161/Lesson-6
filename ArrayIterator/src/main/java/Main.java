import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main (String []args){
        System.out.println(MessageService.get());
    }
}


class MessageService {

    public static String get() {
        return "Hello JUnit 5";
    }

}