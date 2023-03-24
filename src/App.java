public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\033[0;32m");
        System.out.println("welcome to the maze!");
        
    }
    
    /**
     * 
     */
    public static void ClearScreen() {
        System.out.print ("\033[H\033[2J");
    }

}
