package u0;

import a0.v;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g2.c0;
import hf.a0;
import i2.l0;
import i2.y;
import j1.p;
import java.util.LinkedHashMap;
import lf.w0;
import m0.w;
import m0.y1;
import m0.z1;
import o.g0;
import w.n;
import w.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p implements h, i2.l, i2.p, y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w.k f21170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f21172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f21173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y1 f21174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v f21175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f21176u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21178w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f21180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f21181z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f21177v = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g0 f21179x = new g0();

    public b(w.k kVar, boolean z10, float f10, z1 z1Var, y1 y1Var) {
        this.f21170o = kVar;
        this.f21171p = z10;
        this.f21172q = f10;
        this.f21173r = z1Var;
        this.f21174s = y1Var;
    }

    public final void B0(o oVar) {
        i iVar;
        if (!(oVar instanceof w.m)) {
            if (oVar instanceof n) {
                i iVar2 = this.f21181z;
                if (iVar2 != null) {
                    iVar2.d();
                    return;
                }
                return;
            }
            if (!(oVar instanceof w.l) || (iVar = this.f21181z) == null) {
                return;
            }
            iVar.d();
            return;
        }
        w.m mVar = (w.m) oVar;
        long j10 = this.f21177v;
        float f10 = this.f21176u;
        g gVarB = this.f21180y;
        if (gVarB == null) {
            gVarB = n7.e.b(n7.e.c((View) i2.f.i(this, AndroidCompositionLocals_androidKt.f725f)));
            this.f21180y = gVarB;
        }
        i iVarA = gVarB.a(this);
        iVarA.b(mVar, this.f21171p, j10, lc.b.R(f10), this.f21173r.a(), ((e) this.f21174s.b()).f21188d, new r2.a(9, this));
        this.f21181z = iVarA;
        i2.f.m(this);
    }

    @Override // u0.h
    public final void C() {
        this.f21181z = null;
        i2.f.m(this);
    }

    @Override // i2.p
    public final void R(l0 l0Var) throws InterruptedException {
        l0Var.b();
        v vVar = this.f21175t;
        if (vVar != null) {
            vVar.k(l0Var, this.f21176u, this.f21173r.a());
        }
        q1.o oVarZ = l0Var.f8782a.f19346b.z();
        i iVar = this.f21181z;
        if (iVar != null) {
            iVar.e(this.f21177v, lc.b.R(this.f21176u), this.f21173r.a(), ((e) this.f21174s.b()).f21188d);
            iVar.draw(q1.c.a(oVarZ));
        }
    }

    @Override // i2.y
    public final void m(long j10) {
        this.f21178w = true;
        f3.c cVar = i2.f.y(this).f8766y;
        this.f21177v = gh.g.R(j10);
        float f10 = this.f21172q;
        this.f21176u = Float.isNaN(f10) ? f.a(cVar, this.f21171p, this.f21177v) : cVar.Q(f10);
        g0 g0Var = this.f21179x;
        Object[] objArr = g0Var.f15970a;
        int i10 = g0Var.f15971b;
        for (int i11 = 0; i11 < i10; i11++) {
            B0((o) objArr[i11]);
        }
        g0Var.c();
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // j1.p
    public final void r0() {
        a0.y(n0(), null, null, new w0(23, this, (yb.c) null), 3);
    }

    @Override // j1.p
    public final void t0() throws InterruptedException {
        g gVar = this.f21180y;
        if (gVar != null) {
            C();
            w wVar = gVar.f21193d;
            i iVar = (i) ((LinkedHashMap) wVar.f13782b).get(this);
            if (iVar != null) {
                iVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f13782b;
                i iVar2 = (i) linkedHashMap.get(this);
                if (iVar2 != null) {
                }
                linkedHashMap.remove(this);
                gVar.f21192c.add(iVar);
            }
        }
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }

    @Override // i2.y
    public final /* synthetic */ void B(c0 c0Var) {
    }
}
