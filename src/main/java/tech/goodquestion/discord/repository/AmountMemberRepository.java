package tech.goodquestion.discord.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.goodquestion.discord.entity.AmountMember;

@org.springframework.stereotype.Repository
public interface AmountMemberRepository extends JpaRepository<AmountMember, Long> {


    @Query(value = "SELECT MAX(total_member) FROM number_member;",
            nativeQuery = true)
    int getAmountMember();
    
}
