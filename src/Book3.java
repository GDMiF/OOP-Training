public class Book3 {

    String name;
    String author;
    int pages;

    Book3(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString(){
        return this.name + " by " +  this.author + " " + this.pages + " pages";
    }

}
