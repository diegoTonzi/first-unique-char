package br.com.first.unique.character;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import br.com.first.unique.character.exceptions.FirstUniqueCharNotFoundException;
import br.com.first.unique.character.stream.StreamImpl;

/**
 * The test case of Stream Reader type
 * @author Diego Costa (diegotonzi@gmail.com)
 */
public class StreamReaderTest {

	/**
	 * Test to get first unique char
	 * @throws Exception
	 */
    @Test
    public void testFirstChar() throws Exception {
        assertThat(StreamReader.firstChar(new StreamImpl("aAbBABac")), equalTo('b'));
        assertThat(StreamReader.firstChar(new StreamImpl("aAbBABcb")), equalTo('a'));
        assertThat(StreamReader.firstChar(new StreamImpl("AbBABbca")), equalTo('c'));
    }

    /**
     * Test first char not found
     * @throws Exception
     */
    @Test(expected = FirstUniqueCharNotFoundException.class)
    public void testFirstCharNotFound() throws Exception {
        StreamReader.firstChar(new StreamImpl("xxxxxxxx"));
    }

}
