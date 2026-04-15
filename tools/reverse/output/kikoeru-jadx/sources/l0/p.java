package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t2.i0 f11590f;

    public p(long j10, int i10, int i11, int i12, int i13, t2.i0 i0Var) {
        this.f11585a = j10;
        this.f11586b = i10;
        this.f11587c = i11;
        this.f11588d = i12;
        this.f11589e = i13;
        this.f11590f = i0Var;
    }

    public final q a(int i10) {
        return new q(u0.u(this.f11590f, i10), i10, this.f11585a);
    }

    public final i b() {
        int i10 = this.f11587c;
        int i11 = this.f11588d;
        return i10 < i11 ? i.f11497b : i10 > i11 ? i.f11496a : i.f11498c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f11585a);
        sb.append(", range=(");
        int i10 = this.f11587c;
        sb.append(i10);
        sb.append('-');
        t2.i0 i0Var = this.f11590f;
        sb.append(u0.u(i0Var, i10));
        sb.append(',');
        int i11 = this.f11588d;
        sb.append(i11);
        sb.append('-');
        sb.append(u0.u(i0Var, i11));
        sb.append("), prevOffset=");
        return j2.h0.m(sb, this.f11589e, ')');
    }
}
