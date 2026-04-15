package c5;

import java.util.ArrayList;
import m4.o0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f3431c = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m3.l f3432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3433b;

    public static void a(int i10, ArrayList arrayList) {
        if (g8.a.R(f3431c, i10, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final m4.q b(m4.q qVar) {
        if (!this.f3433b || !this.f3432a.k(qVar)) {
            return qVar;
        }
        m4.p pVarA = qVar.a();
        String str = qVar.f14541k;
        pVarA.f14488m = o0.p("application/x-media3-cues");
        pVarA.I = this.f3432a.e(qVar);
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f14544n);
        sb.append(str != null ? " ".concat(str) : "");
        pVarA.f14485j = sb.toString();
        pVarA.f14493r = Long.MAX_VALUE;
        return new m4.q(pVarA);
    }
}
