package v4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5.d0 f22522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f22531j;

    public i0(j5.d0 d0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        p4.c.c(!z14 || z12);
        p4.c.c(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        p4.c.c(z15);
        this.f22522a = d0Var;
        this.f22523b = j10;
        this.f22524c = j11;
        this.f22525d = j12;
        this.f22526e = j13;
        this.f22527f = z10;
        this.f22528g = z11;
        this.f22529h = z12;
        this.f22530i = z13;
        this.f22531j = z14;
    }

    public final i0 a(long j10) {
        if (j10 == this.f22524c) {
            return this;
        }
        return new i0(this.f22522a, this.f22523b, j10, this.f22525d, this.f22526e, this.f22527f, this.f22528g, this.f22529h, this.f22530i, this.f22531j);
    }

    public final i0 b(long j10) {
        if (j10 == this.f22523b) {
            return this;
        }
        return new i0(this.f22522a, j10, this.f22524c, this.f22525d, this.f22526e, this.f22527f, this.f22528g, this.f22529h, this.f22530i, this.f22531j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f22523b == i0Var.f22523b && this.f22524c == i0Var.f22524c && this.f22525d == i0Var.f22525d && this.f22526e == i0Var.f22526e && this.f22527f == i0Var.f22527f && this.f22528g == i0Var.f22528g && this.f22529h == i0Var.f22529h && this.f22530i == i0Var.f22530i && this.f22531j == i0Var.f22531j) {
                j5.d0 d0Var = i0Var.f22522a;
                int i10 = p4.c0.f16548a;
                if (Objects.equals(this.f22522a, d0Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f22522a.hashCode() + 527) * 31) + ((int) this.f22523b)) * 31) + ((int) this.f22524c)) * 31) + ((int) this.f22525d)) * 31) + ((int) this.f22526e)) * 31) + (this.f22527f ? 1 : 0)) * 31) + (this.f22528g ? 1 : 0)) * 31) + (this.f22529h ? 1 : 0)) * 31) + (this.f22530i ? 1 : 0)) * 31) + (this.f22531j ? 1 : 0);
    }
}
