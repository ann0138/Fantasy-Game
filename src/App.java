public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's start the game");
        
        Sword sword = new Sword();

        Knight myKnight = new Knight("Knight Aragon", sword, 11, 17, 23);
        String name = myKnight.SayName();
        int knightphsydmg = myKnight.m_weapon.physicalattack;


        Magicstaff staff = new Magicstaff();

        Wizard myWizard = new Wizard("Gandalf", staff, 4, 8, 20);
        String wname = myWizard.SayName();
        int wizardphysdmg = myWizard.m_weapon.physicalattack;

        Club club = new Club();
        Monster monster1 = new Monster(club, 12, 46);
        String  monsterSound = monster1.SayName();
        int monsterphysdmg = monster1.m_weapon.physicalattack;

        Dice dice6 = new Dice(6);
        Dice dice10 = new Dice(10);

        //Knight Info
        System.out.println(name);
        System.out.println(knightphsydmg);
        

        //Wizard Info
        System.out.println(wname);
        System.out.println(wizardphysdmg);

        //Monster Info
        System.out.println(monsterSound);
        System.out.println(monsterphysdmg);
        
        //Dice Info
        System.out.println("Gamemaster: Let's roll the dices");
        System.out.println(dice6.rolldice());
        System.out.println(dice10.rolldice());
        

    }
}
