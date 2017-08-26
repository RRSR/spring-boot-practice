package spring.practice.demo.course.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.practice.demo.course.Entity.Course;
import spring.practice.demo.course.service.CourseService;

@RestController
public class CourseController {

  @Autowired
  private CourseService courseService;

  @RequestMapping(value = "/courses", method = RequestMethod.GET)
  public List<Course> getAllCourses(){
    return courseService.getAllCourses();
  }

  @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
  public Course getCourse(@PathVariable("id") Integer id){
    return courseService.getCourse(id);
  }

  @RequestMapping(value = "/courses", method = RequestMethod.POST)
  public void addCourse(@RequestBody Course course){
    courseService.addCourse(course);
  }

  @RequestMapping(value = "/courses", method = RequestMethod.PUT)
  public void updateCourse(@RequestBody Course course){
    courseService.updateCourse(course);
  }
  @RequestMapping(value = "/courses/{id}", method = RequestMethod.DELETE)
  public void deleteCourse(@PathVariable("id") Integer id){
    courseService.deleteCourse(id);
  }

}
