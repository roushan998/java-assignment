*****Problem1

  Write a program that would take input from the console. 
If the input is 1 – get two numbers from the console, add them and show the output. 
If input is 2  – get two numbers from the console, subtract them and show the output.
 If input is 3  – get two numbers from the console, multiply them and show the output.
 If input is 4 – get two numbers from the console, divide them and show the output.
If there is any other input show error message as wrong input. 
If input is 0, exit your program. Note: Your program should ask for input(1,2,3,4 or 0) 
until 0 is given as an option.


////Java Code

import java.util.Scanner;
 
 
public class SwitchCase {
    static void add(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }
    static void sub(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a-b);
    }
    static void mult(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a*b);
    }
    static void div(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b!=0){
        System.out.println(a/b);
        }
        else{
            System.out.println("Division not possible");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter 1 to add 2 to subtract 3 to multiply and 4 to divide:");
        int cs=sc.nextInt();
        switch(cs){
        case 1:
            add();
            break;
        case 2:
            sub();
            break;
        case 3:
            mult();
            break;
        case 4:
            div();
            break;
        default:
            System.out.println("Not a valid option");
        }
    }
}





 *****Problem 2 Two strings  and  are called anagrams if they consist same characters,
 but may be in different orders. 
  Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not.
  The strings may consist at most 50 English characters; the comparison should NOT be case sensitive.
  This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.


  static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        int l1=a.length();
        int first[]=new int[l1];
        // Complete the function by writing your code here.
        for(int i=0;i<l1;i++){
            first[i]=0;
        }
        int l2=b.length();
        if(l2==l1){
            for(int i=0;i<l2;i++){
                char ch=b.charAt(i);
                for(int j=0;j<l1;j++){
                    char cy=a.charAt(j);
                    if(ch==cy && first[j]==0){
                        first[j]++;
                        break;
                    }
                }
            }
            int flag=0;
            for(int i=0;i<l1;i++){
                if(first[i]==0){
                    flag++;
                }
            }
            if(flag==0){
                return true;
            }
        }
        return false;
    }





*****Problem 3   Consider the input to your java program will be two sorted arrays.
         (eg {1,2,3,4} and {2,4,5,7}) find the intersection of the arrays.



         //Java Code


     import java.util.Scanner;


      public class arrayassign 
	
	{
	     public static void main(String[] args) 
	 
	 {
		 int[] array1 =  new int[10];
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Please enter elements...");
	        for(int j=0;j<10;j++)
	            array1[j]=sc.nextInt();
	        
		 int[] array2 = new int[10];
		 Scanner s=new Scanner(System.in);
	        System.out.println("Please enter elements...");
	        for(int j=0;j<10;j++)
	            array2[j]=s.nextInt();
		 
		 // Print all the array elements
		 
		 for (int i = 0; i < array1.length; i++) 

		 {
		        for( int j=0;j< array2.length;j++)
		    	
		    	if (array2[j]==array1[i])
		    		System.out.println(array2[j]);
		 }
            }
       }



