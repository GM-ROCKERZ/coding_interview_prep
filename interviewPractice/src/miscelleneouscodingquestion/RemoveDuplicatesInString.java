package miscelleneouscodingquestion;

public class RemoveDuplicatesInString
{
    static String removeDup(String str)
    {
        String strNoDup = " ";

     for(char ch: str.toCharArray() )
     {
         if(!strNoDup.contains(String.valueOf(ch)))
         {
             strNoDup+=ch;
         }
     }
     return strNoDup;

    }
    public static void main(String argsp[])
    {
        String str = "apple";
        String strNoDup = removeDup(str);
        System.out.println("String without duplicates: "+strNoDup);
    }
}
