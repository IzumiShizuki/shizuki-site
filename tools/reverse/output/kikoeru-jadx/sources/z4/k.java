package z4;

import java.util.ArrayList;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements y4.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f26434f;

    public k(m4.q qVar, i0 i0Var, n nVar, ArrayList arrayList) {
        super(qVar, i0Var, nVar, arrayList);
        this.f26434f = nVar;
    }

    @Override // z4.m
    public final String a() {
        return null;
    }

    @Override // y4.h
    public final long b(long j10) {
        return this.f26434f.g(j10);
    }

    @Override // y4.h
    public final long c(long j10, long j11) {
        return this.f26434f.e(j10, j11);
    }

    @Override // y4.h
    public final long e(long j10, long j11) {
        return this.f26434f.c(j10, j11);
    }

    @Override // z4.m
    public final j f() {
        return null;
    }

    @Override // y4.h
    public final long g(long j10, long j11) {
        n nVar = this.f26434f;
        if (nVar.f26444f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(jB, j10) + nVar.g(jB)) - nVar.f26447i;
    }

    @Override // y4.h
    public final j h(long j10) {
        return this.f26434f.h(this, j10);
    }

    @Override // y4.h
    public final long l(long j10, long j11) {
        return this.f26434f.f(j10, j11);
    }

    @Override // y4.h
    public final boolean s() {
        return this.f26434f.i();
    }

    @Override // y4.h
    public final long v() {
        return this.f26434f.f26442d;
    }

    @Override // y4.h
    public final long x(long j10) {
        return this.f26434f.d(j10);
    }

    @Override // y4.h
    public final long y(long j10, long j11) {
        return this.f26434f.b(j10, j11);
    }

    @Override // z4.m
    public final y4.h d() {
        return this;
    }
}
