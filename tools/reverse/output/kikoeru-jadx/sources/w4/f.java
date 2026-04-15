package w4;

import j5.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import m4.f1;
import m4.h1;
import m4.i1;
import p5.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f23364h = new m(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f23365i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f23369d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23371f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f23366a = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f23367b = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23368c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i1 f23370e = i1.f14291a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23372g = -1;

    public final void a(e eVar) {
        long j10 = eVar.f23359c;
        if (j10 != -1) {
            this.f23372g = j10;
        }
        this.f23371f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f23371f;
            if (str != null) {
                e eVar = (e) this.f23368c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.f23368c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.f23361e && (iVar = this.f23369d) != null) {
                    iVar.d(aVar, eVar2.f23357a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w4.e c(int r19, j5.d0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f23368c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            w4.e r8 = (w4.e) r8
            long r9 = r8.f23359c
            j5.d0 r11 = r8.f23360d
            r12 = -1
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L57
            int r9 = r8.f23358b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.f10248d
            w4.f r14 = r8.f23363g
            java.util.HashMap r15 = r14.f23368c
            r16 = r12
            java.lang.String r12 = r14.f23371f
            java.lang.Object r12 = r15.get(r12)
            w4.e r12 = (w4.e) r12
            if (r12 == 0) goto L4b
            long r12 = r12.f23359c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.f23372g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L59
            r8.f23359c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.f23358b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.f10248d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f23359c
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.f10248d
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L16
            int r9 = r2.f10246b
            int r10 = r11.f10246b
            if (r9 != r10) goto L16
            int r9 = r2.f10247c
            int r10 = r11.f10247c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.f23359c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            int r9 = p4.c0.f16548a
            j5.d0 r9 = r5.f23360d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        L9b:
            r5 = r8
            r6 = r9
            goto L16
        L9f:
            if (r5 != 0) goto Lb1
            p5.m r4 = w4.f.f23364h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            w4.e r5 = new w4.e
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.c(int, j5.d0):w4.e");
    }

    public final synchronized String d(i1 i1Var, d0 d0Var) {
        return c(i1Var.g(d0Var.f10245a, this.f23367b).f14203c, d0Var).f23357a;
    }

    public final void e(a aVar) {
        d0 d0Var;
        i1 i1Var = aVar.f23338b;
        int i10 = aVar.f23339c;
        d0 d0Var2 = aVar.f23340d;
        boolean zP = i1Var.p();
        HashMap map = this.f23368c;
        if (zP) {
            String str = this.f23371f;
            if (str != null) {
                e eVar = (e) map.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) map.get(this.f23371f);
        this.f23371f = c(i10, d0Var2).f23357a;
        f(aVar);
        if (d0Var2 != null) {
            long j10 = d0Var2.f10248d;
            if (d0Var2.b()) {
                if (eVar2 != null && eVar2.f23359c == j10 && (d0Var = eVar2.f23360d) != null && d0Var.f10246b == d0Var2.f10246b && d0Var.f10247c == d0Var2.f10247c) {
                    return;
                }
                c(i10, new d0(j10, d0Var2.f10245a));
                this.f23369d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc, B:49:0x00d9, B:52:0x00e0), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(w4.a r10) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.f(w4.a):void");
    }

    public final synchronized void g(a aVar, int i10) {
        try {
            this.f23369d.getClass();
            boolean z10 = i10 == 0;
            Iterator it = this.f23368c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    if (eVar.f23361e) {
                        boolean zEquals = eVar.f23357a.equals(this.f23371f);
                        if (z10 && zEquals) {
                            boolean z11 = eVar.f23362f;
                        }
                        if (zEquals) {
                            a(eVar);
                        }
                        this.f23369d.d(aVar, eVar.f23357a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
