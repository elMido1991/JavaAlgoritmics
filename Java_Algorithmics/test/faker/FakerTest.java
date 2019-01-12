package faker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;


class FakerTest {

	@Test
	public void shouldEmbedRandomElementsInText() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.bothify("Test?#");

		// then
		assert result.matches("Test[a-z][0-9]");
	}

	@Test
	public void letterifyWithEmptyString() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.letterify("");

		// then
		assert result.matches("");
	}

	@Test
	public void letterifyWithNull() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.letterify(null);

		// then
		boolean nullOrEmpty = result == null || "".equals(result);
		assertTrue(nullOrEmpty);
	}

	@Test
	public void numerifyWithEmptyString() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.numerify("");

		// then
		assert result.matches("");
	}

	@Test
	public void numerifyWithNull() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.numerify(null);

		// then
		boolean nullOrEmpty = result == null || "".equals(result);
		assertTrue(nullOrEmpty);
	}

	@Test
	public void shouldCreateRandomText() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.letterify("???");

		// then
		assert result.matches("[a-z][a-z][a-z]");
	}

	@Test
	public void shouldEmbedRandomLetterInText() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.letterify("Test?");

		// then
		assert result.matches("Test[a-z]");
	}

	@Test
	public void shouldCreateRandomNumber() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.numerify("###");

		// then
		assert result.matches("[0-9][0-9][0-9]");
	}

	@Test
	public void shouldEmbedRandomNumberInText() {
		// given
		Faker faker = new Faker();

		// when
		String result = faker.numerify("Test#");

		// then
		assert result.matches("Test[0-9]");
	}

	private static final int TRIES = 5;

	@Test
	public void letterifyRandomness() {
		// given
		Faker faker = new Faker();

		// when
		Set<String> results = new HashSet<String>();
		for (int i = 0; i < TRIES; i++) {
			results.add(faker.letterify("???"));
		}

		// then
		assert results.size()==(TRIES);
	}

	@Test
	public void numerifyRandomness() {
		// given
		Faker faker = new Faker();

		// when
		Set<String> results = new HashSet<String>();
		for (int i = 0; i < TRIES; i++) {
			results.add(faker.numerify("###"));
		}

		// then
		assert results.size()==(TRIES);
	}

	@Test
	public void botifyRandomness() {
		// given
		Faker faker = new Faker();

		// when
		Set<String> results = new HashSet<String>();
		for (int i = 0; i < TRIES; i++) {
			results.add(faker.bothify("##??"));
		}

		// then
		assert results.size()==(TRIES);
	}

}
