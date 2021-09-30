package ru.marks.models.output;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@JsonAutoDetect
@Builder(toBuilder = true)
public class SubjectOutputModel {

    private String subjectName;

    private List<String> marks;
}
