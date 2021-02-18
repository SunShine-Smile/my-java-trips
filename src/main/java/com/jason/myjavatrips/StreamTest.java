package com.jason.myjavatrips;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

	class Test1{
		public int age;
		public String name;
	}

	static class Artists{
		public String name;
		public String isFrom;
	}
	
	public static void main(String[] args) {
		Map<String, Test1> map = new HashMap<>();
		List<Artists> allArtists = new ArrayList<>();
		Artists artists = new Artists();
		artists.name = "John Lennon";
		artists.isFrom = "London";
		allArtists.add(artists);
		Artists artists1 = new Artists();
		artists1.name = "Paul McCartney";
		allArtists.add(artists1);
		Artists artists2 = new Artists();
		artists2.name = "George Harrison";
		allArtists.add(artists2);
		Artists artists3 = new Artists();
		artists3.name = "Ringo Starr";
		allArtists.add(artists3);
		allArtists.stream()
				.filter(artist -> {
					System.out.println(artist.name);
					return artist.isFrom =="London";
				});

		long count = allArtists.stream()
				.filter(artist -> {
					System.out.println(artist.name);
					return artist.isFrom =="London";
				})
				.count();
	}
}
