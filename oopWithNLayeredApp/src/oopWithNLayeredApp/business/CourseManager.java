package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Course;//yardımcı katman

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;
    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers=loggers;
    }

    public void add(Course course){



            if (course.getPrice() < 0) {
                System.out.println("Kurs fiyatı 0'dan küçük olamaz!");
            }
            else{
                courseDao.add(course);
                for(Logger logger : loggers){
                    logger.log(course.getName());
                }
            }


    }
}
