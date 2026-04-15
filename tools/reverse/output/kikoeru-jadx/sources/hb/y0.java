package hb;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) {
        return new AtomicBoolean(aVar.G());
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.c0(((AtomicBoolean) obj).get());
    }
}
