package MentoringFromTugba;

public class PrimeNumber {
    public static void main(String[] args) {
        int myNumber = 0;
     for(myNumber=1; myNumber<=50; myNumber++){
         int count=0;
         for(int lessThanMynNum=1;lessThanMynNum<=myNumber;lessThanMynNum++){
          if(myNumber%lessThanMynNum==0){
              count++;
          }
         }
         if(count==2){
             System.out.println(myNumber+" is a prime number");
         }
     }
    }
}