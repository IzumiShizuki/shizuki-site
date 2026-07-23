-- Align the PostgreSQL playlist flag columns with the Java Boolean entity fields.
-- The production baseline originally created these columns as SMALLINT, which makes
-- MyBatis bind Boolean values that PostgreSQL cannot insert or compare implicitly.
--
-- This block is intentionally idempotent: an already-BOOLEAN column is left in that
-- type and only has its null/default contract normalized.
DO $$
DECLARE
    target RECORD;
    existing_type TEXT;
    default_literal TEXT;
BEGIN
    FOR target IN
        SELECT *
        FROM (VALUES
            ('mda_user_music_playlist', 'public_flag', FALSE),
            ('mda_user_music_playlist', 'system_reserved_flag', FALSE),
            ('mda_user_music_playlist_track', 'enabled_flag', TRUE)
        ) AS targets(table_name, column_name, default_value)
    LOOP
        existing_type := NULL;
        SELECT data_type
        INTO existing_type
        FROM information_schema.columns
        WHERE table_schema = 'public'
          AND table_name = target.table_name
          AND column_name = target.column_name;

        -- Some fresh or selectively restored databases may not have the optional
        -- music-library tables yet. Keep the compatibility migration restart-safe.
        IF existing_type IS NULL THEN
            CONTINUE;
        END IF;

        IF existing_type IN ('smallint', 'integer', 'bigint', 'numeric') THEN
            EXECUTE format(
                'ALTER TABLE public.%I ALTER COLUMN %I DROP DEFAULT',
                target.table_name,
                target.column_name
            );
            EXECUTE format(
                'ALTER TABLE public.%I ALTER COLUMN %I TYPE BOOLEAN USING '
                || '(CASE WHEN %I IS NULL THEN FALSE ELSE %I <> 0 END)',
                target.table_name,
                target.column_name,
                target.column_name,
                target.column_name
            );
        ELSIF existing_type <> 'boolean' THEN
            RAISE EXCEPTION 'Cannot convert %.% from unsupported type % to boolean',
                target.table_name,
                target.column_name,
                existing_type;
        END IF;

        default_literal := CASE WHEN target.default_value THEN 'TRUE' ELSE 'FALSE' END;
        EXECUTE format(
            'UPDATE public.%I SET %I = %s WHERE %I IS NULL',
            target.table_name,
            target.column_name,
            default_literal,
            target.column_name
        );
        EXECUTE format(
            'ALTER TABLE public.%I ALTER COLUMN %I SET DEFAULT %s',
            target.table_name,
            target.column_name,
            default_literal
        );
        EXECUTE format(
            'ALTER TABLE public.%I ALTER COLUMN %I SET NOT NULL',
            target.table_name,
            target.column_name
        );
    END LOOP;
END $$;
