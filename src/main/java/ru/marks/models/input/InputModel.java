package ru.marks.models.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
@Slf4j
public class InputModel {
    private List<SubjectInputModel> subjectInputModelList;
}
