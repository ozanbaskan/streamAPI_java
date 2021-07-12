import java.time.LocalDate;

public class Book {

    private String name;
    private int pages;
    private String writer;
    private int publishYear;

    public Book(String name, int pages, String writer, int publishYear) {
        this.name = name;
        if (pages > 0) this.pages = pages;
        else this.pages = 0;
        this.writer = writer;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0)this.pages = pages;
        else this.pages = 0;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPublishDate() {
        return publishYear;
    }

    public void setPublishDate(int publishYear) {
        this.publishYear = publishYear;
    }
}
