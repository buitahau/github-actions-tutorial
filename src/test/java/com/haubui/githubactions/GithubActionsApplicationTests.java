package com.haubui.githubactions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubActionsApplicationTests {

    @Test
    void contextLoads() {}

    @Test
    void failCase() {
        Assertions.assertTrue(true);
    }
}
