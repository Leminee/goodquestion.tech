package tech.goodquestion.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.goodquestion.website.entity.Topic;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TopicRepository extends JpaRepository<Topic,Long>{


    @Modifying
    @Query(value = "UPDATE topic SET content = :newContent WHERE id_topic = :topicId",
            nativeQuery = true)
    void updateTopic(@Param("topicId") long topicId, @Param("newContent") String newContent);

    @Modifying
    @Query(value = "UPDATE topic SET vote = vote + 1 WHERE id_topic = :topicId",
            nativeQuery = true)
    void giveThumbsUp(@Param("topicId") long topicId);
}
