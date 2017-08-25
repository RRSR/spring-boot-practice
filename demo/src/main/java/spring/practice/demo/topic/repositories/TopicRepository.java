package spring.practice.demo.topic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.practice.demo.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer>{

}
