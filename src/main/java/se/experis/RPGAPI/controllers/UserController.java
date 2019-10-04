package se.experis.RPGAPI.controllers;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.experis.RPGAPI.models.User;
import se.experis.RPGAPI.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ENDPOINTS

    @GetMapping("/api/user/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userRepository.findUserByUserId(id);
    }

    @GetMapping("/api/users")
    public List getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/api/user")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/api/users")
    public List adduseress(@RequestBody String users) {
        JSONArray userList = new JSONArray(users);
        List list = new ArrayList();
        for (int i = 0; i < userList.length(); i++) {
            JSONObject jo = (JSONObject) userList.get(i);
            User u = new User();
            u.setUsername(jo.getString("username"));
            u.setEmail(jo.getString("email"));
            u.setPassword(jo.getString("password"));
            u.setRegistrationDate(LocalDate.now());
            u.setName(jo.getString("name"));
            u.setRegion(jo.getString("region"));
            list.add(userRepository.save(u));
        }
        return list;
    }
}
