package ru.job4j.array;

        import org.junit.Test;

        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.*;

public class TaskLoopForBoard14Test {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        TaskLoopForBoard14.main(null);
        String ln = System.lineSeparator();
        String expected = "2" + ln + "3" + ln + "6" + ln + "7" + ln;
        assertThat(out.toString(), is(expected));
    }
}