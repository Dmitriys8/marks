package ru.marks.converters;

import ru.marks.models.input.SubjectInputModel;
import ru.marks.models.output.SubjectOutputModel;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class Converter {

    public static SubjectOutputModel convertToOutputModel(final SubjectInputModel subjectInputModel){
        List<String> outputMarks = new ArrayList<>();
        var periodInputModels = subjectInputModel.getPeriods();
        for (var periodInputModel : periodInputModels) {
            var marks = periodInputModel.getMarks();
            for (var mark : marks) {
                var markValues = mark.getMarkValues();
                for (var markValue : markValues) {
                    outputMarks.add(markValue.getMarkValue());
                }
            }
        }
        return SubjectOutputModel.builder()
                                 .subjectName(subjectInputModel.getSubjectName())
                                 .marks(outputMarks)
                                 .build();
    }

    public List<SubjectOutputModel> convertToOutputModel(final List<SubjectInputModel> subjectInputModels){
        return subjectInputModels.stream()
                          .map(Converter::convertToOutputModel)
                          .collect(Collectors.toList());
    }
}
