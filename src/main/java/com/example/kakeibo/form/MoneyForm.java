package com.example.kakeibo.form;

import java.util.List;

import com.example.kakeibo.dto.CategoryDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MoneyForm {

	/* 品目名 */
	@Getter
	@Setter
	private String ItemName;
	
	/* カテゴリDTO */
	@Getter
	@Setter
	private List<CategoryDto> dto;
	
	/* 金額 */
	@Getter
	@Setter
	private String money;
	
	/* メモ */
	@Getter
	@Setter
	private String memo;

	/* 日付 */
	@Getter
	@Setter
	private String date;
	
	/* 店名 */
	@Getter
	@Setter
	private String storeName;
	
	
	
	
	
}
