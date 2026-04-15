package m4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14200l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f14207g = b.f14121f;

    static {
        int i10 = p4.c0.f16548a;
        f14196h = Integer.toString(0, 36);
        f14197i = Integer.toString(1, 36);
        f14198j = Integer.toString(2, 36);
        f14199k = Integer.toString(3, 36);
        f14200l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a aVarA = this.f14207g.a(i10);
        if (aVarA.f14091b != -1) {
            return aVarA.f14096g[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        a aVarA;
        int i10;
        b bVar = this.f14207g;
        long j11 = this.f14204d;
        int i11 = bVar.f14127a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = bVar.f14130d;
            while (i12 < i11 && ((bVar.a(i12).f14090a != Long.MIN_VALUE && bVar.a(i12).f14090a <= j10) || ((i10 = (aVarA = bVar.a(i12)).f14091b) != -1 && aVarA.a(-1) >= i10))) {
                i12++;
            }
            if (i12 < i11) {
                return i12;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(long r17) {
        /*
            r16 = this;
            r0 = r16
            m4.b r1 = r0.f14207g
            long r2 = r0.f14204d
            int r4 = r1.f14127a
            int r5 = r4 + (-1)
            r6 = 1
            int r4 = r4 - r6
            r7 = 0
            r8 = -9223372036854775808
            r10 = -1
            if (r5 != r4) goto L26
            m4.a r4 = r1.a(r5)
            boolean r11 = r4.f14100k
            if (r11 == 0) goto L26
            long r11 = r4.f14090a
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L26
            int r4 = r4.f14091b
            if (r4 != r10) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            int r5 = r5 - r4
        L28:
            if (r5 < 0) goto L5b
            int r4 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r4 != 0) goto L2f
            goto L5b
        L2f:
            m4.a r4 = r1.a(r5)
            long r11 = r4.f14090a
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L54
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 == 0) goto L58
            boolean r13 = r4.f14100k
            if (r13 == 0) goto L4f
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L4f
            int r4 = r4.f14091b
            if (r4 != r10) goto L4f
            goto L58
        L4f:
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 >= 0) goto L5b
            goto L58
        L54:
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L5b
        L58:
            int r5 = r5 + (-1)
            goto L28
        L5b:
            if (r5 < 0) goto L75
            m4.a r1 = r1.a(r5)
            int r2 = r1.f14091b
            if (r2 != r10) goto L66
            goto L74
        L66:
            if (r7 >= r2) goto L75
            int[] r3 = r1.f14095f
            r3 = r3[r7]
            if (r3 == 0) goto L74
            if (r3 != r6) goto L71
            goto L74
        L71:
            int r7 = r7 + 1
            goto L66
        L74:
            return r5
        L75:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f1.c(long):int");
    }

    public final long d(int i10) {
        return this.f14207g.a(i10).f14090a;
    }

    public final int e(int i10, int i11) {
        a aVarA = this.f14207g.a(i10);
        if (aVarA.f14091b != -1) {
            return aVarA.f14095f[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class.equals(obj.getClass())) {
            f1 f1Var = (f1) obj;
            Object obj2 = this.f14201a;
            Object obj3 = f1Var.f14201a;
            int i10 = p4.c0.f16548a;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.f14202b, f1Var.f14202b) && this.f14203c == f1Var.f14203c && this.f14204d == f1Var.f14204d && this.f14205e == f1Var.f14205e && this.f14206f == f1Var.f14206f && Objects.equals(this.f14207g, f1Var.f14207g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.f14207g.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        b bVar = this.f14207g;
        int i11 = bVar.f14127a;
        if (i10 != i11 - 1 || i10 != i11 - 1) {
            return false;
        }
        a aVarA = bVar.a(i10);
        return aVarA.f14100k && aVarA.f14090a == Long.MIN_VALUE && aVarA.f14091b == -1;
    }

    public final boolean h(int i10) {
        return this.f14207g.a(i10).f14099j;
    }

    public final int hashCode() {
        Object obj = this.f14201a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f14202b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f14203c) * 31;
        long j10 = this.f14204d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14205e;
        return this.f14207g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f14206f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i10, long j10, long j11, b bVar, boolean z10) {
        this.f14201a = obj;
        this.f14202b = obj2;
        this.f14203c = i10;
        this.f14204d = j10;
        this.f14205e = j11;
        this.f14207g = bVar;
        this.f14206f = z10;
    }
}
