package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseContactTest {

    @Test
    public void testGetPhone() {
        BaseContact contact = new BaseContact("Name", "33221144", "mail@hotmail.com");

        assertEquals("Name", contact.getName());
    }

    @Test
    public void testGetEmail() {
        BaseContact contact = new BaseContact("Name", "33221144", "mail@hotmail.com");
        assertEquals("33221144", contact.getPhone());
    }


    @Test
    public void testGetName() {
        BaseContact contact = new BaseContact("Name", "33221144", "mail@hotmail.com");
        assertEquals("mail@hotmail.com", contact.getEmail());
    }

}