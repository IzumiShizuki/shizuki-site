package u9;

import a0.u;
import android.view.View;
import ic.p;
import java.util.ArrayList;
import java.util.List;
import na.q;
import u3.s;
import ub.a0;
import vb.m;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.i implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ u f21478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ u f21479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f21480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f21481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, w0 w0Var, yb.c cVar) {
        super(4, cVar);
        this.f21480g = view;
        this.f21481h = w0Var;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        h hVar = new h(this.f21480g, this.f21481h, (yb.c) obj4);
        hVar.f21478e = (u) obj2;
        hVar.f21479f = (u) obj3;
        a0 a0Var = a0.f21526a;
        hVar.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        u uVar = this.f21478e;
        u uVar2 = this.f21479f;
        ub.a.f(obj);
        w0 w0Var = this.f21481h;
        ArrayList arrayListH0 = m.H0((List) w0Var.getValue());
        arrayListH0.add(uVar2.f131a, arrayListH0.remove(uVar.f131a));
        w0Var.setValue(arrayListH0);
        q.d("new order: " + ((List) w0Var.getValue()), "");
        s.a(this.f21480g, 27);
        return a0.f21526a;
    }
}
