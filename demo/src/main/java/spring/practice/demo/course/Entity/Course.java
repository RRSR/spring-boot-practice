package spring.practice.demo.course.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import spring.practice.demo.topic.Entity.Topic;

@Entity
public class Course {

  @Id
  private int id;
  private String name;
  private String description;
  private Integer topicId;

  public Course(int id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public Course() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }
}