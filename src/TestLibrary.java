public class TestLibrary {

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook();
        book1.setTitle("otkan kunlar");
        book1.setAuthor("Abdulla Qodiriy");
        book1.setPages(650);

        LibraryBook book2 = new LibraryBook();
        book2.setTitle("The Calculus Prime");
        book2.setAuthor("Dr.Pinto");
        book2.setPages(-50);

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Pages: " + book1.getPages());
        System.out.println("Thinkness? " + book1.Thickness());

        System.out.println("Book 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Pages: " + book2.getPages());
        System.out.println("Thickness: " + book2.Thickness());
    }
}