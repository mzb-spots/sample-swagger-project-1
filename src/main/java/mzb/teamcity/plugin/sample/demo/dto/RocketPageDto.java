package mzb.teamcity.plugin.sample.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RocketPageDto {
    private int totalElements;
    private int page;
    private int pageSize;
    private List<RocketDto> content;
}
