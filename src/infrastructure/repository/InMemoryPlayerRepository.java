package infrastructure.repository;

import domain.model.Player;
import domain.repository.PlayerRepository;

import java.util.HashMap;

public class InMemoryPlayerRepository implements PlayerRepository {
    HashMap<Integer, Player> players = new HashMap<>();
    @Override
    public void addPlayer(Player player) {
        players.put(player.getPlayerId(), player);
    }

    @Override
    public Player fondPlayerById(int playerId) {
        return players.get(playerId);
    }

    @Override
    public void updatePlayer(Player updatedPlayer) {
        players.put(updatedPlayer.getPlayerId(), updatedPlayer);
    }

    @Override
    public void deletePlayer(int playerId) {
        players.remove(playerId);
    }
}
