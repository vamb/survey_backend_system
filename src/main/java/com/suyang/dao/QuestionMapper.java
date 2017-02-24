package com.suyang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.suyang.model.Question;

public interface QuestionMapper {
	
	public List<Question> getQuestionList();
	
	public Question getQustById(@Param("qustId")Long qustId);
}
