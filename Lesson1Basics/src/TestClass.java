import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Test");

        List<String> names= new ArrayList<>();
        names.add("Ivan");
        names.add("Peter");
        names.forEach(System.out::println);
    }
}
