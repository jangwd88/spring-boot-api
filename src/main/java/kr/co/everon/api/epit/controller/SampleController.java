package kr.co.everon.api.epit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kr.co.everon.api.epit.model.SampleModel;
import kr.co.everon.api.epit.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController {

    // @Autowired
    private SampleService sampleService;

    @RequestMapping(value="/getListSample", method=RequestMethod.GET)
    @ResponseStatus(value=HttpStatus.OK)
    public String getListSample() throws Exception {

        List<SampleModel> list = sampleService.selectListSample();
        
        return list.toString();
    }

    @RequestMapping(value="/getOneSample", method=RequestMethod.GET)
    @ResponseStatus(value=HttpStatus.OK)
    public String getOneSample() throws Exception {

        SampleModel map = sampleService.selectOneSample();
        
        return map.toString();
    }
}