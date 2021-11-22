package tech.goodquestion.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.goodquestion.website.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic,Long>{

}
