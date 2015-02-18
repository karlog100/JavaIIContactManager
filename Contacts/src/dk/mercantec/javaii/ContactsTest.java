package dk.mercantec.javaii;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContactsTest {


    @Test
    public void testAddInternalContact() {
        Internal myTest = new Internal("name", "phone", "email@email.dk", "department");

        assertTrue(myTest.getDepartment().equals("department"));
    }

    @Test
    public void testAddExternalContact() {
        External myTest = new External("name", "phone", "email@email.dk", "department");

        assertTrue(myTest.getCompany().equals("department"));
    }
}