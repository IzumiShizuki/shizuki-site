package ge;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7530b;

    public j(String str) {
        super(a0.f21526a);
        this.f7530b = str;
    }

    @Override // ge.g
    public final se.w a(yc.y yVar) {
        jc.l.e(yVar, "module");
        return ue.l.c(ue.k.ERROR_CONSTANT_VALUE, this.f7530b);
    }

    @Override // ge.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // ge.g
    public final String toString() {
        return this.f7530b;
    }
}
