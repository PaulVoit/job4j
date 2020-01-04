package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
	private Map<User, List<Account>> users = new HashMap<>();

	public void addUser(User user) {
		users.putIfAbsent(user, new ArrayList<Account>());
	}

	public void addAccount(String passport, Account account) {
		for (User user : users.keySet()) {
			if (user.getPassport().equals(passport)) {
				users.get(user).add(account);
			}
		}
	}

	public User findByPassport(String passport) {
		User result = null;
		for (User user : users.keySet()) {
			if (user.getPassport().equals(passport)) {
				result = user;
				break;
			}
		}
		return result;
	}

	public Account findByRequisite(String passport, String requisite) {
		Account account = null;
		for (User user : users.keySet()) {
			if (user.getPassport().equals(passport)) {
				for (Account acc : users.get(user)) {
					if (acc.getRequisite().equals(requisite)) {
						account = acc;
					}
				}
			}
		}
		return account;
	}


	public boolean transferMoney(String srcPassport, String srcRequisite,
	                             String destPassport, String dеstRequisite, double amount) {
		boolean rsl = false;
		Account srcAccount = findByRequisite(srcPassport, srcRequisite);
		Account destAccount = findByRequisite(destPassport, dеstRequisite);
		if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
			srcAccount.setBalance(srcAccount.getBalance() - amount);
			destAccount.setBalance(destAccount.getBalance() + amount);
			rsl = true;
		}
		return rsl;
	}
}
