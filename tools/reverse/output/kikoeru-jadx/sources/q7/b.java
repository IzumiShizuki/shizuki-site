package q7;

import i7.p2;
import ic.n;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f17893a;

    public b(p2 p2Var) {
        this.f17893a = p2Var;
    }

    @Override // p7.b
    public final Object S(boolean z10, n nVar, ac.c cVar) {
        a8.b bVar = (a8.b) this.f17893a.f9258a;
        bVar.getClass();
        return nVar.q(new d(new a(bVar.getWritableDatabase())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((a8.b) this.f17893a.f9258a).close();
    }
}
