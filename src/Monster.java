public class Monster extends Figure {

    public Monster(Weapon club, int attack, int lp){

        m_attackvalue = attack;
        m_lifepoints = lp;
        m_weapon = club;

    }

    public String SayName() {
        return "Monters apears: AHHHHHHHRGHHH";
    }
}
