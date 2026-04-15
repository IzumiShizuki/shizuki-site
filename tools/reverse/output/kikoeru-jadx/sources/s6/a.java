package s6;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m7.l0;
import o6.k;
import o6.l;
import p4.c0;
import p4.g;
import p4.s;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f19508g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f19510b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f19512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19513e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19514f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f19511c = new s();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f19509a = false;
            this.f19510b = null;
            return;
        }
        this.f19509a = true;
        String strP = c0.p((byte[]) list.get(0));
        p4.c.c(strP.startsWith("Format:"));
        l0 l0VarB = l0.b(strP);
        l0VarB.getClass();
        this.f19510b = l0VarB;
        b(new s((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long c(String str) {
        Matcher matcher = f19508g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = c0.f16548a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.b(p4.s, java.nio.charset.Charset):void");
    }

    @Override // o6.l
    public final /* synthetic */ o6.d f(byte[] bArr, int i10, int i11) {
        return h0.a(this, bArr, i11);
    }

    @Override // o6.l
    public final int u() {
        return 1;
    }

    @Override // o6.l
    public final void w(byte[] bArr, int i10, int i11, k kVar, g gVar) {
        Charset charset;
        long j10;
        l0 l0Var;
        s sVar;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        Layout.Alignment alignment;
        PointF pointF;
        int i16;
        int i17;
        float f12;
        float f13;
        float f14;
        boolean z10;
        int i18;
        int i19;
        float f15;
        int i20;
        float f16;
        int i21;
        int i22;
        int iA;
        int i23;
        a aVar = this;
        long j11 = kVar.f16268a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        s sVar2 = aVar.f19511c;
        sVar2.E(bArr, i10 + i11);
        sVar2.G(i10);
        Charset charsetC = sVar2.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        boolean z11 = aVar.f19509a;
        if (!z11) {
            aVar.b(sVar2, charsetC);
        }
        l0 l0VarB = z11 ? aVar.f19510b : null;
        while (true) {
            String strH = sVar2.h(charsetC);
            if (strH == null) {
                long j12 = j11;
                ArrayList arrayList3 = (j12 == -9223372036854775807L || !kVar.f16269b) ? null : new ArrayList();
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    List list = (List) arrayList.get(i24);
                    if (!list.isEmpty() || i24 == 0) {
                        if (i24 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i24)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i24 + 1)).longValue() - ((Long) arrayList2.get(i24)).longValue();
                        if (j12 == -9223372036854775807L || jLongValue >= j12) {
                            gVar.accept(new o6.a(jLongValue, jLongValue2, list));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new o6.a(jLongValue, jLongValue2, list));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        gVar.accept((o6.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                l0VarB = l0.b(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (l0VarB == null) {
                    p4.c.B("SsaParser", "Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    int i25 = l0VarB.f14916e;
                    p4.c.c(strH.startsWith("Dialogue:"));
                    String[] strArrSplit = strH.substring(9).split(",", i25);
                    if (strArrSplit.length != i25) {
                        p4.c.B("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jC = c(strArrSplit[l0VarB.f14912a]);
                        if (jC == -9223372036854775807L) {
                            p4.c.B("SsaParser", "Skipping invalid timing: ".concat(strH));
                        } else {
                            charset = charsetC;
                            j10 = j11;
                            long jC2 = c(strArrSplit[l0VarB.f14913b]);
                            if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                l0Var = l0VarB;
                                sVar = sVar2;
                                p4.c.B("SsaParser", "Skipping invalid timing: ".concat(strH));
                            } else {
                                LinkedHashMap linkedHashMap = aVar.f19512d;
                                d dVar = (linkedHashMap == null || (i23 = l0VarB.f14914c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i23].trim());
                                String str = strArrSplit[l0VarB.f14915d];
                                Matcher matcher = c.f19526a.matcher(str);
                                int i26 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    l0 l0Var2 = l0VarB;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = c.a(strGroup);
                                        if (pointFA != null) {
                                            pointF2 = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = c.f19529d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = d.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i26 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    l0VarB = l0Var2;
                                }
                                l0Var = l0VarB;
                                String strReplace = c.f19526a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f17 = aVar.f19513e;
                                float f18 = aVar.f19514f;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (dVar != null) {
                                    boolean z12 = dVar.f19536g;
                                    Integer num = dVar.f19533d;
                                    Integer num2 = dVar.f19532c;
                                    if (num2 != null) {
                                        z10 = z12;
                                        sVar = sVar2;
                                        f10 = f17;
                                        i18 = 33;
                                        i19 = 0;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        z10 = z12;
                                        sVar = sVar2;
                                        f10 = f17;
                                        i18 = 33;
                                        i19 = 0;
                                    }
                                    if (dVar.f19539j == 3 && num != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i19, spannableString.length(), i18);
                                    }
                                    float f19 = dVar.f19534e;
                                    if (f19 == -3.4028235E38f || f18 == -3.4028235E38f) {
                                        f15 = -3.4028235E38f;
                                        i20 = Integer.MIN_VALUE;
                                    } else {
                                        f15 = f19 / f18;
                                        i20 = 1;
                                    }
                                    boolean z13 = dVar.f19535f;
                                    if (z13 && z10) {
                                        f16 = f15;
                                        i21 = i20;
                                        i22 = 33;
                                        i12 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f16 = f15;
                                        i21 = i20;
                                        i22 = 33;
                                        i12 = 0;
                                        if (z13) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z10) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (dVar.f19537h) {
                                        spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i22);
                                    }
                                    if (dVar.f19538i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i22);
                                    }
                                    i13 = i26;
                                    f11 = f16;
                                    i15 = i21;
                                    i14 = -1;
                                } else {
                                    sVar = sVar2;
                                    f10 = f17;
                                    i12 = 0;
                                    i13 = i26;
                                    i14 = -1;
                                    i15 = Integer.MIN_VALUE;
                                    f11 = -3.4028235E38f;
                                }
                                if (i13 == i14) {
                                    i13 = dVar != null ? dVar.f19531b : -1;
                                }
                                switch (i13) {
                                    case 0:
                                    default:
                                        t0.J(i13, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                int i27 = Integer.MIN_VALUE;
                                switch (i13) {
                                    case 0:
                                    default:
                                        t0.J(i13, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i12 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        break;
                                    case 2:
                                    case 5:
                                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                                        i12 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                                        i12 = 2;
                                        break;
                                }
                                switch (i13) {
                                    case 0:
                                    default:
                                        t0.J(i13, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i27 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        pointF = pointF2;
                                        i27 = 1;
                                        break;
                                    case 7:
                                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                                        pointF = pointF2;
                                        i27 = 0;
                                        break;
                                }
                                if (pointF == null || f18 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                    float f20 = 0.5f;
                                    if (i12 != 0) {
                                        i17 = 1;
                                        if (i12 != 1) {
                                            i16 = 2;
                                            f12 = i12 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i16 = 2;
                                            f12 = 0.5f;
                                        }
                                    } else {
                                        i16 = 2;
                                        i17 = 1;
                                        f12 = 0.05f;
                                    }
                                    if (i27 == 0) {
                                        f20 = 0.05f;
                                    } else if (i27 != i17) {
                                        f20 = i27 != i16 ? -3.4028235E38f : 0.95f;
                                    }
                                    f13 = f20;
                                    f14 = f12;
                                } else {
                                    float f21 = pointF.x / f10;
                                    f13 = pointF.y / f18;
                                    f14 = f21;
                                }
                                o4.b bVar = new o4.b(spannableString, alignment, null, null, f13, 0, i27, f14, i12, i15, f11, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(bVar);
                                }
                            }
                            aVar = this;
                            charsetC = charset;
                            j11 = j10;
                            l0VarB = l0Var;
                            sVar2 = sVar;
                        }
                    }
                }
                charset = charsetC;
                j10 = j11;
                l0Var = l0VarB;
                sVar = sVar2;
                aVar = this;
                charsetC = charset;
                j11 = j10;
                l0VarB = l0Var;
                sVar2 = sVar;
            } else {
                charset = charsetC;
                j10 = j11;
                l0Var = l0VarB;
                sVar = sVar2;
                aVar = this;
                charsetC = charset;
                j11 = j10;
                l0VarB = l0Var;
                sVar2 = sVar;
            }
        }
    }

    @Override // o6.l
    public final /* synthetic */ void reset() {
    }
}
