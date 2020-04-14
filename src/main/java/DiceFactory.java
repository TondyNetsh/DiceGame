public class DiceFactory {

    public static void makeDie(int sides){
        int num;
        int min = 1;
        int range = sides - min + 1;

        num = (int)(Math.random() * range) + min;
        System.out.println("Your lucky number is: " + num);
    }
}