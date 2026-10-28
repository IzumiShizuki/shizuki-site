package io.github.shizuki.site.user.notification;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AstrBotBridgeControllerWiringTest {

    @Test
    void springCreatesControllerWithContactBindingCollaborators() {
        WechatNotificationSettings notifications = mock(WechatNotificationSettings.class);
        WechatNotificationService notificationService = mock(WechatNotificationService.class);
        AccountContactBindingSettings contacts = mock(AccountContactBindingSettings.class);
        AccountContactBindingService bindingService = mock(AccountContactBindingService.class);
        AccountContactModels.Confirmation confirmation = mock(AccountContactModels.Confirmation.class);

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.registerBean(WechatNotificationSettings.class, () -> notifications);
            context.registerBean(WechatNotificationService.class, () -> notificationService);
            context.registerBean(AccountContactBindingSettings.class, () -> contacts);
            context.registerBean(AccountContactBindingService.class, () -> bindingService);
            context.registerBean(AstrBotBridgeController.class);
            context.refresh();

            var response = context.getBean(AstrBotBridgeController.class)
                .confirmContact("Bearer fixture", confirmation);

            assertThat(response.getStatusCode().value()).isEqualTo(200);
            verify(contacts).authenticate("Bearer fixture");
            verify(bindingService).confirm(confirmation);
        }
    }
}
