public class APIResponseParser {

	/**
	 * Parses the input text and returns a Book instance containing the parsed data.
	 * 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
	public static Book parse(String response) {
		Book book = new Book();

		String titleStartRule = "<title>";
		String title = parse(response, titleStartRule);
		book.setTitle(title);

		String authorStartRule = "<name>";
		String author = parse(response, authorStartRule);
		book.setAuthor(author);

		String publicationYearRule = "<original_publication_year type=\"integer\">";
		String pubYear = parse(response, publicationYearRule);
		int publicationYear = Integer.parseInt(pubYear);
		book.setPublicationYear(publicationYear);

		String averageRatingRule = "<average_rating>";
		String avgRating = parse(response, averageRatingRule);
		double averageRating = Double.parseDouble(avgRating);
		book.setAverageRating(averageRating);

		String ratingCountRule = "<ratings_count type=\"integer\">";
		String ratingCount = parse(response, ratingCountRule);
		String[] ratingArray = ratingCount.split(",");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ratingArray.length; i++) {

			sb.append(ratingArray[i]);

		}
		int count = Integer.parseInt(sb.toString());
		book.setRatingsCount(count);

		String imageUrlRule = "<image_url>";
		String imageUrl = parse(response, imageUrlRule);
		book.setImageUrl(imageUrl);

		// Your code
		return book;
	}

	public static String parse(String response, String startRule) {

		int startIndex = response.lastIndexOf(startRule);
		startIndex += startRule.length();
		int endIndex = response.indexOf('<', startIndex);
		String value = response.substring(startIndex, endIndex);
		return value;
	}

	public static void main(String[] args) {
		String response = "<work>" + "<id type=\"integer\">2361393</id>"
				+ "<books_count type=\"integer\">813</books_count>"
				+ "<ratings_count type=\"integer\">1,16,315</ratings_count>"
				+ "<text_reviews_count type=\"integer\">3439</text_reviews_count>"
				+ "<original_publication_year type=\"integer\">1854</original_publication_year>"
				+ "<original_publication_month type=\"integer\" nil=\"true\"/>"
				+ "<original_publication_day type=\"integer\" nil=\"true\"/>" + "<average_rating>3.79</average_rating>"
				+ "<best_book type=\"Book\">" + "<id type=\"integer\">16902</id>" + "<title>Walden</title>" + "<author>"
				+ "<id type=\"integer\">10264</id>" + "<name>Henry David Thoreau</name>" + "</author>" + "<image_url>"
				+ "http://images.gr-assets.com/books/1465675526m/16902.jpg" + "</image_url>" + "<small_image_url>"
				+ "http://images.gr-assets.com/books/1465675526s/16902.jpg" + "</small_image_url>" + "</best_book>"
				+ "</work>";

		APIResponseParser.parse(response);
	}
}