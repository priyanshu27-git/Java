public class Book {
    String title,author;
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Bhagavad Gita";
        book.author = "Ved Vyasa";
        System.out.println(book.title + "\n" + book.author);
    }
}
