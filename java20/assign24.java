import java.util.Scanner;
class assign24{



public static void main(String argc[]){
int n,i=0, x,flag=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the element  you want in array no");

n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the element ");
for(i=0;i<n;i++){

a[i]=s.nextInt();
}
System.out.println("Enter the element you want to find");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x){

flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1){

System.out.println("Elemnt found at position"+(i+1));
}
else
{
System.out.println("Elenent not found");
}
}


}