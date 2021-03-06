package spring.practice.demo.topic.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.practice.demo.topic.Entity.Topic;
import spring.practice.demo.topic.repositories.TopicRepository;

@Service
public class TopicService {

  @Autowired
  private TopicRepository topicRepository;

  public List<Topic> getAllTopics() {
    List<Topic> topics = new ArrayList<>();
    topicRepository.findAll().forEach(topics::add);
    return topics;
  }

  public Topic getTopic(Integer id){
    return topicRepository.findOne(id);
  }

  public void addTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void updateTopic(Integer id, Topic topic) {
    topicRepository.save(topic);
  }

  public void deleteTopic(Integer id) {
    topicRepository.delete(id);
  }
}
