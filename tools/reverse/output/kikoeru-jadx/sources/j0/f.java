package j0;

import cg.m0;
import h0.u0;
import h0.x;
import i2.y1;
import l0.l1;
import pc.u;
import q2.t;
import q2.v;
import q2.w;
import t2.k0;
import ub.a0;
import y2.c0;
import y2.d0;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i2.n implements y1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d0 f9594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f9595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u0 f9596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9598u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9599v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y2.r f9600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l1 f9601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y2.j f9602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o1.r f9603z;

    public static final void E0(f fVar, u0 u0Var, String str, boolean z10, boolean z11) {
        if (z10 || !z11) {
            return;
        }
        c0 c0Var = u0Var.f7861e;
        x xVar = u0Var.f7878v;
        a0 a0Var = null;
        if (c0Var != null) {
            y yVarL = u0Var.f7860d.l(ud.b.x(new y2.d(), new y2.a(1, str)));
            c0Var.a(null, yVarL);
            xVar.a(yVarL);
            a0Var = a0.f21526a;
        }
        if (a0Var == null) {
            int length = str.length();
            xVar.a(new y(t2.c0.b(length, length), str, 4));
        }
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        boolean z10 = this.f9599v;
        t2.g gVar = this.f9595r.f25434a;
        u[] uVarArr = v.f17698a;
        w wVar = t.D;
        u[] uVarArr2 = v.f17698a;
        u uVar = uVarArr2[17];
        wVar.a(kVar, gVar);
        t2.g gVar2 = this.f9594q.f25401a;
        w wVar2 = t.E;
        u uVar2 = uVarArr2[18];
        wVar2.a(kVar, gVar2);
        long j10 = this.f9595r.f25435b;
        w wVar3 = t.F;
        u uVar3 = uVarArr2[19];
        wVar3.a(kVar, new k0(j10));
        w wVar4 = t.f17687r;
        u uVar4 = uVarArr2[9];
        wVar4.a(kVar, k1.l.f10995a);
        boolean z11 = false;
        z11 = false;
        kVar.l(q2.j.f17610g, new q2.a(null, new e(this, z11 ? 1 : 0)));
        if (!this.f9598u) {
            v.a(kVar);
        }
        if (z10) {
            kVar.l(t.J, a0.f21526a);
        }
        int i10 = 1;
        if (this.f9598u && !this.f9597t) {
            z11 = true;
        }
        w wVar5 = t.M;
        u uVar5 = uVarArr2[25];
        wVar5.a(kVar, Boolean.valueOf(z11));
        v.c(kVar, new e(this, i10));
        int i11 = 2;
        if (z11) {
            kVar.l(q2.j.f17613j, new q2.a(null, new e(this, i11)));
            kVar.l(q2.j.f17617n, new q2.a(null, new e(this, kVar)));
        }
        kVar.l(q2.j.f17612i, new q2.a(null, new m0(4, this)));
        int i12 = this.f9602y.f25414e;
        d dVar = new d(this, 3);
        kVar.l(t.G, new y2.i(i12));
        kVar.l(q2.j.f17618o, new q2.a(null, dVar));
        kVar.l(q2.j.f17605b, new q2.a(null, new d(this, 4)));
        kVar.l(q2.j.f17606c, new q2.a(null, new d(this, 5)));
        if (!k0.b(this.f9595r.f25435b) && !z10) {
            kVar.l(q2.j.f17619p, new q2.a(null, new d(this, 6)));
            if (this.f9598u && !this.f9597t) {
                kVar.l(q2.j.f17620q, new q2.a(null, new d(this, 1)));
            }
        }
        if (!this.f9598u || this.f9597t) {
            return;
        }
        kVar.l(q2.j.f17621r, new q2.a(null, new d(this, 2)));
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.y1
    public final boolean k0() {
        return true;
    }
}
