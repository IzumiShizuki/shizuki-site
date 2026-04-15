package hb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class y extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        String strF0 = aVar.f0();
        if (strF0.length() == 1) {
            return Character.valueOf(strF0.charAt(0));
        }
        StringBuilder sbK = a0.c.K("Expecting character, got: ", strF0, "; at ");
        sbK.append(aVar.u(true));
        throw new eb.t(sbK.toString());
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        Character ch2 = (Character) obj;
        bVar.Y(ch2 == null ? null : String.valueOf(ch2));
    }
}
