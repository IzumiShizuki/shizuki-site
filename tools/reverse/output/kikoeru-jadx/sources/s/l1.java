package s;

import i2.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends j1.p implements i2.z, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o1 f19217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19218p;

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        pc.u[] uVarArr = q2.v.f17698a;
        q2.w wVar = q2.t.f17682m;
        pc.u[] uVarArr2 = q2.v.f17698a;
        pc.u uVar = uVarArr2[6];
        wVar.a(kVar, Boolean.TRUE);
        q2.i iVar = new q2.i(new j1(this, 0), new j1(this, 1));
        if (this.f19218p) {
            q2.w wVar2 = q2.t.f17690u;
            pc.u uVar2 = uVarArr2[12];
            wVar2.a(kVar, iVar);
        } else {
            q2.w wVar3 = q2.t.f17689t;
            pc.u uVar3 = uVarArr2[11];
            wVar3.a(kVar, iVar);
        }
    }

    @Override // i2.z
    public final int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        if (!this.f19218p) {
            i10 = Integer.MAX_VALUE;
        }
        return u0Var.L(i10);
    }

    @Override // i2.z
    public final int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        if (!this.f19218p) {
            i10 = Integer.MAX_VALUE;
        }
        return u0Var.b(i10);
    }

    @Override // i2.z
    public final int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        if (this.f19218p) {
            i10 = Integer.MAX_VALUE;
        }
        return u0Var.t(i10);
    }

    @Override // i2.z
    public final int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        if (this.f19218p) {
            i10 = Integer.MAX_VALUE;
        }
        return u0Var.m(i10);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        n7.d.e(j10, this.f19218p ? u.e1.f20882a : u.e1.f20883b);
        g2.g1 g1VarV = u0Var.v(f3.a.a(j10, 0, this.f19218p ? f3.a.h(j10) : Integer.MAX_VALUE, 0, this.f19218p ? Integer.MAX_VALUE : f3.a.g(j10), 5));
        int i10 = g1VarV.f7180a;
        int iH = f3.a.h(j10);
        if (i10 > iH) {
            i10 = iH;
        }
        int i11 = g1VarV.f7181b;
        int iG = f3.a.g(j10);
        if (i11 > iG) {
            i11 = iG;
        }
        int i12 = g1VarV.f7181b - i11;
        int i13 = g1VarV.f7180a - i10;
        if (!this.f19218p) {
            i12 = i13;
        }
        o1 o1Var = this.f19217o;
        x0.b1 b1Var = o1Var.f19244d;
        x0.b1 b1Var2 = o1Var.f19241a;
        b1Var.f(i12);
        h1.g gVarD = h1.t.d();
        ic.k kVarE = gVarD != null ? gVarD.e() : null;
        h1.g gVarG = h1.t.g(gVarD);
        try {
            if (b1Var2.e() > i12) {
                b1Var2.f(i12);
            }
            h1.t.k(gVarD, gVarG, kVarE);
            this.f19217o.f19242b.f(this.f19218p ? i11 : i10);
            return x0Var.b0(i10, i11, vb.s.f22820a, new k1(this, i12, g1VarV));
        } catch (Throwable th2) {
            h1.t.k(gVarD, gVarG, kVarE);
            throw th2;
        }
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }
}
