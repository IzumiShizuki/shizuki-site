package k0;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10965c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f10966d = null;

    public n(String str, String str2) {
        this.f10963a = str;
        this.f10964b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return jc.l.a(this.f10963a, nVar.f10963a) && jc.l.a(this.f10964b, nVar.f10964b) && this.f10965c == nVar.f10965c && jc.l.a(this.f10966d, nVar.f10966d);
    }

    public final int hashCode() {
        int iE = (h0.e(this.f10963a.hashCode() * 31, 31, this.f10964b) + (this.f10965c ? 1231 : 1237)) * 31;
        e eVar = this.f10966d;
        return iE + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f10966d + ", isShowingSubstitution=" + this.f10965c + ')';
    }
}
