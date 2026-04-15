package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends yb.a implements yb.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f8593b = new t(yb.d.f26087a, new g1.d(8));

    public u() {
        super(yb.d.f26087a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((yb.f) r3.f8590a.a(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (yb.d.f26087a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return yb.i.f26088a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // yb.a, yb.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yb.h L(yb.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            jc.l.e(r3, r0)
            boolean r0 = r3 instanceof hf.t
            if (r0 == 0) goto L20
            hf.t r3 = (hf.t) r3
            yb.g r0 = r2.f26084a
            if (r0 == r3) goto L15
            yb.g r1 = r3.f8591b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            ic.k r3 = r3.f8590a
            java.lang.Object r3 = r3.a(r2)
            yb.f r3 = (yb.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            yb.d r0 = yb.d.f26087a
            if (r0 != r3) goto L27
        L24:
            yb.i r3 = yb.i.f26088a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.u.L(yb.g):yb.h");
    }

    @Override // yb.a, yb.h
    public final yb.f R(yb.g gVar) {
        yb.f fVar;
        jc.l.e(gVar, "key");
        if (!(gVar instanceof t)) {
            if (yb.d.f26087a == gVar) {
                return this;
            }
            return null;
        }
        t tVar = (t) gVar;
        yb.g gVar2 = this.f26084a;
        if ((gVar2 == tVar || tVar.f8591b == gVar2) && (fVar = (yb.f) tVar.f8590a.a(this)) != null) {
            return fVar;
        }
        return null;
    }

    public abstract void e0(yb.h hVar, Runnable runnable);

    public void f0(yb.h hVar, Runnable runnable) {
        nf.b.i(this, hVar, runnable);
    }

    public boolean g0(yb.h hVar) {
        return !(this instanceof z1);
    }

    public u h0(int i10) {
        nf.b.a(i10);
        return new nf.h(this, i10);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.q(this);
    }
}
