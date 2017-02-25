package com.suyang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suyang.model.Survey;
import com.suyang.service.SurveyService;


@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	public SurveyService surveyService;
	
	@RequestMapping(value = "/listSurveys")
	public String listSurveys(Model model){
		List<Survey> list = surveyService.getSurveysByMybatis();
		model.addAttribute("list",list);
		return "/page/survey/listSurveys";
	}
	
	@RequestMapping(value = "/saveSurvey")
	public String editArticle(Model model, Survey survey){
		if(survey!=null && !StringUtils.isEmpty(survey.getId())){
//			survey = surveyService.getSurveyById(survey.getId());
//			model.addAttribute("article", article);
			surveyService.updateSurvey(survey);
		}else{
			surveyService.insertSurvey(survey);
		}
		return "/page/survey/listSurveys";
	}
	
	@RequestMapping(value = "/newSurvey")
	public String newSurvey(Model model){
		return "/page/survey/newSurvey";
	}
//	
//	@RequestMapping(value = "/delete")
//	public String deleteArticle(Model model, Article article){
//		articleService.deleteArticle(article.getId());
//		List<Article> list = articleService.getAtriclesByMybatis();
//		model.addAttribute("list",list);
//		return "/page/article/listArticles";
//	}
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder("testString");
	}
}
