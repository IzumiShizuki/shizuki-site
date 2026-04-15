package yf;

import d0.y;
import wf.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5.d f26323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf.c f26324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f26325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t[] f26326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f26327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xf.j f26328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26331i;

    public t(k5.d dVar, xf.c cVar, w wVar, t[] tVarArr) {
        jc.l.e(dVar, "composer");
        this.f26323a = dVar;
        this.f26324b = cVar;
        this.f26325c = wVar;
        this.f26326d = tVarArr;
        this.f26327e = cVar.f24989b;
        this.f26328f = cVar.f24988a;
        int iOrdinal = wVar.ordinal();
        if (tVarArr != null) {
            t tVar = tVarArr[iOrdinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[iOrdinal] = this;
        }
    }

    public final t a(uf.g gVar) {
        t tVar;
        jc.l.e(gVar, "descriptor");
        xf.c cVar = this.f26324b;
        w wVarP = k.p(gVar, cVar);
        char c3 = wVarP.f26341a;
        k5.d dVar = this.f26323a;
        dVar.g(c3);
        dVar.f11043b = true;
        String str = this.f26330h;
        if (str != null) {
            String strM = this.f26331i;
            if (strM == null) {
                strM = gVar.m();
            }
            dVar.e();
            u(str);
            dVar.g(':');
            u(strM);
            this.f26330h = null;
            this.f26331i = null;
        }
        if (this.f26325c == wVarP) {
            return this;
        }
        t[] tVarArr = this.f26326d;
        return (tVarArr == null || (tVar = tVarArr[wVarP.ordinal()]) == null) ? new t(dVar, cVar, wVarP, tVarArr) : tVar;
    }

    public final void b(boolean z10) {
        if (this.f26329g) {
            u(String.valueOf(z10));
        } else {
            ((b7.m) this.f26323a.f11044c).w(String.valueOf(z10));
        }
    }

    public final void c(uf.g gVar, int i10, boolean z10) {
        jc.l.e(gVar, "descriptor");
        g(gVar, i10);
        b(z10);
    }

    public final void d(byte b10) {
        if (this.f26329g) {
            u(String.valueOf((int) b10));
        } else {
            this.f26323a.f(b10);
        }
    }

    public final void e(char c3) {
        u(String.valueOf(c3));
    }

    public final void f(double d10) {
        boolean z10 = this.f26329g;
        k5.d dVar = this.f26323a;
        if (z10) {
            u(String.valueOf(d10));
        } else {
            ((b7.m) dVar.f11044c).w(String.valueOf(d10));
        }
        if (Math.abs(d10) > Double.MAX_VALUE) {
            throw k.b(Double.valueOf(d10), ((b7.m) dVar.f11044c).toString());
        }
    }

    public final void g(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        int iOrdinal = this.f26325c.ordinal();
        k5.d dVar = this.f26323a;
        boolean z10 = true;
        if (iOrdinal == 1) {
            if (!dVar.f11043b) {
                dVar.g(',');
            }
            dVar.e();
            return;
        }
        if (iOrdinal == 2) {
            if (dVar.f11043b) {
                this.f26329g = true;
                dVar.e();
                return;
            }
            if (i10 % 2 == 0) {
                dVar.g(',');
                dVar.e();
            } else {
                dVar.g(':');
                dVar.m();
                z10 = false;
            }
            this.f26329g = z10;
            return;
        }
        if (iOrdinal != 3) {
            if (!dVar.f11043b) {
                dVar.g(',');
            }
            dVar.e();
            k.n(gVar, this.f26324b);
            u(gVar.q(i10));
            dVar.g(':');
            dVar.m();
            return;
        }
        if (i10 == 0) {
            this.f26329g = true;
        }
        if (i10 == 1) {
            dVar.g(',');
            dVar.m();
            this.f26329g = false;
        }
    }

    public final void h(float f10) {
        boolean z10 = this.f26329g;
        k5.d dVar = this.f26323a;
        if (z10) {
            u(String.valueOf(f10));
        } else {
            ((b7.m) dVar.f11044c).w(String.valueOf(f10));
        }
        if (Math.abs(f10) > Float.MAX_VALUE) {
            throw k.b(Float.valueOf(f10), ((b7.m) dVar.f11044c).toString());
        }
    }

    public final void i(uf.g gVar, int i10, float f10) {
        jc.l.e(gVar, "descriptor");
        g(gVar, i10);
        h(f10);
    }

    public final t j(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        boolean zA = u.a(gVar);
        w wVar = this.f26325c;
        xf.c cVar = this.f26324b;
        k5.d eVar = this.f26323a;
        if (zA) {
            if (!(eVar instanceof f)) {
                eVar = new f((b7.m) eVar.f11044c, this.f26329g);
            }
            return new t(eVar, cVar, wVar, null);
        }
        if (gVar.l() && gVar.equals(xf.n.f25012a)) {
            if (!(eVar instanceof e)) {
                eVar = new e((b7.m) eVar.f11044c, this.f26329g);
            }
            return new t(eVar, cVar, wVar, null);
        }
        if (this.f26330h != null) {
            this.f26331i = gVar.m();
        }
        return this;
    }

    public final t k(d1 d1Var, int i10) {
        jc.l.e(d1Var, "descriptor");
        g(d1Var, i10);
        return j(d1Var.s(i10));
    }

    public final void l(int i10) {
        if (this.f26329g) {
            u(String.valueOf(i10));
        } else {
            this.f26323a.h(i10);
        }
    }

    public final void m(int i10, int i11, uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        g(gVar, i10);
        l(i11);
    }

    public final void n(long j10) {
        if (this.f26329g) {
            u(String.valueOf(j10));
        } else {
            this.f26323a.i(j10);
        }
    }

    public final void o(uf.g gVar, int i10, long j10) {
        jc.l.e(gVar, "descriptor");
        g(gVar, i10);
        n(j10);
    }

    public final void p() {
        this.f26323a.j("null");
    }

    public final void q(uf.g gVar, int i10, sf.a aVar, Object obj) {
        jc.l.e(gVar, "descriptor");
        if (obj != null || this.f26328f.f25006c) {
            jc.l.e(gVar, "descriptor");
            g(gVar, i10);
            if (aVar.a().n()) {
                s(aVar, obj);
            } else if (obj == null) {
                p();
            } else {
                s(aVar, obj);
            }
        }
    }

    public final void r(uf.g gVar, int i10, sf.a aVar, Object obj) {
        jc.l.e(gVar, "descriptor");
        jc.l.e(aVar, "serializer");
        g(gVar, i10);
        s(aVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(sf.a r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.t.s(sf.a, java.lang.Object):void");
    }

    public final void t(short s10) {
        if (this.f26329g) {
            u(String.valueOf((int) s10));
        } else {
            this.f26323a.k(s10);
        }
    }

    public final void u(String str) {
        jc.l.e(str, "value");
        this.f26323a.l(str);
    }

    public final void v(uf.g gVar, int i10, String str) {
        jc.l.e(gVar, "descriptor");
        jc.l.e(str, "value");
        g(gVar, i10);
        u(str);
    }

    public final void w(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        k5.d dVar = this.f26323a;
        dVar.getClass();
        dVar.f11043b = false;
        dVar.g(this.f26325c.f26342b);
    }

    public final boolean x(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        return this.f26328f.f25004a;
    }
}
