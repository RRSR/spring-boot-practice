package spring.practice.demo.course.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.practice.demo.course.Entity.Course;
import spring.practice.demo.course.reopsitories.CourseRepository;
import spring.practice.demo.topic.Entity.Topic;
import spring.practice.demo.topic.repositories.TopicRepository;

@Service
public class CourseService {

  @Autowired
  private CourseRepository courseRepository;

  public List<Course> getAllCourses() {
    List<Course> courses = new ArrayList<>();
    courseRepository.findAll().forEach(courses::add);
    return courses;
  }

  public Course getCourse(Integer id){
    return courseRepository.findOne(id);
  }

  public void addCourse(Course course) {
    courseRepository.save(course);
  }

  public void updateCourse(Course course) {
    courseRepository.save(course);
  }

  public void deleteCourse(Integer id) {
    courseRepository.delete(id);
  }
}
