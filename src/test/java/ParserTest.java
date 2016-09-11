import generated.StoryParser;
import org.junit.Test;

import java.io.File;

/**
 * Created by ignattolstov on 07.09.16.
 */
public class ParserTest {

    @Test
    public void test1() {
        parse("test.story");
    }


    @Test
    public void test2() {
        parse("test2.story");
    }


    @Test
    public void test3() {
        parse("test3.story");
    }

    @Test
    public void test4() {
        parse("test4.story");
    }

    @Test
    public void test5() {
        parse("test5.story");
    }

    public void parse(final String filePath) {

        StoryParser.parse(
                new File(
                        getClass().getClassLoader().getResource(filePath).getFile()));

    }

}
