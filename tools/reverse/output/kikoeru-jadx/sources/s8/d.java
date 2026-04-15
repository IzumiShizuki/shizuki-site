package s8;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t8.i f19578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8.g f19579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w8.e f19580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t8.d f19581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap.Config f19582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f19583f;

    public d(t8.i iVar, t8.g gVar, w8.e eVar, t8.d dVar, Bitmap.Config config, Boolean bool) {
        this.f19578a = iVar;
        this.f19579b = gVar;
        this.f19580c = eVar;
        this.f19581d = dVar;
        this.f19582e = config;
        this.f19583f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jc.l.a(this.f19578a, dVar.f19578a) && this.f19579b == dVar.f19579b && jc.l.a(this.f19580c, dVar.f19580c) && this.f19581d == dVar.f19581d && this.f19582e == dVar.f19582e && jc.l.a(this.f19583f, dVar.f19583f);
    }

    public final int hashCode() {
        t8.i iVar = this.f19578a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        t8.g gVar = this.f19579b;
        int iHashCode2 = (iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 28629151;
        w8.e eVar = this.f19580c;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        t8.d dVar = this.f19581d;
        int iHashCode4 = (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f19582e;
        int iHashCode5 = (iHashCode4 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f19583f;
        return (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
