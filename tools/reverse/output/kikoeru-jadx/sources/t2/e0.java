package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f20313a = lc.b.C(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20314b = lc.b.C(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f20315c = q1.q.f17574g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e3.o f20316d;

    static {
        long j10 = q1.q.f17569b;
        f20316d = j10 != 16 ? new e3.c(j10) : e3.n.f6087a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final t2.d0 a(t2.d0 r25, long r26, q1.m r28, float r29, long r30, x2.k r32, x2.i r33, x2.j r34, x2.n r35, java.lang.String r36, long r37, e3.a r39, e3.p r40, a3.c r41, long r42, e3.l r44, q1.k0 r45, t2.v r46, s1.e r47) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.e0.a(t2.d0, long, q1.m, float, long, x2.k, x2.i, x2.j, x2.n, java.lang.String, long, e3.a, e3.p, a3.c, long, e3.l, q1.k0, t2.v, s1.e):t2.d0");
    }

    public static final Object b(float f10, Object obj, Object obj2) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    public static final long c(long j10, long j11, float f10) {
        f3.p[] pVarArr = f3.o.f6671b;
        long j12 = j10 & 1095216660480L;
        if (j12 != 0) {
            long j13 = 1095216660480L & j11;
            if (j13 != 0) {
                if (j12 == 0 || j13 == 0) {
                    f3.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!f3.p.a(f3.o.b(j10), f3.o.b(j11))) {
                    f3.i.a("Cannot perform operation for " + ((Object) f3.p.b(f3.o.b(j10))) + " and " + ((Object) f3.p.b(f3.o.b(j11))));
                }
                return lc.b.H(android.support.v4.media.session.b.L(f3.o.c(j10), f3.o.c(j11), f10), j12);
            }
        }
        return ((f3.o) b(f10, new f3.o(j10), new f3.o(j11))).f6673a;
    }
}
