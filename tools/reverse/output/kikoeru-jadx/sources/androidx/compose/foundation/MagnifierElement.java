package androidx.compose.foundation;

import android.view.View;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import ic.k;
import j1.p;
import jc.l;
import jc.m;
import kotlin.Metadata;
import q2.w;
import s.e1;
import s.t0;
import s.u0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Li2/a1;", "Ls/t0;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class MagnifierElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f480c;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(k kVar, k kVar2, e1 e1Var) {
        this.f478a = (m) kVar;
        this.f479b = (m) kVar2;
        this.f480c = e1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ic.k, jc.m] */
    @Override // i2.a1
    public final p h() {
        return new t0(this.f478a, this.f479b, this.f480c);
    }

    public final int hashCode() {
        int i10 = (int) 9205357638345293824L;
        return this.f480c.hashCode() + ((this.f479b.hashCode() + ((((Float.floatToIntBits(Float.NaN) + q.t0.x(Float.NaN, (i10 + ((((Float.floatToIntBits(Float.NaN) + (this.f478a.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        t0 t0Var = (t0) pVar;
        t0Var.getClass();
        e1 e1Var = t0Var.f19275q;
        View view = t0Var.f19276r;
        f3.c cVar = t0Var.f19277s;
        t0Var.f19273o = this.f478a;
        t0Var.f19274p = this.f479b;
        e1 e1Var2 = this.f480c;
        t0Var.f19275q = e1Var2;
        View viewA = i2.f.A(t0Var);
        f3.c cVar2 = i2.f.y(t0Var).f8766y;
        if (t0Var.f19278t != null) {
            w wVar = u0.f19286a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !e1Var2.a()) || !f3.f.a(Float.NaN, Float.NaN) || !f3.f.a(Float.NaN, Float.NaN) || !e1Var2.equals(e1Var) || !viewA.equals(view) || !l.a(cVar2, cVar)) {
                t0Var.C0();
            }
        }
        t0Var.D0();
    }
}
