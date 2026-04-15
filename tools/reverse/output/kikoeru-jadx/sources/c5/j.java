package c5;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p4.y;
import y6.d0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k5.l {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public b C;
    public q D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public i0 I;
    public boolean J;
    public boolean K;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f3465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s4.h f3468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s4.m f3469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f3470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3472t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y f3473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f3474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f3475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m4.n f3476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f6.h f3477y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p4.s f3478z;

    public j(c cVar, s4.h hVar, s4.m mVar, m4.q qVar, boolean z10, s4.h hVar2, s4.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, y yVar, m4.n nVar, b bVar, f6.h hVar3, p4.s sVar, boolean z15, w4.k kVar) {
        super(hVar, mVar, qVar, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f3467o = i11;
        this.K = z12;
        this.f3464l = i12;
        this.f3469q = mVar2;
        this.f3468p = hVar2;
        this.F = mVar2 != null;
        this.B = z11;
        this.f3465m = uri;
        this.f3471s = z14;
        this.f3473u = yVar;
        this.f3472t = z13;
        this.f3474v = cVar;
        this.f3475w = list;
        this.f3476x = nVar;
        this.f3470r = bVar;
        this.f3477y = hVar3;
        this.f3478z = sVar;
        this.f3466n = z15;
        g0 g0Var = i0.f25998b;
        this.I = a1.f25946e;
        this.f3463k = L.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (ud.e.c0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // k5.l
    public final boolean b() {
        throw null;
    }

    public final void c(s4.h hVar, s4.m mVar, boolean z10, boolean z11) {
        s4.m mVarB;
        long j10;
        if (z10) {
            z = this.E != 0;
            mVarB = mVar;
        } else {
            mVarB = mVar.b(this.E);
        }
        try {
            r5.k kVarF = f(hVar, mVarB, z11);
            if (z) {
                kVarF.r(this.E);
            }
            while (!this.G && this.C.f3426a.g(kVarF, b.f3425f) == 0) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f11058d.f14536f & 16384) == 0) {
                            throw e10;
                        }
                        this.C.f3426a.i(0L, 0L);
                        j10 = kVarF.f18846d;
                    }
                } catch (Throwable th2) {
                    this.E = (int) (kVarF.f18846d - mVar.f19448f);
                    throw th2;
                }
            }
            j10 = kVarF.f18846d;
            this.E = (int) (j10 - mVar.f19448f);
        } finally {
            nh.a.h(hVar);
        }
    }

    public final int e(int i10) {
        p4.c.i(!this.f3466n);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i10)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r5.k f(s4.h r34, s4.m r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.j.f(s4.h, s4.m, boolean):r5.k");
    }

    @Override // n5.l
    public final void i() {
        b bVar;
        this.D.getClass();
        if (this.C == null && (bVar = this.f3470r) != null) {
            r5.n nVarC = bVar.f3426a.c();
            if ((nVarC instanceof d0) || (nVarC instanceof l6.j)) {
                this.C = this.f3470r;
                this.F = false;
            }
        }
        s4.m mVar = this.f3469q;
        s4.h hVar = this.f3468p;
        if (this.F) {
            hVar.getClass();
            mVar.getClass();
            c(hVar, mVar, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.f3472t) {
            c(this.f11063i, this.f11056b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // n5.l
    public final void l() {
        this.G = true;
    }
}
