import java.util.Scanner;
 class assign17 
{
    public static void main(String args[])
    {
        int n, r, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        while(n > 0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse:"+sum);
    }
}