package se.experis.RPGAPI.controllers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.experis.RPGAPI.models.GameCharacterClass;
import se.experis.RPGAPI.repository.GameCharacterClassRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GameCharacterClassController {

    @Autowired
    private final GameCharacterClassRepository gameCharacterClassRepository;

    public GameCharacterClassController(GameCharacterClassRepository gameCharacterClassRepository) {
        this.gameCharacterClassRepository = gameCharacterClassRepository;
    }

    // ENDPOINTS

    @GetMapping("/api/class/{classname}")
    public GameCharacterClass getGameCharacterClassByType(@PathVariable("classname") String classname) {
        return gameCharacterClassRepository.findGameCharacterClassByType(classname);
    }

    @GetMapping("/api/class/{id}")
    public GameCharacterClass getGameCharacterClassById(@PathVariable("id") int id) {
        return gameCharacterClassRepository.findGameCharacterClassByGameCharacterClassId(id);
    }

    @GetMapping("/api/classes")
    public List getGameCharacterClasses() {
        return gameCharacterClassRepository.findAll();
    }

    @PostMapping("/api/class")
    public GameCharacterClass addGameCharacterClass(@RequestBody GameCharacterClass gameCharacterClass) {
        return gameCharacterClassRepository.save(gameCharacterClass);
    }

    @PostMapping("/api/classes")
    public List addGameCharacterClasses(@RequestBody String gameCharacterClasses) {
        JSONArray classList = new JSONArray(gameCharacterClasses);
        List list = new ArrayList();

        for (int i = 0; i < classList.length(); i++) {
            JSONObject jo = (JSONObject) classList.get(i);
            GameCharacterClass gcc = new GameCharacterClass();
            gcc.setType(jo.getString("type"));
            gcc.setBaseHealth(jo.getDouble("baseHealth"));
            gcc.setBaseDefence(jo.getDouble("baseDefence"));
            gcc.setBaseStrength(jo.getDouble("baseStrength"));
            gcc.setBaseAgility(jo.getDouble("baseAgility"));
            gcc.setBaseMana(jo.getDouble("baseMana"));
            list.add(gameCharacterClassRepository.save(gcc));
        }
        return list;
    }
}
