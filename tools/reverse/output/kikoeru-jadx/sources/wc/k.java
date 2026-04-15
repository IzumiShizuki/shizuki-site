package wc;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.c f23509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23510b;

    public k(be.c cVar, String str) {
        jc.l.e(cVar, "packageFqName");
        this.f23509a = cVar;
        this.f23510b = str;
    }

    public final be.e a(int i10) {
        return be.e.e(this.f23510b + i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23509a);
        sb.append('.');
        return t0.E(sb, this.f23510b, 'N');
    }
}
