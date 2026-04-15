package c5;

import android.text.TextUtils;
import b5.d0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.o0;
import m4.p0;
import p4.c0;
import p4.y;
import r5.h0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements r5.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f3561i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f3562j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f3564b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o6.j f3566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r5.q f3568f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3570h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f3565c = new p4.s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f3569g = new byte[1024];

    public t(String str, y yVar, o6.j jVar, boolean z10) {
        this.f3563a = str;
        this.f3564b = yVar;
        this.f3566d = jVar;
        this.f3567e = z10;
    }

    public final h0 b(long j10) {
        h0 h0VarU = this.f3568f.u(0, 3);
        m4.p pVar = new m4.p();
        pVar.f14488m = o0.p("text/vtt");
        pVar.f14479d = this.f3563a;
        pVar.f14493r = j10;
        a0.c.O(pVar, h0VarU);
        this.f3568f.n();
        return h0VarU;
    }

    @Override // r5.n
    public final boolean f(r5.o oVar) {
        r5.k kVar = (r5.k) oVar;
        kVar.i(this.f3569g, 0, 6, false);
        byte[] bArr = this.f3569g;
        p4.s sVar = this.f3565c;
        sVar.E(bArr, 6);
        if (x6.i.a(sVar)) {
            return true;
        }
        kVar.i(this.f3569g, 6, 3, false);
        sVar.E(this.f3569g, 9);
        return x6.i.a(sVar);
    }

    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) throws p0 {
        String strH;
        this.f3568f.getClass();
        int length = (int) oVar.getLength();
        int i10 = this.f3570h;
        byte[] bArr = this.f3569g;
        if (i10 == bArr.length) {
            this.f3569g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f3569g;
        int i11 = this.f3570h;
        int i12 = oVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f3570h + i12;
            this.f3570h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        p4.s sVar = new p4.s(this.f3569g);
        x6.i.d(sVar);
        String strH2 = sVar.h(StandardCharsets.UTF_8);
        long jV = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = sVar.h(StandardCharsets.UTF_8);
                    if (strH3 == null) {
                        break;
                    }
                    if (x6.i.f24830a.matcher(strH3).matches()) {
                        do {
                            strH = sVar.h(StandardCharsets.UTF_8);
                            if (strH != null) {
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = x6.h.f24826a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = x6.i.c(strGroup);
                int i14 = c0.f16548a;
                long jB = this.f3564b.b(c0.V((jV + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                h0 h0VarB = b(jB - jC2);
                byte[] bArr3 = this.f3569g;
                int i15 = this.f3570h;
                p4.s sVar2 = this.f3565c;
                sVar2.E(bArr3, i15);
                h0VarB.e(this.f3570h, sVar2);
                h0VarB.a(jB, 1, this.f3570h, 0, null);
                return -1;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f3561i.matcher(strH2);
                if (!matcher3.find()) {
                    throw p0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2));
                }
                Matcher matcher4 = f3562j.matcher(strH2);
                if (!matcher4.find()) {
                    throw p0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = x6.i.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j10 = Long.parseLong(strGroup3);
                int i16 = c0.f16548a;
                jV = c0.V(j10, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strH2 = sVar.h(StandardCharsets.UTF_8);
        }
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        if (this.f3567e) {
            qVar = new d0(qVar, this.f3566d);
        }
        this.f3568f = qVar;
        qVar.a(new r5.s(-9223372036854775807L));
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final r5.n c() {
        return this;
    }
}
