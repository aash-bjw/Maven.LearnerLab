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
    //given
        double numOfHours = 3;

        Instructor instructor = new Instructor(123, "Kris");

        Learner[] learners = new Learner[3];

        Student student1 = new Student(456, "Zaara", 0);
        Student student2 = new Student(123, "Veer", 0);
        Student student3 = new Student(798, "Samiya", 0);

        learners[0] = student1;
        learners[1] = student2;
        learners[2] = student3;

    //when
        instructor.lecture(learners, numOfHours);

    //then
       double student1StudyTime = student1.getTotalStudyTime();
       double expectedStudyTime = 1;

       Assert.assertEquals(expectedStudyTime, student1StudyTime, .4);
    }

    }

