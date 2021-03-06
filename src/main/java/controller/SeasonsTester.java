package controller;

import java.time.LocalDate;
import java.util.List;

import model.Season;

public class SeasonsTester {
	public static void main(String[] args) {
		LocalDate testDate = LocalDate.parse("2021-03-20");
		LocalDateAttributeConverter convert = new LocalDateAttributeConverter();
		Season spring = new Season("Spring", convert.convertToDatabaseColumn(testDate));
		SeasonHelper sh = new SeasonHelper();
		sh.insertSeason(spring);
		List<Season> allSeasons = sh.showAllSeasons();
		for(Season a: allSeasons) {
			System.out.println(a.toString());
		}
	}
}