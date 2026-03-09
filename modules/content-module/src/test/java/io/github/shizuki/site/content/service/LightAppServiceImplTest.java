package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.dto.LightAppTodoReorderRequest;
import io.github.shizuki.site.content.entity.LightAppTodoEntity;
import io.github.shizuki.site.content.mapper.LightAppProjectMapper;
import io.github.shizuki.site.content.mapper.LightAppScheduleEventMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskColumnMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskMapper;
import io.github.shizuki.site.content.mapper.LightAppTodoMapper;
import io.github.shizuki.site.content.service.impl.LightAppServiceImpl;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LightAppServiceImplTest {

    @Mock
    private LightAppProjectMapper projectMapper;

    @Mock
    private LightAppTodoMapper todoMapper;

    @Mock
    private LightAppTaskMapper taskMapper;

    @Mock
    private LightAppTaskColumnMapper taskColumnMapper;

    @Mock
    private LightAppScheduleEventMapper scheduleEventMapper;

    @InjectMocks
    private LightAppServiceImpl lightAppService;

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldRejectWhenNoLoginContext() {
        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> lightAppService.listProjects());
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void shouldRejectReorderWhenTodoNotOwnedByUser() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        LightAppTodoEntity entity = new LightAppTodoEntity();
        entity.setId(1L);
        entity.setUserId(7L);
        Mockito.when(todoMapper.selectList(Mockito.any())).thenReturn(List.of(entity));

        LightAppTodoReorderRequest request = new LightAppTodoReorderRequest();
        LightAppTodoReorderRequest.Item first = new LightAppTodoReorderRequest.Item();
        first.setTodoId(1L);
        first.setSortNum(10);
        LightAppTodoReorderRequest.Item second = new LightAppTodoReorderRequest.Item();
        second.setTodoId(2L);
        second.setSortNum(20);
        request.setItems(List.of(first, second));

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> lightAppService.reorderTodos(request));
        Assertions.assertEquals(ErrorCode.NOT_FOUND, exception.getErrorCode());
    }
}
