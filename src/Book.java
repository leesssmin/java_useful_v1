//book

public class Book
{
    private String title;
    private String author;


    public Book(String title, String author){
        this.title = title;
        this.author =author;
    }

    @Override
    public String toString() {
        return "title :" + title + " , " + "author: " + author;
    }

    public static void main(String[] args) {
        Book book = new Book("데미안" , "헤르만 헤세");

        System.out.println(book.toString());
    }
}
