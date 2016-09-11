import model.Scenario;
import model.Story;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static utils.TestUtils.*;


public class ParserTest {

    @Test
    public void test1() {
        checkStory(getStory("test1.story"), "", Collection::isEmpty);
    }

    @Test
    public void test2() {
        final Story story = getStory("test2.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 1);

        checkScenario(story.getScenarios().iterator().next(), "scenario description");
    }

    @Test
    public void test3() {
        final Story story = getStory("test3.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 1);

        checkScenario(story.getScenarios().iterator().next(), "scenario description");
    }

    @Test
    public void test4() {
        final Story story = getStory("test4.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 1);

        checkScenario(story.getScenarios().iterator().next(), "scenario description");
    }

    @Test
    public void test5() {
        final Story story = getStory("test5.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test6() {
        final Story story = getStory("test6.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test7() {
        final Story story = getStory("test7.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test8() {
        final Story story = getStory("test8.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test9() {
        final Story story = getStory("test9.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test10() {
        final Story story = getStory("test10.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test11() {
        final Story story = getStory("test11.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2");
        checkScenario(itr.next(), "scenario description3");
        checkScenario(itr.next(), "scenario description4");
    }

    @Test
    public void test12() {
        final Story story = getStory("test12.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2", "CPV-1234");
        checkScenario(itr.next(), "scenario description3",
                "CPV-1234", "CPV-5678");
        checkScenario(itr.next(), "scenario description4", "CPV-1234");
    }

    @Test
    public void test13() {
        final Story story = getStory("test13.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2", "CPV-1234");
        checkScenario(itr.next(), "scenario description3",
                "CPV-1234", "CPV-5678", "CPV-9871");
        checkScenario(itr.next(), "scenario description4",
                "CPV-1234", "CPV-5678", "CPV-9871");
    }

    @Test
    public void test14() {
        final Story story = getStory("test14.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 2);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description2", "CPV-1234");
        checkScenario(itr.next(), "scenario description4",
                "CPV-1234", "CPV-5678", "CPV-9871");
    }

    @Test
    public void test15() {
        checkStory(getStory("test15.story"),
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                Collection::isEmpty);
    }

    @Test
    public void test16() {
        final Story story = getStory("test16.story");
        checkStory(story,
                "",
                s -> s.size() == 1);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description2", "CPV-1234");
    }

    @Test
    public void test17() {
        final Story story = getStory("test17.story");
        checkStory(story,
                "As a user\n" +
                        "I want to perform an action\n" +
                        "So that I can achieve a business goal",
                s -> s.size() == 4);

        final Iterator<Scenario> itr = story.getScenarios().iterator();
        checkScenario(itr.next(), "scenario description1");
        checkScenario(itr.next(), "scenario description2", "CPV-1234");
        checkScenario(itr.next(), "scenario description3",
                "CPV-1234", "CPV-5678", "CPV-9871");
        checkScenario(itr.next(), "scenario description4",
                "CPV-1234", "CPV-5678", "CPV-9871");
    }
}
