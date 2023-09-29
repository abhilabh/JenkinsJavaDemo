package JenkinsDemo;

import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertTrue;

    public class AppTest {
    
        @Test
        public void testInputIsEven(){
            assertTrue(App.checkIfInputIsAnEvenNumber(22)); // Assertion
        }
    }