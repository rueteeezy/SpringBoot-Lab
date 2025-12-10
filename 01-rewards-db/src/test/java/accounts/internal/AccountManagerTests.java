package accounts.internal;

import org.junit.jupiter.api.Test;

public class AccountManagerTests extends AbstractAccountManagerTests {

	public AccountManagerTests() {
		accountManager = new StubAccountManager();
	}

	@Override
	@Test
	public void checkProfile() {
	}

	@Override
	protected int getNumAccountsExpected() {
		return StubAccountManager.NUM_ACCOUNTS_IN_STUB;
	}

	@Override
	protected void showStatus() {
	}

}
