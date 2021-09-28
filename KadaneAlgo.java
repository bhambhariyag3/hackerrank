public class MyClass {
    public static void main(String args[]) {
     
      int a[] = {-1,-2,-3,-4}
      
      int cm = a[0];
      int mf = a[0];
      
      for (int i =1;i<a.length;i++){
          cm = cm + a[i];
          if (cm < a[i]){
            cm = a[i];
          }
          if (mf < cm ){
              mf = cm;
          } 
          
      }
      
      System.out.println(mf);
    }
}
