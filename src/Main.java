
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();


        books.add(new Book("Satranç", 71, "Stefan Zweig", 1943));
        books.add(new Book("Bilinmeyen Bir Kadının Mektubu", 68, "Stefan Zweig", 1922));
        books.add(new Book("Amok Koşucusu", 64, "Stefan Zweig", 1922));
        books.add(new Book("Bir Kadının Hayatından Yirmi Dört Saat", 88, "Stefan Zweig", 1922));
        books.add(new Book("Olağanüstü Bir Gece", 80, "Stefan Zweig", 1922));
        books.add(new Book("1984", 328, "George Orwell", 1949));
        books.add(new Book("Fahrenheit 451", 256, "Ray Bradbury", 1953));
        books.add(new Book("Madam Bovary", 360, "Gustave Flaubert", 1856));
        books.add(new Book("Faust", 653, "Goethe", 1790));
        books.add(new Book("Zaman Makinesi", 120, "Herbert George Wells", 1895));


        HashMap<String,String> bookMap= new HashMap<String, String>();

        books.stream().forEach(book -> bookMap.put(book.getName(), book.getWriter()));

        ArrayList<Book> largeBooks = new ArrayList<>();

        books.stream().forEach(book -> {
            if (book.getPages() > 100)
            {
                largeBooks.add(book);
            }
        });

        for (Book largeBook : largeBooks) {
            System.out.print(largeBook.getName() + " - " + largeBook.getPages() + "\n");
        }
        System.out.println(bookMap);

    }

}
