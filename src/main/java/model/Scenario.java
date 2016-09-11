package model;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.NonNull;

import java.util.Collection;

public class Scenario {

    @Getter
    @NonNull
    private final String name;

    @Getter
    @NonNull
    private final Collection<String> relatedJiras;

    @Getter
    private final boolean isIgnored;

    public Scenario(@NonNull String name, @NonNull final Collection<String> relatedJiras, final boolean isIgnored) {
        this.name = CharMatcher.WHITESPACE.trimFrom(Preconditions.checkNotNull(name));
        this.relatedJiras = Preconditions.checkNotNull(relatedJiras);
        this.isIgnored = isIgnored;
    }
}
