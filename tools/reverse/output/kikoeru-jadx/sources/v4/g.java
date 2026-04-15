package v4;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.q f22486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.q f22487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22489e;

    public g(String str, m4.q qVar, m4.q qVar2, int i10, int i11) {
        p4.c.c(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f22485a = str;
        qVar.getClass();
        this.f22486b = qVar;
        qVar2.getClass();
        this.f22487c = qVar2;
        this.f22488d = i10;
        this.f22489e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f22488d == gVar.f22488d && this.f22489e == gVar.f22489e && this.f22485a.equals(gVar.f22485a) && this.f22486b.equals(gVar.f22486b) && this.f22487c.equals(gVar.f22487c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22487c.hashCode() + ((this.f22486b.hashCode() + j2.h0.e((((527 + this.f22488d) * 31) + this.f22489e) * 31, 31, this.f22485a)) * 31);
    }
}
