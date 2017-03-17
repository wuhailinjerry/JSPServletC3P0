package net.smartbetter.jspservletc3p0.entity;

/**
 * 用户信息实体类
 * Created by gc on 17/1/6.
 */
public class User {

	public User() {
	}

	/*
	 * 自增ID
	 */
	private int id;
	/*
	 * 登录账号
	 */
	private String user_id;
	/*
	 * 登录密码(MD5加密)
	 */
	private String user_pass;
	/*
	 * 真实姓名
	 */
	private String user_name;
	/*
	 * 联系电话
	 */
	private String user_telephone;
	/*
	 * 出生日期
	 */
	private String user_birthday;
	/*
	 * 密保答案
	 */
	private String user_answer;
	/*
	 * 密保问题
	 */
	private int user_faq;
	/*
	 * 所在城市
	 */
	private String user_city;
	/*
	 * 创建人
	 */
	private String user_creator;
	/*
	 * 创建时间（时间戳格式）
	 */
	private long created_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_telephone() {
		return user_telephone;
	}

	public void setUser_telephone(String user_telephone) {
		this.user_telephone = user_telephone;
	}

	public String getUser_birthday() {
		return user_birthday;
	}

	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}

	public String getUser_answer() {
		return user_answer;
	}

	public void setUser_answer(String user_answer) {
		this.user_answer = user_answer;
	}

	public int getUser_faq() {
		return user_faq;
	}

	public void setUser_faq(int user_faq) {
		this.user_faq = user_faq;
	}

	public String getUser_city() {
		return user_city;
	}

	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}

	public String getUser_creator() {
		return user_creator;
	}

	public void setUser_creator(String user_creator) {
		this.user_creator = user_creator;
	}

	public long getCreated_time() {
		return created_time;
	}

	public void setCreated_time(long created_time) {
		this.created_time = created_time;
	}

}
