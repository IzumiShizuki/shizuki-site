CREATE TABLE IF NOT EXISTS CTN_AUTHOR_PROFILE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_AUTHOR_PROFILE.id 自增长ID',
    author_code VARCHAR(64) NOT NULL COMMENT 'CTN_AUTHOR_PROFILE.author_code 作者编码',
    profile_json JSON NOT NULL COMMENT 'CTN_AUTHOR_PROFILE.profile_json 作者资料JSON',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_AUTHOR_PROFILE.enabled_flag 是否启用展示',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_AUTHOR_PROFILE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_AUTHOR_PROFILE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_AUTHOR_PROFILE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_AUTHOR_PROFILE.version_num 版本号',
    CONSTRAINT PK_CTN_AUTHOR_PROFILE PRIMARY KEY (id),
    CONSTRAINT AK_CTN_AUTHOR_PROFILE_1 UNIQUE (author_code)
) COMMENT='作者主页资料表';

INSERT INTO CTN_AUTHOR_PROFILE (
    author_code,
    profile_json,
    enabled_flag,
    create_time,
    update_time,
    deleted_flag,
    version_num
)
VALUES (
    'shizuki',
    JSON_OBJECT(
        'hero', JSON_OBJECT(
            'greeting', '你好，很高兴认识你',
            'name', 'Shizuki',
            'quote', '愿你终将与热爱相逢',
            'avatar_url', '/images/katanegai.jpg'
        ),
        'identity', JSON_OBJECT(
            'birth_year', '2006',
            'school', '中国计量大学',
            'major', '计算机科学与技术',
            'role', '大一学生 / 独立开发者',
            'labels', JSON_ARRAY('学习陪伴', '内容沉淀', '游戏图形渲染')
        ),
        'skills', JSON_ARRAY('Java', 'Vue3', 'Spring Boot', 'MySQL', 'OpenGL', 'Vulkan'),
        'journey', JSON_ARRAY(
            JSON_OBJECT(
                'year', '2024',
                'title', '确定长期站点方向',
                'description', '围绕学习陪伴、内容沉淀与作品展示搭建 Shizuki Site 的基础架构。',
                'stack', JSON_ARRAY('Spring Boot', 'Vue3', 'MySQL')
            ),
            JSON_OBJECT(
                'year', '2025',
                'title', '完成博客与音乐模块一期',
                'description', '打通博客阅读/编辑链路与音乐播放器体验，开始沉淀系统化文档。',
                'stack', JSON_ARRAY('Markdown', 'Vite', 'Flyway')
            ),
            JSON_OBJECT(
                'year', '2026',
                'title', '推进作者主页与展示体系',
                'description', '建设更完整的作者介绍、建站经历和关于页面，强化内容表达。',
                'stack', JSON_ARRAY('Vue3', 'Spring Boot', 'Beads')
            )
        ),
        'about', JSON_OBJECT(
            'intro', JSON_ARRAY(
                'Shizuki Site 是一个长期学习与创作系统。',
                '这里记录技术实践、项目迭代与个人成长。'
            ),
            'mission', '持续构建一个可陪伴、可沉淀、可展示的个人站点。',
            'focus', JSON_ARRAY('博客写作', '工程化实践', '图形与交互体验'),
            'music', JSON_ARRAY('初音未来', '日语流行', '游戏原声'),
            'links', JSON_ARRAY(
                JSON_OBJECT('label', '博客列表', 'url', '/#/blog'),
                JSON_OBJECT('label', '项目首页', 'url', '/#/')
            )
        )
    ),
    1,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP,
    0,
    0
)
ON DUPLICATE KEY UPDATE
    update_time = CURRENT_TIMESTAMP,
    deleted_flag = 0;
