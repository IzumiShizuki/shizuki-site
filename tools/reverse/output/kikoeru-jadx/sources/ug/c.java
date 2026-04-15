package ug;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg.d f21725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lh.b0 f21728e;

    public c(xg.d dVar, String str, String str2) {
        this.f21725b = dVar;
        this.f21726c = str;
        this.f21727d = str2;
        this.f21728e = g8.a.l(new j8.b((lh.h0) dVar.f25045c.get(1), this));
    }

    @Override // ug.f0
    public final long g() {
        String str = this.f21727d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = wg.e.f24227a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // ug.f0
    public final v i() {
        String str = this.f21726c;
        if (str == null) {
            return null;
        }
        ef.l lVar = v.f21877c;
        return vb.w.w(str);
    }

    @Override // ug.f0
    public final lh.h k() {
        return this.f21728e;
    }
}
