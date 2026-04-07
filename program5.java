import java.util.Scanner;

class program5
{
    public static void main(String A[])
    {
        int i =0, j= 0, ans = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter first number : \n");
        i = sobj.nextInt();

        System.out.println("Enter second number : \n");
        j = sobj.nextInt();

        ans = i+j;

        System.out.println("Addition is : " + ans);


    }
}