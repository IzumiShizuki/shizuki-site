package b7;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1971b;

    public m3(r rVar, int i10) {
        this.f1970a = rVar;
        this.f1971b = i10;
    }

    @Override // b7.s1
    public final void a() {
        this.f1970a.a();
    }

    @Override // b7.s1
    public final void b(int i10) {
        this.f1970a.b(i10);
    }

    @Override // b7.s1
    public final void c(int i10, v3 v3Var, m4.u0 u0Var, boolean z10, boolean z11) {
        Bundle bundleL;
        int i11 = this.f1971b;
        p4.c.i(i11 != 0);
        boolean z12 = z10 || !u0Var.a(17);
        boolean z13 = z11 || !u0Var.a(30);
        r rVar = this.f1970a;
        if (i11 < 2) {
            rVar.v0(i10, v3Var.i(u0Var, z10, true).l(i11), z12);
            return;
        }
        v3 v3VarI = v3Var.i(u0Var, z10, z11);
        if (rVar instanceof i1) {
            bundleL = new Bundle();
            bundleL.putBinder(v3.f2133l0, new u3(v3VarI));
        } else {
            bundleL = v3VarI.l(i11);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(t3.f2103d, z12);
        bundle.putBoolean(t3.f2104e, z13);
        rVar.S(i10, bundleL, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // b7.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r10, b7.y r11) {
        /*
            r9 = this;
            java.lang.String r0 = b7.y.f2190j
            java.lang.Object r1 = r11.f2195c
            int r2 = r11.f2196d
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = b7.y.f2187g
            int r5 = r11.f2193a
            r3.putInt(r4, r5)
            java.lang.String r4 = b7.y.f2188h
            long r5 = r11.f2194b
            r3.putLong(r4, r5)
            b7.j1 r4 = r11.f2197e
            if (r4 == 0) goto L43
            java.lang.String r5 = b7.y.f2189i
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = b7.j1.f1873e
            android.os.Bundle r8 = r4.f1877a
            r6.putBundle(r7, r8)
            java.lang.String r7 = b7.j1.f1874f
            boolean r8 = r4.f1878b
            r6.putBoolean(r7, r8)
            java.lang.String r7 = b7.j1.f1875g
            boolean r8 = r4.f1879c
            r6.putBoolean(r7, r8)
            java.lang.String r7 = b7.j1.f1876h
            boolean r4 = r4.f1880d
            r6.putBoolean(r7, r4)
            r3.putBundle(r5, r6)
        L43:
            b7.g4 r11 = r11.f2198f
            if (r11 == 0) goto L50
            java.lang.String r4 = b7.y.f2192l
            android.os.Bundle r11 = r11.b()
            r3.putBundle(r4, r11)
        L50:
            java.lang.String r11 = b7.y.f2191k
            r3.putInt(r11, r2)
            if (r1 != 0) goto L58
            goto L99
        L58:
            r11 = 1
            if (r2 == r11) goto L9f
            r11 = 2
            r4 = 0
            if (r2 == r11) goto L90
            r11 = 3
            if (r2 == r11) goto L66
            r11 = 4
            if (r2 == r11) goto L9f
            goto L99
        L66:
            m4.f r11 = new m4.f
            ya.i0 r1 = (ya.i0) r1
            ya.f0 r2 = ya.i0.p()
            r5 = 0
        L6f:
            int r6 = r1.size()
            if (r5 >= r6) goto L85
            java.lang.Object r6 = r1.get(r5)
            m4.i0 r6 = (m4.i0) r6
            android.os.Bundle r6 = r6.c(r4)
            r2.a(r6)
            int r5 = r5 + 1
            goto L6f
        L85:
            ya.a1 r1 = r2.f()
            r11.<init>(r1)
            r3.putBinder(r0, r11)
            goto L99
        L90:
            m4.i0 r1 = (m4.i0) r1
            android.os.Bundle r11 = r1.c(r4)
            r3.putBundle(r0, r11)
        L99:
            b7.r r11 = r9.f1970a
            r11.Y(r10, r3)
            return
        L9f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.m3.e(int, b7.y):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != m3.class) {
            return false;
        }
        IBinder iBinderAsBinder = this.f1970a.asBinder();
        IBinder iBinderAsBinder2 = ((m3) obj).f1970a.asBinder();
        int i10 = p4.c0.f16548a;
        return Objects.equals(iBinderAsBinder, iBinderAsBinder2);
    }

    @Override // b7.s1
    public final void f(int i10, m4.u0 u0Var) {
        this.f1970a.N(i10, u0Var.c());
    }

    @Override // b7.s1
    public final void h(int i10, i4 i4Var) {
        this.f1970a.y0(i10, i4Var.b());
    }

    public final int hashCode() {
        return Objects.hash(this.f1970a.asBinder());
    }

    @Override // b7.s1
    public final void i(int i10, h4 h4Var, boolean z10, boolean z11, int i11) {
        this.f1970a.P(i10, h4Var.a(z10, z11).c(i11));
    }
}
