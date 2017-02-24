package com.suyang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.suyang.model.Option;

public interface OptionMapper {
	
	public List<Option> getOptionList();
	
	public Option getOptnById (@Param("optnId")Long optnId);
	
}
