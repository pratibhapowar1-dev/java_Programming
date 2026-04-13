import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : CountFactorsNonFactors
// Description   : it is used count factors Non factors
// Input         : Intiger
// Output        : Intiger
// Author        : Pratibha Sagar Pawar 
//    
////////////////////////////////////////////////////////////////////////////////////////////
class Display
{
    public void CountFactorsNonFactors(int iNo)
    {
        int iCnt = 0, iFrequancy1 = 0,iFrequancy2 = 0;

        if(iNo<0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<iNo; iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iFrequancy1++;
            }
            else
            {
                iFrequancy2++;
            }
           
        }

        System.out.println("Count of facters : "+iFrequancy1);
        System.out.println("Count of non facters : "+iFrequancy2);
    }
}
///////////////////////////////////////////////////////////////////
//  Entry point function
//////////////////////////////////////////////////////////////////
class program53
{
    public static void main(String A[])
    {
       int iValue = 0, iCount = 0;

       Scanner sobj  =new Scanner(System.in);

       System.out.println("Enter the number : ");

       iValue = sobj.nextInt();

       Display dobj = new Display();

       dobj.CountFactorsNonFactors(iValue);

    }

///////////////////////////////////////////////////////////////////////////////
//  End of entry point function
///////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////
//  End of class
///////////////////////////////////////////////////////////////////////////////