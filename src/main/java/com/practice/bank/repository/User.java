package com.practice.bank.repository;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
  * @FileName : User.java
  * @Project : practiceBank
  * @Date : 2024. 2. 4. 
  * @작성자 : 최장호
  * @변경이력 :
  * @프로그램 설명 : user_tb를 모델링 한 User entity.
  */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
	private Integer id; 
	private String username; 
	private String password; 
	private String fullname; 
	private Timestamp createdAt;
	
}