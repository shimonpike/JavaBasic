package Arrays;

public class EducationBook extends Book{
	private String subject;

	public EducationBook() {}

	public EducationBook(String author, 
			String title, int pages, int isbn, 
			String subject) {
		super(author, title, pages, isbn);
		if(subject != null)
			this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject != null)
			this.subject = subject;
	}

	@Override
	public String toString() {
		
		return super.toString()
				+ "  Subject: " + this.subject;
	}
	
	

}
