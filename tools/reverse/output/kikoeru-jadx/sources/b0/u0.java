package b0;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f1359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1360d;

    public u0(int i10, int i11, int i12) {
        this.f1357a = i11;
        this.f1358b = i12;
        int i13 = (i10 / i11) * i11;
        this.f1359c = new x0.e1(nh.b.E(Math.max(i13 - i12, 0), i13 + i11 + i12), x0.r0.f24439f);
        this.f1360d = i10;
    }

    public final void a(int i10) {
        if (i10 != this.f1360d) {
            this.f1360d = i10;
            int i11 = this.f1357a;
            int i12 = (i10 / i11) * i11;
            int i13 = this.f1358b;
            this.f1359c.setValue(nh.b.E(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    @Override // x0.n2
    public final Object getValue() {
        return (oc.d) this.f1359c.getValue();
    }
}
