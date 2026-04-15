package y2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f25430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25431b;

    public w(int i10, String str) {
        this.f25430a = new t2.g(str);
        this.f25431b = i10;
    }

    @Override // y2.g
    public final void a(l6.d dVar) {
        int i10 = dVar.f11738d;
        t2.g gVar = this.f25430a;
        if (i10 != -1) {
            int i11 = dVar.f11739e;
            String str = gVar.f20320b;
            String str2 = gVar.f20320b;
            dVar.d(i10, i11, str);
            if (str2.length() > 0) {
                dVar.e(i10, str2.length() + i10);
            }
        } else {
            int i12 = dVar.f11736b;
            int i13 = dVar.f11737c;
            String str3 = gVar.f20320b;
            String str4 = gVar.f20320b;
            dVar.d(i12, i13, str3);
            if (str4.length() > 0) {
                dVar.e(i12, str4.length() + i12);
            }
        }
        int i14 = dVar.f11736b;
        int i15 = dVar.f11737c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f25431b;
        int iK = nh.b.k(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - gVar.f20320b.length(), 0, ((ce.g) dVar.f11740f).n());
        dVar.f(iK, iK);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return jc.l.a(this.f25430a.f20320b, wVar.f25430a.f20320b) && this.f25431b == wVar.f25431b;
    }

    public final int hashCode() {
        return (this.f25430a.f20320b.hashCode() * 31) + this.f25431b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f25430a.f20320b);
        sb.append("', newCursorPosition=");
        return h0.m(sb, this.f25431b, ')');
    }
}
