UPDATE CTN_AUTHOR_PROFILE
SET profile_json = JSON_REPLACE(
        profile_json,
        '$.journey[2].stack',
        JSON_ARRAY('Vue3', 'Spring Boot', 'OpenSpec')
    ),
    update_time = CURRENT_TIMESTAMP,
    version_num = version_num + 1
WHERE author_code = 'shizuki'
  AND deleted_flag = 0;
