package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Салам, пес :)");
        user1.sendMessage(user2, "Че как?");

        user2.sendMessage(user1, "Привет, норм. как сам?");
        user2.sendMessage(user1, "Погода отл, может барбекю?");

        user1.sendMessage(user2, "Го");
        user1.sendMessage(user3, "Юзер 3, ты с нами?");

        user3.sendMessage(user1, "Куда там? я все пропустил");

        user1.sendMessage(user3, "Шашлындос");

        user3.sendMessage(user1, "Давай в сб, в пятихатку надо уложиться");

        user1.sendMessage(user3, "Ок");

        user1.sendMessage(user2, "В сб крч");

        user2.sendMessage(user1, "Гуд");

        MessageDatabase.showDialog(user1, user2);
    }

}
