package tech.goodquestion.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.goodquestion.website.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
