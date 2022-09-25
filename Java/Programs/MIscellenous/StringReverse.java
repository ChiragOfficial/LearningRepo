import java.util.*;

class Main
{
  static char[] swap(char[] ch,int i, int j)
  {
    char temp = ch[i];
    ch[i] = ch[j];
    ch[j] = temp;
    return ch;
  }

  static String stringReverse(String word)
  {
    char ch[] = word.toCharArray();
    for(int i = 0; i<word.length()/2; i++)
    {
      ch = swap(ch, i, word.length()-i-1);
    }
    word = new String(ch);
    return word;
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.nextLine();
    scanner.close();
    String reversedWord = stringReverse(word);
    System.out.println("Reversed String: "+reversedWord);
  }
}
