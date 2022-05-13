public class Book {
    public String bookTitle;
    public int pageNum;
    public int publicationYear;

    public Book (String bookTitle){
        this.bookTitle = bookTitle;
        this.pageNum = 0;
        this.publicationYear = 0;
    }

    public Book (String bookTitle, int pageNum){
        this.bookTitle = bookTitle;
        this.pageNum = pageNum;
        this.publicationYear = 0;
    }

    public Book (String bookTitle, int pageNum, int publicationYear){
        this.bookTitle = bookTitle;
        this.pageNum = pageNum;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }

    public int getPageNum(){
        return this.pageNum;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }


}
