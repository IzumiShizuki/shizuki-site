INSERT INTO post (post_id, title, summary, visibility)
VALUES
    (1, 'Shizuki v0.1', 'Project kickoff post', 'PUBLIC'),
    (2, 'Architecture Notes', 'Microservice baseline', 'PUBLIC')
ON DUPLICATE KEY UPDATE summary = VALUES(summary), updated_at = CURRENT_TIMESTAMP(3);

INSERT INTO app (app_id, name, category, pin_able)
VALUES
    (1, 'Focus Timer', 'study', 1),
    (2, 'Ambient Mixer', 'tool', 1)
ON DUPLICATE KEY UPDATE category = VALUES(category), updated_at = CURRENT_TIMESTAMP(3);
