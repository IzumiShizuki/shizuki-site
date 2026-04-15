package v7;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22767d;

    public e(String str, int i10, int i11, String str2) {
        l.e(str, "from");
        l.e(str2, "to");
        this.f22764a = i10;
        this.f22765b = i11;
        this.f22766c = str;
        this.f22767d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        l.e(eVar, "other");
        int i10 = this.f22764a - eVar.f22764a;
        return i10 == 0 ? this.f22765b - eVar.f22765b : i10;
    }
}
