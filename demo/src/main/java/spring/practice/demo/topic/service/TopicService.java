package spring.practice.demo.topic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import spring.practice.demo.topic.Topic;

@Service
public class TopicService {

  private List<Topic> topics = new ArrayList<>(Arrays.asList(
      new Topic(1,"Spring Framework","Spring Framework Description"),
      new Topic(2,"Core Java", "Core Java Description"),
      new Topic(3,"JavaScript","JavaScript Description")
  ));

  public List<Topic> getAllTopics() {
    return topics;
  }

  public Topic getTopic(Integer id){
    return topics.stream().filter(t -> t.getId() == id).findFirst().get();
  }

  public void addTopic(Topic topic) {
    topics.add(topic);
  }

  public void updateTopic(Integer id, Topic topic) {
    for(int i=0;i<topics.size();i++){
      if(topics.get(i).getId() == id){
        topics.set(i,topic);
        return;
      }
    }
  }

  public void deleteTopic(Integer id) {
    topics.removeIf(t -> t.getId() == id);
    return;
  }
}
