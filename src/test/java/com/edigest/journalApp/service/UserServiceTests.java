package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Disabled
    @ParameterizedTest
    @ArgumentsSource(UserArgumentProvider.class)
    public void testSaveNewUser(User user) {
        assertTrue(userService.saveNewUser(user));
    }

    @Disabled
    @Test
    public void testAdd() {
        assertEquals(4, 2+2);
        assertTrue(5 > 3);
        assertFalse(3>4);
        assertTrue(1==1);
        assertNotEquals(3,4);
    }

    @Disabled
    @Test
    public void testFindByUsername() {
        assertNotNull(userRepository.findByUserName("ashim"));
    }

    @Disabled
    @Test
    public void testesJournalEntries() {
        User user = userRepository.findByUserName("ashim");
        assertTrue(!user.getJournalEntries().isEmpty());
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "ashim",
            "vipul",
            "eagle",
            "siyal"
    })
    @Disabled
    public void testFindByUsernames(String name) {
        assertNotNull(userRepository.findByUserName(name), "failed for: "+ name);
    }

    @Disabled
    public void testEnumFindByUsernames(String name) {
        assertNotNull(userRepository.findByUserName(name), "failed for: "+ name);
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "2,3,5",
            "10,20,30"
    })
    public void paramTest(int a, int b, int expected){
        assertEquals(expected, a+b);
    }

}

