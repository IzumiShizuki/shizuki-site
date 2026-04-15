package v0;

import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1.q f22242a = androidx.compose.foundation.layout.c.j(j1.n.f9689a, w0.d.f23011a);

    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.b r16, java.lang.String r17, j1.q r18, long r19, x0.o r21, int r22) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.j.a(v1.b, java.lang.String, j1.q, long, x0.o, int):void");
    }

    public static final void b(w1.f fVar, String str, j1.q qVar, long j10, x0.o oVar, int i10, int i11) {
        x0.o oVar2;
        String str2;
        long j11;
        j1.q qVar2;
        oVar.Y(-126890956);
        int i12 = (oVar.f(fVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i12 |= oVar.f(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i12 & 1171) == 1170 && oVar.z()) {
            oVar.Q();
            oVar2 = oVar;
            j11 = j10;
            qVar2 = qVar;
            str2 = str;
        } else {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            } else if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            j1.q qVar3 = qVar;
            oVar.q();
            oVar2 = oVar;
            a(w1.b.c(fVar, oVar), str, qVar3, j10, oVar2, (i12 & 112) | 8 | (i12 & 896) | 3072);
            str2 = str;
            j11 = j10;
            qVar2 = qVar3;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h(fVar, str2, qVar2, j11, i10, i11);
        }
    }
}
