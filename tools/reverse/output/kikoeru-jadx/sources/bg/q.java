package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f2954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2955b;

    static {
        q qVar = new q();
        f2954a = qVar;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.PlayLists", qVar, 2);
        b1Var.b("pagination", false);
        b1Var.b("playlists", false);
        f2955b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2955b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2955b;
        vf.a aVarI = bVar.i(b1Var);
        Object objG = null;
        Object objG2 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objG = aVarI.g(b1Var, 0, m.Companion.serializer(), objG);
                i10 |= 1;
            } else {
                if (iB != 1) {
                    throw new sf.l(iB);
                }
                objG2 = aVarI.g(b1Var, 1, new wf.d(n.f2929a, 0), objG2);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new s(i10, (m) objG, (List) objG2);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{m.Companion.serializer(), new wf.d(n.f2929a, 0)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        s sVar = (s) obj;
        jc.l.e(sVar, "value");
        wf.b1 b1Var = f2955b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.r(b1Var, 0, m.Companion.serializer(), sVar.f2960a);
        tVarA.r(b1Var, 1, new wf.d(n.f2929a, 0), sVar.f2961b);
        tVarA.w(b1Var);
    }
}
