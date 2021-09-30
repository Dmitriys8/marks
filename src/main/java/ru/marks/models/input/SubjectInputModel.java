package ru.marks.models.input;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY,
        setterVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.ANY,
        creatorVisibility = JsonAutoDetect.Visibility.ANY
)
@Slf4j
public class SubjectInputModel {

    @JsonProperty("subject_name")
    private String subjectName;

    @JsonProperty("periods")
    private List<PeriodInputModel> periods;

    @JsonProperty("avg_five")
    private String avgFive;

    @JsonProperty("avg_hundred")
    private String avgHundred;

}
