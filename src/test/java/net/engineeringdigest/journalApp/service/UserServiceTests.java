package net.engineeringdigest.journalApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUserName(){
        User user = userRepository.findByUserName("aditya");
        assertNotNull(user);
    }

    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "2,10,12",
        "3,3,6"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a + b);
    }
}
