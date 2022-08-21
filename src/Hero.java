public class Hero extends Figure {
    private String name;

    public Hero(String heroName, Weapon herowWeapon, int strenght, int attackvalue, int lifepoints) { // superclass (parent) of Knight/Wizard
        
        name = heroName;
        m_weapon = herowWeapon;
        m_attackvalue = attackvalue;
        m_strenght = strenght;
        m_lifepoints = lifepoints;

    }

    // bei physikalisch ausgelgten Helden ist physattack stärker als die magische
    public void physattack() {

    }

    // bei magisch ausgelegten Helden ist die magicattack stärker als die
    // physikalische
    public void magicsattack() {

    }

    public void calculateAttackvalue() {

    }

    // jeder Held ist in der Lage gegenstände zu benutzen
    public void useObject() {

    }

    public String SayName() {

        return name;

    }
}
