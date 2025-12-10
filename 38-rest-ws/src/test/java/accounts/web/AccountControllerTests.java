package accounts.web;

import accounts.internal.StubAccountManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rewards.internal.account.Account;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * A JUnit test case testing the AccountController. 
 */
class AccountControllerTests {

	private AccountController controller;

	@BeforeEach
	void setUp() {
		controller = new AccountController(new StubAccountManager());
	}

	@Test
	void handleDetailsRequest() {
		Account account = controller.accountDetails(0); 
		assertNotNull(account);
		assertEquals(Long.valueOf(0), account.getEntityId());
	}

	@Test
	void handleSummaryRequest() {
		List<Account> accounts = controller.accountSummary();
		assertNotNull(accounts);
		assertEquals(1, accounts.size());
		assertEquals(Long.valueOf(0), accounts.get(0).getEntityId());
	}
	
}
