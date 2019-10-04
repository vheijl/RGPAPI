package se.experis.RPGAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
// Ignores gameCharacterClass and user to prevent unwanted recursion when serializing
@JsonIgnoreProperties({"gameCharacterClass", "user"})
public class GameCharacter implements Serializable {

    // COLUMNS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gameCharacterid")
    private int gameCharacterId;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "health")
    private double health;

    @Column(name = "defence")
    private double defence;

    @Column(name = "strength")
    private double strength;

    @Column(name = "agility")
    private double agility;

    @Column(name = "mana")
    private double mana;

    @Column(name = "gameCharacterClass_id", nullable = false)
    private int gameCharacterClassId;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "gameCharacterClass_id", referencedColumnName = "gameCharacterClass_id", insertable = false, updatable = false)
    private GameCharacterClass gameCharacterClass;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;

    // EMPTY CONSTRUCTOR

    public GameCharacter() {
    }

    // GETTERS AND SETTERS


    public int getGameCharacterId() {
        return gameCharacterId;
    }

    public void setGameCharacterId(int gameCharacterId) {
        this.gameCharacterId = gameCharacterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getGameCharacterClassId() {
        return gameCharacterClassId;
    }

    public void setGameCharacterClassId(int gameCharacterClassId) {
        this.gameCharacterClassId = gameCharacterClassId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public GameCharacterClass getGameCharacterClass() {
        return gameCharacterClass;
    }

    public void setGameCharacterClass(GameCharacterClass gameCharacterClass) {
        this.gameCharacterClass = gameCharacterClass;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
