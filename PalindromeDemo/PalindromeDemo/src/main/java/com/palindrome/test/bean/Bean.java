package com.palindrome.test.bean;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bean {

	@Id
	private String id;
	@ApiModelProperty(required = true)
	private String value;
}
