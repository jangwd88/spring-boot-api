package kr.co.everon.api.epit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.everon.api.epit.mapper.SampleMapper;
import kr.co.everon.api.epit.model.SampleModel;

@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    private SampleMapper sampleMapper;

    @Override
    public List<SampleModel> selectListSample() throws Exception {
        return sampleMapper.selectSampleList();
    }

    @Override
    public SampleModel selectOneSample() throws Exception {
        return sampleMapper.selectOneSample();
    }


    
}
