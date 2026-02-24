public class Book2 {

    String title;
    String author;
    int page;

    Book2(String title){
        this.title = title;
        this.author = "Unknown";
        this.page = 0;
    }

    Book2(String title, String author){
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    Book2(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book2(String title, int page){
        this.title = title;
        this.author = "Unknown";
        this.page = page;
    }

}
