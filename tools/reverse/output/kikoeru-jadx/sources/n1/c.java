package n1;

import i7.p2;
import ic.k;
import jc.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f15238a = f.f15242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p2 f15239b;

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float M() {
        return this.f15238a.a().M();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        throw null;
    }

    @Override // f3.c
    public final float a() {
        return this.f15238a.a().a();
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p2 b(k kVar) {
        p2 p2Var = new p2();
        p2Var.f9258a = (m) kVar;
        this.f15239b = p2Var;
        return p2Var;
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }
}
