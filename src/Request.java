public class Request {
    private Reader reader;
    private Book book;
    private Date reqDate;
    private Date retDate;

    public Request(Reader reader, Book book, Date reqDate, Date retDate) {
        this.reader = reader;
        this.book = book;
        this.reqDate = reqDate;
        this.retDate = retDate;
        book.setRequested(true);
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getRetDate() {
        return retDate;
    }

    public void setRetDate(Date retDate) {
        this.retDate = retDate;
    }

    @Override
    public String toString() {
        return "Reader= '" + reader + '\'' +
                ", Book= '" + book + '\'' +
                ", Request Date= '" + reqDate + '\'' +
                ", Return Date= '" + retDate + '\'';
    }
}
