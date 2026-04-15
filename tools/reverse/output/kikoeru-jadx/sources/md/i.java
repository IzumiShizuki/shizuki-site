package md;

import b0.w1;
import java.util.Map;
import jc.l;
import jc.s;
import jc.z;
import n7.b0;
import pc.u;
import re.o;
import vc.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f15118g = {z.f10839a.g(new s(i.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.i f15119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ed.e eVar, w1 w1Var) {
        super(w1Var, eVar, n.f22894w);
        l.e(eVar, "annotation");
        l.e(w1Var, "c");
        o oVar = ((od.a) w1Var.f1395c).f16315a;
        bd.e eVar2 = new bd.e(10, this);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f15119f = new re.i(lVar, eVar2);
    }

    @Override // md.b, zc.b
    public final Map c() {
        return (Map) b0.r(this.f15119f, f15118g[0]);
    }
}
