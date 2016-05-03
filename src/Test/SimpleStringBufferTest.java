package Test;

import org.junit.Before;
import org.junit.Test;

import com.SimpleStringBuffer.SimpleStringBuffer;
import com.SimpleStringBuffer.SimpleStringBufferable;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SimpleStringBufferTest extends TestCase {
	private SimpleStringBufferable stringBuffer;

	@Before
	public void setUp() {
		stringBuffer = new SimpleStringBuffer();
	}

	@Test
	public void testAppendString() {

		stringBuffer.append("AAA");
		stringBuffer.append("BBB");
		assertEquals("AAABBB", stringBuffer.toString());

	}

	@Test
	public void testAppendNull() {
		stringBuffer.append("Deepa");
		stringBuffer.append(null);
		assertEquals("Deepanull", stringBuffer.toString());
	}

	@Test
	public void testAppendStringLargerThen16() {
		stringBuffer.append("abcdefghijklmnopqrst");
		stringBuffer.append("uvwxyz1234567891011");
		assertEquals("abcdefghijklmnopqrstuvwxyz1234567891011", stringBuffer.toString());
	}

	@Test
	public void testAppendEmpty() {
		stringBuffer.append("Deepa");
		stringBuffer.append("");
		stringBuffer.append("Deepa");
		assertEquals("DeepaDeepa", stringBuffer.toString());
	}

	@Test
	public void testAppendEmptyBuffer() {
		assertTrue(stringBuffer.toString().equals(""));

	}
}
