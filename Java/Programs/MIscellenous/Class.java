import static java.lang.System.out;

/*public class Class{
  public static void main(String[] args)
  {
    Class cl = new Class();
    int[] arr = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
    int[] newArr;
    newArr = cl.plusOne(arr);
    for(int i = 0; i<newArr.length;i++)
    {
      System.out.print(" "+newArr[i]);
    }
  }

  public int[] accenture(int[] arr)
  {
    int smallSum = 0;
    int bigSum = 0;
    int[] resultArray = new int[arr.length];
    for(int i= 0; i<arr.length; i++)
    {
      smallSum = 0;
      bigSum = 0;
      for(int j = i; j<arr.length-1; j++)
      {
        if(arr[i]>arr[j+1])
        {
          smallSum+=arr[j+1];
        }
        else
        {
          bigSum+=arr[j+1];
        }
      }
      resultArray[i] = smallSum*bigSum;
    }
    return resultArray;
  }
  */
/*
    public int[] plusOne(int[] digits) {

        long num = 0;
        long temp;

        for(int i = 0; i < digits.length; i++)
        {
            temp = digits[i];

            for(int j=0; j<digits.length-i-1;j++)
            {
                temp *= 10;
            }
            num +=temp;
        }

        num++;

        String dg = String.valueOf(num);                        //String

        char[] dig = dg.toCharArray();                          //Array of characters

        int[] newDigits = new int[dig.length];

        System.out.println(dig.length);

        for(int i = 0; i<dig.length; i++)
        {
            newDigits[i] = Character.getNumericValue(dig[i]);
        }

        return newDigits;

    }
}
*/


public class Class {
 static void doCalc(byte... a) {
   out.print("byte...");
 }
 static void doCalc(long a, long b) {
   out.print("long, long");
 }
 static void doCalc(byte s1, byte s2) {
   out.print("Byte, Byte");
 }
 public static void main (String[] args) {
   byte b = 5;
   doCalc(b, b);
 }
}
