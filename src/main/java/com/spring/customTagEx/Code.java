/**
 * 
 */
package com.spring.customTagEx;

/**
 * @CLASS Name
 *  Code
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
public class Code {

	private String code;
	private String label;
	
	public Code() {
		
	}//기본생성자
	
	public Code(String code, String value) {
		this.code = code;
		this.label = value;
	}
	
	//[region] getter, setter
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	//[end]
	
}
