package m3;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import b0.w1;
import b7.m;
import b7.q0;
import ef.u;
import j2.h0;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lh.y;
import m4.p0;
import m4.q;
import n5.n;
import o.u0;
import q1.z;
import r5.b0;
import r5.o;
import r5.s;
import r5.x;
import s4.v;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m6.g, yb.g, n5.l, o6.j, q8.i, lg.b, r5.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile l f14077b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14078a;

    public /* synthetic */ l(int i10) {
        this.f14078a = i10;
    }

    public static final boolean n(y yVar) {
        y yVar2 = mh.h.f15183e;
        lh.i iVarP = yVar.f12620a;
        int iK = lh.i.k(iVarP, mh.c.f15167a);
        if (iK == -1) {
            iK = lh.i.k(yVar.f12620a, mh.c.f15168b);
        }
        if (iK != -1) {
            iVarP = lh.i.p(iVarP, iK + 1, 0, 2);
        } else if (yVar.f() != null && iVarP.d() == 2) {
            iVarP = lh.i.f12572d;
        }
        return !u.c0(iVarP.s(), ".class", true);
    }

    public static byte[] r(i0 i0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            o4.b bVar = (o4.b) it.next();
            Bundle bundleC = bVar.c();
            Bitmap bitmap = bVar.f16200d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                p4.c.i(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(o4.b.f16193w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static q0 t(eg.g gVar, m mVar) {
        IOException iOException = (IOException) mVar.f1959c;
        if (!(iOException instanceof s4.y)) {
            return null;
        }
        int i10 = ((s4.y) iOException).f19484d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (gVar.a(1)) {
            return new q0(1, 300000L);
        }
        if (gVar.a(2)) {
            return new q0(2, 60000L);
        }
        return null;
    }

    public static long v(m mVar) {
        Throwable cause = (IOException) mVar.f1959c;
        if ((cause instanceof p0) || (cause instanceof FileNotFoundException) || (cause instanceof v) || (cause instanceof n)) {
            return -9223372036854775807L;
        }
        int i10 = s4.j.f19426b;
        while (cause != null) {
            if ((cause instanceof s4.j) && ((s4.j) cause).f19427a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((mVar.f1958b - 1) * 1000, 5000);
    }

    public static z y(List list) {
        return new z((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), list);
    }

    @Override // q8.i
    public q8.c a(q8.b bVar) {
        return null;
    }

    @Override // m6.g
    public long d(o oVar) {
        return -1L;
    }

    @Override // o6.j
    public int e(q qVar) {
        switch (this.f14078a) {
            case 17:
                String str = qVar.f14544n;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                        case "application/pgs":
                        case "application/x-mp4-vtt":
                        case "application/x-quicktime-tx3g":
                        case "application/vobsub":
                            return 2;
                        case "text/vtt":
                        case "text/x-ssa":
                        case "application/x-subrip":
                        case "application/ttml+xml":
                            return 1;
                    }
                }
                throw new IllegalArgumentException(h0.x("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    @Override // o6.j
    public o6.l h(q qVar) {
        o6.l hVar;
        switch (this.f14078a) {
            case 17:
                String str = qVar.f14544n;
                List list = qVar.f14547q;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                            hVar = new q6.h(list);
                            break;
                        case "application/pgs":
                            return new w1(17);
                        case "application/x-mp4-vtt":
                            return new x(1);
                        case "text/vtt":
                            return new v2.e(10);
                        case "application/x-quicktime-tx3g":
                            hVar = new v6.a(list);
                            break;
                        case "text/x-ssa":
                            hVar = new s6.a(list);
                            break;
                        case "application/vobsub":
                            hVar = new w1(list);
                            break;
                        case "application/x-subrip":
                            return new t6.a();
                        case "application/ttml+xml":
                            return new u6.e();
                    }
                    return hVar;
                }
                throw new IllegalArgumentException(h0.x("Unsupported MIME type: ", str));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // n5.l
    public void i() {
        synchronized (o5.b.f16238a) {
            Object obj = o5.b.f16239b;
            synchronized (obj) {
                if (o5.b.f16240c) {
                    return;
                }
                long jA = o5.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    o5.b.f16241d = jA;
                    o5.b.f16240c = true;
                }
            }
        }
    }

    @Override // m6.g
    public b0 j() {
        return new s(-9223372036854775807L);
    }

    @Override // o6.j
    public boolean k(q qVar) {
        switch (this.f14078a) {
            case 17:
                String str = qVar.f14544n;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r6, java.util.List r7, ac.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q9.k0
            if (r0 == 0) goto L13
            r0 = r8
            q9.k0 r0 = (q9.k0) r0
            int r1 = r0.f18034f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18034f = r1
            goto L18
        L13:
            q9.k0 r0 = new q9.k0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f18032d
            int r1 = r0.f18034f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r8)
            goto L46
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            ub.a.f(r8)
            pf.e r8 = hf.l0.f8566a
            pf.d r8 = pf.d.f17138c
            q9.l0 r1 = new q9.l0
            r3 = 0
            r4 = 0
            r1.<init>(r6, r7, r4, r3)
            r0.f18034f = r2
            java.lang.Object r8 = hf.a0.H(r8, r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r8 != r6) goto L46
            return r6
        L46:
            ub.n r8 = (ub.n) r8
            java.lang.Object r6 = r8.f21546a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.o(java.lang.String, java.util.List, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(bg.p r6, ac.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q9.m0
            if (r0 == 0) goto L13
            r0 = r7
            q9.m0 r0 = (q9.m0) r0
            int r1 = r0.f18045f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18045f = r1
            goto L18
        L13:
            q9.m0 r0 = new q9.m0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18043d
            int r1 = r0.f18045f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L47
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            ub.a.f(r7)
            pf.e r7 = hf.l0.f8566a
            pf.d r7 = pf.d.f17138c
            a9.k r1 = new a9.k
            r3 = 17
            r4 = 0
            r1.<init>(r3, r6, r4)
            r0.f18045f = r2
            java.lang.Object r7 = hf.a0.H(r7, r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r7 != r6) goto L47
            return r6
        L47:
            ub.n r7 = (ub.n) r7
            java.lang.Object r6 = r7.f21546a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.p(bg.p, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.lang.String r6, ac.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q9.n0
            if (r0 == 0) goto L13
            r0 = r7
            q9.n0 r0 = (q9.n0) r0
            int r1 = r0.f18052f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18052f = r1
            goto L18
        L13:
            q9.n0 r0 = new q9.n0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18050d
            int r1 = r0.f18052f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L46
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            ub.a.f(r7)
            pf.e r7 = hf.l0.f8566a
            pf.d r7 = pf.d.f17138c
            ba.x0 r1 = new ba.x0
            r3 = 6
            r4 = 0
            r1.<init>(r6, r4, r3)
            r0.f18052f = r2
            java.lang.Object r7 = hf.a0.H(r7, r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r7 != r6) goto L46
            return r6
        L46:
            ub.n r7 = (ub.n) r7
            java.lang.Object r6 = r7.f21546a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.q(java.lang.String, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.String r6, ac.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q9.o0
            if (r0 == 0) goto L13
            r0 = r7
            q9.o0 r0 = (q9.o0) r0
            int r1 = r0.f18063f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18063f = r1
            goto L18
        L13:
            q9.o0 r0 = new q9.o0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18061d
            int r1 = r0.f18063f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L46
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            ub.a.f(r7)
            pf.e r7 = hf.l0.f8566a
            pf.d r7 = pf.d.f17138c
            ba.x0 r1 = new ba.x0
            r3 = 7
            r4 = 0
            r1.<init>(r6, r4, r3)
            r0.f18063f = r2
            java.lang.Object r7 = hf.a0.H(r7, r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r7 != r6) goto L46
            return r6
        L46:
            ub.n r7 = (ub.n) r7
            java.lang.Object r6 = r7.f21546a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.s(java.lang.String, ac.c):java.lang.Object");
    }

    public int u(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(java.lang.String r5, java.util.List r6, ac.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof q9.p0
            if (r0 == 0) goto L13
            r0 = r7
            q9.p0 r0 = (q9.p0) r0
            int r1 = r0.f18070f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18070f = r1
            goto L18
        L13:
            q9.p0 r0 = new q9.p0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f18068d
            int r1 = r0.f18070f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L45
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ub.a.f(r7)
            pf.e r7 = hf.l0.f8566a
            pf.d r7 = pf.d.f17138c
            q9.l0 r1 = new q9.l0
            r3 = 0
            r1.<init>(r5, r6, r3, r2)
            r0.f18070f = r2
            java.lang.Object r7 = hf.a0.H(r7, r1, r0)
            zb.a r5 = zb.a.f26667a
            if (r7 != r5) goto L45
            return r5
        L45:
            ub.n r7 = (ub.n) r7
            java.lang.Object r5 = r7.f21546a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.w(java.lang.String, java.util.List, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.lang.String r6, ac.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q9.q0
            if (r0 == 0) goto L13
            r0 = r7
            q9.q0 r0 = (q9.q0) r0
            int r1 = r0.f18078f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18078f = r1
            goto L18
        L13:
            q9.q0 r0 = new q9.q0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18076d
            int r1 = r0.f18078f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L47
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            ub.a.f(r7)
            pf.e r7 = hf.l0.f8566a
            pf.d r7 = pf.d.f17138c
            ba.x0 r1 = new ba.x0
            r3 = 9
            r4 = 0
            r1.<init>(r6, r4, r3)
            r0.f18078f = r2
            java.lang.Object r7 = hf.a0.H(r7, r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r7 != r6) goto L47
            return r6
        L47:
            ub.n r7 = (ub.n) r7
            java.lang.Object r6 = r7.f21546a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.x(java.lang.String, ac.c):java.lang.Object");
    }

    public /* synthetic */ l(int i10, Object obj) {
        this.f14078a = i10;
    }

    public l(String str) {
        this.f14078a = 27;
        jc.l.e(str, "name");
    }

    public l() {
        this.f14078a = 8;
        new u0(0);
        new o.s((Object) null);
    }

    @Override // n5.l
    public void l() {
    }

    @Override // q8.i
    public void b(int i10) {
    }

    @Override // r5.g
    public long f(long j10) {
        return j10;
    }

    @Override // m6.g
    public void m(long j10) {
    }

    @Override // lg.b
    public int g(byte[] bArr, int i10, int i11) {
        return i11;
    }

    @Override // q8.i
    public void c(q8.b bVar, Bitmap bitmap, Map map, int i10) {
    }
}
