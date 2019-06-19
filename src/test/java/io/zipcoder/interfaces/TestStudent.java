package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        boolean studentIsLearner = true;
        Student student = new Student(789, "Zaara", 3);

        if (student instanceof Learner) {
            studentIsLearner = true;
        } else {
            studentIsLearner = false;
        }
        Assert.assertTrue(studentIsLearner);
    }

    @Test
    public void testInheritance(){
        boolean studentIsPerson = true;
        Student student = new Student(789, "Zaara", 3);

        if (student instanceof Person) {
            studentIsPerson = true;
        } else {
            studentIsPerson = false;
        }
        Assert.assertTrue(studentIsPerson);
    }

    @Test
    public void testLearn(){
        Student student = new Student(789, "Zaara", 0);

        double expected = 3;
        student.learn(expected);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }
}
