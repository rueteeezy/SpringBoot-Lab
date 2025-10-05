package rewards.internal.restaurant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import config.AppConfig;
import config.DbConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration test for the JPA-based restaurant repository implementation.
 * Verifies that the JpaRestaurantRepository works with its underlying
 * components and that Spring is configuring things properly.
 */
@ActiveProfiles("jpa")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class, DbConfig.class})
class JpaRestaurantRepositoryIntegrationTests extends AbstractRestaurantRepositoryTests {

    @Test
    @Override
    public void checkProfile() {
        assertEquals(JpaRestaurantRepository.INFO, restaurantRepository.getInfo(), "JPA expected but found " + restaurantRepository.getInfo());
    }

}
