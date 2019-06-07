package mzb.teamcity.plugin.sample.demo.dao;


import mzb.teamcity.plugin.sample.demo.dto.RocketDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Service
public class RocketDao {

    private List<RocketDto> data = com.google.common.collect.Lists.newArrayList(
            new RocketDto()
                    .setId(1)
                    .setCountry("USA")
                    .setInauguralLaunchDate(LocalDateTime.of(1960, 7, 29, 1, 1, 0).toInstant(ZoneOffset.UTC).toEpochMilli())
                    .setName("Atlas LV-3B")
                    .setWiki("https://en.wikipedia.org/wiki/Atlas_LV-3B")
    );

    public List<RocketDto> getData() {
        return data;
    }
}
