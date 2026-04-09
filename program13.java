import java.util.Scanner;

class JayGanesh
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo<0)
        {
            System.out.println("Invalid Input");
            return;
        }
        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
           System.out.println("Jay Ganesh");
        }

    }
}

class program13
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        JayGanesh.Display(iValue);
    }
}