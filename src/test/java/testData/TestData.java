package testData;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "MainTestData")
    public static Object[][] mainDataProvider() {

        //все физические страницы сайта

        return new Object[][]{
                {0, "Start", "/", "https://www.99-bottles-of-beer.net/", "99 Bottles of Beer | Start"},
                {1, "Browse Languages", "/abc.html", "https://www.99-bottles-of-beer.net/abc.html", "99 Bottles of Beer | Browse category A"},
                {2, "Search Languages", "/search.html", "https://www.99-bottles-of-beer.net/search.html", "99 Bottles of Beer | Search Languages"},
                {3, "Top Lists", "/toplist.html", "https://www.99-bottles-of-beer.net/toplist.html", "99 Bottles of Beer | Top Rated"},
                {4, "Guestbook", "/guestbookv2.html", "https://www.99-bottles-of-beer.net/guestbookv2.html", "99 Bottles of Beer | Guestbook"},
                {5, "Submit new Language", "/submitnewlanguage.html", "https://www.99-bottles-of-beer.net/submitnewlanguage.html", "99 Bottles of Beer | Submit new Language"}
        };
    }

    @DataProvider(name = "StartSubMenuData")
    public static Object[][] startSumMenuDataProvider() {

        //все физические страницы сайта

        return new Object[][]{
                {0, "Team", "/team.html", "https://www.99-bottles-of-beer.net/team.html", "99 Bottles of Beer | The Team"},
                {1, "Song Lyrics", "/lyrics.html", "https://www.99-bottles-of-beer.net/lyrics.html", "99 Bottles of Beer | The lyrics to the song 99 Bottles of Beer"},
                {2, "History", "/info.html", "https://www.99-bottles-of-beer.net/info.html", "99 Bottles of Beer | Background and historic information"},
                {3, "Privacy", "/impressum.html", "https://www.99-bottles-of-beer.net/impressum.html", "99 Bottles of Beer | Impressum"},

        };
    }
}
