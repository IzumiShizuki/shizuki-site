package o6;

import java.util.List;
import m4.d1;
import p4.c0;
import ya.a1;
import ya.g0;
import ya.i0;
import ya.p;
import ya.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f16246c = new p(new d1(6), x0.f26071b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f16247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f16248b;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(ya.a1 r19) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.b.<init>(ya.a1):void");
    }

    @Override // o6.d
    public final int a(long j10) {
        int iA = c0.a(this.f16248b, j10, false);
        if (iA < this.f16247a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // o6.d
    public final long e(int i10) {
        p4.c.c(i10 < this.f16247a.size());
        return this.f16248b[i10];
    }

    @Override // o6.d
    public final List f(long j10) {
        int iE = c0.e(this.f16248b, j10, false);
        if (iE != -1) {
            return (i0) this.f16247a.get(iE);
        }
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // o6.d
    public final int g() {
        return this.f16247a.size();
    }
}
