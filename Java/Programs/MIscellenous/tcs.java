import java.util.Scanner;

public class tcs
{

  public static int count(int count, String num)
  {
    for(int i = 0; i<num.length();i++)
    {
      if(num.charAt(i)=='a'||num.charAt(i)=='e'||num.charAt(i)=='i'||num.charAt(i)=='o'||num.charAt(i)=='u')
      {
        count++;
      }
    }
    return count;
  }

  public static int vowels(int[] arr, int count)
  {
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] == 1)
      {
        count = count(count, "one");
      }
      else if(arr[i]==2)
      {
        count = count(count,"two");
      }
      else if(arr[i]==3)
      {
        count = count(count,"three");
      }
      else if(arr[i]==4)
      {
        count = count(count,"four");
      }
      else if(arr[i]==5)
      {
        count = count(count,"five");
      }
      else if(arr[i]==6)
      {
        count = count(count,"six");
      }
      else if(arr[i]==7)
      {
        count = count(count,"seven");
      }
      else if(arr[i]==8)
      {
        count = count(count,"eight");
      }
      else if(arr[i]==9)
      {
        count = count(count,"nine");
      }
      else if(arr[i]==10)
      {
        count = count(count,"ten");
      }
      else if(arr[i]==11)
      {
        count = count(count,"eleven");
      }
      else if(arr[i]==12)
      {
        count = count(count,"twelve");
      }
      else if(arr[i]==13)
      {
        count = count(count,"thirteen");
      }
      else if(arr[i]==14)
      {
        count = count(count,"fourteen");
      }
      else if(arr[i]==15)
      {
        count = count(count,"fifteen");
      }
      else if(arr[i]==16)
      {
        count = count(count, "sixteen");
      }
      else if(arr[i]==17)
      {
        count = count(count, "seventeen");
      }
      else if(arr[i]==18)
      {
        count = count(count, "eightteen");
      }
      else if(arr[i]==19)
      {
        count = count(count, "nineteen");
      }
      else if(arr[i]==20)
      {
        count = count(count, "twenty");
      }
      else if(arr[i]==21)
      {
        count = count(count, "twentyone");
      }
      else if(arr[i]==22)
      {
        count = count(count, "twentytwo");
      }
      else if(arr[i]==23)
      {
        count = count(count, "twentythree");
      }
      else if(arr[i]==24)
      {
        count = count(count, "twentyfour");
      }
      else if(arr[i]==25)
      {
        count = count(count, "twentyfive");
      }
      else if(arr[i]==26)
      {
        count = count(count, "twentysix");
      }
      else if(arr[i]==27)
      {
        count = count(count, "twentyseven");
      }
      else if(arr[i]==28)
      {
        count = count(count, "twentyeight");
      }
      else if(arr[i]==29)
      {
        count = count(count, "twentynine");
      }
      else if(arr[i]==30)
      {
        count = count(count, "thirty");
      }
      else if(arr[i]==31)
      {
        count = count(count, "thirtyone");
      }
      else if(arr[i]==32)
      {
        count = count(count, "thirtytwo");
      }
      else if(arr[i]==33)
      {
        count = count(count, "thirtythree");
      }
      else if(arr[i]==34)
      {
        count = count(count, "thirtyfour");
      }
      else if(arr[i]==35)
      {
        count = count(count, "thirtyfive");
      }
      else if(arr[i]==36)
      {
        count = count(count, "thirtysix");
      }
      else if(arr[i]==37)
      {
        count = count(count, "thirtyseven");
      }
      else if(arr[i]==38)
      {
        count = count(count, "thirtyeight");
      }
      else if(arr[i]==39)
      {
        count = count(count, "thirtynine");
      }
      else if(arr[i]==40)
      {
        count = count(count, "forty");
      }
      else if(arr[i]==41)
      {
        count = count(count, "fortyone");
      }
      else if(arr[i]==42)
      {
        count = count(count, "fortytwo");
      }
      else if(arr[i]==43)
      {
        count = count(count, "fourtythree");
      }
      else if(arr[i]==44)
      {
        count = count(count, "fortyfour");
      }
      else if(arr[i]== 45)
      {
        count = count(count, "fortyfive");
      }
      else if(arr[i]==46)
      {
        count = count(count, "fortysix");
      }
      else if(arr[i]==47)
      {
        count = count(count, "fortyseven");
      }
      else if(arr[i]==48)
      {
        count = count(count, "fortyeight");
      }
      else if(arr[i]==49)
      {
        count = count(count, "fortynine");
      }
      else if(arr[i]==50)
      {
        count = count(count, "fifty");
      }
      else if(arr[i]==51)
      {
        count = count(count, "fiftyone");
      }
      else if(arr[i]==52)
      {
        count = count(count, "fiftytwo");
      }
      else if(arr[i]==53)
      {
        count = count(count, "fiftythree");
      }
      else if(arr[i]==54)
      {
        count = count(count, "fiftyfour");
      }
      else if(arr[i]==55)
      {
        count = count(count, "fiftyfive");
      }
      else if(arr[i]==56)
      {
        count = count(count, "fiftysix");
      }
      else if(arr[i]==57)
      {
        count = count(count, "fiftyseven");
      }
      else if(arr[i]==58)
      {
        count = count(count, "fiftyeight");
      }
      else if(arr[i]==59)
      {
        count = count(count, "fiftynine");
      }
      else if(arr[i]==60)
      {
        count = count(count, "sixty");
      }
      else if(arr[i]==61)
      {
        count = count(count, "sixtyone");
      }
      else if(arr[i]==62)
      {
        count = count(count, "sixtytwo");
      }
      else if(arr[i]==63)
      {
        count = count(count, "sixtythree");
      }
      else if(arr[i]==64)
      {
        count = count(count, "sixtyfour");
      }
      else if(arr[i]==65)
      {
        count = count(count, "sixtyfive");
      }
      else if(arr[i]==66)
      {
        count = count(count, "sixtysix");
      }
      else if(arr[i]==67)
      {
        count = count(count, "sixtyseven");
      }
      else if(arr[i]==68)
      {
        count = count(count, "sixtyeight");
      }
      else if(arr[i]==69)
      {
        count = count(count, "sixtynine");
      }
      else if(arr[i]==70)
      {
        count = count(count, "seventy");
      }
      else if(arr[i]==71)
      {
        count = count(count, "seventyone");
      }
      else if(arr[i]==72)
      {
        count = count(count, "seventytwo");
      }
      else if(arr[i]==73)
      {
        count = count(count, "seventythree");
      }
      else if(arr[i]==74)
      {
        count = count(count, "seventyfour");
      }
      else if(arr[i]==75)
      {
        count = count(count, "seventyfive");
      }
      else if(arr[i]==76)
      {
        count = count(count, "seventysix");
      }
      else if(arr[i]==77)
      {
        count = count(count, "seventyseven");
      }
      else if(arr[i]==78)
      {
        count = count(count, "seventyeight");
      }
      else if(arr[i]==79)
      {
        count = count(count, "seventynine");
      }
      else if(arr[i]==80)
      {
        count = count(count, "eighty");
      }
      else if(arr[i]==81)
      {
        count = count(count, "eightyone");
      }
      else if(arr[i]==82)
      {
        count = count(count, "eightytwo");
      }
      else if(arr[i]==83)
      {
        count = count(count, "eightythree");
      }
      else if(arr[i]==84)
      {
        count = count(count, "eightyfour");
      }
      else if(arr[i]==85)
      {
        count = count(count, "eightyfive");
      }
      else if(arr[i]==86)
      {
        count = count(count, "eightysix");
      }
      else if(arr[i]==87)
      {
        count = count(count, "eightyseven");
      }
      else if(arr[i]==88)
      {
        count = count(count, "eightyeight");
      }
      else if(arr[i]==89)
      {
        count = count(count, "eightynine");
      }
      else if(arr[i]==90)
      {
        count = count(count, "ninty");
      }
      else if(arr[i]==91)
      {
        count = count(count, "nintyone");
      }
      else if(arr[i]==92)
      {
        count = count(count, "nintytwo");
      }
      else if(arr[i]==93)
      {
        count = count(count, "nintythree");
      }
      else if(arr[i]==94)
      {
        count = count(count, "nintyfour");
      }
      else if(arr[i]==95)
      {
        count = count(count, "nintyfive");
      }
      else if(arr[i]==96)
      {
        count = count(count, "nintysix");
      }
      else if(arr[i]==97)
      {
        count = count(count, "nintyseven");
      }
      else if(arr[i]==98)
      {
        count = count(count, "nintyeight");
      }
      else if(arr[i]==99)
      {
        count = count(count, "nintynine");
      }
      else if(arr[i]==100)
      {
        count = count(count, "hundred");
      }
    }
    return count;
  }
  public static void numOfUnorderedPair(int n)
  {
    if(n==0)
    {
      System.out.println("zero");
    }
    else if(n==1)
    {
      System.out.println("one");
    }
    else if(n == 2)
    {
      System.out.println("two");
    }
    else if(n == 3)
    {
      System.out.println("three");
    }
    else if(n == 4)
    {
      System.out.println("four");
    }
    else if(n == 5)
    {
      System.out.println("five");
    }
    else if(n == 6)
    {
      System.out.println("six");
    }
    else if(n == 7)
    {
      System.out.println("seven");
    }
    else if(n == 8)
    {
      System.out.println("eight");
    }
    else if(n == 9)
    {
      System.out.println("nine");
    }

    else if(n == 10)
    {
      System.out.println("ten");
    }
  }

  public static void main(String[] args)
  {
    //Initialization
    int numOfEle;
    int count=0;
    int num=0;
    Scanner sc = new Scanner(System.in);
    numOfEle = sc.nextInt();

    //Entering Values into the array:
    int[] arr = new int[numOfEle];
    for(int i = 0; i<numOfEle;i++)
    {
      arr[i] = sc.nextInt();
      while(arr[i]>100)
      {
        System.out.println("greater 100");
        arr[i] = sc.nextInt();
      }
      sc.nextLine();
    }
    sc.close();
    //Passing String
    count = vowels(arr, count);
    for(int i = 0;i<arr.length-1;i++)
    {
      for(int j = i+1;j<arr.length;j++)
      {
        int sum = arr[i]+arr[j];
        if(sum == count)
        {
          num++;
        }
      }
    }

    numOfUnorderedPair(num);
  }
}
