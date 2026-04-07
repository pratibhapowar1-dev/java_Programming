/*
Algorithem
START
        Accept first number as no1
        Accept second number as no2
        if input is nigetive then convert it into positive
        perform addition of no and no2
        Display the addition on screen     
STOP

*/

///////////////////////////////////////////////////////////////////////////////////
// Required header file
//////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////
//
//  Function name : AdditionTwoNumbers        
//  Description :   It is use to perform addition  
//  input :         int, int  
//  output :        int
//  Author :        Pratibha Sagar Pawar
//  Date :          09/10/25 
//
////////////////////////////////////////////////////////////////////////////////
class program8
{
    public static int AdditionTwoNumbers(
                                            int iNo1, 
                                            int iNo2
                                        )
    {
        int iSum = 0;

        if(iNo1<0)
        {
            iNo1 = -iNo1;
        }

        if(iNo2<0)
        {
            iNo2=-iNo2;
        }

        iSum = iNo1+iNo2;
        return iSum;
    }

///////////////////////////////////////////////////////////////////////////////
// End of AdditionTwoNumbes
///////////////////////////////////////////////////////////////////////////////
    
///////////////////////////////////////////////////////////////////////////////
//  Entery point function
//////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        iRet = AdditionTwoNumbers(iValue1, iValue2);

        System.out.println("Addition is : "+iRet);
    }
/////////////////////////////////////////////////////////////////////////////
//  End of entry point function
////////////////////////////////////////////////////////////////////////////

}

///////////////////////////////////////////////////////////////////////////////
//
//  Testcasess successfully handaled by the applications
//
//   Input 1 : 10        Input2 : 3          output : 13
//   Input 1 : -10       Input2 : 3          output : 13
//   Input 1 : 10        Input2 : -3         output : 13
//   Input 1 : -10       Input2 : -3         output : 13
//
///////////////////////////////////////////////////////////////////////////////
