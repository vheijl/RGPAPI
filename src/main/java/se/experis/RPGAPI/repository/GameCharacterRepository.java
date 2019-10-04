package se.experis.RPGAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.RPGAPI.models.GameCharacter;

public interface GameCharacterRepository extends JpaRepository<GameCharacter, Integer> {
    GameCharacter findGameCharacterByGameCharacterId(int id);
}
