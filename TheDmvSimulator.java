import java.util.Random;

public class TheDmvSimulator{

    public static void main(String[] args) {
        System.out.println("Welcome to the DMV, grab a ticket and wait in line, boy there is a long line today");

        Random random = new Random();
        int userNumber = random.nextInt(200) + 1;

        System.out.println("Your number is " + userNumber + " Sir stop yelling and wait in line");

        for (int i = userNumber + 1; i <= 200; i++) {
            System.out.println("Calling number " + i);
        }
        for (int i = 1; i < userNumber; i++) {
        }

        System.out.println("Calling number " + userNumber);

        if (Math.random() < 0.01){
            System.out.println("Wow! you have all of the required paperwork");

        } else{
            System.out.println("YOU DON'T HAVE THE WRITE PAPERWORK, LEAVE AND NEVER COME BACK!");

        }
        
       
    }
    

    

}