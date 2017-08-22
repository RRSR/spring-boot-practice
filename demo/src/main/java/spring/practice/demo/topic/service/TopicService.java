package spring.practice.demo.topic.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import spring.practice.demo.topic.Topic;

@Service
public class TopicService
{

  private List<Topic> topics = Arrays.asList(
      new Topic(1,"Spring Framework","Spring Framework Description"),
        new Topic(2,"Core Java", "Core Java Description"),
        new Topic(3,"JavaScript","JavaScript Description")
  );

  public List<Topic> getAllTopics() {
    return topics;
  }
}
