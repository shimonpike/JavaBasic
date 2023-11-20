
public class FictionBook extends Book{
	private String genre;
	
	public FictionBook() {}
	
	public FictionBook(String author,String title,
			           int pages,int isbn,String genre)
	{
		super(author,title,pages,isbn);
		if(genre != null)
			this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		if(genre != null)
			this.genre = genre;
	}

	@Override
	public String toString() {
		
		return super.toString()
				+ "  Genre: " + genre;
	}
	
	

}
