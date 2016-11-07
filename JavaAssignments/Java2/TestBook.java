class Author{
	String name;
	String email;
	char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString(){
		return("Name : "+getName()+" Gender :"+getGender()+" Email : "+getEmail());
	}
}
class Book{
	String name;
	String author;
	double price;
	int qtyInStock;
	Book(String name,String author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString(){
		return("Name : "+getName()+" Author :"+getAuthor()+" Price : "+getPrice()+" Quantity in Stock : "+getQtyInStock());
	}
}
public class TestBook {
	public static void main(String args[]){
		Author a1=new Author("J K Rowling","jkrowlingharry@gmail.com",'F');
		Book b1=new Book("Harry Potter","J K Rowling",699,40);
		System.out.println(a1.toString());
		System.out.println(b1.toString());
	}
}
