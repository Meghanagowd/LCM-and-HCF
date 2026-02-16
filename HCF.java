public class HCF {
  public static void main(String args[]){
    int a = 8 , b = 16;
    int hcf = Math.min(a,b);
    while(true){
      if( a % hcf == 0 && b % hcf ==0){
        System.out.println("hcf : "+hcf);
        break;
      }
      hcf--;
    }
  }
  
}
