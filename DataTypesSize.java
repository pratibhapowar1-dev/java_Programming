/////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : DisplayValues
// Description   : it is used display values 
// Input         : Intiger/character 
// Output        : Intiger
// Author        : Pratibha Sagar Pawar 
//    
////////////////////////////////////////////////////////////////////////////////////////////
class DataTypesX
{
     static void DisplayValue()
    {
        char cValue = 'P';
        int iValue = 11;
        float fValue = 90.78f;
        double dValue = 98.564323;

        System.out.println(cValue);
        System.out.println(iValue);
        System.out.println(fValue);
        System.out.println(dValue);

        System.out.println("Size of cValue is : "+Character.BYTES);
        System.out.println("Size of iValue is : "+Integer.BYTES);
        System.out.println("Size of fValue is : "+Float.BYTES);
        System.out.println("Size of dValue is : "+Double.BYTES);

    }

///////////////////////////////////////////////////////////////////
//  Entry point function
//////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        DisplayValue();

    }
///////////////////////////////////////////////////////////////////////////////
//  End of entry point function
///////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////
//  End of class
///////////////////////////////////////////////////////////////////////////////