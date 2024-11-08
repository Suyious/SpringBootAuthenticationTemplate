package com.xetra.xetra;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class XetraApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void main() {
        XetraApplication.main(new String[]{"--spring.main.web-application-type=none"});
    }
}
