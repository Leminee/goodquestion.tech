package tech.goodquestion.discord.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.goodquestion.discord.api.entity.ActiveMember;

@Repository
public interface ActiveMemberRepository extends JpaRepository<ActiveMember,Long> {

    @Query(value = "SELECT amount FROM user_online ORDER BY time DESC LIMIT 1;",
            nativeQuery = true)
    int getCurrentActiveMember();

    @Query(value = "SELECT MAX(amount) FROM user_online;",
            nativeQuery = true)
    int getRecordActiveMember();
}
