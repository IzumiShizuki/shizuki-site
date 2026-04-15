package r9;

import ic.o;
import ic.p;
import j2.h0;
import jc.l;
import x0.e1;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.f f18966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f18967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0 f18968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f18969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f18970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f18971h;

    public c(String str, String str2, w1.f fVar, f1.f fVar2, f1.f fVar3, o oVar, int i10) {
        fVar2 = (i10 & 8) != 0 ? null : fVar2;
        e1 e1VarV = v.v(Boolean.FALSE);
        e1 e1VarV2 = v.v("");
        fVar3 = (i10 & 64) != 0 ? null : fVar3;
        l.e(oVar, "content");
        this.f18964a = str;
        this.f18965b = str2;
        this.f18966c = fVar;
        this.f18967d = fVar2;
        this.f18968e = e1VarV;
        this.f18969f = e1VarV2;
        this.f18970g = fVar3;
        this.f18971h = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f18964a, cVar.f18964a) && l.a(this.f18965b, cVar.f18965b) && l.a(this.f18966c, cVar.f18966c) && l.a(this.f18967d, cVar.f18967d) && l.a(this.f18968e, cVar.f18968e) && l.a(this.f18969f, cVar.f18969f) && l.a(this.f18970g, cVar.f18970g) && l.a(this.f18971h, cVar.f18971h);
    }

    public final int hashCode() {
        int iHashCode = (this.f18966c.hashCode() + h0.e(this.f18964a.hashCode() * 31, 31, this.f18965b)) * 31;
        p pVar = this.f18967d;
        int iHashCode2 = (this.f18969f.hashCode() + ((this.f18968e.hashCode() + ((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31)) * 31;
        o oVar = this.f18970g;
        return this.f18971h.hashCode() + ((iHashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OthersPageChild(route=" + this.f18964a + ", title=" + this.f18965b + ", icon=" + this.f18966c + ", actions=" + this.f18967d + ", searchEnable=" + this.f18968e + ", searchKeyword=" + this.f18969f + ", searchBar=" + this.f18970g + ", content=" + this.f18971h + ")";
    }
}
