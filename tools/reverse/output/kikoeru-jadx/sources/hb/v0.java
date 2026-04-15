package hb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class v0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        try {
            int iO = aVar.O();
            if (iO <= 65535 && iO >= -32768) {
                return Short.valueOf((short) iO);
            }
            StringBuilder sbO = j2.h0.o(iO, "Lossy conversion from ", " to short; at path ");
            sbO.append(aVar.u(true));
            throw new eb.t(sbO.toString());
        } catch (NumberFormatException e10) {
            throw new eb.t(e10);
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            bVar.y();
        } else {
            bVar.R(r4.shortValue());
        }
    }
}
