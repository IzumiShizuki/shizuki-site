package t6;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import j2.h0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o6.d;
import o6.k;
import o6.l;
import p4.c;
import p4.g;
import p4.s;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f20542d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f20543e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f20544a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20545b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f20546c = new s();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o4.b a(android.text.Spanned r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.a.a(android.text.Spanned, java.lang.String):o4.b");
    }

    public static long b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    @Override // o6.l
    public final /* synthetic */ d f(byte[] bArr, int i10, int i11) {
        return h0.a(this, bArr, i11);
    }

    @Override // o6.l
    public final int u() {
        return 1;
    }

    @Override // o6.l
    public final void w(byte[] bArr, int i10, int i11, k kVar, g gVar) {
        String strH;
        String str;
        a aVar = this;
        long j10 = kVar.f16268a;
        s sVar = aVar.f20546c;
        sVar.E(bArr, i10 + i11);
        sVar.G(i10);
        Charset charsetC = sVar.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (j10 == -9223372036854775807L || !kVar.f16269b) ? null : new ArrayList();
        while (true) {
            String strH2 = sVar.h(charsetC);
            if (strH2 == null) {
                break;
            }
            if (strH2.length() != 0) {
                try {
                    Integer.parseInt(strH2);
                    strH = sVar.h(charsetC);
                } catch (NumberFormatException unused) {
                    c.B("SubripParser", "Skipping invalid index: ".concat(strH2));
                }
                if (strH == null) {
                    c.B("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f20542d.matcher(strH);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = aVar.f20544a;
                    sb.setLength(0);
                    ArrayList arrayList2 = aVar.f20545b;
                    arrayList2.clear();
                    String strH3 = sVar.h(charsetC);
                    while (!TextUtils.isEmpty(strH3)) {
                        long j12 = j11;
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strH3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f20543e.matcher(strTrim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String strGroup = matcher3.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher3.start() - i12;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i12 += length;
                            matcher2 = matcher3;
                            j10 = j10;
                        }
                        sb.append(sb2.toString());
                        strH3 = sVar.h(charsetC);
                        j11 = j12;
                    }
                    long j13 = j10;
                    long j14 = j11;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i13);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (j13 == j14 || jB >= j13) {
                        gVar.accept(new o6.a(jB, jB2 - jB, i0.u(a(spannedFromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new o6.a(jB, jB2 - jB, i0.u(a(spannedFromHtml, str))));
                    }
                    aVar = this;
                    j11 = j14;
                    j10 = j13;
                } else {
                    c.B("SubripParser", "Skipping invalid timing: ".concat(strH));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.accept((o6.a) it.next());
            }
        }
    }

    @Override // o6.l
    public final /* synthetic */ void reset() {
    }
}
