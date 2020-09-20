import java.util.Scanner;
class simple{
public static void main(String argc[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the principle amount and rate");

int p=sc.nextInt();
int t=sc.nextInt();
int r=sc.nextInt();

int si= (p*r*t)/100;

System.out.println("Simple Interst is"+si);








}

}