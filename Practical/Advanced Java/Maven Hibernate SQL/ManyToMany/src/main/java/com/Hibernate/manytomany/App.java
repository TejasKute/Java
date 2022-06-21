package com.Hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import com.Hibernate.manytomany.dao.CourseDao;
import com.Hibernate.manytomany.dao.InstructorDao;
import com.Hibernate.manytomany.entity.Course;
import com.Hibernate.manytomany.entity.Instructor;
import com.Hibernate.manytomany.entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
    	Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com");
	InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
	// associate the objects
	instructorDetail.setInstructor(instructor);
	// associate the objects
	instructor.setInstructorDetail(instructorDetail);

	Instructor instructorOne = new Instructor("Tejas", "Kute", "Tejas@Kute.com");
	InstructorDetail instructorDetailOne = new InstructorDetail("http://www.youtube.com", "Piano");
	// associate the objects
	instructorDetailOne.setInstructor(instructorOne);
	// associate the objects
	instructorOne.setInstructorDetail(instructorDetailOne);
	
	List<Course> courses = new ArrayList<>();
	// create some courses
	Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
	tempCourse1.setInstructor(instructor);
	courses.add(tempCourse1);
	
	Course tempCourse2 = new Course("The Pinball Masterclass");
		tempCourse2.setInstructor(instructorOne);
		courses.add(tempCourse2);
		
		CourseDao coursedao = new CourseDao();
		coursedao.saveCourse(tempCourse1);
		coursedao.saveCourse(tempCourse2);		
    }
   }
