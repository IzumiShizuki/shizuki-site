package io.github.shizuki.site.ai.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class AiTownCatalog {

    private static final List<SceneDefinition> SCENES = List.of(
        new SceneDefinition(
            "library",
            "图书馆",
            "knowledge",
            "偏资料、知识与设定浏览，适合作为世界书氛围承载的公开入口。",
            "木书架、暖灯和安静检索位构成一期知识向主场景。",
            List.of("资料索引", "设定浏览", "夜间氛围"),
            18,
            26,
            "amber",
            List.of(
                new NpcDefinition(
                    "librarian",
                    "馆长 Haru",
                    "管理员特殊 NPC",
                    "负责图书馆资料整理、世界书索引与深夜设定问答。",
                    true,
                    true,
                    null,
                    List.of()
                ),
                new NpcDefinition(
                    "stack_guide",
                    "书架导览牌",
                    "公开展示点位",
                    "告诉访客图书馆不同区域适合做什么，但不承接对话。",
                    false,
                    false,
                    null,
                    List.of()
                )
            )
        ),
        new SceneDefinition(
            "classroom",
            "教室",
            "training",
            "偏教学、训练与问答感，作为后续课程型 NPC 的扩展点。",
            "长桌、黑板和练习区构成一期训练场景。",
            List.of("题目训练", "教学引导", "课堂氛围"),
            52,
            16,
            "sky",
            List.of(
                new NpcDefinition(
                    "teaching_assistant",
                    "助教 Sora",
                    "管理员特殊 NPC",
                    "适合承接训练、提问和一步一步的教学对话。",
                    true,
                    true,
                    null,
                    List.of()
                ),
                new NpcDefinition(
                    "class_notice",
                    "课表公告板",
                    "公开展示点位",
                    "展示一期教室定位与未来扩展方向。",
                    false,
                    false,
                    null,
                    List.of()
                )
            )
        ),
        new SceneDefinition(
            "home_gate",
            "自宅外部",
            "home_exterior",
            "作为自宅入口场景，先承接公开浏览，再为 companion bead 预留过渡入口。",
            "门牌、庭院与门口提示牌共同定义管理员专属入口氛围。",
            List.of("自宅入口", "管理员专属", "companion 预留"),
            78,
            42,
            "rose",
            List.of(
                new NpcDefinition(
                    "home_keeper",
                    "门口接待终端",
                    "管理员特殊 NPC",
                    "负责说明自宅 companion 的一期边界，并作为管理员入口过渡角色。",
                    true,
                    true,
                    null,
                    List.of()
                ),
                new NpcDefinition(
                    "house_sign",
                    "自宅门牌",
                    "公开展示点位",
                    "提示非管理员只能在外部浏览，不能直接进入 companion 内部。",
                    false,
                    false,
                    null,
                    List.of()
                )
            )
        )
    );

    private static final Map<String, SceneDefinition> SCENE_BY_CODE = indexScenes();
    private static final Map<String, NpcDefinition> NPC_BY_CODE = indexNpcs();

    private AiTownCatalog() {
    }

    static List<SceneDefinition> listScenes() {
        return SCENES;
    }

    static SceneDefinition findScene(String sceneCode) {
        if (sceneCode == null) {
            return null;
        }
        return SCENE_BY_CODE.get(sceneCode);
    }

    static NpcDefinition findNpc(String npcCode) {
        if (npcCode == null) {
            return null;
        }
        return NPC_BY_CODE.get(npcCode);
    }

    static SceneDefinition findSceneByNpc(String npcCode) {
        NpcDefinition npc = findNpc(npcCode);
        if (npc == null) {
            return null;
        }
        return findScene(npc.sceneCode());
    }

    private static Map<String, SceneDefinition> indexScenes() {
        Map<String, SceneDefinition> result = new LinkedHashMap<>();
        for (SceneDefinition scene : SCENES) {
            result.put(scene.sceneCode(), scene);
        }
        return Map.copyOf(result);
    }

    private static Map<String, NpcDefinition> indexNpcs() {
        Map<String, NpcDefinition> result = new LinkedHashMap<>();
        for (SceneDefinition scene : SCENES) {
            for (NpcDefinition npc : scene.npcs()) {
                result.put(npc.npcCode(), npc.withSceneCode(scene.sceneCode()));
            }
        }
        return Map.copyOf(result);
    }

    record SceneDefinition(
        String sceneCode,
        String title,
        String sceneType,
        String description,
        String atmosphereHint,
        List<String> highlights,
        int coordX,
        int coordY,
        String tone,
        List<NpcDefinition> npcs
    ) {
    }

    record NpcDefinition(
        String npcCode,
        String displayName,
        String roleLabel,
        String intro,
        boolean adminOnly,
        boolean memoryEnabled,
        Long characterId,
        List<Long> worldbookIds,
        String sceneCode
    ) {
        NpcDefinition(String npcCode,
                      String displayName,
                      String roleLabel,
                      String intro,
                      boolean adminOnly,
                      boolean memoryEnabled,
                      Long characterId,
                      List<Long> worldbookIds) {
            this(npcCode, displayName, roleLabel, intro, adminOnly, memoryEnabled, characterId, worldbookIds, null);
        }

        NpcDefinition withSceneCode(String nextSceneCode) {
            return new NpcDefinition(
                npcCode,
                displayName,
                roleLabel,
                intro,
                adminOnly,
                memoryEnabled,
                characterId,
                worldbookIds,
                nextSceneCode
            );
        }
    }
}
