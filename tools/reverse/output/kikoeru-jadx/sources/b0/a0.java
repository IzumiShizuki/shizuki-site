package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f1170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f1171t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.y f1172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.v f1173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f1174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r.x f1175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r.x f1176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r.x f1177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.e1 f1179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f1180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0.e1 f1181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.e1 f1182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t1.b f1185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r.c f1186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r.c f1187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0.e1 f1188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1189r;

    static {
        long j10 = Integer.MAX_VALUE;
        f1170s = (j10 & 4294967295L) | (j10 << 32);
    }

    public a0(hf.y yVar, q1.v vVar, d0 d0Var) {
        this.f1172a = yVar;
        this.f1173b = vVar;
        this.f1174c = d0Var;
        Boolean bool = Boolean.FALSE;
        this.f1179h = x0.v.v(bool);
        this.f1180i = x0.v.v(bool);
        this.f1181j = x0.v.v(bool);
        this.f1182k = x0.v.v(bool);
        long j10 = f1170s;
        this.f1183l = j10;
        this.f1184m = 0L;
        this.f1185n = vVar != null ? vVar.b() : null;
        this.f1186o = new r.c(new f3.j(0L), r.w1.f18626g, null, 12);
        this.f1187p = new r.c(Float.valueOf(1.0f), r.w1.f18620a, null, 12);
        this.f1188q = x0.v.v(new f3.j(0L));
        this.f1189r = j10;
    }

    public final void a() {
        t1.b bVar = this.f1185n;
        r.x xVar = this.f1175d;
        boolean zBooleanValue = ((Boolean) this.f1180i.getValue()).booleanValue();
        hf.y yVar = this.f1172a;
        if (zBooleanValue || xVar == null || bVar == null) {
            if (b()) {
                if (bVar != null) {
                    bVar.f(1.0f);
                }
                hf.a0.y(yVar, null, null, new u(this, null, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z10 = !zB;
        if (!zB) {
            bVar.f(0.0f);
        }
        hf.a0.y(yVar, null, null, new w(z10, this, xVar, bVar, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.f1181j.getValue()).booleanValue();
    }

    public final void c() {
        q1.v vVar;
        boolean zBooleanValue = ((Boolean) this.f1179h.getValue()).booleanValue();
        hf.y yVar = this.f1172a;
        if (zBooleanValue) {
            f(false);
            hf.a0.y(yVar, null, null, new u(this, null, 2), 3);
        }
        if (((Boolean) this.f1180i.getValue()).booleanValue()) {
            d(false);
            hf.a0.y(yVar, null, null, new u(this, null, 3), 3);
        }
        if (b()) {
            e(false);
            hf.a0.y(yVar, null, null, new u(this, null, 4), 3);
        }
        this.f1178g = false;
        g(0L);
        this.f1183l = f1170s;
        t1.b bVar = this.f1185n;
        if (bVar != null && (vVar = this.f1173b) != null) {
            vVar.a(bVar);
        }
        this.f1185n = null;
        this.f1175d = null;
        this.f1177f = null;
        this.f1176e = null;
    }

    public final void d(boolean z10) {
        this.f1180i.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f1181j.setValue(Boolean.valueOf(z10));
    }

    public final void f(boolean z10) {
        this.f1179h.setValue(Boolean.valueOf(z10));
    }

    public final void g(long j10) {
        this.f1188q.setValue(new f3.j(j10));
    }
}
