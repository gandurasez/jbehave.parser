package utils;

import generated.StoryParser;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import model.Scenario;
import model.Story;
import org.junit.Assert;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

@UtilityClass
public class TestUtils {

    @NonNull
    public static Story getStory(@NonNull final String filePath) {
        final Optional<Story> optional =
                Optional.ofNullable(TestUtils.class.getClassLoader().getResource(filePath))
                        .map(URL::getFile)
                        .map(File::new)
                        .map(StoryParser::parse);

        Assert.assertTrue(optional.isPresent());

        return optional.get();
    }

    public static void checkStory(@NonNull final Story story,
                                  @NonNull String name,
                                  @NonNull final Predicate<Collection<Scenario>> checkScenarios) {
        Assert.assertEquals(name, story.getName());

        Assert.assertTrue(checkScenarios.test(story.getScenarios()));
    }

    public static void checkScenario(@NonNull final Scenario scenario,
                                     @NonNull String name,
                                     final String... relatedJiras) {
        Assert.assertEquals(name, scenario.getName());

        if (relatedJiras != null)
            Assert.assertArrayEquals(relatedJiras, scenario.getRelatedJiras().toArray());

        else
            Assert.assertTrue(scenario.getRelatedJiras().isEmpty());
    }
}
