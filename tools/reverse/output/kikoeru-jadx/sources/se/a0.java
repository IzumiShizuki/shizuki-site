package se;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends w0 implements ve.f, ve.g {
    @Override // se.w0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public abstract a0 z(boolean z10);

    @Override // se.w0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract a0 C(h0 h0Var);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", de.i.f5908e.v((zc.b) it.next(), null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb.append(strArr[i10]);
            }
        }
        sb.append(t());
        if (!q().isEmpty()) {
            vb.m.e0(q(), sb, ", ", "<", ">", null, 112);
        }
        if (u()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
