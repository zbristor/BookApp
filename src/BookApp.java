
public class BookApp extends Book{
	public static void main(String[] args) {
		Book b = new Book("Unknown author", "The Most Dangerous Game", "rabbit is the most dangerous game", 19.00, "Yes");
		b.setIsInStock("Yes");
		b.getSum(7);
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
