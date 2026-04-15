package c0;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import b0.u0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import h0.x0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import m4.r1;
import pc.f0;
import r.y1;
import u.a2;
import u.c2;
import u.z0;
import x0.b1;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3162h;

    public s(int[] iArr, int[] iArr2, x xVar) {
        this.f3156b = xVar;
        this.f3157c = iArr;
        this.f3159e = new b1(d(iArr));
        this.f3158d = iArr2;
        this.f3160f = new b1(e(iArr, iArr2));
        Integer numG0 = vb.l.G0(iArr);
        this.f3162h = new u0(numG0 != null ? numG0.intValue() : 0, 90, TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS);
    }

    public static final float a(s sVar, a2 a2Var, float f10) {
        c2 c2Var = (c2) sVar.f3156b;
        long jH = c2Var.h(c2Var.d(f10));
        c2 c2Var2 = a2Var.f20805a;
        return c2Var.g(c2Var.e(c2.a(c2Var2, c2Var2.f20853j, jH, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(c0.s r21, u.c2 r22, u.z0 r23, float r24, float r25, ac.c r26) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.b(c0.s, u.c2, u.z0, float, float, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(c0.s r11, jc.y r12, jc.v r13, u.c2 r14, jc.y r15, long r16, ac.c r18) {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof u.c1
            if (r3 == 0) goto L17
            r3 = r2
            u.c1 r3 = (u.c1) r3
            int r4 = r3.f20843j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f20843j = r4
            goto L1c
        L17:
            u.c1 r3 = new u.c1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f20842i
            int r4 = r3.f20843j
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            jc.y r11 = r3.f20841h
            u.c2 r12 = r3.f20840g
            jc.v r0 = r3.f20839f
            jc.y r1 = r3.f20838e
            c0.s r3 = r3.f20837d
            ub.a.f(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L6b
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            ub.a.f(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4b:
            ba.v0 r2 = new ba.v0
            r4 = 0
            r6 = 18
            r2.<init>(r6, r11, r4)
            r3.f20837d = r11
            r3.f20838e = r12
            r3.f20839f = r13
            r3.f20840g = r14
            r3.f20841h = r15
            r3.f20843j = r5
            java.lang.Object r2 = hf.a0.I(r0, r2, r3)
            zb.a r0 = zb.a.f26667a
            if (r2 != r0) goto L68
            return r0
        L68:
            r0 = r13
            r6 = r14
            r7 = r15
        L6b:
            u.z0 r2 = (u.z0) r2
            if (r2 == 0) goto La5
            java.lang.Object r1 = r12.f10838a
            u.z0 r1 = (u.z0) r1
            boolean r1 = r1.f21150c
            long r3 = r2.f21148a
            long r8 = r2.f21149b
            u.z0 r10 = new u.z0
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f10838a = r1
            long r3 = r6.e(r3)
            float r12 = r6.g(r3)
            r0.f10835a = r12
            r12 = 30
            r1 = 0
            r.k r12 = r.d.b(r1, r1, r12)
            r7.f10838a = r12
            r11.i(r2)
            float r11 = r0.f10835a
            boolean r11 = u.y0.a(r11)
            r11 = r11 ^ r5
            goto La6
        La5:
            r11 = 0
        La6:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.c(c0.s, jc.y, jc.v, u.c2, jc.y, long, ac.c):java.lang.Object");
    }

    public static int d(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        while (true) {
            if (i10 >= length) {
                if (i11 == Integer.MAX_VALUE) {
                    break;
                }
                return i11;
            }
            int i12 = iArr[i10];
            if (i12 <= 0) {
                break;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            i10++;
        }
        return 0;
    }

    public static int e(int[] iArr, int[] iArr2) {
        int iD = d(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == iD) {
                iMin = Math.min(iMin, iArr2[i10]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z0 h(kf.f fVar) {
        z0 z0Var = null;
        df.l lVarO = f0.O(new x0(3, (Object) new r2.a(6, fVar), (yb.c) (0 == true ? 1 : 0)));
        while (lVarO.hasNext()) {
            z0 z0VarA = (z0) lVarO.next();
            if (z0Var != null) {
                z0VarA = z0Var.a(z0VarA);
            }
            z0Var = z0VarA;
        }
        return z0Var;
    }

    public FileInputStream f(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((k7.c) this.f3157c).e();
            return null;
        }
    }

    public void g(int i10, Serializable serializable) {
        ((Executor) this.f3156b).execute(new b5.n(this, i10, serializable, 3));
    }

    public void i(z0 z0Var) {
        m0.w wVar = (m0.w) this.f3162h;
        long j10 = z0Var.f21149b;
        long j11 = z0Var.f21148a;
        ((d2.d) wVar.f13782b).a(Float.intBitsToFloat((int) (j11 >> 32)), j10);
        ((d2.d) wVar.f13783c).a(Float.intBitsToFloat((int) (j11 & 4294967295L)), j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(u.c2 r5, u.b1 r6, ac.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof u.d1
            if (r0 == 0) goto L13
            r0 = r7
            u.d1 r0 = (u.d1) r0
            int r1 = r0.f20873g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20873g = r1
            goto L18
        L13:
            u.d1 r0 = new u.d1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f20871e
            int r1 = r0.f20873g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            c0.s r5 = r0.f20870d
            ub.a.f(r7)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ub.a.f(r7)
            r4.f3155a = r2
            lf.w0 r7 = new lf.w0
            r1 = 0
            r3 = 21
            r7.<init>(r5, r6, r1, r3)
            r0.f20870d = r4
            r0.f20873g = r2
            hf.s1 r5 = new hf.s1
            yb.h r6 = r0.f302b
            jc.l.b(r6)
            r1 = 0
            r5.<init>(r6, r0, r1)
            java.lang.Object r5 = nd.h.v(r5, r2, r5, r7)
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L54
            return r6
        L54:
            r5 = r4
        L55:
            r6 = 0
            r5.f3155a = r6
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.j(u.c2, u.b1, ac.c):java.lang.Object");
    }

    public s(c2 c2Var, y1 y1Var, f1.e eVar, f3.c cVar) {
        this.f3156b = c2Var;
        this.f3157c = y1Var;
        this.f3158d = eVar;
        this.f3159e = cVar;
        this.f3160f = g8.a.c(Integer.MAX_VALUE, 6, null);
        this.f3162h = new m0.w(23);
    }

    public s(AssetManager assetManager, Executor executor, k7.c cVar, String str, File file) {
        this.f3155a = false;
        this.f3156b = executor;
        this.f3157c = cVar;
        this.f3160f = str;
        this.f3159e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24) {
            if (i10 >= 31) {
                bArr = k7.d.f11170d;
            } else {
                switch (i10) {
                    case 24:
                    case 25:
                        bArr = k7.d.f11174h;
                        break;
                    case 26:
                        bArr = k7.d.f11173g;
                        break;
                    case 27:
                        bArr = k7.d.f11172f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = k7.d.f11171e;
                        break;
                }
            }
        }
        this.f3158d = bArr;
    }

    public s(Context context, p5.r rVar) {
        this.f3156b = context.getApplicationContext();
        this.f3157c = rVar;
        g0 g0Var = i0.f25998b;
        this.f3160f = a1.f25946e;
        this.f3161g = r1.f14573a;
        this.f3162h = p4.v.f16624a;
    }
}
