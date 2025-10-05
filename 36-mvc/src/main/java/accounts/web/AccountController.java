package accounts.web;

import accounts.AccountManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rewards.internal.account.Account;

import java.util.List;

/**
 * A Spring MVC REST Controller handling requests to retrieve Account information.
 *
 * Note that some of the Account related classes are imported from the
 * rewards-db project:
 *
 * -Domain objects: Account and Beneficiary
 * -Service layer: AccountManager interface
 * -Repository layer: AccountRepository interface
 *
 */
// TODO-03: Add an appropriate annotation to make this class a REST controller
@RestController
public class AccountController {

	private final AccountManager accountManager;

	/**
	 * Creates a new AccountController with a given account manager.
	 */
	public AccountController(AccountManager accountManager) {
		this.accountManager = accountManager;
	}

	/**
	 * Return a list of all accounts
	 */
	// TODO-04: Add an appropriate annotation to make this method handle "/accounts"
	@GetMapping("/accounts")
	public List<Account> accountList() {

		return accountManager.getAllAccounts();
	}

	@GetMapping("/accounts/{entityId}")
	public Account accountDetails(@PathVariable("entityId") Long entityId) {
		return accountManager.getAccount(entityId);
	}
}
