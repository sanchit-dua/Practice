package com.sanchit.thrillio.dao;

import com.sanchit.thrillio.DataStore;
import com.sanchit.thrillio.entities.Bookmark;
import com.sanchit.thrillio.entities.UserBookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);

	}

}
