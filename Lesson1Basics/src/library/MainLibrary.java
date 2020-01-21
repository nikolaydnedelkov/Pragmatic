package library;

public class MainLibrary {
    public static void main(String[] args) {
        Book podIgoto = new Book("Pod Igoto", "Ivan Vazov");
        Book ad = new Book("Ad", "Dan Brown");

        Library library = new Library("Small Library");
        library.addBook(podIgoto);
        library.addBook(ad);

    }
}
