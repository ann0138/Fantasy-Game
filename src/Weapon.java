public class Weapon extends Object {
    public int m_bonus;
    public String m_material;
    public int m_magic;


    public int calculate_bonus() {

        int bonus = 0;
        if (m_material == "Iron") bonus += 5;
        if (m_material == "Waiden Wood") bonus += 3;
        if (m_material == "Wood") bonus += 1;

        bonus += m_magic;

        return bonus;
    }
}
