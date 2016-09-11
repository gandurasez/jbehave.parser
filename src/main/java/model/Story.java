package model;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.NonNull;

import java.util.Collection;


public class Story {

    @Getter
    @NonNull
    private final String name;

    @Getter
    @NonNull
    private final Collection<Scenario> scenarios;

    public Story(@NonNull String name, @NonNull Collection<Scenario> scenarios) {
        this.name = CharMatcher.WHITESPACE.trimFrom(Preconditions.checkNotNull(name));
        this.scenarios = Preconditions.checkNotNull(scenarios);
    }
}
