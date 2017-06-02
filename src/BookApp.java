
public class BookApp extends Book{
	public static void main(String[] args) {
		Book b = new Book("Unknown author", "The Most Dangerous Game", "rabbit is the most dangerous game", "19.99", "The book is in stock");
		/*
		b.setAuthor("Unknown author");
		b.setTitle("The Most Dangerous Game");
		b.setDesc("man is the most dangerous game");
		b.setPrice("19.99");
		b.setIsInStock("The book is in stock");
		*/
		b.getDisplayText();
	}

}
