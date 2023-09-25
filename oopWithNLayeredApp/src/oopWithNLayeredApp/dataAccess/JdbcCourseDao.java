package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao {
    public void add(Course course){
        //sadece db erişim kodları buraya yazılır.
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
