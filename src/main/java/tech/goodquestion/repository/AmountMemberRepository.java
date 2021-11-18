package tech.goodquestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.goodquestion.entity.NumberMember;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<NumberMember, Long> {
    
}
