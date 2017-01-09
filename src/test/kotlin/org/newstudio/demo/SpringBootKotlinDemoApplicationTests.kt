package org.newstudio.demo

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringBootKotlinDemoApplicationTests {
	@Autowired
	lateinit var restTemplate: TestRestTemplate

	@Test
	fun contextLoads() {
        val response = restTemplate.getForEntity("/", String::class.java)

        Assert.assertEquals(response.statusCode, HttpStatus.OK)
	}

}
