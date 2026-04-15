package xf;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f24991a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uf.h f24992b = ud.e.h("kotlinx.serialization.json.JsonPrimitive", uf.e.f21690j, new uf.g[0]);

    @Override // sf.a
    public final uf.g a() {
        return f24992b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        m mVarL = ua.j.e(bVar).l();
        if (mVarL instanceof c0) {
            return (c0) mVarL;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw yf.k.e(-1, t0.F(jc.z.f10839a, mVarL.getClass(), sb), mVarL.toString());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        c0 c0Var = (c0) obj;
        jc.l.e(c0Var, "value");
        ua.j.d(tVar);
        if (c0Var instanceof v) {
            tVar.s(w.f25020a, v.INSTANCE);
        } else {
            tVar.s(t.f25018a, (s) c0Var);
        }
    }
}
