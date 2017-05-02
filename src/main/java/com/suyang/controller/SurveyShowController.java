package com.suyang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suyang.bean.BeanSurvey;
import com.suyang.model.Survey;
import com.suyang.service.SurveyService;


@Controller
@RequestMapping("/surveyShow")
public class SurveyShowController {
	
	@Autowired
	public SurveyService surveyService;
	
	@RequestMapping(value = "/viewSurveyList")
	public String viewSurveyList(Model model){
		List<Survey> list = surveyService.getSurveysByMybatis();
		model.addAttribute("list",list);
		return "/page/survey/listSurveyPage";
	}
	
	@RequestMapping(value="/SurveyDetailPage")
	public String SurveyDetailPage(Model model, Survey survey){
		BeanSurvey beanSurvey = surveyService.getBeanSurveyById(survey.getId());
		model.addAttribute("beanSurvey", beanSurvey);
		return "/page/survey/SurveyDetailPage";
	}
}
