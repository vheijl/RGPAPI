package se.experis.RPGAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.experis.RPGAPI.models.GameCharacter;
import se.experis.RPGAPI.repository.GameCharacterRepository;
import java.util.List;

@RestController
public class GameCharacterController {

    @Autowired
    private final GameCharacterRepository gameCharacterRepository;

    public GameCharacterController(GameCharacterRepository gameCharacterRepository) {
        this.gameCharacterRepository = gameCharacterRepository;
    }

    // ENDPOINTS

    @GetMapping("/api/character/{id}")
    public GameCharacter getGameCharacter(@PathVariable("id") int id) {
        return gameCharacterRepository.findGameCharacterByGameCharacterId(id);
    }

    @GetMapping("/api/characters")
    public List getGameCharacters() {
        return gameCharacterRepository.findAll();
    }

    @PostMapping("/api/character")
    public GameCharacter addGameCharacter(@RequestBody GameCharacter gameCharacter) {
        return gameCharacterRepository.save(gameCharacter);
    }
}
