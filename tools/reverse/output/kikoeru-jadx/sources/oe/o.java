package oe;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yd.e f16403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16404e;

    public o(Object obj, Object obj2, yd.e eVar, yd.e eVar2, String str) {
        jc.l.e(str, "filePath");
        this.f16400a = obj;
        this.f16401b = obj2;
        this.f16402c = eVar;
        this.f16403d = eVar2;
        this.f16404e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16400a.equals(oVar.f16400a) && jc.l.a(this.f16401b, oVar.f16401b) && jc.l.a(this.f16402c, oVar.f16402c) && this.f16403d.equals(oVar.f16403d) && jc.l.a(this.f16404e, oVar.f16404e);
    }

    public final int hashCode() {
        int iHashCode = this.f16400a.hashCode() * 31;
        Object obj = this.f16401b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f16402c;
        return this.f16404e.hashCode() + ((this.f16403d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f16400a);
        sb.append(", compilerVersion=");
        sb.append(this.f16401b);
        sb.append(", languageVersion=");
        sb.append(this.f16402c);
        sb.append(", expectedVersion=");
        sb.append(this.f16403d);
        sb.append(", filePath=");
        return t0.E(sb, this.f16404e, ')');
    }
}
