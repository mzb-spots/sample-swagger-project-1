package mzb.teamcity.plugin.sample.demo.controllers;


import mzb.teamcity.plugin.sample.demo.dao.RocketDao;
import mzb.teamcity.plugin.sample.demo.dto.RocketDto;
import mzb.teamcity.plugin.sample.demo.dto.RocketPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class RocketsController {

    @Autowired
    private RocketDao rocketDao;

    @GetMapping(name = "/api/rockets")
    public RocketPageDto getPage(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "pageSize", defaultValue = "5") int pageSize) {
        List<RocketDto> data = rocketDao.getData();
        int start = page * pageSize;
        int end = (page + 1) * pageSize;
        List<RocketDto> part = null;
        if (start >= 0 && start < end && start < data.size()) {
            part = data.subList(start, Math.min(data.size(), end));
        } else {
            part = Collections.emptyList();
        }
        return new RocketPageDto(data.size(), page, pageSize, part);
    }

}
