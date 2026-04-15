package y2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f25353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25354b;

    public a(t2.g gVar, int i10) {
        this.f25353a = gVar;
        this.f25354b = i10;
    }

    @Override // y2.g
    public final void a(l6.d dVar) {
        int i10 = dVar.f11738d;
        t2.g gVar = this.f25353a;
        if (i10 != -1) {
            dVar.d(i10, dVar.f11739e, gVar.f20320b);
        } else {
            dVar.d(dVar.f11736b, dVar.f11737c, gVar.f20320b);
        }
        int i11 = dVar.f11736b;
        int i12 = dVar.f11737c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f25354b;
        int iK = nh.b.k(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - gVar.f20320b.length(), 0, ((ce.g) dVar.f11740f).n());
        dVar.f(iK, iK);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jc.l.a(this.f25353a.f20320b, aVar.f25353a.f20320b) && this.f25354b == aVar.f25354b;
    }

    public final int hashCode() {
        return (this.f25353a.f20320b.hashCode() * 31) + this.f25354b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f25353a.f20320b);
        sb.append("', newCursorPosition=");
        return h0.m(sb, this.f25354b, ')');
    }

    public a(int i10, String str) {
        this(new t2.g(str), i10);
    }
}
