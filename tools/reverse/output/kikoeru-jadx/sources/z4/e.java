package z4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.p0;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p4.c0;
import tc.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultHandler implements n5.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f26408b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f26409c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f26410d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f26411e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f26412f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f26413a;

    public e() {
        try {
            this.f26413a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = c0.f16548a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[PHI: r13
      0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01ae, B:120:0x019b, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.e.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!p4.c.t(xmlPullParser, "BaseURL"));
        if (text != null && p4.c.r(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return ya.q.o(new b(text, i10, i11, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b bVar = (b) arrayList.get(i12);
            String strX = p4.c.x(bVar.f26385a, text);
            String str = attributeValue3 == null ? strX : attributeValue3;
            if (z10) {
                i10 = bVar.f26387c;
                i11 = bVar.f26388d;
                str = bVar.f26386b;
            }
            arrayList2.add(new b(strX, i10, i11, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!p4.c.t(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = c0.f16556i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j11 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j11 : j11;
    }

    public static float j(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f26408b.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i10 / Integer.parseInt(r2) : i10;
            }
        }
        return f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:310:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0c6a A[LOOP:11: B:246:0x0697->B:483:0x0c6a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0f96 A[LOOP:5: B:158:0x0408->B:581:0x0f96, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:706:0x13a0 A[LOOP:1: B:45:0x00cd->B:706:0x13a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x136c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0e33 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:737:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:752:0x0aee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z4.c k(org.xmlpull.v1.XmlPullParser r167, android.net.Uri r168) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.e.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):z4.c");
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return new j(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return new j(attributeValue, j10, j11);
    }

    public static int m(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (ud.e.s("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f26414a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j10 = rVar != null ? rVar.f26457b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.f26458c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = rVar != null ? rVar.f26454d : 0L;
        long j15 = rVar != null ? rVar.f26455e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        j jVarL = rVar != null ? rVar.f26456a : null;
        while (true) {
            xmlPullParser.next();
            if (p4.c.u(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarL;
            if (p4.c.t(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j11, j13, j17, j16);
            }
            jVarL = jVar;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = oVar != null ? oVar.f26457b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.f26458c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.f26443e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = oVar != null ? oVar.f26442d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVarL = null;
        List listR = null;
        do {
            xmlPullParser.next();
            if (p4.c.u(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (p4.c.u(xmlPullParser, "SegmentTimeline")) {
                listR = r(xmlPullParser, j16, j11);
            } else if (p4.c.u(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!p4.c.t(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarL == null) {
                jVarL = oVar.f26456a;
            }
            if (listR == null) {
                listR = oVar.f26444f;
            }
            if (arrayList == null) {
                arrayList = oVar.f26448j;
            }
        }
        return new o(jVarL, j16, j18, j22, j20, listR, j24, arrayList, c0.N(j14), c0.N(j10));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16 = pVar != null ? pVar.f26457b : 1L;
        j jVarL = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.f26458c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.f26443e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = pVar != null ? pVar.f26442d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (ud.e.s("http://dashif.org/guidelines/last-segment-number", fVar.f26414a)) {
                j15 = Long.parseLong(fVar.f26415b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        b0 b0VarS = s(xmlPullParser, "media", pVar != null ? pVar.f26450k : null);
        b0 b0VarS2 = s(xmlPullParser, "initialization", pVar != null ? pVar.f26449j : null);
        List listR = null;
        do {
            xmlPullParser.next();
            if (p4.c.u(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (p4.c.u(xmlPullParser, "SegmentTimeline")) {
                listR = r(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!p4.c.t(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarL == null) {
                jVarL = pVar.f26456a;
            }
            if (listR == null) {
                listR = pVar.f26444f;
            }
        }
        return new p(jVarL, j17, j19, j23, j24, j21, listR, j26, b0VarS2, b0VarS, c0.N(j14), c0.N(j10));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (p4.c.u(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j14 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j12 = j14;
                    jA = a(arrayList, jA, j13, i11, j12);
                } else {
                    j12 = j14;
                }
                if (j12 != -9223372036854775807L) {
                    jA = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!p4.c.t(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            int i12 = c0.f16548a;
            a(arrayList, jA, j13, i10, c0.V(j11, j10, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00ff. Please report as an issue. */
    public static b0 s(XmlPullParser xmlPullParser, String str, b0 b0Var) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return b0Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i10 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i10);
                String strSubstring2 = attributeValue.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new b0(arrayList, arrayList2, arrayList3);
    }

    @Override // n5.q
    public final Object F0(Uri uri, s4.k kVar) throws p0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f26413a.newPullParser();
            xmlPullParserNewPullParser.setInput(kVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return k(xmlPullParserNewPullParser, uri);
            }
            throw p0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw p0.b(null, e10);
        }
    }
}
