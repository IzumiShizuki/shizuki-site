package ba;

import i7.j1;
import i7.k1;
import i7.l1;
import i7.y1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.a f2355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1 f2357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f2358d = x0.v.v(lf.e.f12389b);

    public f1(k4.a aVar, String str) {
        this.f2355a = aVar;
        this.f2356b = str;
    }

    public static l1 a(l1 l1Var) {
        Executor k0Var;
        pf.e eVar = hf.l0.f8566a;
        pf.d dVar = pf.d.f17138c;
        pf.d dVar2 = q.t0.M(dVar) ? dVar : null;
        if (dVar2 == null || (k0Var = dVar2.i0()) == null) {
            k0Var = new hf.k0(dVar);
        }
        a9.n nVar = new a9.n(28);
        jc.l.e(l1Var, "<this>");
        return new l1(new y1(l1Var.f9193a, k0Var, nVar, 0), l1Var.f9194b, l1Var.f9195c, k1.f9182b);
    }

    public final void b() {
        na.q.d(this.f2356b.concat(" reload call"), "MainPage");
        this.f2358d.setValue(i7.u.a(new c1(new i7.o0(new i7.i1(0, new androidx.lifecycle.n0(2, this), null), 1, new j1(20)).f9240f, this, 0), this.f2355a));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, java.lang.String r10, ac.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ba.e1
            if (r0 == 0) goto L13
            r0 = r11
            ba.e1 r0 = (ba.e1) r0
            int r1 = r0.f2345h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2345h = r1
            goto L18
        L13:
            ba.e1 r0 = new ba.e1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f2343f
            int r1 = r0.f2345h
            r2 = 2
            r3 = 0
            ub.a0 r4 = ub.a0.f21526a
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L2d
            java.lang.String r10 = r0.f2342e
            java.lang.String r9 = r0.f2341d
            ub.a.f(r11)
            goto L81
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ub.a.f(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = r8.f2356b
            r11.append(r1)
            java.lang.String r1 = " search call: "
            r11.append(r1)
            r11.append(r9)
            java.lang.String r1 = " "
            r11.append(r1)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "MainPage"
            na.q.d(r11, r1)
            x0.e1 r11 = ba.y.f2506a
            r0.f2341d = r9
            r0.f2342e = r10
            r0.f2345h = r5
            boolean r11 = ba.y.f2507b
            zb.a r1 = zb.a.f26667a
            if (r11 == 0) goto L6b
        L69:
            r11 = r4
            goto L7e
        L6b:
            ba.y.f2507b = r5
            pf.e r11 = hf.l0.f8566a
            pf.d r11 = pf.d.f17138c
            a0.c0 r6 = new a0.c0
            r7 = 8
            r6.<init>(r2, r3, r7)
            java.lang.Object r11 = hf.a0.H(r11, r6, r0)
            if (r11 != r1) goto L69
        L7e:
            if (r11 != r1) goto L81
            return r1
        L81:
            i7.j1 r11 = new i7.j1
            r0 = 20
            r11.<init>(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            ba.c r1 = new ba.c
            r1.<init>(r10, r9, r8, r2)
            i7.o0 r9 = new i7.o0
            i7.i1 r10 = new i7.i1
            r2 = 0
            r10.<init>(r2, r1, r3)
            r9.<init>(r10, r0, r11)
            ba.c1 r10 = new ba.c1
            lf.f r9 = r9.f9240f
            r10.<init>(r9, r8, r5)
            k4.a r9 = r8.f2355a
            lf.j0 r9 = i7.u.a(r10, r9)
            x0.e1 r10 = r8.f2358d
            r10.setValue(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.f1.c(java.lang.String, java.lang.String, ac.c):java.lang.Object");
    }
}
