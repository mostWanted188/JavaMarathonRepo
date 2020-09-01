package day7.Task2;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

/*    public static void showStamina(Player p) {
        System.out.println(p.getStamina());
    }*/

    public Player(int stamina) {
        this.stamina = stamina;
//        this.stamina = (int) ((Math.random() * 11 + 90));

        if (countPlayers < 6 && countPlayers >= 0) {
            countPlayers++;
        }
    }

    public void run(){
/*        if (stamina <= 0){
            countPlayers--;
            System.out.println("игрок устал и ушел");
            } else if(stamina > MIN_STAMINA){
                stamina--;
            };*/
        if (stamina == 0)
            return;

        stamina--;

        if(stamina == 0) {
            countPlayers--;
        }
    }

    public static void info(){
        String end1 = "";
        char c = ' ';
        if(countPlayers < 6){
            switch (countPlayers){
                case (5):
                    end1 = "ое";
                    c = 'о';
                    break;
                case (1):
                    end1 = "ых";
                    c = ' ';
                    break;
                case (2):
                case (3):
                case (4):
                    end1 = "ых";
                    c = 'а';
                    break;
            }
            System.out.println("команды неполные, еще есть " + (6 - countPlayers) + " свободн" + end1 + " мест" + c);
        } else System.out.println("мест в командах больше нет");
    }

}