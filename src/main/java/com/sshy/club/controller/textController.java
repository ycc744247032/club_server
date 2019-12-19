package com.sshy.club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.sshy.club.entity.RYTreasure.AndroidManager;
import com.sshy.club.entity.RYTreasure.GameColumnItem;
import com.sshy.club.serviceRYTreasure.AndroidManagerService;
import com.sshy.club.serviceRYTreasure.GameColumnItemService;

	


@RestController
public class textController  {
		
	@Autowired
	AndroidManagerService androidManagerService;
	
	@Autowired
	GameColumnItemService IGameColumnItemService;

	
	@RequestMapping(value = "/text2")
	public String text2() {
//		EntityWrapper<AndroidManager> code = new EntityWrapper<>();
//		code.eq("UserID", 1);
//		AndroidManager list=androidManagerService.selectOne(code);
//		 System.out.println(list);
	
		GameColumnItem co=IGameColumnItemService.getById(1);
		
		
		//AndroidManager amd=androidManagerService.getById(1);
		return JSON.toJSONString(co);
//		EntityWrapper<AndroidManager> code = new EntityWrapper<>();
//		code.eq("UserID", 1);
//		 AndroidManager anager1=androidManagerService.selectOne(code);
//		 System.out.println(anager1);
		 
		
	}

	@RequestMapping(value = "/text1")
	public String text1() {

		
		AndroidManager amd=androidManagerService.getById(1);
		return JSON.toJSONString(amd);

		 
		
	}
	
	
	
}
