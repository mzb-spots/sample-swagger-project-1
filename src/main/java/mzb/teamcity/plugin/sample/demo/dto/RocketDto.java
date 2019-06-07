package mzb.teamcity.plugin.sample.demo.dto;


import lombok.Data;

@Data
public class RocketDto {
    private long id;
    private String name;
    private String country;
    private String wiki;
    private long inauguralLaunchDate;
}
