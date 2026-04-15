package k0;

import b0.d0;
import g2.u0;
import i2.q0;
import i2.y1;
import i2.z;
import java.util.Map;
import pc.u;
import q1.r;
import q2.t;
import q2.v;
import q2.w;
import t2.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j1.p implements z, i2.p, y1 {
    public l A;
    public k B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t2.g f10951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l0 f10952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x2.d f10953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ic.k f10954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f10959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r f10960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f10961y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f10962z;

    public m(t2.g gVar, l0 l0Var, x2.d dVar, ic.k kVar, int i10, boolean z10, int i11, int i12, h hVar, r rVar) {
        this.f10951o = gVar;
        this.f10952p = l0Var;
        this.f10953q = dVar;
        this.f10954r = kVar;
        this.f10955s = i10;
        this.f10956t = z10;
        this.f10957u = i11;
        this.f10958v = i12;
        this.f10959w = hVar;
        this.f10960x = rVar;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    public final void B0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            d dVarC0 = C0();
            t2.g gVar = this.f10951o;
            l0 l0Var = this.f10952p;
            x2.d dVar = this.f10953q;
            int i10 = this.f10955s;
            boolean z14 = this.f10956t;
            int i11 = this.f10957u;
            int i12 = this.f10958v;
            dVarC0.f10893a = gVar;
            boolean zC = l0Var.c(dVarC0.f10903k);
            dVarC0.f10903k = l0Var;
            if (!zC) {
                dVarC0.f10904l = null;
                dVarC0.f10906n = null;
                dVarC0.f10908p = -1;
                dVarC0.f10907o = -1;
            }
            dVarC0.f10894b = dVar;
            dVarC0.f10895c = i10;
            dVarC0.f10896d = z14;
            dVarC0.f10897e = i11;
            dVarC0.f10898f = i12;
            dVarC0.f10899g = null;
            dVarC0.f10904l = null;
            dVarC0.f10906n = null;
            dVarC0.f10908p = -1;
            dVarC0.f10907o = -1;
        }
        if (this.f9703n) {
            if (z11 || (z10 && this.A != null)) {
                i2.f.o(this);
            }
            if (z11 || z12 || z13) {
                i2.f.n(this);
                i2.f.m(this);
            }
            if (z10) {
                i2.f.m(this);
            }
        }
    }

    public final d C0() {
        if (this.f10962z == null) {
            this.f10962z = new d(this.f10951o, this.f10952p, this.f10953q, this.f10955s, this.f10956t, this.f10957u, this.f10958v, null);
        }
        d dVar = this.f10962z;
        jc.l.b(dVar);
        return dVar;
    }

    public final d D0(f3.c cVar) {
        d dVar;
        k kVar = this.B;
        if (kVar != null && kVar.f10947c && (dVar = kVar.f10948d) != null) {
            dVar.c(cVar);
            return dVar;
        }
        d dVarC0 = C0();
        dVarC0.c(cVar);
        return dVarC0;
    }

    public final boolean E0(ic.k kVar, h hVar) {
        boolean z10;
        if (this.f10954r != kVar) {
            this.f10954r = kVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (jc.l.a(this.f10959w, hVar)) {
            return z10;
        }
        this.f10959w = hVar;
        return true;
    }

    public final boolean F0(l0 l0Var, int i10, int i11, boolean z10, x2.d dVar, int i12) {
        boolean z11 = !this.f10952p.c(l0Var);
        this.f10952p = l0Var;
        if (this.f10958v != i10) {
            this.f10958v = i10;
            z11 = true;
        }
        if (this.f10957u != i11) {
            this.f10957u = i11;
            z11 = true;
        }
        if (this.f10956t != z10) {
            this.f10956t = z10;
            z11 = true;
        }
        if (!jc.l.a(this.f10953q, dVar)) {
            this.f10953q = dVar;
            z11 = true;
        }
        if (this.f10955s == i12) {
            return z11;
        }
        this.f10955s = i12;
        return true;
    }

    public final boolean G0(t2.g gVar) {
        boolean zA = jc.l.a(this.f10951o.f20320b, gVar.f20320b);
        boolean z10 = (zA && jc.l.a(this.f10951o.f20319a, gVar.f20319a)) ? false : true;
        if (z10) {
            this.f10951o = gVar;
        }
        if (!zA) {
            this.B = null;
        }
        return z10;
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        l lVar = this.A;
        if (lVar == null) {
            lVar = new l(this, 0);
            this.A = lVar;
        }
        t2.g gVar = this.f10951o;
        u[] uVarArr = v.f17698a;
        kVar.l(t.A, ud.b.w(gVar));
        k kVar2 = this.B;
        if (kVar2 != null) {
            t2.g gVar2 = kVar2.f10946b;
            w wVar = t.B;
            u[] uVarArr2 = v.f17698a;
            u uVar = uVarArr2[15];
            wVar.a(kVar, gVar2);
            boolean z10 = kVar2.f10947c;
            w wVar2 = t.C;
            u uVar2 = uVarArr2[16];
            wVar2.a(kVar, Boolean.valueOf(z10));
        }
        kVar.l(q2.j.f17614k, new q2.a(null, new l(this, 1)));
        kVar.l(q2.j.f17615l, new q2.a(null, new l(this, 2)));
        kVar.l(q2.j.f17616m, new q2.a(null, new d0(22, this)));
        v.c(kVar, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    @Override // i2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(i2.l0 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.m.R(i2.l0):void");
    }

    @Override // i2.z
    public final int b(q0 q0Var, u0 u0Var, int i10) {
        return D0(q0Var).a(i10, q0Var.getLayoutDirection());
    }

    @Override // i2.z
    public final int c(q0 q0Var, u0 u0Var, int i10) {
        return D0(q0Var).a(i10, q0Var.getLayoutDirection());
    }

    @Override // i2.z
    public final int d(q0 q0Var, u0 u0Var, int i10) {
        return h0.q0.m(D0(q0Var).d(q0Var.getLayoutDirection()).j());
    }

    @Override // i2.z
    public final int f(q0 q0Var, u0 u0Var, int i10) {
        return h0.q0.m(D0(q0Var).d(q0Var.getLayoutDirection()).i());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // i2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g2.w0 g(g2.x0 r9, g2.u0 r10, long r11) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.m.g(g2.x0, g2.u0, long):g2.w0");
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
