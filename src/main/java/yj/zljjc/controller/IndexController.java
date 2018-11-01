package yj.zljjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author yj 
* @date 2018-11-01 
*/
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "/index";
	}
}
