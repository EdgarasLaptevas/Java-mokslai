import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 20));
        players.add(new Player("Bob", 30));
        players.add(new Player("Charlie", 30));
        players.add(new Player("Daisy", 10));

//        players.forEach((player) -> System.out.println("Player: " + player.getName() + ", Score: " + player.getScore()));
//        players.removeIf((player) -> player.getScore() < 25);
//        System.out.println(players);
//        players.replaceAll((player) -> {
//            player.setScore(player.getScore() * 2);
//            return player;
//        });
//        System.out.println(players);
//        players.sort(Comparator.comparing(Player::getScore).reversed().thenComparing(Player::getName));
//        System.out.println(players);
        players.forEach((player) -> player.setName("Player-" + player.getName()));
        System.out.println(players);
    }
}