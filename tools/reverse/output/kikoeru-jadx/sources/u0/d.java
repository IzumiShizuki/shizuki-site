package u0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ic.n;
import q.t0;
import q1.h0;
import q1.q;
import s.m0;
import s.n0;
import x0.o;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f21184b;

    public d(float f10, w0 w0Var) {
        this.f21183a = f10;
        this.f21184b = w0Var;
    }

    @Override // s.m0
    public final n0 a(w.k kVar, o oVar) {
        long j10;
        oVar.W(988743187);
        c cVar = (c) oVar.j(l.f21204a);
        w0 w0Var = this.f21184b;
        if (((q) w0Var.getValue()).f17577a != 16) {
            oVar.W(-303557454);
            oVar.p(false);
            j10 = ((q) w0Var.getValue()).f17577a;
        } else {
            oVar.W(-303499670);
            cVar.getClass();
            oVar.W(2042140174);
            j10 = q.f17569b;
            h0.r(j10);
            oVar.p(false);
            oVar.p(false);
        }
        w0 w0VarY = v.y(new q(j10), oVar);
        cVar.getClass();
        oVar.W(-1629816343);
        e eVar = ((double) h0.r(q.f17569b)) > 0.5d ? l.f21205b : l.f21206c;
        oVar.p(false);
        w0 w0VarY2 = v.y(eVar, oVar);
        oVar.W(331259447);
        ViewGroup viewGroupC = n7.e.c((View) oVar.j(AndroidCompositionLocals_androidKt.f725f));
        boolean zF = oVar.f(kVar) | oVar.f(this) | oVar.f(viewGroupC);
        Object objK = oVar.K();
        Object obj = x0.k.f24334a;
        if (zF || objK == obj) {
            objK = new a(this.f21183a, w0VarY, w0VarY2, viewGroupC);
            oVar.h0(objK);
        }
        a aVar = (a) objK;
        oVar.p(false);
        boolean zF2 = oVar.f(kVar) | oVar.h(aVar);
        Object objK2 = oVar.K();
        if (zF2 || objK2 == obj) {
            objK2 = new q.q(kVar, aVar, (yb.c) null, 16);
            oVar.h0(objK2);
        }
        v.f(aVar, kVar, (n) objK2, oVar);
        oVar.p(false);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f3.f.a(this.f21183a, dVar.f21183a) && this.f21184b.equals(dVar.f21184b);
    }

    public final int hashCode() {
        return this.f21184b.hashCode() + t0.x(this.f21183a, 38347, 31);
    }
}
