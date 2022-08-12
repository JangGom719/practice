package jsh;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import jsh.domain.Board;
import jsh.domain.Member;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@SpringBootTest
class PracticeApplicationTests {

	@Test
	public void testBoardBuilder() {
	}
	//board 도메인 ToString 테스트
	
	@Test
	public void testToStringExclude() {
		Member member = new Member();
		log.info("@@ member = {}",member);
	}
	//member 도메인 ToStringExclude 테스트

}
