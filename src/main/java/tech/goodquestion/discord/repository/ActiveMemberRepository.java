package tech.goodquestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.goodquestion.entity.ActiveMember;

@Repository
public interface ActiveMemberRepository extends JpaRepository<ActiveMember,Long> {

    @Query(value = "SELECT active_member FROM active_user ORDER BY time DESC LIMIT 1;",
            nativeQuery = true)
    int getCurrentActiveMember();

    @Query(value = "SELECT MAX(active_member) FROM active_user;",
            nativeQuery = true)
    int getRecordActiveMember();
}
