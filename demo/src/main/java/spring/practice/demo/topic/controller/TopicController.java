package spring.practice.demo.topic.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

  @RequestMapping("/topics/{id}")
  public Topic getTopic(@PathVariable("id") Integer id){
    return topicService.getTopic(id);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/topics")
  public void addTopic(@RequestBody Topic topic){
    System.out.println("The topic to be added is : "+topic);
    topicService.addTopic(topic);
  }

}
