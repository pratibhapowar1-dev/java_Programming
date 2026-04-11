import java.util.*;

class Dispaly
{
    public static void Disply(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}

class program15
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequancy : ");
        iValue = sobj.nextInt();

        Dispaly.Disply(iValue);


    }
}