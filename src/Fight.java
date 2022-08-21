public class Fight {

    private Figure m_player;
    private Figure m_opponent;

    private Dice m_dice6;
    private Dice m_dice10;

    public Fight(Figure player, Figure opponent) {

        m_player = player;
        m_opponent = opponent;

        m_dice10 = new Dice(10);
        m_dice6 = new Dice(6);

    }

    public void fight() {

    }
}
