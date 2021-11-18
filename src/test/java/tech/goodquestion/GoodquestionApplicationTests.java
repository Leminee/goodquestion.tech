package tech.goodquestion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class GoodquestionApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void test(){ 


		int result = add(1,2);
		int excepted = 3;

		assertThat(result).isEqualTo(excepted);

	}


	public static int add(int a, int b) {
		return a +b;
	}

}
