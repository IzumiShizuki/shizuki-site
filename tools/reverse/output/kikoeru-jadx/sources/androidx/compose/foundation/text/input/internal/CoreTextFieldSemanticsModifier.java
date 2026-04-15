package androidx.compose.foundation.text.input.internal;

import com.tencent.bugly.beta.tinker.TinkerReport;
import h0.u0;
import i2.a1;
import j0.d;
import j0.f;
import j1.p;
import jc.l;
import kotlin.Metadata;
import l0.l1;
import t2.k0;
import y2.d0;
import y2.j;
import y2.r;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Li2/a1;", "Lj0/f;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final /* data */ class CoreTextFieldSemanticsModifier extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1 f631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1.r f633j;

    public CoreTextFieldSemanticsModifier(d0 d0Var, y yVar, u0 u0Var, boolean z10, boolean z11, boolean z12, r rVar, l1 l1Var, j jVar, o1.r rVar2) {
        this.f624a = d0Var;
        this.f625b = yVar;
        this.f626c = u0Var;
        this.f627d = z10;
        this.f628e = z11;
        this.f629f = z12;
        this.f630g = rVar;
        this.f631h = l1Var;
        this.f632i = jVar;
        this.f633j = rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return this.f624a.equals(coreTextFieldSemanticsModifier.f624a) && l.a(this.f625b, coreTextFieldSemanticsModifier.f625b) && this.f626c.equals(coreTextFieldSemanticsModifier.f626c) && this.f627d == coreTextFieldSemanticsModifier.f627d && this.f628e == coreTextFieldSemanticsModifier.f628e && this.f629f == coreTextFieldSemanticsModifier.f629f && l.a(this.f630g, coreTextFieldSemanticsModifier.f630g) && this.f631h.equals(coreTextFieldSemanticsModifier.f631h) && l.a(this.f632i, coreTextFieldSemanticsModifier.f632i) && l.a(this.f633j, coreTextFieldSemanticsModifier.f633j);
    }

    @Override // i2.a1
    public final p h() {
        f fVar = new f();
        fVar.f9594q = this.f624a;
        fVar.f9595r = this.f625b;
        fVar.f9596s = this.f626c;
        fVar.f9597t = this.f627d;
        fVar.f9598u = this.f628e;
        fVar.f9599v = this.f629f;
        fVar.f9600w = this.f630g;
        l1 l1Var = this.f631h;
        fVar.f9601x = l1Var;
        fVar.f9602y = this.f632i;
        fVar.f9603z = this.f633j;
        l1Var.f11531g = new d(fVar, 0);
        return fVar;
    }

    public final int hashCode() {
        return this.f633j.hashCode() + ((this.f632i.hashCode() + ((this.f631h.hashCode() + ((this.f630g.hashCode() + ((((((((this.f626c.hashCode() + ((this.f625b.hashCode() + (this.f624a.hashCode() * 31)) * 31)) * 31) + (this.f627d ? 1231 : 1237)) * 31) + (this.f628e ? 1231 : 1237)) * 31) + (this.f629f ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        f fVar = (f) pVar;
        boolean z10 = fVar.f9598u;
        boolean z11 = false;
        boolean z12 = z10 && !fVar.f9597t;
        boolean z13 = fVar.f9599v;
        j jVar = fVar.f9602y;
        l1 l1Var = fVar.f9601x;
        boolean z14 = this.f627d;
        boolean z15 = this.f628e;
        if (z15 && !z14) {
            z11 = true;
        }
        fVar.f9594q = this.f624a;
        y yVar = this.f625b;
        fVar.f9595r = yVar;
        fVar.f9596s = this.f626c;
        fVar.f9597t = z14;
        fVar.f9598u = z15;
        fVar.f9600w = this.f630g;
        l1 l1Var2 = this.f631h;
        fVar.f9601x = l1Var2;
        j jVar2 = this.f632i;
        fVar.f9602y = jVar2;
        fVar.f9603z = this.f633j;
        if (z15 != z10 || z11 != z12 || !l.a(jVar2, jVar) || this.f629f != z13 || !k0.b(yVar.f25435b)) {
            i2.f.o(fVar);
        }
        if (l1Var2.equals(l1Var)) {
            return;
        }
        l1Var2.f11531g = new d(fVar, 7);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f624a + ", value=" + this.f625b + ", state=" + this.f626c + ", readOnly=" + this.f627d + ", enabled=" + this.f628e + ", isPassword=" + this.f629f + ", offsetMapping=" + this.f630g + ", manager=" + this.f631h + ", imeOptions=" + this.f632i + ", focusRequester=" + this.f633j + ')';
    }
}
