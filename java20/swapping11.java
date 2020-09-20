
class swapping11 {
public static void main(String argc []){
int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
















import java.util.Scanner ;class Ass13a {	public static void main(String args[]){	Scanner sc = new Scanner(System.in);	System.out.println("Enter the numbers");	int i = sc.nextInt();	int j = sc.nextInt();	int k = sc.nextInt();	String s =(i > j && i > k)? "i is greater": j>k ? "J is greater" : "K is greater";System.out.println(s);	}}













}
}