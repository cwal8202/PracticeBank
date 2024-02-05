package com.practice.bank.repository;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
  * @FileName : Account.java
  * @Project : practiceBank
  * @Date : 2024. 2. 4. 
  * @작성자 : 최장호
  * @변경이력 :
  * @프로그램 설명 : account_tb를 모델링한 Account entity
  */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
	
	private Integer id; 
	private String number; 
	private String password; 
	private Long balance; 
	private Integer userId;
	private Timestamp createdAt; 
	
	// 출금 기능 
	// 입금 기능 
	// 패스워드 체크 
	// 잔액 여부 확인 기능 
	// 계좌 소유자 확인 기능 
	
}
	