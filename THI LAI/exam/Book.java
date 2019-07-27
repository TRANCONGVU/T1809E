package exam;

class Book {
    int bookId;
    String bookName,bookAuth;
    double Price;

    public Book() {
    }


    public Book(int bookId, String bookName, String bookAuth, double Price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuth = bookAuth;
        this.Price = Price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuth() {
        return bookAuth;
    }

    public void setBookAuth(String bookAuth) {
        this.bookAuth = bookAuth;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return bookId+"\t" + bookName +"\t"+ bookAuth+"\t"+ Price;
    }


}