package tech.goodquestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.goodquestion.entity.NewMember;

@Repository
public interface NewUserRepository extends JpaRepository<NewMember, Long> {

    @Query(value = "SELECT username FROM user_join ORDER BY joined_on DESC LIMIT 1;",
            nativeQuery = true)

    String getLatestJoinedMemberName();

    @Query(value = "SELECT CONCAT(DAY(joined_on), '-', MONTH(joined_on), '-', YEAR(joined_on)) FROM user_join ORDER BY joined_on DESC LIMIT 1;",
            nativeQuery = true)

    String getLatestJoinedMemberDate();
}
