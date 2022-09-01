import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void proofTest35(){
        //given

        int num = 15;

        //when

        String actual = FizzBuzz.proof(num);

        //then

        assertEquals("FizzBu", actual);
    }

    @Test
    void proofTest5(){
        //given

        int num = 5;

        //when

        String actual = FizzBuzz.proof(num);

        //then

        assertEquals("Buzz", actual);
    }

    @Test
    void proofTest3(){
        //given

        int num = 6;

        //when

        String actual = FizzBuzz.proof(num);

        //then

        assertEquals("Fizz", actual);
    }
}
