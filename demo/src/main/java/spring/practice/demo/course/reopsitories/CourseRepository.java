package spring.practice.demo.course.reopsitories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import spring.practice.demo.course.Entity.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{

  List<Course> findByTopicId(Integer topicId);

}
