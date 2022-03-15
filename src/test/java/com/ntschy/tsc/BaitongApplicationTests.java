package com.ntschy.tsc;

import com.ntschy.tsc.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class BaitongApplicationTests {

	@Test
	void contextLoads() {
//		BasicTextEncryptor encryptor = new BasicTextEncryptor();
//		encryptor.setPassword("NTSchy123456");
//		System.out.println(encryptor.encrypt("sde"));

		for (int i = 0; i < 10; i ++) {
			System.out.println(Utils.GenerateUUID(32));
		}
	}

}
