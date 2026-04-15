package p7;

import androidx.lifecycle.n0;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f16862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f16864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f16865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16866e;

    public e(w wVar) {
        this.f16864c = new ThreadLocal();
        this.f16865d = new AtomicBoolean(false);
        int i10 = ff.a.f7057d;
        this.f16866e = ff.f.m(30, ff.c.SECONDS);
        j jVar = new j(1, new n0(22, wVar));
        this.f16862a = jVar;
        this.f16863b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #6 {all -> 0x019d, blocks: (B:63:0x0121, B:68:0x013f, B:70:0x014a, B:84:0x01a1, B:85:0x01a8, B:59:0x00f9), top: B:116:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185 A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #5 {all -> 0x019c, blocks: (B:74:0x017f, B:76:0x0185, B:78:0x0191, B:80:0x0195), top: B:114:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1 A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #6 {all -> 0x019d, blocks: (B:63:0x0121, B:68:0x013f, B:70:0x014a, B:84:0x01a1, B:85:0x01a8, B:59:0x00f9), top: B:116:0x00f9 }] */
    @Override // p7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(boolean r18, ic.n r19, ac.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.e.S(boolean, ic.n, ac.c):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f16865d.compareAndSet(false, true)) {
            this.f16862a.c();
            this.f16863b.c();
        }
    }

    public e(final w wVar, final String str, int i10) {
        jc.l.e(str, "fileName");
        this.f16864c = new ThreadLocal();
        final int i11 = 0;
        this.f16865d = new AtomicBoolean(false);
        int i12 = ff.a.f7057d;
        this.f16866e = ff.f.m(30, ff.c.SECONDS);
        if (i10 > 0) {
            this.f16862a = new j(i10, new ic.a() { // from class: p7.c
                @Override // ic.a
                public final Object b() {
                    switch (i11) {
                        case 0:
                            z7.a aVarL = wVar.l(str);
                            ud.n.g(aVarL, "PRAGMA query_only = 1");
                            return aVarL;
                        default:
                            return wVar.l(str);
                    }
                }
            });
            final int i13 = 1;
            this.f16863b = new j(1, new ic.a() { // from class: p7.c
                @Override // ic.a
                public final Object b() {
                    switch (i13) {
                        case 0:
                            z7.a aVarL = wVar.l(str);
                            ud.n.g(aVarL, "PRAGMA query_only = 1");
                            return aVarL;
                        default:
                            return wVar.l(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
