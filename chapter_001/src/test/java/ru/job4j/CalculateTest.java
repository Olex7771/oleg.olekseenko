package ru.job4j;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
 * @author Oleg Olekseenko (olekseenkoo3@gmail.com)
 * @version 1.0
 * @since 14.11.2017
 */
public class CalculateTest {
	/**
* Test echo.
*/ 
	public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Oleg Olekseenko";
    String expect = "Echo, echo, echo : Oleg Olekseenko"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}
	