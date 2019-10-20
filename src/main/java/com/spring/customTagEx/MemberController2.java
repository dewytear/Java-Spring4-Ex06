/**
 * 
 */
package com.spring.customTagEx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @CLASS Name
 *  MemberController
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-20
 * @PROJECT    : Java-Spring4-Ex06
 * @PACKAGE    : com.spring.customTagEx
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 **/
@Controller
@RequestMapping("/member")
public class MemberController2 {
	private String viewName = "joinForm";
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(Model model) {
		refData(model);
		return viewName;
	}
	
	private void refData(Model model) {
		List<Code> jCodes = new ArrayList<Code>();
		jCodes.add(new Code("001", "프로그래머"));
		jCodes.add(new Code("002", "디자이너"));
		jCodes.add(new Code("003", "영업사원"));
		jCodes.add(new Code("004", "기획자"));
		
		String[] hobbyNames = {"독서", "여행", "스포츠", "영화감상", "등산", "낚시"};
		String[] mw = {"남성", "여성"};
		
		model.addAttribute("jobCodes", jCodes);
		model.addAttribute("hobbyNames", hobbyNames);
		model.addAttribute("mw", mw);
	}
	
	@ModelAttribute
	protected Object formBack() throws Exception{
		return new Member();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute Member member, BindingResult result, Model model) {
		new MemberValidator().validate(member, result);
		if(result.hasErrors()) {
			refData(model);
			return viewName;
		}
		return "memberOK";
	}
}
