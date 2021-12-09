package tech.goodquestion.website.service;

import tech.goodquestion.website.entity.Topic;

import java.util.Optional;

public interface ITopicService {

    Optional<Topic> getTopicById(long userId);
    void saveTopic(Topic topic);
    void updateTopic(long topicId, String newContent);
    void deleteTopicById(long topicId);
    void giveThumbsUp(long topicId);
}
