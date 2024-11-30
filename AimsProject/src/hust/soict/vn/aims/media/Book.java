package hust.soict.vn.aims.media;
import java.util.List;
import java.util.ArrayList;
public class Book {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();

	public Book() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	private boolean AuthorExist(String author) {
		return authors.contains(author);
	}
	public void addAuthor(String authorName) {
		if(AuthorExist(authorName)) {
			System.out.println("Author " + authorName + " is already in the list.");
		}
		else {
			authors.add(authorName);
			System.out.println("Author " + authorName + " has been added to the list.");
		}
	}
	public void removeAuthor(String authorName) {
		if(AuthorExist(authorName)) {
			authors.remove(authorName);
			System.out.println("Author " + authorName + " has been removed to the list.");
		}
		else {
			System.out.println("Author " + authorName + " does not ex in the list.");
		}
	}
	

}
