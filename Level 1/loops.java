public class loops {

    public static void main(String args[]) {
        
    
    // for(int i =0; i<5; i++){
    //     System.out.println("Skyer " + i);
    // }

    // for(int i =0 ; i<10; i*=2){
    //     System.out.println(i);
    // }
    // for(int i =1 ; i<=10; i+=2){
    //     System.out.println(i);
    // }
    int j=1;
    for(++  j; j<=10; j++){
        System.out.println(j);
        int n = scn.nextInt();
      int nCpy = n;

      int temp=1;
      while(nCpy>9){
        nCpy /= 10;
        temp = temp*10;
      }

      while(temp != 0){
        int digit = n/temp;
        System.out.println(digit);
        n = n%temp;
        temp = temp/10;
      }
    }
}
}
