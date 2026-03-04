UPDATE CTN_POST
SET deleted_flag = 1,
    update_time = CURRENT_TIMESTAMP
WHERE post_num IN (1001, 1002)
  AND deleted_flag = 0;

SET @seed_slug = CONVERT('initial-overview-v01' USING utf8mb4) COLLATE utf8mb4_unicode_ci;
SET @seed_post_id = (
    SELECT id
    FROM CTN_POST
    WHERE slug_code IS NOT NULL
      AND slug_code COLLATE utf8mb4_unicode_ci = @seed_slug
    ORDER BY id ASC
    LIMIT 1
);
SET @seed_post_num = (
    SELECT post_num
    FROM CTN_POST
    WHERE id = @seed_post_id
);
SET @seed_post_num = IFNULL(
    @seed_post_num,
    (
        SELECT COALESCE(MAX(post_num), 1002) + 1
        FROM CTN_POST
    )
);

UPDATE CTN_POST
SET post_num = @seed_post_num,
    user_id = 1,
    title_text = '总体设计文档（初始）',
    summary_text = '用于博客界面初始化展示的总体设计文档。',
    visibility_status = 'PUBLIC',
    status_code = 'PUBLISHED',
    category_code = 'dev',
    slug_code = @seed_slug,
    cover_image_url = NULL,
    md_bucket_name = NULL,
    md_object_key = NULL,
    word_count = 0,
    line_count = 0,
    reading_minutes = 1,
    like_value = 0,
    published_time = CURRENT_TIMESTAMP,
    deleted_flag = 0,
    update_time = CURRENT_TIMESTAMP
WHERE id = @seed_post_id;

INSERT INTO CTN_POST (
    post_num,
    user_id,
    title_text,
    summary_text,
    visibility_status,
    status_code,
    category_code,
    slug_code,
    cover_image_url,
    md_bucket_name,
    md_object_key,
    word_count,
    line_count,
    reading_minutes,
    like_value,
    published_time,
    create_time,
    update_time,
    deleted_flag,
    version_num
)
SELECT
    @seed_post_num,
    1,
    '总体设计文档（初始）',
    '用于博客界面初始化展示的总体设计文档。',
    'PUBLIC',
    'PUBLISHED',
    'dev',
    @seed_slug,
    NULL,
    NULL,
    NULL,
    0,
    0,
    1,
    0,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP,
    0,
    0
FROM DUAL
WHERE @seed_post_id IS NULL;
