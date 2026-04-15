package b3;

import android.graphics.Paint;
import android.text.TextPaint;
import ce.j0;
import e3.l;
import p4.p;
import q1.h0;
import q1.k0;
import q1.m;
import q1.q;
import x0.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f1485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f1486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f1488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f1489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f1490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f1491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1.e f1492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s1.e f1493i;

    public final p a() {
        p pVar = this.f1485a;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this);
        this.f1485a = pVar2;
        return pVar2;
    }

    public final void b(int i10) {
        if (i10 == this.f1487c) {
            return;
        }
        a().h(i10);
        this.f1487c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(float r6, long r7, q1.m r9) {
        /*
            r5 = this;
            r0 = 0
            if (r9 != 0) goto Ld
            r5.f1491g = r0
            r5.f1490f = r0
            r5.f1492h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r9 instanceof q1.n0
            if (r1 == 0) goto L1d
            q1.n0 r9 = (q1.n0) r9
            long r7 = r9.f17562a
            long r6 = gh.g.I(r6, r7)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r9 instanceof q1.j0
            if (r1 == 0) goto L72
            q1.m r1 = r5.f1490f
            boolean r1 = jc.l.a(r1, r9)
            r2 = 0
            if (r1 == 0) goto L38
            p1.e r1 = r5.f1492h
            if (r1 != 0) goto L30
            r1 = 0
            goto L36
        L30:
            long r3 = r1.f16495a
            boolean r1 = p1.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.f1490f = r9
            p1.e r1 = new p1.e
            r1.<init>(r7)
            r5.f1492h = r1
            da.r r1 = new da.r
            r2 = 2
            r1.<init>(r9, r7, r2)
            x0.c0 r7 = x0.v.o(r1)
            r5.f1491g = r7
        L59:
            p4.p r7 = r5.a()
            x0.c0 r8 = r5.f1491g
            if (r8 == 0) goto L68
            java.lang.Object r8 = r8.getValue()
            android.graphics.Shader r8 = (android.graphics.Shader) r8
            goto L69
        L68:
            r8 = r0
        L69:
            r7.l(r8)
            r5.f1489e = r0
            b3.i.b(r5, r6)
            return
        L72:
            ce.j0 r6 = new ce.j0
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.d.c(float, long, q1.m):void");
    }

    public final void d(long j10) {
        q qVar = this.f1489e;
        if (qVar == null ? false : q.c(qVar.f17577a, j10)) {
            return;
        }
        if (j10 != 16) {
            this.f1489e = new q(j10);
            setColor(h0.B(j10));
            this.f1491g = null;
            this.f1490f = null;
            this.f1492h = null;
            setShader(null);
        }
    }

    public final void e(s1.e eVar) {
        if (eVar == null || jc.l.a(this.f1493i, eVar)) {
            return;
        }
        this.f1493i = eVar;
        if (eVar.equals(s1.g.f19351a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(eVar instanceof s1.h)) {
            throw new j0();
        }
        a().p(1);
        s1.h hVar = (s1.h) eVar;
        a().o(hVar.f19352a);
        p pVarA = a();
        ((Paint) pVarA.f16600b).setStrokeMiter(hVar.f19353b);
        a().n(hVar.f19355d);
        a().m(hVar.f19354c);
        ((Paint) a().f16600b).setPathEffect(null);
    }

    public final void f(k0 k0Var) {
        if (k0Var == null || jc.l.a(this.f1488d, k0Var)) {
            return;
        }
        this.f1488d = k0Var;
        if (k0Var.equals(k0.f17544d)) {
            clearShadowLayer();
            return;
        }
        k0 k0Var2 = this.f1488d;
        float f10 = k0Var2.f17547c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (k0Var2.f17546b >> 32)), Float.intBitsToFloat((int) (this.f1488d.f17546b & 4294967295L)), h0.B(this.f1488d.f17545a));
    }

    public final void g(l lVar) {
        if (lVar == null || jc.l.a(this.f1486b, lVar)) {
            return;
        }
        this.f1486b = lVar;
        int i10 = lVar.f6085a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f1486b.f6085a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
