package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3.q f20390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f20391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e3.i f20392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e3.s f20395i;

    public s(int i10, int i11, long j10, e3.q qVar, u uVar, e3.i iVar, int i12, int i13, e3.s sVar) {
        this.f20387a = i10;
        this.f20388b = i11;
        this.f20389c = j10;
        this.f20390d = qVar;
        this.f20391e = uVar;
        this.f20392f = iVar;
        this.f20393g = i12;
        this.f20394h = i13;
        this.f20395i = sVar;
        if (f3.o.a(j10, f3.o.f6672c) || f3.o.c(j10) >= 0.0f) {
            return;
        }
        z2.a.b("lineHeight can't be negative (" + f3.o.c(j10) + ')');
    }

    public final s a(s sVar) {
        return sVar == null ? this : t.a(this, sVar.f20387a, sVar.f20388b, sVar.f20389c, sVar.f20390d, sVar.f20391e, sVar.f20392f, sVar.f20393g, sVar.f20394h, sVar.f20395i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f20387a == sVar.f20387a && this.f20388b == sVar.f20388b && f3.o.a(this.f20389c, sVar.f20389c) && jc.l.a(this.f20390d, sVar.f20390d) && jc.l.a(this.f20391e, sVar.f20391e) && jc.l.a(this.f20392f, sVar.f20392f) && this.f20393g == sVar.f20393g && this.f20394h == sVar.f20394h && jc.l.a(this.f20395i, sVar.f20395i);
    }

    public final int hashCode() {
        int iD = (f3.o.d(this.f20389c) + (((this.f20387a * 31) + this.f20388b) * 31)) * 31;
        e3.q qVar = this.f20390d;
        int iHashCode = (iD + (qVar != null ? qVar.hashCode() : 0)) * 31;
        u uVar = this.f20391e;
        int iHashCode2 = (iHashCode + (uVar != null ? uVar.hashCode() : 0)) * 31;
        e3.i iVar = this.f20392f;
        int iHashCode3 = (((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.f20393g) * 31) + this.f20394h) * 31;
        e3.s sVar = this.f20395i;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) e3.k.a(this.f20387a)) + ", textDirection=" + ((Object) e3.m.a(this.f20388b)) + ", lineHeight=" + ((Object) f3.o.e(this.f20389c)) + ", textIndent=" + this.f20390d + ", platformStyle=" + this.f20391e + ", lineHeightStyle=" + this.f20392f + ", lineBreak=" + ((Object) e3.e.a(this.f20393g)) + ", hyphens=" + ((Object) e3.d.a(this.f20394h)) + ", textMotion=" + this.f20395i + ')';
    }
}
