package androidx.compose.foundation.text.modifiers;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import ic.k;
import j1.p;
import j2.h0;
import jc.l;
import k0.f;
import k0.h;
import kotlin.Metadata;
import lc.b;
import q1.r;
import t2.g;
import t2.l0;
import x2.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Li2/a1;", "Lk0/f;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final /* data */ class SelectableTextAnnotatedStringElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f646j;

    public SelectableTextAnnotatedStringElement(g gVar, l0 l0Var, d dVar, k kVar, int i10, boolean z10, int i11, int i12, h hVar, r rVar) {
        this.f637a = gVar;
        this.f638b = l0Var;
        this.f639c = dVar;
        this.f640d = kVar;
        this.f641e = i10;
        this.f642f = z10;
        this.f643g = i11;
        this.f644h = i12;
        this.f645i = hVar;
        this.f646j = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return l.a(this.f646j, selectableTextAnnotatedStringElement.f646j) && this.f637a.equals(selectableTextAnnotatedStringElement.f637a) && l.a(this.f638b, selectableTextAnnotatedStringElement.f638b) && l.a(this.f639c, selectableTextAnnotatedStringElement.f639c) && this.f640d == selectableTextAnnotatedStringElement.f640d && this.f641e == selectableTextAnnotatedStringElement.f641e && this.f642f == selectableTextAnnotatedStringElement.f642f && this.f643g == selectableTextAnnotatedStringElement.f643g && this.f644h == selectableTextAnnotatedStringElement.f644h && this.f645i.equals(selectableTextAnnotatedStringElement.f645i);
    }

    @Override // i2.a1
    public final p h() {
        return new f(this.f637a, this.f638b, this.f639c, this.f640d, this.f641e, this.f642f, this.f643g, this.f644h, this.f645i, this.f646j);
    }

    public final int hashCode() {
        int iHashCode = (this.f639c.hashCode() + h0.f(this.f637a.hashCode() * 31, 31, this.f638b)) * 31;
        k kVar = this.f640d;
        int iHashCode2 = (this.f645i.hashCode() + ((((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f641e) * 31) + (this.f642f ? 1231 : 1237)) * 31) + this.f643g) * 31) + this.f644h) * 29791)) * 961;
        r rVar = this.f646j;
        return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // i2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(j1.p r11) {
        /*
            r10 = this;
            k0.f r11 = (k0.f) r11
            k0.m r0 = r11.f10928r
            q1.r r1 = r0.f10960x
            q1.r r2 = r10.f646j
            boolean r1 = jc.l.a(r2, r1)
            r0.f10960x = r2
            t2.l0 r4 = r10.f638b
            if (r1 == 0) goto L26
            t2.l0 r1 = r0.f10952p
            if (r4 == r1) goto L21
            t2.d0 r2 = r4.f20362a
            t2.d0 r1 = r1.f20362a
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r4.getClass()
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            t2.g r2 = r10.f637a
            boolean r2 = r0.G0(r2)
            k0.m r3 = r11.f10928r
            int r5 = r10.f644h
            int r6 = r10.f643g
            boolean r7 = r10.f642f
            x2.d r8 = r10.f639c
            int r9 = r10.f641e
            boolean r3 = r3.F0(r4, r5, r6, r7, r8, r9)
            ic.k r4 = r10.f640d
            k0.h r5 = r10.f645i
            boolean r4 = r0.E0(r4, r5)
            r0.B0(r1, r2, r3, r4)
            r11.f10927q = r5
            i2.f.n(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.l(j1.p):void");
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f637a) + ", style=" + this.f638b + ", fontFamilyResolver=" + this.f639c + ", onTextLayout=" + this.f640d + ", overflow=" + ((Object) b.W(this.f641e)) + ", softWrap=" + this.f642f + ", maxLines=" + this.f643g + ", minLines=" + this.f644h + ", placeholders=null, onPlaceholderLayout=null, selectionController=" + this.f645i + ", color=" + this.f646j + ", autoSize=null)";
    }
}
