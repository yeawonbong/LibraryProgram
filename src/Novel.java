public class Novel extends Book {
    public Novel(String title, String author, int page) {
        super(title, author, page);
    }

    @Override
    void setGenre() {
        genre = "Novel";
    }
}
