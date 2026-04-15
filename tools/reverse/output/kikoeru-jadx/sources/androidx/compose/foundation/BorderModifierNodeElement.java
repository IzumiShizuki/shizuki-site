package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q1.l0;
import q1.n0;
import s.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Li2/a1;", "Ls/n;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f461c;

    public BorderModifierNodeElement(float f10, n0 n0Var, l0 l0Var) {
        this.f459a = f10;
        this.f460b = n0Var;
        this.f461c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return f3.f.a(this.f459a, borderModifierNodeElement.f459a) && this.f460b.equals(borderModifierNodeElement.f460b) && l.a(this.f461c, borderModifierNodeElement.f461c);
    }

    @Override // i2.a1
    public final p h() {
        return new n(this.f459a, this.f460b, this.f461c);
    }

    public final int hashCode() {
        return this.f461c.hashCode() + ((this.f460b.hashCode() + (Float.floatToIntBits(this.f459a) * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        n nVar = (n) pVar;
        float f10 = nVar.f19229r;
        n1.b bVar = nVar.f19232u;
        float f11 = this.f459a;
        if (!f3.f.a(f10, f11)) {
            nVar.f19229r = f11;
            bVar.B0();
        }
        n0 n0Var = nVar.f19230s;
        n0 n0Var2 = this.f460b;
        if (!l.a(n0Var, n0Var2)) {
            nVar.f19230s = n0Var2;
            bVar.B0();
        }
        l0 l0Var = nVar.f19231t;
        l0 l0Var2 = this.f461c;
        if (l.a(l0Var, l0Var2)) {
            return;
        }
        nVar.f19231t = l0Var2;
        bVar.B0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) f3.f.b(this.f459a)) + ", brush=" + this.f460b + ", shape=" + this.f461c + ')';
    }
}
