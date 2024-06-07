package Top_Programmming_Exercises;

public class S2SortWithOutSortMethod {
  public static void main(String[] args) {
    System.out.println(sortString("XyzcdaB"));
  }
  public static String sortString(String input){
    input = input.toLowerCase();
    char[] arrayChar = input.toCharArray();
    char temp;
    for(int i =0; i<arrayChar.length; i++){
      for(int j=i; j<arrayChar.length;j++){
        temp = arrayChar[i];
        if(arrayChar[j]<arrayChar[i]){
          arrayChar[i] = arrayChar[j];
          arrayChar[j]=temp;
        }
      }
    }
    String result = "";
    for (int i=0; i<arrayChar.length;i++){
      result = result + Character.toString(arrayChar[i]);
    }
   return result;
  }
}
