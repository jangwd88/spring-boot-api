package kr.co.everon.api.epit.service;

import java.util.List;
import kr.co.everon.api.epit.model.SampleModel;

public interface SampleService {
    List<SampleModel> selectListSample() throws Exception;
    SampleModel selectOneSample() throws Exception;
}
