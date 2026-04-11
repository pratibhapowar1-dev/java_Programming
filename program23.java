import java.util.*;

class Dispaly
{
    public void Dispaly(int iNo)
    {
        int iCnt = 0;

        for( iCnt = 2; iCnt<=iNo; iCnt=iCnt+2 )
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class program23
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequancy : ");
        iValue = sobj.nextInt();

        Dispaly dobj = new Dispaly();

        dobj.Dispaly(iValue);
    }
  
}