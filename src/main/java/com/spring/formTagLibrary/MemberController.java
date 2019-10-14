/**
 * 
 */
package com.spring.formTagLibrary;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @CLASS Name
 *  MemberController
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-14
 * @PROJECT    : Java-Spring4-Ex06
 * @PACKAGE    : com.spring.formTagLibrary
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 **/
@Controller
public class MemberController {

	@RequestMapping("/memInput")
	public ModelAndView showMemInfo() {
		
		//command 라는 user객체를 만들어 form ID로 사용했다.
		return new ModelAndView("memberInput", "command", new User());
		
	}
	
	@RequestMapping("/addMember")
	public String addMember(@ModelAttribute User user, BindingResult result) {
		
		System.out.println("이름: " + user.getName());
		System.out.println("아이디: " + user.getId());
		System.out.println("이메일: " + user.getEmail());
		System.out.println("전화번호: " + user.getHp());
		
		return "redirect:memInput";
	}
	
}
