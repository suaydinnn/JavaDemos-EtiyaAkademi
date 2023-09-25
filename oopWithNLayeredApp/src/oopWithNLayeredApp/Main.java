package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateCourseDao;
import oopWithNLayeredApp.entities.Course;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1,"Java",15675.0);
        List<Logger> loggers = (List<Logger>) new FileLogger();
        CourseManager courseManager =new CourseManager(new HibernateCourseDao(),loggers );
        courseManager.add(course1);


    }
}