public class ProjectLibrary {
    public static void main(String[] args) {

        Book4 book41 = new Book4("Assassin’s Apprentice", "Robin Hobb", 800);
        Book4 book42 = new Book4("A Game of Thrones", "George R. R. Martin", 1100);
        Book4 book43 = new Book4("Kingslayer Chronics", 700);
        Book4 book44 = new Book4("Witcher", "Andrzej Sapkowski");
        Book4 book45 = new Book4("Red Rising");

        Book4 [] books = {book41, book42, book43, book44, book45};

        for(Book4 book : books){
            System.out.println(book);
        }

        book45.numberOfPages();

    }
}
