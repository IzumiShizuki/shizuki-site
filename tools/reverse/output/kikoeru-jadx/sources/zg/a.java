package zg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import lh.a0;
import lh.j0;
import tc.b0;
import ug.d0;
import ug.u;
import ug.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26818a = new a();

    @Override // ug.u
    public final d0 a(ah.h hVar) throws IOException {
        ah.f hVar2;
        n nVar = hVar.f377a;
        synchronized (nVar) {
            if (!nVar.f26882o) {
                throw new IllegalStateException("released");
            }
            if (nVar.f26879l || nVar.f26878k || nVar.f26881n || nVar.f26880m) {
                throw new IllegalStateException("Check failed.");
            }
        }
        h hVar3 = nVar.f26874g;
        jc.l.b(hVar3);
        o oVarA = hVar3.a();
        x xVar = nVar.f26868a;
        oVarA.getClass();
        int i10 = hVar.f383g;
        b0 b0Var = oVarA.f26892h;
        ch.p pVar = oVarA.f26893i;
        if (pVar != null) {
            hVar2 = new ch.q(xVar, oVarA, hVar, pVar);
        } else {
            oVarA.f26889e.setSoTimeout(i10);
            j0 j0VarA = ((lh.b0) b0Var.f20619c).f12544a.a();
            long j10 = i10;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j0VarA.g(j10);
            ((a0) b0Var.f20620d).f12541a.a().g(hVar.f384h);
            hVar2 = new bh.h(xVar, oVarA, b0Var);
        }
        b5.d0 d0Var = new b5.d0(nVar, hVar3, hVar2);
        nVar.f26877j = d0Var;
        nVar.f26884q = d0Var;
        synchronized (nVar) {
            nVar.f26878k = true;
            nVar.f26879l = true;
        }
        if (nVar.f26883p) {
            throw new IOException("Canceled");
        }
        return ah.h.a(hVar, 0, d0Var, null, 61).b(hVar.f381e);
    }
}
