package hb;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class g0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        String strF0 = aVar.f0();
        if (strF0.equals("null")) {
            return null;
        }
        return new URL(strF0);
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bVar.Y(url == null ? null : url.toExternalForm());
    }
}
