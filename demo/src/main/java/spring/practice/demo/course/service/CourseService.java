package spring.practice.demo.course.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.practice.demo.course.Entity.Course;
import spring.practice.demo.course.reopsitories.CourseRepository;
import spring.practice.demo.topic.repositories.TopicRepository;

@Service
public class CourseService {

  @Autowired
  private TopicRepository topicRepository;

  @Autowired
  private CourseRepository courseRepository;

  public List<Course> getAllCourses(Integer topicId) {
    return courseRepository.findByTopicId(topicId);
  }

  public Course getCourse(Integer id){
    return courseRepository.findOne(id);
  }

  public void addCourse(Integer topicId ,Course course) {
    course.setTopic(topicRepository.findOne(topicId));
    courseRepository.save(course);
  }

  public void updateCourse(Course course) {
    courseRepository.save(course);
  }

  public void deleteCourse(Integer id) {
    courseRepository.delete(id);
  }
}
