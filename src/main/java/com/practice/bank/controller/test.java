/**
 * 
 */
package com.practice.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @FileName : test.java
 * @Project : practiceBank
 * @Date : 2024. 2. 5.
 * @작성자 : 최장호
 * @변경이력 :
 * @프로그램 설명 :
 */
@Controller
@RequestMapping("test/")
public class test {
	@GetMapping("test")
	public String a() {
		return "layout/main";
	}
}
