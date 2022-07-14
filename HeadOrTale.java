import java.util.Random;
import java.util.Scanner;
public class HeadOrTale{

    public static void main(String[] args){
        Random rand = new Random();
         Scanner sc = new Scanner(System.in);  
         
        int num;
        int Hnum = 0;
        int Tnum = 0;
        String name ; 
        System.out.println("Who are you?");
        name = sc.next();
        System.out.println("Hello,"+name);
        System.out.println("Tossing a coin...");
        for(int i=0;i<3;i++){
            System.out.printf("Round %d: ",i+1);
            num = rand.nextInt(2);
            if (num == 0){
                System.out.println("Heads");
                Hnum++;
            }else if(num == 1){
                System.out.println("Tails");
                Tnum++;
            }
            System.out.printf("Heads: %d, Tails: %d",Hnum,Tnum);
            if(Hnum > Tnum){
                System.out.println( name+" win.");
            }else{
                System.out.println( name+" lose.");
            }
        }
    }
}