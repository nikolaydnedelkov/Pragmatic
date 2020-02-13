import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {
    public static void main(String[] args) {

        Book harryPotterAndTheSorcerersStone = new Book("J.K. Rowling", "english", "fantasy", 250, true);
        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(harryPotterAndTheSorcerersStone);
            System.out.println(jsonInString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
