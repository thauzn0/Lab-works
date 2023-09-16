public class Lab6 {

public static int countSpaces(String s)
{
  int spaceCount = 0;
  char c = ' ';
  for(int i=0;i<s.length();i++){
  if(s.charAt(i) == c){
  spaceCount++;  
  }
  }
  return spaceCount;
}
public static String removeSpaces(String s){
  StringBuilder builder1 = new  StringBuilder("");
  for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) != ' '){
      builder1.append(s.charAt(i)); 
    }        
    }
    return builder1.toString();

}

public static String everyNthChar(String s, int n){
  StringBuilder builder2 = new StringBuilder("");
  int c = ' ';
  for(int i=0;i<s.length();i+=n){
    //result+=s.charAt(i)+" "; // 1) T" " , 2)T |
    builder2.append(s.charAt(i));
    builder2.append(" ");
  }
  return builder2.toString();
}


}   
