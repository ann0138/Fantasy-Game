import java.util.Random;

public class Dice {
    private int m_dicesides;

    public Dice(int sides) {

        m_dicesides = sides;


    }

    public int rolldice (){

        Random rand = new Random();
        int n = rand.nextInt(m_dicesides);
        n += 1; 
        return n;
        
    }
}
