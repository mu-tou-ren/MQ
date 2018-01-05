package com.example.mq.controller;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 *
 * @author Li Zhenbang
 * @date 创建时间：2018年1月4日 下午3:57:30
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println((char)('0' + ThreadLocalRandom.current().nextInt(10)));
		}
		
	}
}
