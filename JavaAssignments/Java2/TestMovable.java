import java.util.Scanner;

interface Movable{
	 void moveUp(); 
	 void moveDown();
	 void moveLeft();
	 void moveRight(); 
}
class MovablePoint implements Movable{
	 int x;
	 int y;
	 MovablePoint(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 public void moveUp(){
		 y++;
	 }
	 public void moveDown(){
		 y--;
	 }
	 public void moveLeft(){
		 x--;
	 }
	 public void moveRight(){
		 x++;
	 }
}
public class TestMovable {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the x coordinates of the point:");
		int x=sc.nextInt();
		System.out.println("Enter the y coordinates of the point:");
		int y=sc.nextInt();
		MovablePoint m=new MovablePoint(x,y);
		m.moveUp();
		System.out.println("The new point after upward shift is ("+m.x+","+m.y+")");
		m.moveDown();
		System.out.println("The new point after downward shift is ("+m.x+","+m.y+")");
		m.moveRight();
		System.out.println("The new point after rightward shift is ("+m.x+","+m.y+")");
		m.moveLeft();
		System.out.println("The new point after leftward shift is ("+m.x+","+m.y+")");
		sc.close();
	}
}
