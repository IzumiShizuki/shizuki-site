package androidx.compose.animation;

import a0.c;
import com.tencent.bugly.beta.tinker.TinkerReport;
import h2.g;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q.d1;
import q.e1;
import q.f1;
import q.h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SharedBoundsNodeElement;", "Li2/a1;", "Lq/e1;", "animation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final /* data */ class SharedBoundsNodeElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f452a;

    public SharedBoundsNodeElement(h1 h1Var) {
        this.f452a = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && l.a(this.f452a, ((SharedBoundsNodeElement) obj).f452a);
    }

    @Override // i2.a1
    public final p h() {
        return new e1(this.f452a);
    }

    public final int hashCode() {
        return this.f452a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        e1 e1Var = (e1) pVar;
        h1 h1Var = e1Var.f17283o;
        h1 h1Var2 = this.f452a;
        if (h1Var2.equals(h1Var)) {
            return;
        }
        e1Var.f17283o = h1Var2;
        if (e1Var.f9703n) {
            g gVar = f1.f17294a;
            c.p(e1Var, gVar, h1Var2);
            e1Var.f17283o.f17326l = (h1) c.a(e1Var, gVar);
            h1 h1Var3 = e1Var.f17283o;
            h1Var3.f17327m.setValue(e1Var.f17284p);
            e1Var.f17283o.f17325k = new d1(e1Var, 1);
        }
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f452a + ')';
    }
}
