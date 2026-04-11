import java.util.*;

class Dispaly
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;

        for( iCnt = 1; iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt+"\t");
            }
            
        }
       
    }
}

class program25
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequancy : ");
        iValue = sobj.nextInt();

         Dispaly.Dispaly(iValue);
    }
  
}