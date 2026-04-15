package u9;

import android.view.View;
import ic.n;
import m0.b4;
import ub.a0;
import x0.o;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh.j f21462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f21465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f21466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f21467f;

    public e(uh.j jVar, boolean z10, int i10, w0 w0Var, View view, i iVar) {
        this.f21462a = jVar;
        this.f21463b = z10;
        this.f21464c = i10;
        this.f21465d = w0Var;
        this.f21466e = view;
        this.f21467f = iVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        o oVar = (o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            uh.j jVar = this.f21462a;
            android.support.v4.media.session.b.g(ud.n.e(jVar, null, null, 15), f1.g.f(382487175, new c(this.f21463b, this.f21464c, this.f21465d), oVar), null, false, null, f1.g.f(-1120846709, new ee.b(11, jVar, this.f21466e), oVar), f1.g.f(-1496680180, new b4(1, this.f21467f), oVar), oVar, 1769520, 28);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }
}
