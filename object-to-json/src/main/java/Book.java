import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    private String author;
    private String language;
    private String genre;
    private int numberOfPages;
    private boolean isCoverLuxury;

}
