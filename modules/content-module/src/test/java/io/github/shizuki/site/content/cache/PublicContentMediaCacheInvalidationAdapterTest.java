package io.github.shizuki.site.content.cache;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.mapper.publiccontent.PublicContentCacheTargetMapper;
import io.github.shizuki.site.content.mapper.publiccontent.PublicContentCacheTargetRow;
import io.github.shizuki.site.content.model.PublicContentType;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class PublicContentMediaCacheInvalidationAdapterTest {

    @Test
    void invalidatesEveryDistinctOpaqueAssociationTargetForOneSourceAsset() {
        PublicContentCacheTargetMapper mapper = Mockito.mock(PublicContentCacheTargetMapper.class);
        PublicContentCacheInvalidator invalidator = Mockito.mock(PublicContentCacheInvalidator.class);
        PublicContentMediaCacheInvalidationAdapter adapter =
            new PublicContentMediaCacheInvalidationAdapter(mapper, invalidator);
        when(mapper.selectBySourceAssetId(41L)).thenReturn(List.of(
            row("ALBUM", "alb_AAAAAAAAAAAAAAAAAAAAAAAA"),
            row("ALBUM", "alb_AAAAAAAAAAAAAAAAAAAAAAAA"),
            row("MOMENT", "mom_BBBBBBBBBBBBBBBBBBBBBBBB")
        ));

        adapter.invalidateBySourceAssetId(41L);

        @SuppressWarnings("unchecked")
        ArgumentCaptor<List<PublicContentCacheTarget>> captor = ArgumentCaptor.forClass(List.class);
        verify(invalidator).invalidateContentsAfterCommit(captor.capture());
        org.assertj.core.api.Assertions.assertThat(captor.getValue()).containsExactly(
            new PublicContentCacheTarget(PublicContentType.ALBUM, "alb_AAAAAAAAAAAAAAAAAAAAAAAA"),
            new PublicContentCacheTarget(PublicContentType.MOMENT, "mom_BBBBBBBBBBBBBBBBBBBBBBBB")
        );
    }

    private PublicContentCacheTargetRow row(String type, String identifier) {
        PublicContentCacheTargetRow row = new PublicContentCacheTargetRow();
        row.setContentType(type);
        row.setPublicIdentifier(identifier);
        return row;
    }
}
