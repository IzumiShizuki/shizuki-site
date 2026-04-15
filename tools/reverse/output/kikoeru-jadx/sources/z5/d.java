package z5;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f26474a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f26475b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f26476c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bh.a a(java.lang.String r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.d.a(java.lang.String):bh.a");
    }

    public static a1 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        f0 f0VarP = i0.p();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (p4.c.u(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strQ = p4.c.q(xmlPullParser, strConcat3);
                String strQ2 = p4.c.q(xmlPullParser, strConcat4);
                String strQ3 = p4.c.q(xmlPullParser, strConcat5);
                String strQ4 = p4.c.q(xmlPullParser, strConcat6);
                if (strQ == null || strQ2 == null) {
                    return a1.f25946e;
                }
                f0VarP.a(new b(strQ, strQ3 != null ? Long.parseLong(strQ3) : 0L, strQ4 != null ? Long.parseLong(strQ4) : 0L));
            }
        } while (!p4.c.t(xmlPullParser, strConcat2));
        return f0VarP.f();
    }
}
