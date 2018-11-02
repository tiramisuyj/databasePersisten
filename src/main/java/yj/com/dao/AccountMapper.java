package yj.com.dao;

import yj.com.entity.Account;

/** 
* @author yj 
* @date 2018-11-01 
*/
public interface AccountMapper {
	
	void insert(Account account);
	void update(Account account);
	void deleteByAccountId(String accountId);
	Account findByAccountId(String accountId);
}
