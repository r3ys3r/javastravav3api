package test.api.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import stravajava.api.v3.model.StravaSegmentLeaderboard;

/**
 * @author dshannon
 *
 */
public class SegmentLeaderboardTest {

	@Test
	public void test() {
		new BeanTester().testBean(StravaSegmentLeaderboard.class);
	}

	@Test
	public void testEqualsMethod() {
		EqualsVerifier.forClass(StravaSegmentLeaderboard.class).suppress(Warning.STRICT_INHERITANCE,Warning.NONFINAL_FIELDS).verify();
	}
}
