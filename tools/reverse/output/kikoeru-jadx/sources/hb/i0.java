package hb;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() != 9) {
            return InetAddress.getByName(aVar.f0());
        }
        aVar.c0();
        return null;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.Y(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
