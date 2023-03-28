import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        clearscreen();
        System.out.println("\033[0;34m");
        System.out.println("welcome to the maze!");
      
        System.out.println("There are 3 ways to go, ");
        System.out.println("1, North");
        System.out.println("2, East");
        System.out.println("3, West");
        System.out.println(" ");
        int start = in.nextInt();
        String test=in.nextLine();
        String firstWay;
        if (start <= 1){
          
            System.out.println("before you can go here you need to solve this riddle");
            System.out.println("what is 12x15");
            int test1= in.nextInt();
            if (test1 == 180){

            firstWay="youve chosen North now you have 4 more options";
            System.out.println(" ");
            System.out.println(firstWay);
             System.out.println("1, North");
         System.out.println("2, East");
         System.out.println("3, West");
         System.out.println("4, South");
         System.out.println(" ");
         int north1 = in.nextInt();
        }
        else if (test1 >= 170)
        System.out.println("try again");
        else if (test1 <= 181)
        System.out.println("try again");
    }
        else if (start == 2){
            System.out.println("before you can go here you need to solve this riddle");
            System.out.println("if mark has 7 pencils and he gives away 4 and gets 9 more how many does he have");
            int test2= in.nextInt();
            if (test2 == 12){
            firstWay="youve chosen East now you have 2 more options";
            System.out.println(" ");
            System.out.println(firstWay);
             System.out.println("1, North");
         System.out.println("2, West");
         System.out.println(" ");
         int east1 = in.nextInt();
            }
         else if (test2 >= 11)
        System.out.println("try again");
        else if (test2 <= 13)
        System.out.println("try again");
    }

        else if (start >= 3){
            
            System.out.println("before you can go here you need to solve this riddle");
            System.out.println("how many stars are there");
            System.out.println("xxx*xxx*x");
            System.out.println("x**xx*xxx");
            System.out.println("x*x**xxxx");
            System.out.println("*xx*xx*x*");
            int test3= in.nextInt();
            if (test3 == 12){
            
            firstWay="correct, now that youve chosen West now you have 3 more options";
           System.out.println(" ");
           System.out.println(firstWay);
            System.out.println("1, North");
        System.out.println("2, East");
        System.out.println("3, West");
        System.out.println(" ");
        int west1 = in.nextInt();
        }
        else if (test3 >= 11)
        System.out.println("try again");
        else if (test3 <= 13)
        System.out.println("try again");
    }
       










    }
    
    /**
     * 
     */
    public static void clearscreen() {
        System.out.print ("\033[H\033[2J");
    }

}
