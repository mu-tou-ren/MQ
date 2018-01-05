package com.example.mq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 *
 * @author Li Zhenbang
 * @date 创建时间：2018年1月2日 上午11:31:50
 * @version 1.0
 */
@Controller
public class TestController {

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		return "Hello World";
	}
}
