package se.experis.RPGAPI.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class User implements Serializable {

    // COLUMNS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private int userId;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="registrationDate")
    private LocalDate registrationDate;

    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private String region;

    @OneToMany(mappedBy = "user")
    private List<GameCharacter> gameCharacterList;

    // EMPTY CONSTRUCTOR

    public User() {
    }

    // GETTERS AND SETTERS

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<GameCharacter> getGameCharacterList() {
        return gameCharacterList;
    }

    public void setGameCharacterList(List<GameCharacter> gameCharacterList) {
        this.gameCharacterList = gameCharacterList;
    }
}
