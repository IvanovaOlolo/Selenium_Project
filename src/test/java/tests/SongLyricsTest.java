package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestUtils;

import java.util.List;

public class SongLyricsTest extends BaseTest {
    @Test
    public void test99BottleSongLyrics(){
        final String expectedSongLyrics = TestUtils.createSongLyrics();

        String actualSongLyrics = openBaseURL().
                clickLinkSongLyrics().
                getSongLyrics();

        Assert.assertEquals(actualSongLyrics, expectedSongLyrics);
    }
    }

