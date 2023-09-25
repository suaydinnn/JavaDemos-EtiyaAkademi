package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {
    public void add(Course course){
        //sadece db erişim kodları buraya yazılır.
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
