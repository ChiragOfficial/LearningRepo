import java.util.Scanner;

class Main
{
  static void Palindrome(String word)
  {
    System.out.print("The word, "+word+" is");

    for(int front = 0, end = word.length()-1; front<word.length()/2;front++)
    {
      if(word.charAt(front)!=word.charAt(end))
      {
        System.out.print(" not");
        break;
      }
      end--;
    }
    System.out.print(" a palindrome.\n");
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.nextLine();
    scanner.close();
    Palindrome(word);
  }
}
