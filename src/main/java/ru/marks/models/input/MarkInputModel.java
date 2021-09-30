package ru.marks.models.input;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@AllArgsConstructor
@JsonAutoDetect
@Slf4j
@NoArgsConstructor
public class MarkInputModel {

    @JsonProperty("values")
    private List<MarkValue> markValues;

    @JsonProperty("weight")
    private String weight;
}
