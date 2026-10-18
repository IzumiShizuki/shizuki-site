package io.github.shizuki.site.monolith.notification;

import io.github.shizuki.site.notification.NotificationContentResolver;
import io.github.shizuki.site.notification.WebsiteContentPublishedEvent;
import io.github.shizuki.site.user.notification.WechatNotificationService;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.service.moment.PublicMomentQueryService;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.mapper.MomentMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.event.TransactionPhase;

@Component
public class WebsiteNotificationIntegration implements NotificationContentResolver {
    private final ContentService posts;
    private final PostMapper postMapper;
    private final MomentMapper momentMapper;
    private final PublicMomentQueryService moments;
    public WebsiteNotificationIntegration(ContentService posts, PostMapper postMapper, MomentMapper momentMapper,
                                          PublicMomentQueryService moments) {
        this.posts=posts; this.postMapper=postMapper; this.momentMapper=momentMapper; this.moments=moments;
    }

    @Override
    public Optional<Content> resolve(String kind,String sourceId) {
        try {
            long id=Long.parseLong(sourceId);
            if ("POST".equals(kind)) {
                var owner=postMapper.selectById(id);
                if(owner==null || owner.getUserId()==null) return Optional.empty();
                var post=posts.getDiscoverablePost(id);
                return Optional.of(new Content(owner.getUserId(),post.title(),post.summary(),"/read/posts/"+id));
            }
            if ("MOMENT".equals(kind)) {
                var row=momentMapper.selectById(id);
                if(row==null || row.getAuthorUserId()==null || !"PUBLIC".equals(row.getVisibilityStatus())
                    || !"PUBLISHED".equals(row.getLifecycleStatus()) || Integer.valueOf(1).equals(row.getDeleted()))
                    return Optional.empty();
                var detail=moments.detail(row.getPublicId());
                if(detail.unlisted()) return Optional.empty();
                return Optional.of(new Content(row.getAuthorUserId(),"一则新动态",detail.moment().body(),
                    "/read/moments/"+row.getPublicId()));
            }
            return Optional.empty();
        } catch (NumberFormatException e) {
            return Optional.empty();
        } catch (BusinessException e) {
            if(e.getErrorCode()==ErrorCode.NOT_FOUND || e.getErrorCode()==ErrorCode.FORBIDDEN
                || e.getErrorCode()==ErrorCode.FEATURE_DISABLED) return Optional.empty();
            throw e;
        }
    }

    /** Separate listener avoids a resolver -> service -> resolver constructor cycle. */
    @Component
    public static class PublicationListener {
        private final WechatNotificationService notifications;
        public PublicationListener(WechatNotificationService notifications) { this.notifications=notifications; }
        @TransactionalEventListener(phase=TransactionPhase.BEFORE_COMMIT)
        public void published(WebsiteContentPublishedEvent event) { notifications.enqueue(event); }
    }
}
