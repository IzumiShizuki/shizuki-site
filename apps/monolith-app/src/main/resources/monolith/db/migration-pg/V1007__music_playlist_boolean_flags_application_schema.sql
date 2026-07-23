-- V1006 only inspected the public schema, while production keeps application
-- tables in the shizuki_app schema. Convert every matching user-schema table so
-- the migration follows the actual PostgreSQL search_path instead of assuming it.
DO $$
DECLARE
    target RECORD;
    default_literal TEXT;
BEGIN
    FOR target IN
        SELECT
            column_info.table_schema,
            column_info.table_name,
            column_info.column_name,
            column_info.data_type,
            flag_contract.default_value
        FROM information_schema.columns AS column_info
        JOIN (VALUES
            ('mda_user_music_playlist', 'public_flag', FALSE),
            ('mda_user_music_playlist', 'system_reserved_flag', FALSE),
            ('mda_user_music_playlist_track', 'enabled_flag', TRUE)
        ) AS flag_contract(table_name, column_name, default_value)
          ON column_info.table_name = flag_contract.table_name
         AND column_info.column_name = flag_contract.column_name
        WHERE column_info.table_schema NOT IN ('information_schema', 'pg_catalog')
        ORDER BY column_info.table_schema, column_info.table_name, column_info.column_name
    LOOP
        IF target.data_type IN ('smallint', 'integer', 'bigint', 'numeric') THEN
            EXECUTE format(
                'ALTER TABLE %I.%I ALTER COLUMN %I DROP DEFAULT',
                target.table_schema,
                target.table_name,
                target.column_name
            );
            EXECUTE format(
                'ALTER TABLE %I.%I ALTER COLUMN %I TYPE BOOLEAN USING '
                || '(CASE WHEN %I IS NULL THEN FALSE ELSE %I <> 0 END)',
                target.table_schema,
                target.table_name,
                target.column_name,
                target.column_name,
                target.column_name
            );
        ELSIF target.data_type <> 'boolean' THEN
            RAISE EXCEPTION 'Cannot convert %.%.% from unsupported type % to boolean',
                target.table_schema,
                target.table_name,
                target.column_name,
                target.data_type;
        END IF;

        default_literal := CASE WHEN target.default_value THEN 'TRUE' ELSE 'FALSE' END;
        EXECUTE format(
            'UPDATE %I.%I SET %I = %s WHERE %I IS NULL',
            target.table_schema,
            target.table_name,
            target.column_name,
            default_literal,
            target.column_name
        );
        EXECUTE format(
            'ALTER TABLE %I.%I ALTER COLUMN %I SET DEFAULT %s',
            target.table_schema,
            target.table_name,
            target.column_name,
            default_literal
        );
        EXECUTE format(
            'ALTER TABLE %I.%I ALTER COLUMN %I SET NOT NULL',
            target.table_schema,
            target.table_name,
            target.column_name
        );
    END LOOP;
END $$;
