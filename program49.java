
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : DisplayNonFactors
// Description   : it is used display Non factors
// Input         : Intiger
// Output        : Intiger
// Author        : Pratibha Sagar Pawar 
//    
////////////////////////////////////////////////////////////////////////////////////////////
class Display
{
    public void DisplayNonFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo<=0)
        {
            System.out.println("Invalid Input");
        }

        for(iCnt = 1; iCnt<iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print(iCnt+"\t");
            }
          
        }

    }

///////////////////////////////////////////////////////////////////
//  Entry point function
//////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
       int iValue = 0;

       Scanner sobj  =new Scanner(System.in);

       System.out.println("Enter the number : ");

       iValue = sobj.nextInt();

       Display dobj = new Display();

       dobj.DisplayNonFactors(iValue);


    }
///////////////////////////////////////////////////////////////////////////////
//  End of entry point function
///////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////
//  End of class
///////////////////////////////////////////////////////////////////////////////