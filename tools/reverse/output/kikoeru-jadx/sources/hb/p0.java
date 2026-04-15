package hb;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        boolean zG;
        BitSet bitSet = new BitSet();
        aVar.b();
        int iH0 = aVar.h0();
        int i10 = 0;
        while (iH0 != 2) {
            int iB = w0.c.b(iH0);
            if (iB == 5 || iB == 6) {
                int iO = aVar.O();
                if (iO == 0) {
                    zG = false;
                } else {
                    if (iO != 1) {
                        StringBuilder sbO = j2.h0.o(iO, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbO.append(aVar.u(true));
                        throw new eb.t(sbO.toString());
                    }
                    zG = true;
                }
            } else {
                if (iB != 7) {
                    throw new eb.t("Invalid bitset value type: " + j2.h0.A(iH0) + "; at path " + aVar.u(false));
                }
                zG = aVar.G();
            }
            if (zG) {
                bitSet.set(i10);
            }
            i10++;
            iH0 = aVar.h0();
        }
        aVar.n();
        return bitSet;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bVar.g();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.R(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.n();
    }
}
