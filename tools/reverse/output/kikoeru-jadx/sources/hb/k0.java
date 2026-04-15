package hb;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        String strF0 = aVar.f0();
        try {
            return Currency.getInstance(strF0);
        } catch (IllegalArgumentException e10) {
            StringBuilder sbK = a0.c.K("Failed parsing '", strF0, "' as Currency; at path ");
            sbK.append(aVar.u(true));
            throw new eb.t(sbK.toString(), e10);
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.Y(((Currency) obj).getCurrencyCode());
    }
}
