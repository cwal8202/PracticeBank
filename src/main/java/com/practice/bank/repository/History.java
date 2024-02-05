package com.practice.bank.repository;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
  * @FileName : History.java
  * @Project : practiceBank
  * @Date : 2024. 2. 4. 
  * @작성자 : 최장호
  * @변경이력 :
  * @프로그램 설명 : history_tb를 모델링한 history entity
  */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class History {
	private Integer id; 
	private Long amount; 
	private Integer wAccountId; 
	private Integer dAccountId; 
	private Long wBalance; 
	private Long dBalance;
	private Timestamp createdAt;
	
}