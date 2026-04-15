package u9;

import android.view.View;
import ic.p;
import jc.l;
import ub.a0;
import x0.o;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f21470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f21471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f21472e;

    public f(boolean z10, int i10, w0 w0Var, View view, i iVar) {
        this.f21468a = z10;
        this.f21469b = i10;
        this.f21470c = w0Var;
        this.f21471d = view;
        this.f21472e = iVar;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        uh.j jVar = (uh.j) obj;
        ((Boolean) obj2).getClass();
        o oVar = (o) obj3;
        int iIntValue = ((Number) obj4).intValue();
        l.e(jVar, "$this$ReorderableItem");
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(jVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 131) != 130)) {
            g8.a.a(null, null, 0L, 0.0f, f1.g.f(1798741544, new e(jVar, this.f21468a, this.f21469b, this.f21470c, this.f21471d, this.f21472e), oVar), oVar, 1572864, 63);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }
}
