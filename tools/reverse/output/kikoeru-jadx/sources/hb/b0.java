package hb;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        String strF0 = aVar.f0();
        try {
            gb.d.d(strF0);
            return new BigInteger(strF0);
        } catch (NumberFormatException e10) {
            StringBuilder sbK = a0.c.K("Failed parsing '", strF0, "' as BigInteger; at path ");
            sbK.append(aVar.u(true));
            throw new eb.t(sbK.toString(), e10);
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.X((BigInteger) obj);
    }
}
