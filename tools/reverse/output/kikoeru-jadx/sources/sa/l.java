package sa;

import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qa.b f19708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f19709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f19710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f19711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f19712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f19713g;

    public l(String str, qa.b bVar, j jVar, s sVar, s sVar2, s sVar3) {
        jc.l.e(bVar, "whitePoint");
        jc.l.e(sVar, "r");
        jc.l.e(sVar2, "g");
        jc.l.e(sVar3, "b");
        this.f19707a = str;
        this.f19708b = bVar;
        this.f19709c = jVar;
        this.f19710d = sVar;
        this.f19711e = sVar2;
        this.f19712f = sVar3;
        b0.u("RGB");
        float[] fArrB = n.b(bVar, sVar, sVar2, sVar3);
        this.f19713g = fArrB;
        nh.b.z(fArrB);
    }

    @Override // sa.k
    public final j G() {
        return this.f19709c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jc.l.a(this.f19707a, lVar.f19707a) && jc.l.a(this.f19708b, lVar.f19708b) && jc.l.a(this.f19709c, lVar.f19709c) && jc.l.a(this.f19710d, lVar.f19710d) && jc.l.a(this.f19711e, lVar.f19711e) && jc.l.a(this.f19712f, lVar.f19712f);
    }

    @Override // sa.k
    public final float[] f() {
        return this.f19713g;
    }

    public final int hashCode() {
        return this.f19712f.hashCode() + ((this.f19711e.hashCode() + ((this.f19710d.hashCode() + ((this.f19709c.hashCode() + ((this.f19708b.hashCode() + (this.f19707a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return this.f19707a;
    }

    @Override // qa.c
    public final qa.b z() {
        return this.f19708b;
    }
}
