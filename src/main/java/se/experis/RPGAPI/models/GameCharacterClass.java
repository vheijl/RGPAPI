package se.experis.RPGAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
// Ignores gameCharacterList when serializing to keep GET /api/classes as a pure descriptor of the class.
@JsonIgnoreProperties("gameCharacterList")
public class GameCharacterClass implements Serializable {

    // COLUMNS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gameCharacterClass_id", unique = true, nullable = false)
    private int gameCharacterClassId;

    @Column(name="type")
    private String type;

    @Column(name="baseHealth")
    private double baseHealth;

    @Column(name="baseDefence")
    private double baseDefence;

    @Column(name="baseStrength")
    private double baseStrength;

    @Column(name="baseAgility")
    private double baseAgility;

    @Column(name="baseMana")
    private double baseMana;

    @OneToMany(mappedBy = "gameCharacterClass")
    private List<GameCharacter> gameCharacterList;

    // EMPTY CONSTRUCTOR

    public GameCharacterClass() {
    }

    // GETTERS AND SETTERS

    public int getGameCharacterClassId() {
        return gameCharacterClassId;
    }

    public void setGameCharacterClassId(int gameCharacterClassId) {
        this.gameCharacterClassId = gameCharacterClassId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(double baseHealth) {
        this.baseHealth = baseHealth;
    }

    public double getBaseDefence() {
        return baseDefence;
    }

    public void setBaseDefence(double baseDefence) {
        this.baseDefence = baseDefence;
    }

    public double getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(double baseStrength) {
        this.baseStrength = baseStrength;
    }

    public double getBaseAgility() {
        return baseAgility;
    }

    public void setBaseAgility(double baseAgility) {
        this.baseAgility = baseAgility;
    }

    public double getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(double baseMana) {
        this.baseMana = baseMana;
    }

    public List<GameCharacter> getGameCharacterList() {
        return gameCharacterList;
    }

    public void setGameCharacterList(List<GameCharacter> gameCharacterList) {
        this.gameCharacterList = gameCharacterList;
    }
}
