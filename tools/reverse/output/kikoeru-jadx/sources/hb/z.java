package hb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class z extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        int iH0 = aVar.h0();
        if (iH0 != 9) {
            return iH0 == 8 ? Boolean.toString(aVar.G()) : aVar.f0();
        }
        aVar.c0();
        return null;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.Y((String) obj);
    }
}
