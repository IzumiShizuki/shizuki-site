package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j1.p implements i2.y, i2.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e1 f20900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2 f20901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f20903r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g2.c0 f20905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20906u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20907v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20909x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0.m f20904s = new b0.m(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20908w = 0;

    public g(e1 e1Var, c2 c2Var, boolean z10, c cVar) {
        this.f20900o = e1Var;
        this.f20901p = c2Var;
        this.f20902q = z10;
        this.f20903r = cVar;
    }

    public static final float B0(g gVar, c cVar) {
        p1.c cVar2;
        int iCompare;
        if (f3.l.b(gVar.f20908w, 0L)) {
            return 0.0f;
        }
        z0.e eVar = gVar.f20904s.f1296a;
        int i10 = eVar.f26374c - 1;
        Object[] objArr = eVar.f26372a;
        if (i10 < objArr.length) {
            cVar2 = null;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                p1.c cVar3 = (p1.c) ((f) objArr[i10]).f20889a.b();
                if (cVar3 != null) {
                    long jC = cVar3.c();
                    long jR = gh.g.R(gVar.f20908w);
                    int iOrdinal = gVar.f20900o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jR & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new ce.j0();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jR >> 32)));
                    }
                    if (iCompare <= 0) {
                        cVar2 = cVar3;
                    } else if (cVar2 == null) {
                        cVar2 = cVar3;
                    }
                }
                i10--;
            }
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            p1.c cVarC0 = gVar.f20906u ? gVar.C0() : null;
            if (cVarC0 == null) {
                return 0.0f;
            }
            cVar2 = cVarC0;
        }
        long jR2 = gh.g.R(gVar.f20908w);
        int iOrdinal2 = gVar.f20900o.ordinal();
        if (iOrdinal2 == 0) {
            float f10 = cVar2.f16484b;
            return cVar.a(f10, cVar2.f16486d - f10, Float.intBitsToFloat((int) (jR2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new ce.j0();
        }
        float f11 = cVar2.f16483a;
        return cVar.a(f11, cVar2.f16485c - f11, Float.intBitsToFloat((int) (jR2 >> 32)));
    }

    public final p1.c C0() {
        if (this.f9703n) {
            i2.g1 g1VarX = i2.f.x(this);
            g2.c0 c0Var = this.f20905t;
            if (c0Var != null) {
                if (!c0Var.h()) {
                    c0Var = null;
                }
                if (c0Var != null) {
                    return g1VarX.s(c0Var, false);
                }
            }
        }
        return null;
    }

    public final boolean D0(p1.c cVar, long j10) {
        long jF0 = F0(cVar, j10);
        return Math.abs(Float.intBitsToFloat((int) (jF0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF0 & 4294967295L))) <= 0.5f;
    }

    public final void E0() {
        c cVar = this.f20903r;
        if (cVar == null) {
            cVar = (c) i2.f.i(this, e.f20879a);
        }
        c cVar2 = cVar;
        if (this.f20909x) {
            x.a.c("launchAnimation called when previous animation was running");
        }
        c.f20829a.getClass();
        q2 q2Var = new q2(b.f20807b);
        hf.a0.y(n0(), null, hf.z.f8619d, new e.j(this, q2Var, cVar2, (yb.c) null, 21), 1);
    }

    public final long F0(p1.c cVar, long j10) {
        long jFloatToRawIntBits;
        long j11;
        long jR = gh.g.R(j10);
        int iOrdinal = this.f20900o.ordinal();
        if (iOrdinal == 0) {
            c cVar2 = this.f20903r;
            if (cVar2 == null) {
                cVar2 = (c) i2.f.i(this, e.f20879a);
            }
            float f10 = cVar.f16484b;
            float fA = cVar2.a(f10, cVar.f16486d - f10, Float.intBitsToFloat((int) (jR & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j11 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new ce.j0();
            }
            c cVar3 = this.f20903r;
            if (cVar3 == null) {
                cVar3 = (c) i2.f.i(this, e.f20879a);
            }
            float f11 = cVar.f16483a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(cVar3.a(f11, cVar.f16485c - f11, Float.intBitsToFloat((int) (jR >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j11 = jFloatToRawIntBits3 << 32;
        }
        return j11 | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // i2.y
    public final void m(long j10) {
        int iG;
        p1.c cVarC0;
        long j11 = this.f20908w;
        this.f20908w = j10;
        int iOrdinal = this.f20900o.ordinal();
        if (iOrdinal == 0) {
            iG = jc.l.g((int) (j10 & 4294967295L), (int) (4294967295L & j11));
        } else {
            if (iOrdinal != 1) {
                throw new ce.j0();
            }
            iG = jc.l.g((int) (j10 >> 32), (int) (j11 >> 32));
        }
        if (iG >= 0 || this.f20909x || this.f20906u || (cVarC0 = C0()) == null || !D0(cVarC0, j11)) {
            return;
        }
        this.f20907v = true;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // i2.y
    public final /* synthetic */ void B(g2.c0 c0Var) {
    }
}
