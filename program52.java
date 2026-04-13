
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : CountNonFactors
// Description   : it is used count Non factors
// Input         : Intiger
// Output        : Intiger
// Author        : Pratibha Sagar Pawar 
//    
////////////////////////////////////////////////////////////////////////////////////////////
class Display
{
    public void CountNonFactors(int iNo)
    {
        int iCnt = 0, iFrequancy = 0;

        if(iNo<0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            if(iNo%iCnt!=0)
            {
                iFrequancy++;
            }
           
        }

        System.out.println("Count of non facters : "+iFrequancy);
    }
}
///////////////////////////////////////////////////////////////////
//  Entry point function
//////////////////////////////////////////////////////////////////
class program52
{
    public static void main(String A[])
    {
       int iValue = 0, iCount = 0;

       Scanner sobj  =new Scanner(System.in);

       System.out.println("Enter the number : ");

       iValue = sobj.nextInt();

       Display dobj = new Display();

       dobj.CountNonFactors(iValue);

    }

///////////////////////////////////////////////////////////////////////////////
//  End of entry point function
///////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////
//  End of class
///////////////////////////////////////////////////////////////////////////////