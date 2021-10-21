package tech.goodquestion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

import java.util.Optional;

@SpringBootTest
class GoodquestionApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void test(){ 
		

		Optional<Object> op = Optional.of("test");
		//Assertions.assertEquals(true, op);

		String text = "test";
		int num = 2;
		int num2 = 3;

		String rs = text + (num + num2);

		Assertions.assertEquals("test23",rs);


	}


	public int getNumber() {
		return 1;
	}

}
