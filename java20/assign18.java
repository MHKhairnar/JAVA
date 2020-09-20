import java.util.Scanner;
class assign18{

public static void main(String argc[]){

int x,j,flag=0;
System.out.print("Enter any number");
Scanner sc=new Scanner(System.in);
 x=sc.nextInt();
for(j=2;j<x;j++)
{
if(x%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}

}

if(flag==1)
{
	System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}

}



}