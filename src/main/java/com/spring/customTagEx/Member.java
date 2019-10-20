/**
 * 
 */
package com.spring.customTagEx;

/**
 * @CLASS Name
 *  Member
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
public class Member {

	private String id;
	private String name;
	private String email;
	private Address address;
	
	private String[] hobbys;
	private String job;
	private String[] gender;
	private String etc;
	private boolean contractAgreement;
	
	//[region] getter, setter
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the etc
	 */
	public String getEtc() {
		return etc;
	}
	/**
	 * @param etc the etc to set
	 */
	public void setEtc(String etc) {
		this.etc = etc;
	}
	/**
	 * @return the contractAgreement
	 */
	public boolean isContractAgreement() {
		return contractAgreement;
	}
	/**
	 * @param contractAgreement the contractAgreement to set
	 */
	public void setContractAgreement(boolean contractAgreement) {
		this.contractAgreement = contractAgreement;
	}
	/**
	 * @return the hobbys
	 */
	public String[] getHobbys() {
		return hobbys;
	}
	/**
	 * @param hobbys the hobbys to set
	 */
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	/**
	 * @return the gender
	 */
	public String[] getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String[] gender) {
		this.gender = gender;
	}
	//[end]
	
}
