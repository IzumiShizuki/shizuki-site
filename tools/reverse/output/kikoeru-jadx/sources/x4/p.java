package x4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tc.b0 f24665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24666d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v2.e f24669g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f24664b = b.f24582c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f24667e = w.f24726a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f24668f = w.f24727b;

    public p(Context context) {
        this.f24663a = context;
    }

    public final v a() {
        p4.c.i(!this.f24666d);
        this.f24666d = true;
        if (this.f24665c == null) {
            this.f24665c = new tc.b0(new n4.f[0]);
        }
        if (this.f24669g == null) {
            this.f24669g = new v2.e(9, this.f24663a);
        }
        return new v(this);
    }
}
