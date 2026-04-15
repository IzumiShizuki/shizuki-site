package w5;

import r5.e;
import r5.f;
import r5.g;
import r5.i;
import r5.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f23405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f23406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23407d;

    public a(g gVar, i iVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f23405b = iVar;
        this.f23407d = i10;
        this.f23404a = new e(gVar, j10, j11, j12, j13, j14);
    }

    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(o oVar, long j10, b0.a aVar) {
        if (j10 == oVar.getPosition()) {
            return 0;
        }
        aVar.f1169a = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        return c(r27, r8, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(r5.o r27, b0.a r28) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.b(r5.o, b0.a):int");
    }

    public final void d(long j10) {
        f fVar = this.f23406c;
        if (fVar == null || fVar.f18811a != j10) {
            e eVar = this.f23404a;
            this.f23406c = new f(j10, eVar.f18805a.f(j10), eVar.f18807c, eVar.f18808d, eVar.f18809e, eVar.f18810f);
        }
    }
}
