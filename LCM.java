public class LCM {
  public static void  main(String args[]){
    int a = 12 , b = 10;
    int lar = Math.max(a , b);
    int lcm = lar;
    System.out.println(lar);
    while(true){
      if( lcm % a ==0  &&  lcm % b == 0){
        System.out.println("lcm is : "+lcm);
        break;
      }
      else{
         lcm = lcm+lar;
      }

    }
  }
}
