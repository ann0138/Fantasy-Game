import java.util.EmptyStackException;

public class Wizard extends Hero{
    
    private int stanima;
    private int Magic;

    public Wizard(String heroName, Weapon staff, int strenght, int attackvalue, int lifepoints){
        super(heroName, staff, strenght, attackvalue, lifepoints);
    }

    //der magisch ausgelgte Held ist in der Lage die Fähigkeit heilen zu benutzen
    public void Heal () {    
        
        m_lifepoints += 5;

    }
}
