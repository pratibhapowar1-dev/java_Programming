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
    public static float AdditionTwoNumbers(
                                            float iNo1, 
                                            float iNo2
                                        )
    {
        float iSum = 0.0f;

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
        float fValue1 = 0.0f, fValue2 = 0.0f,fRet = 0.0f;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        fValue2 = sobj.nextFloat();

        fRet = AdditionTwoNumbers(fValue1, fValue2);

        System.out.println("Addition is : "+fRet);
    }
/////////////////////////////////////////////////////////////////////////////
//  End of entry point function
////////////////////////////////////////////////////////////////////////////

}

///////////////////////////////////////////////////////////////////////////////
//
//  Testcasess successfully handaled by the applications
//
//   Input 1 : 10.5        Input2 : 3.5          output : 14
//   Input 1 : -10.5       Input2 : 3.5          output : 14
//   Input 1 : 10.5        Input2 : -3.5         output : 14
//   Input 1 : -10.5       Input2 : -3.5         output : 14
//
///////////////////////////////////////////////////////////////////////////////
