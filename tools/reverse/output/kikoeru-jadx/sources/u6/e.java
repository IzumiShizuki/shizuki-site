package u6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.b0;
import o6.k;
import o6.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p4.c0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21413b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f21414c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f21415d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f21416e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f21417f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f21418g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f21419h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f21420i = new d(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f21421a;

    public e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f21421a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f21419h.matcher(attributeValue);
        if (!matcher.matches()) {
            p4.c.B("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                z10 = false;
            }
            p4.c.b("Invalid cell resolution " + i10 + " " + i11, z10);
            return i11;
        } catch (NumberFormatException unused) {
            p4.c.B("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) throws o6.f {
        Matcher matcher;
        String strGroup;
        int i10 = c0.f16548a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f21415d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new o6.f("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = pattern.matcher(strArrSplit[1]);
            p4.c.B("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new o6.f(t0.D("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.f21441j = 3;
                break;
            case "em":
                gVar.f21441j = 2;
                break;
            case "px":
                gVar.f21441j = 1;
                break;
            default:
                throw new o6.f(t0.D("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.f21442k = Float.parseFloat(strGroup2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = c0.f16548a;
            p4.c.b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        d dVar = f21420i;
        int i12 = dVar.f21411b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = dVar.f21412c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new d(i10 * f10, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, e7.c0 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.e.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, e7.c0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u6.c h(org.xmlpull.v1.XmlPullParser r21, u6.c r22, java.util.HashMap r23, u6.d r24) throws o6.f {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.e.h(org.xmlpull.v1.XmlPullParser, u6.c, java.util.HashMap, u6.d):u6.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u6.g i(org.xmlpull.v1.XmlPullParser r18, u6.g r19) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.e.i(org.xmlpull.v1.XmlPullParser, u6.g):u6.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long j(java.lang.String r13, u6.d r14) throws o6.f {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.e.j(java.lang.String, u6.d):long");
    }

    public static e7.c0 k(XmlPullParser xmlPullParser) {
        String strQ = p4.c.q(xmlPullParser, "extent");
        if (strQ == null) {
            return null;
        }
        Matcher matcher = f21418g.matcher(strQ);
        if (!matcher.matches()) {
            p4.c.B("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strQ));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new e7.c0(i10, Integer.parseInt(strGroup2), 5);
        } catch (NumberFormatException unused) {
            p4.c.B("TtmlParser", "Ignoring malformed tts extent: ".concat(strQ));
            return null;
        }
    }

    @Override // o6.l
    public final o6.d f(byte[] bArr, int i10, int i11) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f21421a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            e7.c0 c0VarK = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVarE = f21420i;
            ch.l lVar = null;
            int iC = 15;
            int i12 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            c0VarK = k(xmlPullParserNewPullParser);
                        }
                        d dVar = dVarE;
                        e7.c0 c0Var = c0VarK;
                        int i13 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                g(xmlPullParserNewPullParser, map, i13, c0Var, map2, map3);
                            } else {
                                try {
                                    c cVarH = h(xmlPullParserNewPullParser, cVar, map2, dVar);
                                    arrayDeque.push(cVarH);
                                    if (cVar != null) {
                                        if (cVar.f21409m == null) {
                                            cVar.f21409m = new ArrayList();
                                        }
                                        cVar.f21409m.add(cVarH);
                                    }
                                } catch (o6.f e10) {
                                    p4.c.C("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iC = i13;
                            c0VarK = c0Var;
                            dVarE = dVar;
                        } else {
                            p4.c.s("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iC = i13;
                        c0VarK = c0Var;
                        dVarE = dVar;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar.f21409m == null) {
                            cVar.f21409m = new ArrayList();
                        }
                        cVar.f21409m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            lVar = new ch.l(cVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            lVar.getClass();
            return lVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // o6.l
    public final int u() {
        return 1;
    }

    @Override // o6.l
    public final void w(byte[] bArr, int i10, int i11, k kVar, p4.g gVar) {
        b0.B(f(bArr, i10, i11), kVar, gVar);
    }

    @Override // o6.l
    public final /* synthetic */ void reset() {
    }
}
