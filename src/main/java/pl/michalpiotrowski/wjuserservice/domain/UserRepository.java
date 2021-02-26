package pl.michalpiotrowski.wjuserservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u WHERE (u.username = ?1 OR u.email = ?2) AND NOT u.id = ?3")
    Optional<User> findByUsernameOrEmailAndIdNot(String username, String email, UUID id);

    Optional<User> findByEmail(String email);

}
