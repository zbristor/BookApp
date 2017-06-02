
public class Book {
private String title;
private String author;
private String desc;
private String price;
private String isInStock;

public Book()
	{
	System.out.println("The book is written");
	}
public Book(String title, String author, String desc, String price, String isInStock)
{
	this.title=title;
	this.author=author ;
	this.desc=desc;
	this.price=price;
	this.isInStock=isInStock;
	//"The Most Dangerous Game","Unknown author","man is the most dangerous game", "$37.95","50
}
public void getDisplayText()
{
	System.out.println(author+" "+title+" "+desc);
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getIsInStock() {
	return isInStock;
}
public void setIsInStock(String isInStock) {
	this.isInStock = isInStock;
}

}

