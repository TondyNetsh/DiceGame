import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String maxNum;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter 6 or 10): ");
            maxNum = sc.nextLine();

            if(intValidation(maxNum) && Integer.parseInt(maxNum) == 6){
                Die dice = new Die(Integer.parseInt(maxNum),new int[]{1,1,1,1,1,2}); //The dodgy die

                dice.roll();

                System.out.println("\nFair dice from Dice factory");
                DiceFactory.makeDie(Integer.parseInt(maxNum));
                DiceFactory.makeDie(Integer.parseInt(maxNum));

            }
            else if(intValidation(maxNum) && Integer.parseInt(maxNum) == 10){
                Die dice = new Die(Integer.parseInt(maxNum),new int[]{1,1,1,1,1,1,1,1,1,1}); //The fair die

                dice.roll();

                System.out.println("\nFair dice from Dice factory");
                DiceFactory.makeDie(Integer.parseInt(maxNum));
                DiceFactory.makeDie(Integer.parseInt(maxNum));
            }
            else {
                System.out.println("Invalid: 6 or 10 allowed");
            }
        }while (!intValidation(maxNum));

    }
    public static boolean intValidation(String maxNumber){
        boolean valid = false;
        try{
            if(Integer.parseInt(maxNumber) == 6 || Integer.parseInt(maxNumber) == 10){
                valid = true;
            }
        }catch (NumberFormatException ex){
            valid = false;
        }
        return valid;
    }
}