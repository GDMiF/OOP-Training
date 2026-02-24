public class TrainingConstructor {
    public static void main(String[] args) {

        Book book1 = new Book("The Witcher", "Anjei Sapkowski", 3200);
        Book book2 = new Book("The Idiot", "Fyodor Dostoevsky", 800);
        Book book3 = new Book("Stranger", "Alber Camus", 160);
        Book book4 = new Book("Lord of the Rings", "J. R. R. Tolkien", 1200);

        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.page);

        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.page);

        System.out.println(book3.title);
        System.out.println(book3.author);
        System.out.println(book3.page);

        System.out.println(book4.title);
        System.out.println(book4.author);
        System.out.println(book4.page);

    }
}
