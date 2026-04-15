package i8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import ba.v0;
import hf.a0;
import hf.l0;
import hf.t1;
import lf.b1;
import lf.p0;
import x0.a1;
import x0.e1;
import x0.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends v1.b implements u1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g1.d f9426u = new g1.d(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nf.d f9427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f9428g = p0.c(new p1.e(0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f9429h = x0.v.v(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f9430i = new a1(1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e1 f9431j = x0.v.v(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f9432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v1.b f9433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ic.k f9434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ic.k f9435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g2.p f9436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1 f9439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e1 f9440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e1 f9441t;

    public l(s8.i iVar, h8.h hVar) {
        d dVar = d.f9414a;
        this.f9432k = dVar;
        this.f9434m = f9426u;
        this.f9436o = g2.o.f7246b;
        this.f9437p = 1;
        this.f9439r = x0.v.v(dVar);
        this.f9440s = x0.v.v(iVar);
        this.f9441t = x0.v.v(hVar);
    }

    @Override // x0.u1
    public final void a() {
        nf.d dVar = this.f9427f;
        if (dVar != null) {
            a0.h(dVar, null);
        }
        this.f9427f = null;
        Object obj = this.f9433l;
        u1 u1Var = obj instanceof u1 ? (u1) obj : null;
        if (u1Var != null) {
            u1Var.a();
        }
    }

    @Override // v1.b
    public final boolean b(float f10) {
        this.f9430i.f(f10);
        return true;
    }

    @Override // x0.u1
    public final void c() {
        nf.d dVar = this.f9427f;
        if (dVar != null) {
            a0.h(dVar, null);
        }
        this.f9427f = null;
        Object obj = this.f9433l;
        u1 u1Var = obj instanceof u1 ? (u1) obj : null;
        if (u1Var != null) {
            u1Var.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.u1
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f9427f == null) {
                t1 t1VarE = a0.e();
                pf.e eVar = l0.f8566a;
                nf.d dVarB = a0.b(ud.b.C(t1VarE, nf.n.f15850a.f10872f));
                this.f9427f = dVarB;
                v1.b bVar = this.f9433l;
                Object[] objArr = 0;
                u1 u1Var = bVar instanceof u1 ? (u1) bVar : null;
                if (u1Var != null) {
                    u1Var.d();
                }
                if (this.f9438q) {
                    s8.h hVarA = s8.i.a((s8.i) this.f9440s.getValue());
                    hVarA.f19590b = ((h8.h) this.f9441t.getValue()).f8226b;
                    hVarA.f19613y = null;
                    s8.i iVarB = hVarA.b();
                    Drawable drawable = iVarB.f19639z;
                    Integer num = iVarB.f19638y;
                    iVarB.F.getClass();
                    Drawable drawableB = x8.c.b(iVarB, drawable, num);
                    k(new f(drawableB != null ? j(drawableB) : null));
                } else {
                    a0.y(dVarB, null, null, new v0(5, this, objArr == true ? 1 : 0), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // v1.b
    public final boolean e(q1.k kVar) {
        this.f9431j.setValue(kVar);
        return true;
    }

    @Override // v1.b
    public final long h() {
        v1.b bVar = (v1.b) this.f9429h.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override // v1.b
    public final void i(i2.l0 l0Var) {
        p1.e eVar = new p1.e(l0Var.e());
        b1 b1Var = this.f9428g;
        b1Var.getClass();
        b1Var.m(null, eVar);
        v1.b bVar = (v1.b) this.f9429h.getValue();
        if (bVar != null) {
            bVar.g(l0Var, l0Var.e(), this.f9430i.e(), (q1.k) this.f9431j.getValue());
        }
    }

    public final v1.b j(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new va.a(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        q1.f fVar = new q1.f(bitmap);
        int i10 = this.f9437p;
        v1.a aVar = new v1.a(fVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.f22350h = i10;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(i8.h r13) {
        /*
            r12 = this;
            i8.h r0 = r12.f9432k
            ic.k r1 = r12.f9434m
            java.lang.Object r13 = r1.a(r13)
            i8.h r13 = (i8.h) r13
            r12.f9432k = r13
            x0.e1 r1 = r12.f9439r
            r1.setValue(r13)
            boolean r1 = r13 instanceof i8.g
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            i8.g r1 = (i8.g) r1
            s8.o r1 = r1.f9419b
            goto L25
        L1c:
            boolean r1 = r13 instanceof i8.e
            if (r1 == 0) goto L60
            r1 = r13
            i8.e r1 = (i8.e) r1
            s8.e r1 = r1.f9416b
        L25:
            s8.i r3 = r1.b()
            w8.e r3 = r3.f19620g
            i8.m r4 = i8.n.f9442a
            w8.f r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof w8.b
            if (r4 == 0) goto L60
            v1.b r4 = r0.a()
            boolean r5 = r0 instanceof i8.f
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            v1.b r8 = r13.a()
            g2.p r9 = r12.f9436o
            w8.b r3 = (w8.b) r3
            int r10 = r3.f23437c
            boolean r3 = r1 instanceof s8.o
            if (r3 == 0) goto L58
            s8.o r1 = (s8.o) r1
            boolean r1 = r1.f19664g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
            r11 = 0
            goto L5a
        L58:
            r1 = 1
            r11 = 1
        L5a:
            i8.t r6 = new i8.t
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            v1.b r6 = r13.a()
        L68:
            r12.f9433l = r6
            x0.e1 r1 = r12.f9429h
            r1.setValue(r6)
            nf.d r1 = r12.f9427f
            if (r1 == 0) goto L9e
            v1.b r1 = r0.a()
            v1.b r3 = r13.a()
            if (r1 == r3) goto L9e
            v1.b r0 = r0.a()
            boolean r1 = r0 instanceof x0.u1
            if (r1 == 0) goto L88
            x0.u1 r0 = (x0.u1) r0
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8e
            r0.c()
        L8e:
            v1.b r0 = r13.a()
            boolean r1 = r0 instanceof x0.u1
            if (r1 == 0) goto L99
            r2 = r0
            x0.u1 r2 = (x0.u1) r2
        L99:
            if (r2 == 0) goto L9e
            r2.d()
        L9e:
            ic.k r0 = r12.f9435n
            if (r0 == 0) goto La5
            r0.a(r13)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.l.k(i8.h):void");
    }
}
