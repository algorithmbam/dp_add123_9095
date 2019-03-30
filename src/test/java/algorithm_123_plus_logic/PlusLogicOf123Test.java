package algorithm_123_plus_logic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PlusLogicOf123Test {

	private PlusLogicOf123 plusLogicOf123;

	@Before
	public void setUp() {
		plusLogicOf123= new PlusLogicOf123();
	}
	
	@Test
	public void input1_ouput1() {

		int result= plusLogicOf123.dp(1);

		assertThat(result, is(1));
	}
	
	@Test
	public void input2_ouput2() {

		int result= plusLogicOf123.dp(2);

		assertThat(result, is(2));
	}
	
	@Test
	public void input3_ouput4() {

		int result= plusLogicOf123.dp(3);

		assertThat(result, is(4));
	}
	
	@Test
	public void input4_ouput6() {

		int result= plusLogicOf123.dp(4);

		assertThat(result, is(7));
	}
	
	@Test
	public void input5_ouput13() {

		int result= plusLogicOf123.dp(5);

		assertThat(result, is(13));
	}
	
	@Test
	public void input6_ouput24() {

		int result= plusLogicOf123.dp(6);

		assertThat(result, is(24));
	}
	
	@Test
	public void input7_ouput44() {

		int result= plusLogicOf123.dp(7);

		assertThat(result, is(44));
	}
	
	@Test
	public void input8_ouput81() {

		int result= plusLogicOf123.dp(8);

		assertThat(result, is(81));
	}
	
	@Test
	public void input9_ouput149() {

		int result= plusLogicOf123.dp(9);

		assertThat(result, is(149));
	}
	
	@Test
	public void input10_ouput274() {

		int result= plusLogicOf123.dp(10);

		assertThat(result, is(274));
	}
}
