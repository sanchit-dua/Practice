package com.sanchit.thrillio.entities;

import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

import com.sanchit.thrillio.constants.MovieGenre;
import com.sanchit.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		// Test 1 - Movie is of Horror Genre
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles,Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR, 8.5);

		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();

		assertFalse("for Horror movie, isKidFriendlyEligible() should return false", isKidFriendlyEligible);

		// Test 2 - Movie is of Thriller Genre
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles,Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);

		isKidFriendlyEligible = movie.isKidFriendlyEligible();

		assertFalse("for Thriller movie, isKidFriendlyEligible() should return false", isKidFriendlyEligible);
	}

}
