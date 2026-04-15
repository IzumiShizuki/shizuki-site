package xg;

import java.io.IOException;
import lh.h0;
import lh.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f25031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f25032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h0 h0Var, g gVar, c cVar) {
        super(h0Var);
        this.f25031c = gVar;
        this.f25032d = cVar;
    }

    @Override // lh.o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f25030b) {
            return;
        }
        this.f25030b = true;
        g gVar = this.f25031c;
        c cVar = this.f25032d;
        synchronized (gVar) {
            int i10 = cVar.f25040h - 1;
            cVar.f25040h = i10;
            if (i10 == 0 && cVar.f25038f) {
                gVar.D(cVar);
            }
        }
    }
}
