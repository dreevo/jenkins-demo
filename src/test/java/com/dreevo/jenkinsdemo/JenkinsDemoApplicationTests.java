package com.dreevo.jenkinsdemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertThat(true).isEqualTo(false);
	}

}
