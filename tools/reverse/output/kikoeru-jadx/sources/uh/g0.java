package uh;

import b0.s1;
import ce.j0;
import hf.r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.g0 f21998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf.y f21999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f22000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r1 f22001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf.f f22002e = g8.a.c(-1, 6, null);

    public g0(a0.g0 g0Var, hf.y yVar, s1 s1Var) {
        this.f21998a = g0Var;
        this.f21999b = yVar;
        this.f22000c = s1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (u.w1.c(r2, r10, r3, r1) == r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x005b, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00d4, B:49:0x00ea], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r11v1, types: [ac.i, ic.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ic.a] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(uh.g0 r18, ac.c r19) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.g0.a(uh.g0, ac.c):java.lang.Object");
    }

    public final boolean b(a0 a0Var, float f10, ic.a aVar, ic.k kVar) {
        boolean zC;
        int iOrdinal = a0Var.ordinal();
        a0.g0 g0Var = this.f21998a;
        if (iOrdinal == 0) {
            zC = g0Var.c();
        } else {
            if (iOrdinal != 1) {
                throw new j0();
            }
            zC = g0Var.d();
        }
        if (!zC) {
            return false;
        }
        if (this.f22001d == null) {
            this.f22001d = hf.a0.y(this.f21999b, null, null, new e0(this, null, 0), 3);
        }
        this.f22002e.e(new c0(a0Var, f10, aVar, kVar));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ac.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof uh.f0
            if (r0 == 0) goto L13
            r0 = r6
            uh.f0 r0 = (uh.f0) r0
            int r1 = r0.f21992g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21992g = r1
            goto L18
        L13:
            uh.f0 r0 = new uh.f0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f21990e
            int r1 = r0.f21992g
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            uh.g0 r0 = r0.f21989d
            ub.a.f(r6)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            uh.g0 r1 = r0.f21989d
            ub.a.f(r6)
            goto L4d
        L3a:
            ub.a.f(r6)
            uh.c0 r6 = uh.c0.f21955e
            r0.f21989d = r5
            r0.f21992g = r3
            kf.f r1 = r5.f22002e
            java.lang.Object r6 = r1.j(r6, r0)
            if (r6 != r4) goto L4c
            goto L5b
        L4c:
            r1 = r5
        L4d:
            hf.r1 r6 = r1.f22001d
            if (r6 == 0) goto L5e
            r0.f21989d = r1
            r0.f21992g = r2
            java.lang.Object r6 = hf.a0.j(r6, r0)
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            r0 = r1
        L5d:
            r1 = r0
        L5e:
            r6 = 0
            r1.f22001d = r6
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.g0.c(ac.c):java.lang.Object");
    }
}
