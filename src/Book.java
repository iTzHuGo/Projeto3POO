public class Book {
    private String title;
    private String author;
    private boolean requested;

    public Book(String title, String author, boolean requested) {
        this.title = title;
        this.author = author;
        this.requested = requested;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isRequested() {
        return requested;
    }

    public void setRequested(boolean requested) {
        this.requested = requested;
    }

    @Override
    public String toString() {
        return "title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", requested= " + requested;
    }
}
