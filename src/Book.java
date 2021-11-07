abstract class Book {
	
	protected String title;
	protected String author;
	protected int page;
	protected String genre;
	
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		setGenre();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPage() {
		return page;
	}	
	
	abstract void setGenre();
	
	public String getGenre() {
		return genre;
	}
}