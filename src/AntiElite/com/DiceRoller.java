package AntiElite.com;

import java.util.Random;

public class DiceRoller{

    Random random;
    int number;

    DiceRoller(){
        random = new Random();
        roll(random,number);

    }
    void roll(Random random,int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
