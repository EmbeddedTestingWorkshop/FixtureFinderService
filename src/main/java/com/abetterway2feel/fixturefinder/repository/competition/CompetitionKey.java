package com.abetterway2feel.fixturefinder.repository.competition;

import com.abetterway2feel.fixturefinder.domain.Location;
import lombok.Value;

@Value
public class CompetitionKey {

    private Location location;

    private String tag;

}
