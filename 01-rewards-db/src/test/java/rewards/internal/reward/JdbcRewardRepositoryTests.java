package rewards.internal.reward;

import javax.sql.DataSource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests the JDBC reward repository with a test data source to test repository
 * behavior and verifies the Reward JDBC code is correct.
 */
class JdbcRewardRepositoryTests extends AbstractRewardRepositoryTests {

	@BeforeEach
	void setUp() {
		dataSource = createTestDataSource();
		rewardRepository = new JdbcRewardRepository(dataSource);
	}

	@Test
	@Override
	public void checkProfile() {
		assertTrue(
				rewardRepository instanceof JdbcRewardRepository, "JDBC expected");
	}

	private DataSource createTestDataSource() {
		return new EmbeddedDatabaseBuilder().setName("rewards")
				.addScript("/rewards/testdb/schema.sql")
				.addScript("/rewards/testdb/data.sql").build();
	}
}
