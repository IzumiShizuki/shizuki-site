package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.site.media.response.WorkshopSearchItemResponse;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WorkshopBrowseHtmlParserTest {

    private static final String DETAIL_BASE = "https://steamcommunity.com/sharedfiles/filedetails/?id=";

    @Test
    void parsesItemsFromBrowseHtml() {
        String html = """
                <div class="workshopBrowseItems">
                  <div class="workshopItem">
                    <a href="https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896&searchtext=rain" class="ugc" data-publishedfileid="2141505896">
                      <div class="workshopItemPreviewHolder ">
                        <img class="workshopItemPreviewImage " src="https://images.steamusercontent.com/ugc/abc/123/?imw=268&amp;imh=151">
                      </div>
                    </a>
                    <div class="workshopItemTitle ellipsis">Rainy Night &amp; Caf&#39;e</div>
                  </div>
                  <div class="workshopItem">
                    <a href="https://steamcommunity.com/sharedfiles/filedetails/?id=987654321" class="ugc" data-publishedfileid="987654321">
                      <div class="workshopItemPreviewHolder ">
                        <img class="workshopItemPreviewImage" src="https://images.steamusercontent.com/ugc/def/456/">
                      </div>
                    </a>
                    <div class="workshopItemTitle ellipsis">City <b>Lights</b></div>
                  </div>
                </div>
                """;

        List<WorkshopSearchItemResponse> items = WorkshopBrowseHtmlParser.parse(html, DETAIL_BASE);

        assertEquals(2, items.size());
        assertEquals("2141505896", items.get(0).itemId());
        assertEquals("Rainy Night & Caf'e", items.get(0).title());
        assertEquals("https://images.steamusercontent.com/ugc/abc/123/?imw=268&imh=151", items.get(0).previewUrl());
        assertEquals(DETAIL_BASE + "2141505896", items.get(0).detailUrl());
        assertEquals("987654321", items.get(1).itemId());
        assertEquals("City Lights", items.get(1).title());
    }

    @Test
    void deduplicatesRepeatedAnchorsForSameItem() {
        String html = """
                <a href="https://steamcommunity.com/sharedfiles/filedetails/?id=555000111" data-publishedfileid="555000111">
                  <img class="workshopItemPreviewImage" src="https://images.steamusercontent.com/ugc/x/1/">
                </a>
                <div class="workshopItemTitle ellipsis">Same Item</div>
                <a href="https://steamcommunity.com/sharedfiles/filedetails/?id=555000111">again</a>
                """;

        List<WorkshopSearchItemResponse> items = WorkshopBrowseHtmlParser.parse(html, DETAIL_BASE);

        assertEquals(1, items.size());
        assertEquals("555000111", items.get(0).itemId());
    }

    @Test
    void returnsEmptyListForBlankOrUnrelatedHtml() {
        assertTrue(WorkshopBrowseHtmlParser.parse("", DETAIL_BASE).isEmpty());
        assertTrue(WorkshopBrowseHtmlParser.parse(null, DETAIL_BASE).isEmpty());
        assertTrue(WorkshopBrowseHtmlParser.parse("<html><body>no results</body></html>", DETAIL_BASE).isEmpty());
    }
}
