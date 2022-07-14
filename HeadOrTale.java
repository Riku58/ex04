import java.util.Random;
public class HeadOrTale{

    public static void main(String[] args){
        Random rand = new Random();
        int num;
        int Hnum = 0;
        int Tnum = 0;
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
        }
    }
}