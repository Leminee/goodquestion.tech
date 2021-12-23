package tech.goodquestion.website.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.goodquestion.website.entity.Topic;
import tech.goodquestion.website.service.TopicServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/topic/")
public class TopicController {

    private final TopicServiceImpl topicService;

    public TopicController(TopicServiceImpl topicService) {
        this.topicService = topicService;
    }

    @GetMapping("{topicId}")
    public ResponseEntity<Optional<Topic>> getTopicById(@PathVariable long topicId) {

        return new ResponseEntity<>(topicService.getTopicById(topicId), HttpStatus.OK);

    }

    @PostMapping("save")
    public ResponseEntity<String> createTopic(@RequestBody Topic topic) {

       topicService.saveTopic(topic);

       return new ResponseEntity<>("Topic wurde erfolgreich erstellt!", HttpStatus.CREATED);

    }

    @PutMapping("update/{topicId}/{newContent}")
    public ResponseEntity<String> updateTopic(@PathVariable long topicId, @PathVariable String newContent) {

        topicService.updateTopic(topicId, newContent);

        return new ResponseEntity<>("Topic wurde erfolgreich bearbeitet!", HttpStatus.ACCEPTED);

    }


    @PutMapping("update/up/{topicId}")
    public ResponseEntity<String> updateTopic(@PathVariable long topicId) {

        topicService.giveThumbsUp(topicId);

        return new ResponseEntity<>("Daumen hoch!", HttpStatus.ACCEPTED);

    }

    @DeleteMapping("delete/{topicId}")
    public ResponseEntity<String> deleteTopicById(@PathVariable long topicId) {

        topicService.deleteTopicById(topicId);

        return new ResponseEntity<>("Topic wurde erfolgreich gelöscht!", HttpStatus.ACCEPTED);

    }
}
