public class Die {
    private int dieSides;

    Die(int sides, int[] probabilities){
        dieSides = sides;
        setProbabilities(probabilities);
    }

    int getSides(){
        return dieSides;
    }

    void setProbabilities(int[] probabilities){
        int sum = 0;
        if(probabilities.length == 0 && getSides() == 6){
            probabilities = new int[]{1,1,1,1,1,1};
        }
        if(probabilities.length == 0 && getSides() == 10){
            probabilities = new int[]{1,1,1,1,1,1,1,1,1,1};
        }
        for(int x = 0; x< probabilities.length; ++x){
            if(probabilities[x] < 0){
                System.out.println("ERROR: negative probabilities not allowed");
                sum = 1;
                break;
            }
            sum += probabilities[x];
        }
        if(sum < 1){
            System.out.println("ERROR: probability sum must be greater than 0");
        }

    }
    void roll(){
        int value;
        int min = 1;
        int range = getSides() - min + 1;

        value = (int)(Math.random() * range) + min;
        System.out.println("Your lucky number is: " + value);

    }
}