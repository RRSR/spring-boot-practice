package spring.practice.demo.topic.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.practice.demo.topic.Topic;
import spring.practice.demo.topic.service.TopicService;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;


  @RequestMapping("/topics")
  public List<Topic> getAllTopics(){
    return topicService.getAllTopics();
  }
}
