package ae;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(2);
        l.e(str, "name");
        l.e(str2, "desc");
        this.f318e = str;
        this.f319f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f318e, eVar.f318e) && l.a(this.f319f, eVar.f319f);
    }

    public final int hashCode() {
        return this.f319f.hashCode() + (this.f318e.hashCode() * 31);
    }

    @Override // android.support.v4.media.session.b
    public final String u() {
        return this.f318e + this.f319f;
    }
}
