package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkshopResolutionTest {
    @Test
    void extractsActualSourceTagsAndDistinguishesDynamicAndUnknown() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("1920x1080", WorkshopResolution.fromTags(mapper.readTree(
                "[{\"tag\":\"Video\"},{\"tag\":\"1920 x 1080\"}]")));
        assertEquals("Dynamic Resolution", WorkshopResolution.fromTags(mapper.readTree(
                "[{\"tag\":\"Dynamic Resolution\"}]")));
        assertEquals("", WorkshopResolution.fromTags(mapper.readTree("[]")));
    }

    @Test
    void readsExplicitSteamPageFieldAndNeverUsesThumbnailDimensions() {
        assertEquals("1920x1080", WorkshopResolution.fromPage(
                "<span class=\"workshopTagsTitle\">Resolution:&nbsp;</span><a href=\"/browse\">1920 x 1080</a>"));
        assertEquals("", WorkshopResolution.fromPage("<img width=\"3840\" height=\"2160\">"));
    }
}
