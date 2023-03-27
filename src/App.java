import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        clearscreen();
        System.out.println("\033[0;32m");
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
        else if (start == 2){
            firstWay="youve chosen East now you have 2 more options";
            System.out.println(" ");
            System.out.println(firstWay);
             System.out.println("1, North");
         System.out.println("2, West");
         System.out.println(" ");
         int east1 = in.nextInt();
        }
        else if (start >= 3){
            firstWay="youve chosen West now you have 3 more options";
           System.out.println(" ");
           System.out.println(firstWay);
            System.out.println("1, North");
        System.out.println("2, East");
        System.out.println("3, West");
        System.out.println(" ");
        int west1 = in.nextInt();
        }
       










    }
    
    /**
     * 
     */
    public static void clearscreen() {
        System.out.print ("\033[H\033[2J");
    }

}
