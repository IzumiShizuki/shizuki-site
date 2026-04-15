package k0;

import g2.c0;
import i2.g1;
import t2.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f10942c = new j(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f10943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f10944b;

    public j(c0 c0Var, i0 i0Var) {
        this.f10943a = c0Var;
        this.f10944b = i0Var;
    }

    public static j a(j jVar, g1 g1Var, i0 i0Var, int i10) {
        c0 c0Var = g1Var;
        if ((i10 & 1) != 0) {
            c0Var = jVar.f10943a;
        }
        if ((i10 & 2) != 0) {
            i0Var = jVar.f10944b;
        }
        return new j(c0Var, i0Var);
    }
}
