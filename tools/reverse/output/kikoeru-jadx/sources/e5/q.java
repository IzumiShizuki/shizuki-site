package e5;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.p0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements n5.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f6285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f6252c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f6253d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f6254e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f6255f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f6256g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f6257h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f6258i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f6259j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f6260k = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f6261l = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f6262m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f6263n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f6264o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f6265p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f6266q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f6267r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f6268s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f6270t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f6272u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f6274v = a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f6276w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f6278x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f6280y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f6282z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = a("AUTOSELECT");
    public static final Pattern X = a("DEFAULT");
    public static final Pattern Y = a("FORCED");
    public static final Pattern Z = a("INDEPENDENT");
    public static final Pattern q0 = a("GAP");
    public static final Pattern r0 = a("PRECISE");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f6269s0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f6271t0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f6273u0 = Pattern.compile("[:,]ID=\"(.+?)\"");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f6275v0 = Pattern.compile("CLASS=\"(.+?)\"");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f6277w0 = Pattern.compile("START-DATE=\"(.+?)\"");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Pattern f6279x0 = Pattern.compile("CUE=\"(.+?)\"");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Pattern f6281y0 = Pattern.compile("END-DATE=\"(.+?)\"");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final Pattern f6283z0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern A0 = a("END-ON-NEXT");
    public static final Pattern B0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");
    public static final Pattern C0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");
    public static final Pattern D0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern E0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern F0 = Pattern.compile("X-SNAP=\"(.+?)\"");
    public static final Pattern G0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");
    public static final Pattern H0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern I0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public q() {
        this(n.f6240l, null);
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static m4.n b(String str, m4.m[] mVarArr) {
        m4.m[] mVarArr2 = new m4.m[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            m4.m mVar = mVarArr[i10];
            mVarArr2[i10] = new m4.m(mVar.f14394b, mVar.f14395c, mVar.f14396d, null);
        }
        return new m4.n(str, true, mVarArr2);
    }

    public static m4.m c(String str, String str2, HashMap map) throws p0 {
        String strI = i(str, M, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new m4.m(m4.g.f14211d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = m4.g.f14211d;
            int i10 = c0.f16548a;
            return new m4.m(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = m4.g.f14212e;
        return new m4.m(uuid2, null, "video/mp4", l6.p.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x07c5, code lost:
    
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07c9, code lost:
    
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x07d6, code lost:
    
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x07e3, code lost:
    
        r26 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x07c7 A[PHI: r26
      0x07c7: PHI (r26v28 int) = (r26v24 int), (r26v25 int), (r26v26 int), (r26v29 int) binds: [B:280:0x07eb, B:276:0x07de, B:272:0x07d1, B:269:0x07c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0b15  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e5.k d(e5.n r113, e5.k r114, c7.e1 r115, java.lang.String r116) throws e5.p, m4.p0 {
        /*
            Method dump skipped, instruction units count: 3126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.q.d(e5.n, e5.k, c7.e1, java.lang.String):e5.k");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0231  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e5.n e(c7.e1 r43, java.lang.String r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.q.e(c7.e1, java.lang.String):e5.n");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d10;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(map, str2);
    }

    public static String j(String str, Pattern pattern, Map map) throws p0 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw p0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(Map map, String str) {
        Matcher matcher = H0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004f A[SYNTHETIC] */
    @Override // n5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F0(android.net.Uri r7, s4.k r8) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.q.F0(android.net.Uri, s4.k):java.lang.Object");
    }

    public q(n nVar, k kVar) {
        this.f6284a = nVar;
        this.f6285b = kVar;
    }
}
