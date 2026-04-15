package t9;

import hf.j;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import jc.l;
import n7.w;
import ub.a0;
import ub.k;
import wf.s0;
import wf.y;
import wf.z0;
import x0.q1;
import x0.t1;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20583b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f20582a = i10;
        this.f20583b = obj;
    }

    @Override // ic.a
    public final Object b() {
        j jVarY;
        switch (this.f20582a) {
            case 0:
                a aVar = (a) this.f20583b;
                d9.j jVarR = a9.i.c().r();
                String strName = aVar.name();
                jVarR.getClass();
                l.e(strName, "type");
                return new d9.f(new w("SELECT * FROM BlacklistBean WHERE type=(?)", new a9.j(1, strName)), jVarR, jVarR.f5571a, new String[]{"BlacklistBean"}, 1);
            case 1:
                fg.f fVar = (fg.f) this.f20583b;
                u9.i[] iVarArrValues = u9.i.values();
                ArrayList arrayList = new ArrayList(iVarArrValues.length);
                for (u9.i iVar : iVarArrValues) {
                    arrayList.add(new k(iVar, Boolean.valueOf(iVar.f21484a)));
                }
                r rVar = na.w.f15765a;
                rVar.getClass();
                fVar.setValue(rVar.b(new wf.d(new s0(new y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", u9.i.values()), wf.g.f24118a, 1), 0), arrayList));
                return a0.f21526a;
            case 2:
                uf.h hVar = (uf.h) this.f20583b;
                return Integer.valueOf(z0.e(hVar, hVar.f21701k));
            case 3:
                return jc.k.a((Object[]) this.f20583b);
            case 4:
                return ((Iterable) this.f20583b).iterator();
            case 5:
                w7.e eVar = (w7.e) this.f20583b;
                eVar.f().W0(new w7.b(eVar, 0));
                return a0.f21526a;
            case 6:
                return ud.e.f("kotlin.Unit", uf.k.f21708e, new uf.g[0], new e7.y(18, (bg.k) this.f20583b));
            default:
                t1 t1Var = (t1) this.f20583b;
                synchronized (t1Var.f24468b) {
                    jVarY = t1Var.y();
                    if (((q1) t1Var.f24486t.getValue()).compareTo(q1.f24428b) <= 0) {
                        Throwable th2 = t1Var.f24470d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th2);
                        throw cancellationException;
                    }
                }
                if (jVarY != null) {
                    ((hf.k) jVarY).h(a0.f21526a);
                }
                return a0.f21526a;
        }
    }
}
