package net.smartbetter.jspservletc3p0.entity;

/**
 * 系统设置信息实体类
 * Created by gc on 17/1/6.
 */
public class Sys {

	public Sys() {
	}

	/*
	 * 最小人数
	 */
	private int user_min;
	/*
	 * 最大人数
	 */
	private int user_max;

	public int getUser_min() {
		return user_min;
	}

	public void setUser_min(int user_min) {
		this.user_min = user_min;
	}

	public int getUser_max() {
		return user_max;
	}

	public void setUser_max(int user_max) {
		this.user_max = user_max;
	}

}
