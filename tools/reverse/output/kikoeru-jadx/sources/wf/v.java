package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f24190a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24191b = new f1("kotlin.time.Duration", uf.e.f21690j);

    @Override // sf.a
    public final uf.g a() {
        return f24191b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        int i10 = ff.a.f7057d;
        String strR = bVar.r();
        jc.l.e(strR, "value");
        try {
            return new ff.a(ff.f.a(strR));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(q.t0.D("Invalid ISO duration string format: '", strR, "'."), e10);
        }
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        long j10 = ((ff.a) obj).f7058a;
        int i10 = ff.a.f7057d;
        StringBuilder sb = new StringBuilder();
        if (j10 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jI = j10 < 0 ? ff.a.i(j10) : j10;
        long jH = ff.a.h(jI, ff.c.HOURS);
        boolean z10 = false;
        int iH = ff.a.f(jI) ? 0 : (int) (ff.a.h(jI, ff.c.MINUTES) % ((long) 60));
        int iH2 = ff.a.f(jI) ? 0 : (int) (ff.a.h(jI, ff.c.SECONDS) % ((long) 60));
        int iE = ff.a.e(jI);
        if (ff.a.f(j10)) {
            jH = 9999999999999L;
        }
        boolean z11 = jH != 0;
        boolean z12 = (iH2 == 0 && iE == 0) ? false : true;
        if (iH != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb.append(jH);
            sb.append('H');
        }
        if (z10) {
            sb.append(iH);
            sb.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            ff.a.b(sb, iH2, iE, 9, "S", true);
        }
        tVar.u(sb.toString());
    }
}
