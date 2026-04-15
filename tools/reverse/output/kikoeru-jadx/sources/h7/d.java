package h7;

import android.os.Bundle;
import ba.e0;
import hf.y;
import jc.l;
import jc.u;
import q9.c0;
import q9.r0;
import ub.a0;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8151e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8147a = i10;
        this.f8148b = obj;
        this.f8149c = obj2;
        this.f8150d = obj3;
        this.f8151e = obj4;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f8147a) {
            case 0:
                u uVar = (u) this.f8148b;
                g gVar = (g) this.f8149c;
                e7.u uVar2 = (e7.u) this.f8150d;
                Bundle bundle = (Bundle) this.f8151e;
                e7.j jVar = (e7.j) obj;
                l.e(jVar, "it");
                uVar.f10834a = true;
                gVar.a(uVar2, bundle, jVar, r.f22819a);
                break;
            default:
                j7.b bVar = (j7.b) this.f8148b;
                r0 r0Var = (r0) this.f8149c;
                y yVar = (y) this.f8150d;
                String str = (String) this.f8151e;
                a0.j jVar2 = (a0.j) obj;
                l.e(jVar2, "$this$LazyColumn");
                jVar2.l(new f1.f(new c0(1, yVar, r0Var), 738761487, true));
                na.c.h(jVar2, bVar, new f1.f(new e0(yVar, r0Var, str, 2), 1764714954, true));
                break;
        }
        return a0.f21526a;
    }
}
