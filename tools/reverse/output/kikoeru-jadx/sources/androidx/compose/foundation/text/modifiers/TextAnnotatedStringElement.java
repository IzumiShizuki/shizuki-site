package androidx.compose.foundation.text.modifiers;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import ic.k;
import j1.p;
import j2.h0;
import jc.l;
import k0.m;
import kotlin.Metadata;
import q1.r;
import t2.g;
import t2.l0;
import x2.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Li2/a1;", "Lk0/m;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class TextAnnotatedStringElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f655i;

    public TextAnnotatedStringElement(g gVar, l0 l0Var, d dVar, k kVar, int i10, boolean z10, int i11, int i12, r rVar) {
        this.f647a = gVar;
        this.f648b = l0Var;
        this.f649c = dVar;
        this.f650d = kVar;
        this.f651e = i10;
        this.f652f = z10;
        this.f653g = i11;
        this.f654h = i12;
        this.f655i = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return l.a(this.f655i, textAnnotatedStringElement.f655i) && this.f647a.equals(textAnnotatedStringElement.f647a) && l.a(this.f648b, textAnnotatedStringElement.f648b) && l.a(this.f649c, textAnnotatedStringElement.f649c) && this.f650d == textAnnotatedStringElement.f650d && this.f651e == textAnnotatedStringElement.f651e && this.f652f == textAnnotatedStringElement.f652f && this.f653g == textAnnotatedStringElement.f653g && this.f654h == textAnnotatedStringElement.f654h;
    }

    @Override // i2.a1
    public final p h() {
        return new m(this.f647a, this.f648b, this.f649c, this.f650d, this.f651e, this.f652f, this.f653g, this.f654h, null, this.f655i);
    }

    public final int hashCode() {
        int iHashCode = (this.f649c.hashCode() + h0.f(this.f647a.hashCode() * 31, 31, this.f648b)) * 31;
        k kVar = this.f650d;
        int iHashCode2 = (((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f651e) * 31) + (this.f652f ? 1231 : 1237)) * 31) + this.f653g) * 31) + this.f654h) * 923521;
        r rVar = this.f655i;
        return (iHashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // i2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(j1.p r9) {
        /*
            r8 = this;
            r0 = r9
            k0.m r0 = (k0.m) r0
            q1.r r9 = r0.f10960x
            q1.r r1 = r8.f655i
            boolean r9 = jc.l.a(r1, r9)
            r0.f10960x = r1
            if (r9 == 0) goto L25
            t2.l0 r9 = r0.f10952p
            t2.l0 r1 = r8.f648b
            if (r1 == r9) goto L20
            t2.d0 r1 = r1.f20362a
            t2.d0 r9 = r9.f20362a
            boolean r9 = r1.b(r9)
            if (r9 == 0) goto L25
            goto L23
        L20:
            r1.getClass()
        L23:
            r9 = 0
            goto L26
        L25:
            r9 = 1
        L26:
            t2.g r1 = r8.f647a
            boolean r7 = r0.G0(r1)
            x2.d r5 = r8.f649c
            int r6 = r8.f651e
            t2.l0 r1 = r8.f648b
            int r2 = r8.f654h
            int r3 = r8.f653g
            boolean r4 = r8.f652f
            boolean r1 = r0.F0(r1, r2, r3, r4, r5, r6)
            ic.k r2 = r8.f650d
            r3 = 0
            boolean r2 = r0.E0(r2, r3)
            r0.B0(r9, r7, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.l(j1.p):void");
    }
}
