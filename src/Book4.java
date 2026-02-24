public class Book4 {

    String name;
    String author;
    int page;
    static int totalPages;

    Book4(String name, String author, int page){
        this.name = name;
        this.author = author;
        this.page = page;
        totalPages += page;
    }
    Book4(String name, int page){
        this.name = name;
        this.author = "Unknown Author";
        this.page = page;
        totalPages += page;

    }
    Book4(String name, String author){
        this.name = name;
        this.author = author;
        this.page = 0;
        totalPages += page;

    }
    Book4(String name){
        this.name = name;
        this.author = "Unknown Author";
        this.page = 0;
        totalPages += page;

    }

    @Override
    public String toString(){
        return this.name + " was written by " + author + ". its " + page + " pages";
    }

    void numberOfPages(){
        System.out.println("The total number of pages are: " + totalPages);
    }

}
