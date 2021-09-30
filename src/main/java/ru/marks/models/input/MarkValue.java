package ru.marks.models.input;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@JsonAutoDetect
@Slf4j
@NoArgsConstructor
public class MarkValue {

    @JsonProperty("original")
    private String markValue;
}
