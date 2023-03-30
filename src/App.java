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
        int currentJunction = 0;
        int health = 10;
        String firstWay;

        while (currentJunction != 6 && health >= 1) {
            if (currentJunction == 0) {
                System.out.println("There are 3 ways to go, ");
                System.out.println("1, North");
                System.out.println("2, East");
                System.out.println("3, West");
                System.out.println(" ");
                int start = Integer.parseInt(in.nextLine());

                if (start <= 1) {

                    System.out.println("before you can go here you need to solve this riddle");
                    System.out.println("what is 12x15");
                    int test1 = Integer.parseInt(in.nextLine());
                    if (test1 == 180) {
                        currentJunction = 2;

                    } else if (test1 >= 170) {
                        System.out.println("try again");
                        health -= 1;
                    } else if (test1 <= 181) {
                        System.out.println("try again");
                        health -= 1;
                        // if (north1 >= 1)

                    }
                } else if (start == 2) {
                    System.out.println("before you can go here you need to solve this riddle");
                    System.out
                            .println("if mark has 7 pencils and he gives away 4 and gets 9 more how many does he have");
                    int test2 = Integer.parseInt(in.nextLine());
                    if (test2 == 12) {
                        currentJunction = 3;
                        firstWay = "youve chosen East and reached a deadend";
                        System.out.println(" ");
                        System.out.println(firstWay);
                        System.out.println("1, West");
                        System.out.println(" ");
                        int east1 = Integer.parseInt(in.nextLine());
                    } else if (test2 >= 11)
                        System.out.println("try again");
                    else if (test2 <= 13)
                        System.out.println("try again");
                }

                else if (start >= 3) {

                    System.out.println("before you can go here you need to solve this riddle");
                    System.out.println("how many stars are there");
                    System.out.println("xxx*xxx*x");
                    System.out.println("x**xx*xxx");
                    System.out.println("x*x**xxxx");
                    System.out.println("*xx*xx*x*");
                    int test3 = Integer.parseInt(in.nextLine());
                    if (test3 == 12) {
                        currentJunction = 1;
                        firstWay = "correct, now that youve chosen West now you have 2 more options";
                        System.out.println(" ");
                        System.out.println(firstWay);
                        System.out.println("1, North");
                        System.out.println("2, East");
                        System.out.println(" ");
                        int west1 = Integer.parseInt(in.nextLine());
                    } else if (test3 >= 11)
                        System.out.println("try again");
                    else if (test3 <= 13)
                        System.out.println("try again");
                }
            } else if (currentJunction == 1) {

                firstWay = "youve chose West now you have 2 more options";
                System.out.println(" ");
                System.out.println(firstWay);
                System.out.println("1, Final");
                System.out.println("2, East");
                System.out.println(" ");
                int west1 = Integer.parseInt(in.nextLine());
            } else if (currentJunction == 2) {
                firstWay = "youve chosen North now you have 2 more options";
                System.out.println(" ");
                System.out.println(firstWay);
                System.out.println("1, Final");
                System.out.println("2, South");
                System.out.println(" ");

                int north1 = Integer.parseInt(in.nextLine());
                currentJunction = 4;
            } else if (currentJunction == 4) {
                firstWay = "youve chosen Final now you have 1 way now";
                System.out.println(" ");
                System.out.println(firstWay);
                System.out.println("1, ENDING");
                System.out.println("");
                System.out.println(" ");
                int final1 = Integer.parseInt(in.nextLine());
                if (final1 == 1) {
                    currentJunction = 5;
                }
            } else if (currentJunction == 5) {
                firstWay = "You've reached the ending";
                String choice = "Would you like to start over? (Y/N)";

                System.out.println(firstWay);
                System.out.println(choice);
                String final2 = in.nextLine();

                if (final2.equalsIgnoreCase("y")) {
                    System.out.println("You are being sent back to the start");
                    clearscreen();
                    currentJunction = 0;
                }

                else if (final2.equalsIgnoreCase("n")) {
                    System.out.println("well played");

                    currentJunction = 6;
                }
            }
        }
        if (health == 0) {
            System.out.println(" ");
            System.out.println("GAME OVER");
            System.out.println(" ");
        }

    }

    /**
     * 
     */
    public static void clearscreen() {
        System.out.print("\033[H\033[2J");
    }

}
