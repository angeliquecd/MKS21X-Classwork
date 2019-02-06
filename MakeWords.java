import java.util.List;
import java.util.ArrayList;
public class MakeWords{
  public static List<String> makeAllWords (int k, int maxChar){
    List<String> returner = new ArrayList<String>();
    wordHelper(k,maxChar,"",returner);
    return returner;
  }
  public static void wordHelper(int k, int maxChar, String ans, List<String> returner){
    if (k==0) {
      returner.add(ans);}
    if (k>0){
    for (int i =97;i<=96+maxChar;i++){
    wordHelper(k-1, maxChar, ans+ (char)i,returner);}
  }
  }
public static void main (String[] args){
  System.out.println(makeAllWords(2,3));
  System.out.println(makeAllWords(3,4));
}
}
