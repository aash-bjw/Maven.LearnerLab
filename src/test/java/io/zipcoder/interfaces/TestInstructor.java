package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        boolean instructorIsTeacher = true;

      Instructor instructor = new Instructor(123, "Kris");

      if (instructor instanceof Teacher){
          instructorIsTeacher = true;
      } else {
          instructorIsTeacher = false;
      }
        Assert.assertTrue(instructorIsTeacher);
    }

    @Test
    public void testInheritance(){
        boolean instructorIsPerson = true;

        Instructor instructor = new Instructor(123, "Kris");

        if(instructor instanceof Person){
            instructorIsPerson = true;
        } else {
            instructorIsPerson = false;
        }
        Assert.assertTrue(instructorIsPerson);
        }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(123, "Kris");

        Student student = new Student(456, "Zaara", 0);

        instructor.teach(student, 5);

        double expected = 5;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(123, "Kris");

        Student student = new Student(456, "Zaara", 0);

        instructor.teach(student, 5);

//        double expected = 5;
//        double actual = 
    }

    }

