import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void test1() {
        String text = "1 3 20\n" +
                "15 4\n" +
                "- 1\n" +
                "- 20";
        assertEquals(3,Main.test(text));
    }
    @Test
    public void test2() {
        String text = "1 2 20\n" +
                "4 2\n" +
                "- 2\n";
        assertEquals(3,Main.test(text));
    }
    @Test
    public void test3() {
        String text = "2 1 20\n" +
                "2 4\n" +
                "2 -";
        assertEquals(3,Main.test(text));
    }
    @Test
    public void test4() {
        String text = "2 1 20\n" +
                "21 4\n" +
                "2 -";
        assertEquals(1,Main.test(text));
    }

    @Test
    public void test5() {
        String text = "2 1 20\n" +
                "21 41\n" +
                "2 -";
        assertEquals(0,Main.test(text));
    }
    @Test
    public void test6() {
        String text = "5 5 10\n" +
                "5 1\n" +
                "1 3\n" +
                "1 3\n" +
                "1 3\n" +
                "1 3";
        assertEquals(6,Main.test(text));
    }
    @Test
    public void test7() {
        String text = "3 4 11\n" +
                "1 1\n" +
                "2 2\n" +
                "3 3\n" +
                "- 4\n";
        assertEquals(5,Main.test(text));
    }
    @Test
    public void test8() {
        String text = "1 1 1\n" +
                "2 3";
        assertEquals(0,Main.test(text));
    }
    @Test
    public void test9() {
        String text = "1 3 900\n" +
                "1 2\n" +
                "- 3\n" +
                "- 4";
        assertEquals(4,Main.test(text));
    }




}
