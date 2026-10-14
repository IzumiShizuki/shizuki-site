-- Voice access must be deliberately granted through a dedicated custom group.
-- Preserve ADMIN and custom grants; remove historically automatic built-in grants.
DELETE FROM USR_GROUP_PERMISSION
WHERE permission_code = 'music.asmr.access'
  AND group_code IN ('FRIEND', 'USER', 'GUEST');
