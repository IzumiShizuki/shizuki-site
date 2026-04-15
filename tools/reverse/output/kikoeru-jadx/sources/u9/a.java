package u9;

import hf.y;
import ic.n;
import java.util.List;
import na.w;
import ub.a0;
import wf.s0;
import x0.w0;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21453e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg.f f21454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f21455g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fg.f fVar, w0 w0Var, yb.c cVar) {
        super(2, cVar);
        this.f21454f = fVar;
        this.f21455g = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f21453e) {
            case 0:
                return new a(this.f21455g, this.f21454f, cVar);
            default:
                return new a(this.f21454f, this.f21455g, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f21453e) {
            case 0:
                a aVar = (a) o(yVar, cVar);
                a0 a0Var = a0.f21526a;
                aVar.u(a0Var);
                return a0Var;
            default:
                a aVar2 = (a) o(yVar, cVar);
                a0 a0Var2 = a0.f21526a;
                aVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f21453e) {
            case 0:
                ub.a.f(obj);
                List list = (List) this.f21455g.getValue();
                r rVar = w.f15765a;
                rVar.getClass();
                this.f21454f.setValue(rVar.b(new wf.d(new s0(new wf.y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", i.values()), wf.g.f24118a, 1), 0), list));
                break;
            default:
                ub.a.f(obj);
                String str = (String) this.f21454f.getValue();
                r rVar2 = w.f15765a;
                rVar2.getClass();
                this.f21455g.setValue((List) rVar2.a(str, new wf.d(new s0(new wf.y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", i.values()), wf.g.f24118a, 1), 0)));
                break;
        }
        return a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w0 w0Var, fg.f fVar, yb.c cVar) {
        super(2, cVar);
        this.f21455g = w0Var;
        this.f21454f = fVar;
    }
}
