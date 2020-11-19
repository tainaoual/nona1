package fizz_buzz;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzTest {
    private Object StringToSay;
    @Test
    public void multipleOfFourShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.Say(4);
        assertThat(spokenWord).isEqualTo("Fizz");

    }
    @Test
    public void multipleOfTreeShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.Say(8);
        assertThat(spokenWord).isEqualTo("Fizz");

    }

    @Test
    public void multipleOfFiveShouldReturnBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.Say(10);
        assertThat(spokenWord).isEqualTo("Buzz");
    }


    @Test
    public void multipleOfSevenShouldReturnQix() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.Say(11);
        assertThat(spokenWord).isEqualTo("BANG");
    }

    @Test
    public void multipleOftenShouldReturnBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.Say(10);
        assertThat(spokenWord).isEqualTo("Buzz");
    }
}