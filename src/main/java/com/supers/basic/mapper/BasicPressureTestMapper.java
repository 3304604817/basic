package com.supers.basic.mapper;

import com.supers.basic.domain.entity.BasicPressureTest;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface BasicPressureTestMapper extends Mapper<BasicPressureTest> {
}
