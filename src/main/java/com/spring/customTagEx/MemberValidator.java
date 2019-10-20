/**
 * 
 */
package com.spring.customTagEx;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @CLASS Name
 *  MemberValidator
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
public class MemberValidator implements Validator{
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required", "필수 입력사항 입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required", "필수 입력사항 입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.address1", "required", "필수 입력사항 입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.address2", "required", "필수 입력사항 입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required", "필수 입력사항 입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "job", "required", "???");
		
		Member member = (Member) target;
		if(member.getHobbys() == null || member.getHobbys().length == 0) {
			errors.rejectValue("hobbys", "select");
		}
	}//validate()
	
	@Override
	public boolean supports(Class<?> claszz) {
		return Member.class.isAssignableFrom(claszz);
	}
	
}
