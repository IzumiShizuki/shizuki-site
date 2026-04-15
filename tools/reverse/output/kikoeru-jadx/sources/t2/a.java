package t2;

import android.graphics.Canvas;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.c f20254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2.k f20257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f20258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f20259f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(b3.c r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.a.<init>(b3.c, int, int, long):void");
    }

    public final u2.k a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        u uVar;
        float fD = d();
        b3.c cVar = this.f20254a;
        b3.d dVar = cVar.f1479g;
        int i17 = cVar.f1484l;
        u2.f fVar = cVar.f1481i;
        l0 l0Var = cVar.f1474b;
        b3.a aVar = b3.b.f1472a;
        w wVar = l0Var.f20364c;
        return new u2.k(charSequence, fD, dVar, i10, truncateAt, i17, (wVar == null || (uVar = wVar.f20402b) == null) ? false : uVar.f20399a, i12, i14, i15, i16, i13, i11, fVar);
    }

    public final float b() {
        return this.f20257d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Type inference failed for: r13v26, types: [u2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(p1.c r12, int r13, m4.d1 r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.a.c(p1.c, int, m4.d1):long");
    }

    public final float d() {
        return f3.a.h(this.f20256c);
    }

    public final void e(q1.o oVar) {
        Canvas canvasA = q1.c.a(oVar);
        u2.k kVar = this.f20257d;
        if (kVar.f21251d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i10 = kVar.f21255h;
        if (canvasA.getClipBounds(kVar.f21263p)) {
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            u2.j jVar = u2.l.f21265a;
            jVar.f21247a = canvasA;
            kVar.f21253f.draw(jVar);
            if (i10 != 0) {
                canvasA.translate(0.0f, (-1) * i10);
            }
        }
        if (kVar.f21251d) {
            canvasA.restore();
        }
    }

    public final void f(q1.o oVar, long j10, q1.k0 k0Var, e3.l lVar, s1.e eVar) {
        b3.d dVar = this.f20254a.f1479g;
        int i10 = dVar.f1487c;
        dVar.d(j10);
        dVar.f(k0Var);
        dVar.g(lVar);
        dVar.e(eVar);
        dVar.b(3);
        e(oVar);
        dVar.b(i10);
    }

    public final void g(q1.o oVar, q1.m mVar, float f10, q1.k0 k0Var, e3.l lVar, s1.e eVar) {
        b3.d dVar = this.f20254a.f1479g;
        int i10 = dVar.f1487c;
        float fD = d();
        dVar.c(f10, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), mVar);
        dVar.f(k0Var);
        dVar.g(lVar);
        dVar.e(eVar);
        dVar.b(3);
        e(oVar);
        dVar.b(i10);
    }
}
