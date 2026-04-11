import java.util.*;

class Divisible
{
    public boolean CheckDivisible(int iNo1, int iNo2)
    {
        if(iNo1 % iNo2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program23
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter thr second number :");
        iValue2 = sobj.nextInt();

        Divisible dobj = new Divisible();

        bRet = dobj.CheckDivisible(iValue1, iValue2);

        if(bRet == true)
        {
            System.out.println("is a completly Divisible number ");
        }
        else
        {
            System.out.println("is not a divisible number ");
        }

    }
}
