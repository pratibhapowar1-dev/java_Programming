import java.util.*;

class Dispaly
{
    public void Disply(int iNo)
    {
        int iCnt = 0;

        iCnt = 1;
        while( iCnt<=iNo )
        {
            System.out.println(iCnt);
            iCnt++;
        }
    }
}

class program18
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequancy : ");
        iValue = sobj.nextInt();

        Dispaly dobj = new Dispaly();

        dobj.Disply(iValue);


    }
}