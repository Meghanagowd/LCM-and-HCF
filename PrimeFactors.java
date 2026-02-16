public class PrimeFactors {
  
  public static void main(String args[]){
    int n =48;
    int i = 2;
    while(n!=1){
      while(n%i == 0){
        System.out.print(i+" ");
        n = n/i;
      }
      i++;
    }
  }
}

  

