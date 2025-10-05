package common.datetime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleDateEditorTests {

	private final SimpleDateEditor editor = new SimpleDateEditor();

	@Test
	void getAsText() {
		SimpleDate date = new SimpleDate(12, 29, 1977);
		editor.setValue(date);
		assertEquals("December 29, 1977", editor.getAsText());
	}

	@Test
	void setAsText() {
		editor.setAsText("December 29, 1977");
		SimpleDate date = (SimpleDate) editor.getValue();
		assertEquals(new SimpleDate(12, 29, 1977), date);
	}

	@Test
	void setAsTextBogus() {
		assertThrows(IllegalArgumentException.class, () ->
			editor.setAsText("December 29th, 1977"));
	}
}
