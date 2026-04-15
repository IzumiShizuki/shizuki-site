package c5;

import j5.c1;
import java.io.IOException;
import java.util.ArrayList;
import p4.c0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f3515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3516c = -1;

    public m(q qVar, int i10) {
        this.f3515b = qVar;
        this.f3514a = i10;
    }

    @Override // j5.c1
    public final boolean a() {
        if (this.f3516c == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i10 = this.f3516c;
        q qVar = this.f3515b;
        return !qVar.D() && qVar.f3547v[i10].x(qVar.T);
    }

    @Override // j5.c1
    public final void b() throws IOException {
        int i10 = this.f3516c;
        q qVar = this.f3515b;
        if (i10 == -2) {
            qVar.j();
            throw new androidx.media3.exoplayer.offline.e(t0.D("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.I.a(this.f3514a).f14307d[0].f14544n, "."));
        }
        if (i10 == -1) {
            qVar.F();
        } else if (i10 != -3) {
            qVar.F();
            qVar.f3547v[i10].z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.f3516c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p4.c.c(r0)
            c5.q r0 = r6.f3515b
            r0.j()
            int[] r3 = r0.K
            r3.getClass()
            int[] r3 = r0.K
            int r4 = r6.f3514a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.J
            j5.o1 r0 = r0.I
            m4.j1 r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = -2
            goto L3a
        L31:
            boolean[] r0 = r0.N
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.f3516c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.m.c():void");
    }

    public final boolean d() {
        int i10 = this.f3516c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // j5.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.d()
            if (r0 == 0) goto L61
            int r0 = r4.f3516c
            c5.q r1 = r4.f3515b
            boolean r2 = r1.D()
            if (r2 == 0) goto L11
            goto L61
        L11:
            c5.p[] r2 = r1.f3547v
            r2 = r2[r0]
            boolean r3 = r1.T
            int r5 = r2.v(r5, r3)
            java.util.ArrayList r6 = r1.f3539n
            if (r6 == 0) goto L31
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L47
        L26:
            int r1 = r6.size()
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.get(r1)
            goto L48
        L31:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L47
        L3b:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L3b
            r6 = r1
            goto L48
        L47:
            r6 = 0
        L48:
            c5.j r6 = (c5.j) r6
            if (r6 == 0) goto L5d
            boolean r1 = r6.K
            if (r1 != 0) goto L5d
            int r1 = r2.t()
            int r6 = r6.e(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5d:
            r2.H(r5)
            return r5
        L61:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.m.j(long):int");
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        m4.q qVar;
        if (this.f3516c == -3) {
            fVar.b(4);
            return -4;
        }
        if (d()) {
            int i11 = this.f3516c;
            q qVar2 = this.f3515b;
            ArrayList arrayList = qVar2.f3539n;
            if (!qVar2.D()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).f3463k;
                        int length = qVar2.f3547v.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar2.N[i15] && qVar2.f3547v[i15].B() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    c0.S(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    m4.q qVar3 = jVar.f11058d;
                    if (!qVar3.equals(qVar2.G)) {
                        qVar2.f3536k.j(qVar2.f3527b, qVar3, jVar.f11059e, jVar.f11060f, jVar.f11061g);
                    }
                    qVar2.G = qVar3;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).K) {
                    int iC = qVar2.f3547v[i11].C(eVar, fVar, i10, qVar2.T);
                    if (iC == -5) {
                        m4.q qVarD = (m4.q) eVar.f22365c;
                        qVarD.getClass();
                        if (i11 == qVar2.B) {
                            int iQ = g8.a.q(qVar2.f3547v[i11].B());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).f3463k != iQ) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                qVar = ((j) arrayList.get(i12)).f11058d;
                            } else {
                                qVar = qVar2.F;
                                qVar.getClass();
                            }
                            qVarD = qVarD.d(qVar);
                        }
                        eVar.f22365c = qVarD;
                    }
                    return iC;
                }
            }
        }
        return -3;
    }
}
