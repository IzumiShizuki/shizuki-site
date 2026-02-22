-- change: oauth login identity no longer persists provider/account email

UPDATE OAU_BINDING
SET provider_email_text = NULL
WHERE provider_type IN ('github', 'linuxdo')
  AND deleted_flag = 0
  AND provider_email_text IS NOT NULL;

UPDATE USR_ACCOUNT ua
INNER JOIN OAU_BINDING ob
    ON ob.user_id = ua.id
   AND ob.provider_type IN ('github', 'linuxdo')
   AND ob.deleted_flag = 0
SET ua.email_text = NULL,
    ua.email_verified_flag = 0
WHERE ua.deleted_flag = 0
  AND ua.password_hash IS NULL
  AND (ua.email_text IS NOT NULL OR ua.email_verified_flag <> 0);
