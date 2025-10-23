package domain.repository;

import domain.model.Player;

public interface PlayerRepository {
    void addPlayer(Player player);

    Player fondPlayerById(int playerId);

    void updatePlayer(Player updatedPlayer);

    void deletePlayer(int playerId);
}
