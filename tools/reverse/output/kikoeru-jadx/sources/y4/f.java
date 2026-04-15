package y4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.p0;
import n5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f25487a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // n5.q
    public final Object F0(Uri uri, s4.k kVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(kVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f25487a.matcher(line);
            if (!matcher.matches()) {
                throw p0.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw p0.b(null, e10);
        }
    }
}
