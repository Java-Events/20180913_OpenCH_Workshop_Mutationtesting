package junit.chopen.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyArroundClassExtension.class)
@ExtendWith(MyArroundMethodExtension.class)
public class TestLifecycleExtension {
	
	@Test
	public void test001() {
		System.out.println("The test");
	}
}
