package kr.co.everon.api.epit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.everon.api.epit.model.SampleModel;

@Mapper
public interface SampleMapper {

    @Select("SELECT * FROM DUAL")
    List<SampleModel> selectSampleList() throws Exception;

    @Select("SELECT * FROM DUAL")
    SampleModel selectOneSample() throws Exception;
}
