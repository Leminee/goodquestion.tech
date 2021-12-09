package tech.goodquestion.website.service;


import org.springframework.stereotype.Service;
import tech.goodquestion.website.entity.Topic;
import tech.goodquestion.website.repository.TopicRepository;

import java.util.Optional;

@Service
public class TopicServiceImpl implements ITopicService {

    private final TopicRepository topicRepository;

    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public Optional<Topic> getTopicById(long userId) {
        return topicRepository.findById(userId);
    }

    @Override
    public void saveTopic(Topic topic) {

        topicRepository.save(topic);
    }

    @Override
    public void updateTopic(long topicId, String newContent) {

        topicRepository.updateTopic(topicId, newContent);

    }

    @Override
    public void deleteTopicById(long topicId) {

        topicRepository.deleteById(topicId);

    }

    @Override
    public void giveThumbsUp(long topicId) {

        topicRepository.giveThumbsUp(topicId);
    }
}
