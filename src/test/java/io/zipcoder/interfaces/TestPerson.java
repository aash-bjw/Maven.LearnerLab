package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

@Test
    public void testConstructor(){
    Person person = new Person(456, "Aashna");

    long expected = 456;
    long actual = person.getId();

    Assert.assertEquals(expected, actual);
}

@Test
    public void testSetName(){
    Person person = new Person(456, "Aashna");

    String expected = "Aashna";
    String actual = person.getName();

    Assert.assertEquals(expected, actual);
}
}
