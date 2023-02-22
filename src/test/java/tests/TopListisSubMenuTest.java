package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.top_lists.TopRatedPage;

import java.util.List;

public class TopListisSubMenuTest extends BaseTest {

    @Test
    private void testMenuLinksText(){

        final String [] expectedListMenu = {"Top Rated", "Top Rated Real", "Top Rated Esoteric", "Top Rated Assembly",
        "Top Hits", "New Languages this month", "New Comments"};

        TopRatedPage topRatedPage = openBaseURL().clickTopListsMenu();
        List <String> actualListMenu = topRatedPage.getTextListSubMenuTopLists();

       for(int i = 0; i < actualListMenu.size(); i++){
           Assert.assertEquals(actualListMenu.get(i), expectedListMenu[i]);
       }
    }
}
