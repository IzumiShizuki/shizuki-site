package a0;

import b0.q0;
import b0.r0;
import b0.s0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f85a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f86b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f87c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f88d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f90f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j1.f f91g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f92h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f94j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0 f95k;

    public p(long j10, l lVar, q0 q0Var, int i10, int i11, j1.f fVar, int i12, int i13, long j11, g0 g0Var) {
        this.f88d = q0Var;
        this.f89e = i10;
        this.f90f = i11;
        this.f91g = fVar;
        this.f92h = i12;
        this.f93i = i13;
        this.f94j = j11;
        this.f95k = g0Var;
        this.f85a = lVar;
        this.f86b = q0Var;
        this.f87c = f3.b.b(f3.a.h(j10), Integer.MAX_VALUE, 5);
    }

    public final u a(int i10, long j10) {
        l lVar = this.f85a;
        Object objB = lVar.b(i10);
        Object objI = lVar.f75b.i(i10);
        return new u(i10, this.f86b.b(i10, j10), this.f91g, this.f88d.f1337b.getLayoutDirection(), this.f92h, this.f93i, i10 == this.f89e + (-1) ? 0 : this.f90f, this.f94j, objB, objI, this.f95k.f54m, j10);
    }

    @Override // b0.s0
    public final r0 b(int i10, int i11, int i12, long j10) {
        return a(i10, j10);
    }
}
