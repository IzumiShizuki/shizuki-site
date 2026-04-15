package yf;

import java.util.Set;
import wf.a2;
import wf.r1;
import wf.u1;
import wf.x1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f26332a = vb.l.N0(new uf.g[]{u1.f24189b, x1.f24208b, r1.f24174b, a2.f24082b});

    public static final boolean a(uf.g gVar) {
        jc.l.e(gVar, "<this>");
        return gVar.l() && f26332a.contains(gVar);
    }
}
