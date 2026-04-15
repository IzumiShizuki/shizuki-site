package androidx.compose.foundation.text.modifiers;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import j2.h0;
import jc.l;
import kotlin.Metadata;
import q1.r;
import t2.l0;
import x2.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Li2/a1;", "Lk0/p;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class TextStringSimpleElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f663h;

    public TextStringSimpleElement(String str, l0 l0Var, d dVar, int i10, boolean z10, int i11, int i12, r rVar) {
        this.f656a = str;
        this.f657b = l0Var;
        this.f658c = dVar;
        this.f659d = i10;
        this.f660e = z10;
        this.f661f = i11;
        this.f662g = i12;
        this.f663h = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return l.a(this.f663h, textStringSimpleElement.f663h) && l.a(this.f656a, textStringSimpleElement.f656a) && l.a(this.f657b, textStringSimpleElement.f657b) && l.a(this.f658c, textStringSimpleElement.f658c) && this.f659d == textStringSimpleElement.f659d && this.f660e == textStringSimpleElement.f660e && this.f661f == textStringSimpleElement.f661f && this.f662g == textStringSimpleElement.f662g;
    }

    @Override // i2.a1
    public final p h() {
        k0.p pVar = new k0.p();
        pVar.f10969o = this.f656a;
        pVar.f10970p = this.f657b;
        pVar.f10971q = this.f658c;
        pVar.f10972r = this.f659d;
        pVar.f10973s = this.f660e;
        pVar.f10974t = this.f661f;
        pVar.f10975u = this.f662g;
        pVar.f10976v = this.f663h;
        return pVar;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f658c.hashCode() + h0.f(this.f656a.hashCode() * 31, 31, this.f657b)) * 31) + this.f659d) * 31) + (this.f660e ? 1231 : 1237)) * 31) + this.f661f) * 31) + this.f662g) * 31;
        r rVar = this.f663h;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // i2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(j1.p r12) {
        /*
            r11 = this;
            k0.p r12 = (k0.p) r12
            q1.r r0 = r12.f10976v
            q1.r r1 = r11.f663h
            boolean r0 = jc.l.a(r1, r0)
            r12.f10976v = r1
            r1 = 0
            r2 = 1
            t2.l0 r3 = r11.f657b
            if (r0 == 0) goto L26
            t2.l0 r0 = r12.f10970p
            if (r3 == r0) goto L21
            t2.d0 r4 = r3.f20362a
            t2.d0 r0 = r0.f20362a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            java.lang.String r4 = r12.f10969o
            java.lang.String r5 = r11.f656a
            boolean r4 = jc.l.a(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.f10969o = r5
            r1 = 0
            r12.f10980z = r1
            r1 = 1
        L38:
            t2.l0 r4 = r12.f10970p
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.f10970p = r3
            int r3 = r12.f10975u
            int r5 = r11.f662g
            if (r3 == r5) goto L4a
            r12.f10975u = r5
            r4 = 1
        L4a:
            int r3 = r12.f10974t
            int r5 = r11.f661f
            if (r3 == r5) goto L53
            r12.f10974t = r5
            r4 = 1
        L53:
            boolean r3 = r12.f10973s
            boolean r5 = r11.f660e
            if (r3 == r5) goto L5c
            r12.f10973s = r5
            r4 = 1
        L5c:
            x2.d r3 = r12.f10971q
            x2.d r5 = r11.f658c
            boolean r3 = jc.l.a(r3, r5)
            if (r3 != 0) goto L69
            r12.f10971q = r5
            r4 = 1
        L69:
            int r3 = r12.f10972r
            int r5 = r11.f659d
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.f10972r = r5
        L73:
            if (r1 != 0) goto L77
            if (r2 == 0) goto L9a
        L77:
            k0.e r3 = r12.B0()
            java.lang.String r4 = r12.f10969o
            t2.l0 r5 = r12.f10970p
            x2.d r6 = r12.f10971q
            int r7 = r12.f10972r
            boolean r8 = r12.f10973s
            int r9 = r12.f10974t
            int r10 = r12.f10975u
            r3.f10909a = r4
            r3.f10910b = r5
            r3.f10911c = r6
            r3.f10912d = r7
            r3.f10913e = r8
            r3.f10914f = r9
            r3.f10915g = r10
            r3.b()
        L9a:
            boolean r3 = r12.f9703n
            if (r3 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            k0.o r3 = r12.f10979y
            if (r3 == 0) goto Laa
        La7:
            i2.f.o(r12)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            i2.f.n(r12)
            i2.f.m(r12)
        Lb4:
            if (r0 == 0) goto Lb9
            i2.f.m(r12)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.l(j1.p):void");
    }
}
