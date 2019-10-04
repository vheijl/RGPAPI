package se.experis.RPGAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.RPGAPI.models.GameCharacterClass;

public interface GameCharacterClassRepository extends JpaRepository<GameCharacterClass, Integer> {
    GameCharacterClass findGameCharacterClassByType(String type);
    GameCharacterClass findGameCharacterClassByGameCharacterClassId(int id);
}
