package la;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements bg.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.k f11903d;

    public b(long j10, String str, List list, ic.k kVar) {
        jc.l.e(str, "title");
        jc.l.e(list, "extras");
        this.f11900a = j10;
        this.f11901b = str;
        this.f11902c = list;
        this.f11903d = kVar;
    }

    @Override // bg.t
    public final String f() {
        return na.w.a(this.f11900a);
    }

    @Override // bg.t
    public final String name() {
        return String.valueOf(this.f11900a);
    }
}
