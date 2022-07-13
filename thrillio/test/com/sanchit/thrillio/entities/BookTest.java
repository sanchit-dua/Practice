package com.sanchit.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sanchit.thrillio.constants.BookGenre;
import com.sanchit.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// Test 1 - Book Genre is Philosophy
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", "", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);

		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertFalse("For Philosophy genre, isKidFriendlyEligible() should be false", isKidFriendlyEligible);

		// Test 2 - Book Genre is Self Help
		book = BookmarkManager.getInstance().createBook(4000, "Walden", "", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);

		isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertFalse("For Self Help genre, isKidFriendlyEligible() should be false", isKidFriendlyEligible);

	}

}
