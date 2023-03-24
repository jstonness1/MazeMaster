import java.util.Scanner;

public class App {
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
        int first = in.nextInt();

        if (first == 1)
            System.out.println("north");
        if (first == 2)
            System.out.println("east");
        if (first >= 3)
            System.out.println("west");
       










    }
    
    /**
     * 
     */
    public static void clearscreen() {
        System.out.print ("\033[H\033[2J");
    }

}
