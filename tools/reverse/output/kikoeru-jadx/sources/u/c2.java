package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1 f20844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.f f20845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f20846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1 f20847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b2.d f20849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r2.a f20850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20852i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f20853j = androidx.compose.foundation.gestures.a.f521a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f20854k = new a2(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q.a0 f20855l = new q.a0(14, this);

    public c2(v1 v1Var, s.f fVar, p0 p0Var, e1 e1Var, boolean z10, b2.d dVar, r2.a aVar) {
        this.f20844a = v1Var;
        this.f20845b = fVar;
        this.f20846c = p0Var;
        this.f20847d = e1Var;
        this.f20848e = z10;
        this.f20849f = dVar;
        this.f20850g = aVar;
    }

    public static final long a(c2 c2Var, k1 k1Var, long j10, int i10) {
        b2.g gVar = c2Var.f20849f.f1455a;
        b2.g gVar2 = null;
        b2.g gVar3 = (gVar == null || !gVar.f9703n) ? null : (b2.g) i2.f.j(gVar);
        long jF = gVar3 != null ? gVar3.F(i10, j10) : 0L;
        long jH = p1.b.h(j10, jF);
        long jE = c2Var.e(c2Var.h(k1Var.a(c2Var.g(c2Var.e(p1.b.a(jH, 0.0f, c2Var.f20847d == e1.f20883b ? 1 : 2))))));
        long jH2 = p1.b.h(jH, jE);
        b2.g gVar4 = c2Var.f20849f.f1455a;
        if (gVar4 != null && gVar4.f9703n) {
            gVar2 = (b2.g) i2.f.j(gVar4);
        }
        b2.g gVar5 = gVar2;
        return p1.b.i(p1.b.i(jF, jE), gVar5 != null ? gVar5.X(i10, jE, jH2) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, ac.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof u.x1
            if (r0 == 0) goto L13
            r0 = r12
            u.x1 r0 = (u.x1) r0
            int r1 = r0.f21124h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21124h = r1
            goto L18
        L13:
            u.x1 r0 = new u.x1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f21122f
            int r1 = r0.f21124h
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            jc.x r10 = r0.f21121e
            u.c2 r11 = r0.f21120d
            ub.a.f(r12)
            r4 = r9
            goto L59
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            ub.a.f(r12)
            jc.x r5 = new jc.x
            r5.<init>()
            r5.f10837a = r10
            r9.f20851h = r2
            u.z1 r3 = new u.z1
            r8 = 0
            r4 = r9
            r6 = r10
            r3.<init>(r4, r5, r6, r8)
            r0.f21120d = r4
            r0.f21121e = r5
            r0.f21124h = r2
            s.v0 r10 = s.v0.f19292a
            java.lang.Object r10 = r9.f(r10, r3, r0)
            zb.a r11 = zb.a.f26667a
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r4
            r10 = r5
        L59:
            r12 = 0
            r11.f20851h = r12
            long r10 = r10.f10837a
            f3.q r12 = new f3.q
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c2.b(long, ac.c):java.lang.Object");
    }

    public final Object c(long j10, boolean z10, ac.i iVar) {
        ub.a0 a0Var = ub.a0.f21526a;
        if (z10) {
            return a0Var;
        }
        long jA = f3.q.a(j10, 0.0f, 0.0f, this.f20847d == e1.f20883b ? 1 : 2);
        b2 b2Var = new b2(this, null);
        s.f fVar = this.f20845b;
        zb.a aVar = zb.a.f26667a;
        if (fVar == null || !(this.f20844a.d() || this.f20844a.c())) {
            b2 b2Var2 = new b2(this, iVar);
            b2Var2.f20827g = jA;
            Object objU = b2Var2.u(a0Var);
            if (objU == aVar) {
                return objU;
            }
        } else {
            Object objB = fVar.b(jA, b2Var, iVar);
            if (objB == aVar) {
                return objB;
            }
        }
        return a0Var;
    }

    public final float d(float f10) {
        return this.f20848e ? f10 * (-1) : f10;
    }

    public final long e(long j10) {
        return this.f20848e ? p1.b.j(-1.0f, j10) : j10;
    }

    public final Object f(s.v0 v0Var, ic.n nVar, ac.c cVar) {
        Object objB = this.f20844a.b(v0Var, new q.q(this, nVar, (yb.c) null, 13), cVar);
        return objB == zb.a.f26667a ? objB : ub.a0.f21526a;
    }

    public final float g(long j10) {
        return Float.intBitsToFloat((int) (this.f20847d == e1.f20883b ? j10 >> 32 : j10 & 4294967295L));
    }

    public final long h(float f10) {
        long jFloatToRawIntBits;
        long j10;
        if (f10 == 0.0f) {
            return 0L;
        }
        if (this.f20847d == e1.f20883b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j10 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j10 = jFloatToRawIntBits3 << 32;
        }
        return j10 | (4294967295L & jFloatToRawIntBits);
    }
}
