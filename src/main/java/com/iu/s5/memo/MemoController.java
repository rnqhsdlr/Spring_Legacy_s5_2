package com.iu.s5.memo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memo/**")
public class MemoController {
	
	@GetMapping("memoList")
	public void memoList() throws Exception{
		
	}
}
