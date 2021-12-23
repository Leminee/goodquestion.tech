package tech.goodquestion.discord.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.goodquestion.discord.api.entity.NewMember;

@Repository
public interface NewMemberRepository extends JpaRepository<NewMember, Long> {

    @Query(value = "SELECT username FROM user_join ORDER BY joined_at DESC LIMIT 1;",
            nativeQuery = true)
    String getLatestJoinedMemberName();

    @Query(value = "SELECT CONCAT(DAY(joined_at), '-', MONTH(joined_at), '-', YEAR(joined_at), ' ',TIME(joined_at)) FROM user_join ORDER BY joined_at DESC LIMIT 1;",
            nativeQuery = true)
    String getLatestJoinedMemberDateTime();
}
