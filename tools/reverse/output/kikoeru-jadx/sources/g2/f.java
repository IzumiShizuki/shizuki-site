package g2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.m f7177b;

    public f(d dVar, f3.m mVar) {
        this.f7176a = dVar;
        this.f7177b = mVar;
    }

    @Override // f3.c
    public final long E(float f10) {
        return this.f7176a.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f7176a.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return this.f7176a.J(f10);
    }

    @Override // f3.c
    public final float M() {
        return this.f7176a.M();
    }

    @Override // g2.y
    public final boolean O() {
        return this.f7176a.O();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f7176a.Q(f10);
    }

    @Override // f3.c
    public final int U(long j10) {
        return this.f7176a.U(j10);
    }

    @Override // f3.c
    public final float a() {
        return this.f7176a.a();
    }

    @Override // f3.c
    public final int a0(float f10) {
        return this.f7176a.a0(f10);
    }

    @Override // g2.x0
    public final w0 b0(int i10, int i11, Map map, ic.k kVar) {
        return y(i10, i11, map, null, kVar);
    }

    @Override // f3.c
    public final long f0(long j10) {
        return this.f7176a.f0(j10);
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f7177b;
    }

    @Override // f3.c
    public final float i0(long j10) {
        return this.f7176a.i0(j10);
    }

    @Override // f3.c
    public final long n(long j10) {
        return this.f7176a.n(j10);
    }

    @Override // f3.c
    public final float r(long j10) {
        return this.f7176a.r(j10);
    }

    @Override // g2.x0
    public final w0 y(int i10, int i11, Map map, ic.k kVar, ic.k kVar2) {
        int i12 = i10 < 0 ? 0 : i10;
        int i13 = i11 < 0 ? 0 : i11;
        if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
            f2.a.b("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i12, i13, map, kVar, 0);
    }
}
