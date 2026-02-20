public class LibraryBook {
    private String title = "unknown";
    private String author = "unknown";
    private int pages = 1;

    public LibraryBook() {
    }

    public LibraryBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public boolean Thickness() {
        return pages > 500;
    }
}