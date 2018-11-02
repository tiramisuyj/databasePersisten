package yj.com.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import yj.com.dao.AccountMapper;
import yj.com.entity.Account;

/** 
* @author yj 
* @date 2018-11-01 
*/
@Controller
public class IndexController {
	
	@Autowired
	private AccountMapper accountMapper;

	@Transactional
	@RequestMapping("/")
	public String index() {
		Account account = new Account();
		account.setAccountId(new Date().toString());
		account.setName("a");
		accountMapper.insert(account);
//		Account account = accountMapper.findByAccountId("1");
		return "/index";
	}
}
