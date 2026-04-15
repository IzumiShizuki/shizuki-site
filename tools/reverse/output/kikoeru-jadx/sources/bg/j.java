package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class j {
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f2904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2908e;

    public j(int i10, Boolean bool, String str, String str2, String str3, List list) {
        if (4 != (i10 & 4)) {
            wf.z0.i(i10, 4, h.f2896b);
            throw null;
        }
        this.f2904a = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.f2905b = null;
        } else {
            this.f2905b = str;
        }
        this.f2906c = str2;
        if ((i10 & 8) == 0) {
            this.f2907d = null;
        } else {
            this.f2907d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f2908e = null;
        } else {
            this.f2908e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jc.l.a(this.f2904a, jVar.f2904a) && jc.l.a(this.f2905b, jVar.f2905b) && jc.l.a(this.f2906c, jVar.f2906c) && jc.l.a(this.f2907d, jVar.f2907d) && jc.l.a(this.f2908e, jVar.f2908e);
    }

    public final int hashCode() {
        Boolean bool = this.f2904a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f2905b;
        int iE = j2.h0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2906c);
        String str2 = this.f2907d;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f2908e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "LrcResult(result=" + this.f2904a + ", message=" + this.f2905b + ", hash=" + this.f2906c + ", lyricExtension=" + this.f2907d + ", lrc=" + this.f2908e + ')';
    }
}
