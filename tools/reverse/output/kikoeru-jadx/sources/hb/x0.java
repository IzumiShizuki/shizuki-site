package hb;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class x0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) {
        try {
            return new AtomicInteger(aVar.O());
        } catch (NumberFormatException e10) {
            throw new eb.t(e10);
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.R(((AtomicInteger) obj).get());
    }
}
