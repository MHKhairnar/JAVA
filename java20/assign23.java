import java.util.Scanner;
class assign23{
public static void main(String argc[]){

Scanner s=new Scanner(System.in);

int arr[]=new int[5];
for(int i=0;i<arr.length;i++){

System.out.println("Enter the element");
arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++){

System.out.println(arr[i]+ " ");
}
System.out.println("Array in reverse order");

for(int i=arr.length-1; i>=0; i--){
System.out.println(arr[i]+ " ");
}
}

}