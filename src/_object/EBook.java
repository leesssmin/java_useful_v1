package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;


    public EBook(int bookTypeId,  String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString()메서드 재정의

    @Override
    public String toString() {
        return "종류: " + bookTypeId + "타이틀: " + title + "작가: " + author;
    }

    // equals() 메서드 재정의

    // hashCode() 메서드 재정의

}

