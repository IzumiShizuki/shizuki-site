package hb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class x extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() != 9) {
            return Double.valueOf(aVar.L());
        }
        aVar.c0();
        return null;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.y();
        } else {
            bVar.O(number.doubleValue());
        }
    }
}
