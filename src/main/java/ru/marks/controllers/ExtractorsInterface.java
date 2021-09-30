package ru.marks.controllers;

import lombok.extern.slf4j.Slf4j;
import ru.marks.converters.Converter;
import ru.marks.models.input.SubjectInputModel;
import ru.marks.models.output.SubjectOutputModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/extractor")
@ApplicationScoped
@Slf4j
public class ExtractorsInterface {

    @Inject
    Converter converter;

    @POST
    @Path("/marks")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SubjectOutputModel> extractMarks(
            List<SubjectInputModel> jsonMarks
    ){
        return converter.convertToOutputModel(jsonMarks);
    }


    @POST
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public SubjectInputModel test(
            SubjectInputModel subjectInputModel
    ){
//        var markValues = new HashMap<String, String>();
//        markValues.put("test","1");
//        var marks = new ArrayList<Map<String,String>>();
//        marks.add(markValues);
//        var period = new PeriodInputModel(marks);
//        var periods = new ArrayList<PeriodInputModel>();
//        periods.add(period);
//        var subjectInputModel = new SubjectInputModel(
//                "test",
//                periods,
//                "test",
//                "test"
//        );
        return subjectInputModel;
    }
}
