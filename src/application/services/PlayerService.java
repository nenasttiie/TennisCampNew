package application.services;

import domain.model.Player;
import infrastructure.repository.InMemoryPlayerRepository;

public class PlayerService {
    private final InMemoryPlayerRepository playerRepository;

    public PlayerService(InMemoryPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public void addPlayer(Player player){
        playerRepository.addPlayer(player);
    }

    public Player findPlayerById(int playerId){
        return playerRepository.fondPlayerById(playerId);
    }

    public void updatePlayer(Player updatedPlayer){
        playerRepository.updatePlayer(updatedPlayer);
    }

    public void deletePlayer(int playerId){
        playerRepository.deletePlayer(playerId);
    }
}
