package src;


public class metods{
  public  void lenString(String str) {
      try {
        System.out.println(str.length());
      } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
      } finally {
        System.out.println("String processing completed.");
      }
  }

  public static void findElemArray(int[] arr, int index) {
    try {
      System.out.println(arr[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Array processing completed.");
    }
  }

   public static void mulDivide(int a,int b,int c){
    try{
      int result= a/(b-c);
      System.out.println( result);
    } catch(RuntimeException e){
      System.out.println("coud not devide on null");
    }finally {
      System.out.println("division arrays processing completed.");
    }
  }

  /* 
  public static void mulDivide(int a,int b,int c){
    if ((b-c)==0){
      throw new RuntimeException ("coud not devide on null");
    } 
    int result= a/(b-c);
    System.out.println( result);
  }
*/
  public static int[] divideArrays(int[] arr1, int[] arr2) {
  if (arr1.length != arr2.length) {
    throw new RuntimeException("arrays length do not equal");
  }
  int[] result = new int[arr1.length];
  for (int i = 0; i < arr1.length; i++) {
    if (arr2[i] == 0) {
      throw new RuntimeException("division on null is impossible");
    }
    result[i] = arr1[i] / arr2[i];
  }
  return result;
} 

  


}