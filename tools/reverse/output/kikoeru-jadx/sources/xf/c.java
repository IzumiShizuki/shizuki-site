package xf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24987d = new b(new j(false, false, true, "    ", false, "type", true, a.f24983b), zf.d.f26817a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f24988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.y f24989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xa.h f24990c = new xa.h(3);

    public c(j jVar, d0.y yVar) {
        this.f24988a = jVar;
        this.f24989b = yVar;
    }

    public final Object a(String str, sf.a aVar) {
        jc.l.e(aVar, "deserializer");
        jc.l.e(str, "string");
        h7.k kVar = new h7.k(str);
        Object objD = new yf.s(this, yf.w.f26335c, kVar, aVar.a(), null).d(aVar);
        if (kVar.i() == 10) {
            return objD;
        }
        h7.k.q(kVar, "Expected EOF after parsing, but had " + str.charAt(kVar.f8197b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(sf.a aVar, Object obj) {
        char[] cArr;
        jc.l.e(aVar, "serializer");
        b7.m mVar = new b7.m(11, (char) 0);
        yf.c cVar = yf.c.f26281c;
        synchronized (cVar) {
            vb.j jVar = (vb.j) cVar.f21336b;
            cArr = null;
            char[] cArr2 = (char[]) (jVar.isEmpty() ? null : jVar.removeLast());
            if (cArr2 != null) {
                cVar.f21335a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        mVar.f1959c = cArr;
        try {
            new yf.t(new k5.d(mVar), this, yf.w.f26335c, new yf.t[yf.w.f26340h.a()]).s(aVar, obj);
            return mVar.toString();
        } finally {
            mVar.u();
        }
    }
}
