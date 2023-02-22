package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TopRatedPageTest extends BaseTest {
    @Test
    public void testNameHeaderTable(){
        final String [] expectedNameHeadersTable = {"#", "Language", "Author", "Date", "Comments", "Rate"};

        List<String> actualNameHeadersTable = openBaseURL().clickTopListsMenu().getNameHeadesrTable();

        for(int i = 0; i < actualNameHeadersTable.size(); i++){
            Assert.assertEquals(actualNameHeadersTable.get(i), expectedNameHeadersTable[i]);
        }
    }
}
