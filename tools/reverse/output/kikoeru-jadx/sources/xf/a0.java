package xf;

import java.util.Map;
import wf.e0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f24985a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f24986b = z.f25023b;

    @Override // sf.a
    public final uf.g a() {
        return f24986b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        ua.j.e(bVar);
        n1 n1Var = n1.f24152a;
        o oVar = o.f25013a;
        return new y((Map) new e0(n1.f24152a, o.f25013a, 1).b(bVar));
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        y yVar = (y) obj;
        jc.l.e(yVar, "value");
        ua.j.d(tVar);
        n1 n1Var = n1.f24152a;
        o oVar = o.f25013a;
        new e0(n1.f24152a, o.f25013a, 1).d(tVar, yVar);
    }
}
