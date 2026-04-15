package u;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends k0 implements a2.d, i2.y1, i2.l {
    public final b2.d A;
    public final l1 B;
    public final i C;
    public final c2 D;
    public final r1 E;
    public final g F;
    public cg.d G;
    public s1 H;
    public c0.s I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s.f f21101y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p0 f21102z;

    public u1(s.f fVar, c cVar, p0 p0Var, e1 e1Var, v1 v1Var, w.k kVar, boolean z10, boolean z11) {
        super(d.f20860g, z10, kVar, e1Var);
        this.f21101y = fVar;
        this.f21102z = p0Var;
        b2.d dVar = new b2.d();
        this.A = dVar;
        l1 l1Var = new l1();
        l1Var.f20998o = z10;
        B0(l1Var);
        this.B = l1Var;
        i iVar = new i(new r.t(new i7.p2((f3.c) androidx.compose.foundation.gestures.a.f523c)));
        this.C = iVar;
        s.f fVar2 = this.f21101y;
        p0 p0Var2 = this.f21102z;
        c2 c2Var = new c2(v1Var, fVar2, p0Var2 == null ? iVar : p0Var2, e1Var, z11, dVar, new r2.a(7, this));
        this.D = c2Var;
        r1 r1Var = new r1(c2Var, z10);
        this.E = r1Var;
        g gVar = new g(e1Var, c2Var, z11, cVar);
        B0(gVar);
        this.F = gVar;
        B0(new b2.g(r1Var, dVar));
        B0(new o1.v(2, null, 4));
        e0.f fVar3 = new e0.f();
        fVar3.f6058o = gVar;
        B0(fVar3);
        q.a0 a0Var = new q.a0(13, this);
        s.c0 c0Var = new s.c0();
        c0Var.f19117o = a0Var;
        B0(c0Var);
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // u.k0
    public final Object I0(j0 j0Var, j0 j0Var2) {
        c2 c2Var = this.D;
        Object objF = c2Var.f(s.v0.f19293b, new q.q(j0Var, c2Var, (yb.c) null, 12), j0Var2);
        return objF == zb.a.f26667a ? objF : ub.a0.f21526a;
    }

    @Override // u.k0
    public final void K0(long j10) {
        hf.a0.y(this.A.c(), null, null, new s1(this, j10, null, 0), 3);
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        if (this.f20977s && (this.G == null || this.H == null)) {
            this.G = new cg.d(17, this);
            this.H = new s1(this, null);
        }
        cg.d dVar = this.G;
        if (dVar != null) {
            pc.u[] uVarArr = q2.v.f17698a;
            kVar.l(q2.j.f17607d, new q2.a(null, dVar));
        }
        s1 s1Var = this.H;
        if (s1Var != null) {
            pc.u[] uVarArr2 = q2.v.f17698a;
            kVar.l(q2.j.f17608e, s1Var);
        }
    }

    @Override // u.k0
    public final boolean L0() {
        c2 c2Var = this.D;
        if (c2Var.f20844a.a()) {
            return true;
        }
        s.f fVar = c2Var.f20845b;
        if (fVar == null) {
            return false;
        }
        s.a0 a0Var = fVar.f19142c;
        EdgeEffect edgeEffect = a0Var.f19091d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? m3.f.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = a0Var.f19092e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? m3.f.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = a0Var.f19093f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? m3.f.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = a0Var.f19094g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? m3.f.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void N0(s.f fVar, c cVar, p0 p0Var, e1 e1Var, v1 v1Var, w.k kVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = false;
        if (this.f20977s != z10) {
            this.E.f21066b = z10;
            this.B.f20998o = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        p0 p0Var2 = p0Var == null ? this.C : p0Var;
        c2 c2Var = this.D;
        if (!jc.l.a(c2Var.f20844a, v1Var)) {
            c2Var.f20844a = v1Var;
            z14 = true;
        }
        c2Var.f20845b = fVar;
        if (c2Var.f20847d != e1Var) {
            c2Var.f20847d = e1Var;
            z14 = true;
        }
        if (c2Var.f20848e != z11) {
            c2Var.f20848e = z11;
        } else {
            z13 = z14;
        }
        c2Var.f20846c = p0Var2;
        c2Var.f20849f = this.A;
        g gVar = this.F;
        gVar.f20900o = e1Var;
        gVar.f20902q = z11;
        gVar.f20903r = cVar;
        this.f21101y = fVar;
        this.f21102z = p0Var;
        d dVar = d.f20860g;
        e1 e1Var2 = c2Var.f20847d;
        e1 e1Var3 = e1.f20882a;
        if (e1Var2 != e1Var3) {
            e1Var3 = e1.f20883b;
        }
        M0(dVar, z10, kVar, e1Var3, z13);
        if (z12) {
            this.G = null;
            this.H = null;
            i2.f.o(this);
        }
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // a2.d
    public final boolean i(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [ic.k, jc.m] */
    @Override // u.k0, i2.u1
    public final void j(c2.l lVar, c2.m mVar, long j10) {
        long j11;
        ?? r0 = lVar.f3309a;
        int size = ((Collection) r0).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) this.f20976r.a((c2.t) r0.get(i10))).booleanValue()) {
                super.j(lVar, mVar, j10);
                break;
            }
            i10++;
        }
        if (this.f20977s) {
            if (mVar == c2.m.f3314a && lVar.f3313e == 6) {
                if (this.I == null) {
                    this.I = new c0.s(this.D, new r.y1(10, ViewConfiguration.get(i2.f.A(this).getContext())), new f1.e(2, this, u1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 2), i2.f.y(this).f8766y);
                }
                c0.s sVar = this.I;
                if (sVar != null) {
                    hf.y yVarN0 = n0();
                    if (((hf.r1) sVar.f3161g) == null) {
                        sVar.f3161g = hf.a0.y(yVarN0, null, null, new lf.w0(20, sVar, (yb.c) null), 3);
                    }
                }
            }
            c0.s sVar2 = this.I;
            if (sVar2 == null || mVar != c2.m.f3315b) {
                return;
            }
            int i11 = lVar.f3313e;
            ?? r32 = lVar.f3309a;
            if (i11 == 6) {
                Collection collection = (Collection) r32;
                int size2 = collection.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (((c2.t) r32.get(i12)).b()) {
                        return;
                    }
                }
                r.y1 y1Var = (r.y1) sVar2.f3157c;
                f3.c cVar = (f3.c) sVar2.f3159e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) y1Var.f18634b;
                int i13 = Build.VERSION.SDK_INT;
                float f10 = -(i13 > 26 ? r2.b(viewConfiguration) : cVar.Q(64));
                float f11 = -(i13 > 26 ? r2.a(viewConfiguration) : cVar.Q(64));
                p1.b bVar = new p1.b(0L);
                int size3 = collection.size();
                int i14 = 0;
                while (true) {
                    j11 = bVar.f16481a;
                    if (i14 >= size3) {
                        break;
                    }
                    bVar = new p1.b(p1.b.i(j11, ((c2.t) r32.get(i14)).f3331j));
                    i14++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) * f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10)));
                c2 c2Var = (c2) sVar2.f3156b;
                float fG = c2Var.g(c2Var.e(jFloatToRawIntBits));
                if ((fG > 0.0f ? 1 : (fG == 0.0f ? 0 : -1)) == 0 ? false : (fG > 0.0f ? 1 : (fG == 0.0f ? 0 : -1)) > 0 ? c2Var.f20844a.d() : c2Var.f20844a.c() ? !(((kf.f) sVar2.f3160f).e(new z0(jFloatToRawIntBits, ((c2.t) vb.m.Y(r32)).f3323b, false)) instanceof kf.l) : sVar2.f3155a) {
                    int size4 = collection.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        ((c2.t) r32.get(i15)).a();
                    }
                }
            }
        }
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // j1.p
    public final void r0() {
        if (this.f9703n) {
            f3.c cVar = i2.f.y(this).f8766y;
            i iVar = this.C;
            iVar.getClass();
            iVar.f20940a = new r.t(new i7.p2(cVar));
        }
        c0.s sVar = this.I;
        if (sVar != null) {
            sVar.f3159e = i2.f.y(this).f8766y;
        }
    }

    @Override // u.k0, j1.p
    public final void s0() {
        z();
        if (this.f9703n) {
            f3.c cVar = i2.f.y(this).f8766y;
            i iVar = this.C;
            iVar.getClass();
            iVar.f20940a = new r.t(new i7.p2(cVar));
        }
        c0.s sVar = this.I;
        if (sVar != null) {
            sVar.f3159e = i2.f.y(this).f8766y;
        }
    }

    @Override // a2.d
    public final boolean v(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f20977s) {
            return false;
        }
        if ((!a2.a.a(a2.c.L(keyEvent), a2.a.f185p) && !a2.a.a(g8.a.e(keyEvent.getKeyCode()), a2.a.f184o)) || a2.c.O(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        e1 e1Var = this.D.f20847d;
        e1 e1Var2 = e1.f20882a;
        g gVar = this.F;
        if (e1Var == e1Var2) {
            int i10 = (int) (gVar.f20908w & 4294967295L);
            float f10 = a2.a.a(g8.a.e(keyEvent.getKeyCode()), a2.a.f184o) ? i10 : -i10;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        } else {
            int i11 = (int) (gVar.f20908w >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(a2.a.a(g8.a.e(keyEvent.getKeyCode()), a2.a.f184o) ? i11 : -i11);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        hf.a0.y(n0(), null, null, new s1(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 1), 3);
        return true;
    }

    @Override // u.k0
    public final void J0(long j10) {
    }
}
