package hb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends eb.z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f8323b = new k(0, new l(eb.y.f6473b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb.y f8324a;

    public l(eb.y yVar) {
        this.f8324a = yVar;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        int iH0 = aVar.h0();
        int iB = w0.c.b(iH0);
        if (iB == 5 || iB == 6) {
            return this.f8324a.a(aVar);
        }
        if (iB == 8) {
            aVar.c0();
            return null;
        }
        throw new eb.t("Expecting number, got: " + j2.h0.A(iH0) + "; at path " + aVar.u(false));
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.X((Number) obj);
    }
}
