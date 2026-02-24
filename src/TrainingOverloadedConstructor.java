public class TrainingOverloadedConstructor {
    public static void main(String[] args) {

        Book2 book21 = new Book2("Witcher");
        Book2 book22 = new Book2("Witcher", 3200);
        Book2 book23 = new Book2("Witcher", "Sapkovski", 3200);
        Book2 book24 = new Book2("Witcher", "Sapkovski");

        System.out.println(book21.title);
        System.out.println(book21.author);
        System.out.println(book21.page);

        System.out.println(book22.title);
        System.out.println(book22.author);
        System.out.println(book22.page);

        System.out.println(book23.title);
        System.out.println(book23.author);
        System.out.println(book23.page);

        System.out.println(book24.title);
        System.out.println(book24.author);
        System.out.println(book24.page);


    }
    }
