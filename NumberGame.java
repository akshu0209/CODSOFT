import java.util.*;
public class NumberGame{

    public static int randomNumber(){
        Random rand=new Random();
        int value=rand.nextInt(100);
        return value;
    }

    public static int check(){
        Scanner sc=new Scanner(System.in);
        int count=3;
        int point=0;
        int randomNum=randomNumber();
        System.out.println("\n\tYou have to Guess Number which is randomly Generated (Range : 1 to 100) = ._._.");
        System.out.println("\tYou have 3 Attempts to Guess !!");
        while(count>0){
            System.out.print("\n\tGuess the Number : ");
            int num=sc.nextInt();
            if(num==randomNum){
                System.out.println("\tGreat!! Your Answer is Right\n \t You win the Game!!!");
                point++;
                break;
            }else{
                 if(count==1){
                    System.out.println("\tOhhh!!..You Loose the Game");
                    break;
                }
                if(num<randomNum){
                System.out.println("\tThe number is Greater than Entered Number..");
                count--;
                }else if(num>randomNum){
                    System.out.println("\tThe number is Smaller than Enterd Number..");
                    count--;
                }
            }
        }
        return point;
    }

    public static void main(String args[]){
        System.out.println("\n\t========= Welcome To Guessing Number Game ==========");
        int count=1;
        int score=0;
        while(count<=3){
            System.out.println("\n\t\t====================================");
            System.out.println("\t\t\t-> Round "+count+" <-");
            System.out.println("\t\t====================================");
            int points=check();
            score=score+points;
            count++;
        }
        System.out.println("\n\tYour Score is : "+score);
    }
}