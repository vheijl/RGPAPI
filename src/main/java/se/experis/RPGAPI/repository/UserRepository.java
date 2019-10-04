package se.experis.RPGAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.RPGAPI.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUserId(int id);
}
