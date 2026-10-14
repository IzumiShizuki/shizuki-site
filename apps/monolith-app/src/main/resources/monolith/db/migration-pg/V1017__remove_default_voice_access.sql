-- Voice access is deliberate; preserve ADMIN and explicitly created custom groups.
DELETE FROM USR_GROUP_PERMISSION
WHERE permission_code = 'music.asmr.access'
  AND group_code IN ('FRIEND', 'USER', 'GUEST');
