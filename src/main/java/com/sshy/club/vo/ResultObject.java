package com.sshy.club.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class ResultObject {

	/**
	 * 返回状态	0为失败	1为成功
	 */
	private Integer state;

	/**
	 * 返回消息
	 */
	private String msg;

	/**
	 * 返回数据
	 */
	private Object data;

	/**
	 * 异常信息
	 */
	private Throwable e;


	/**
	 * 
	 * @param data	返回数据
	 */
	public ResultObject( Object data) {
		this.state = 1;
		this.data = data;
	}

	/**
	 * 
	 * @param data	返回数据
	 * @param msg	返回消息
	 */
	public ResultObject( Object data,String msg) {
		this.state = 1;
		this.msg = msg;
		this.data = data;
	}	

	/**
	 * 
	 * @param e 异常返回
	 */
	public ResultObject(Throwable e) {
		this.state = 0;
		this.msg =e.getMessage();
	}











}
