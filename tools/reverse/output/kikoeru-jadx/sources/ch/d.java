package ch;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lh.i f4159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lh.i f4160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lh.i f4161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lh.i f4162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lh.i f4163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final lh.i f4164i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh.i f4165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh.i f4166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4167c;

    static {
        lh.i iVar = lh.i.f12572d;
        f4159d = g5.w.t(":");
        f4160e = g5.w.t(":status");
        f4161f = g5.w.t(":method");
        f4162g = g5.w.t(":path");
        f4163h = g5.w.t(":scheme");
        f4164i = g5.w.t(":authority");
    }

    public d(lh.i iVar, lh.i iVar2) {
        jc.l.e(iVar, "name");
        jc.l.e(iVar2, "value");
        this.f4165a = iVar;
        this.f4166b = iVar2;
        this.f4167c = iVar2.d() + iVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jc.l.a(this.f4165a, dVar.f4165a) && jc.l.a(this.f4166b, dVar.f4166b);
    }

    public final int hashCode() {
        return this.f4166b.hashCode() + (this.f4165a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4165a.s() + ": " + this.f4166b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(g5.w.t(str), g5.w.t(str2));
        lh.i iVar = lh.i.f12572d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, lh.i iVar) {
        this(iVar, g5.w.t(str));
        jc.l.e(iVar, "name");
        jc.l.e(str, "value");
        lh.i iVar2 = lh.i.f12572d;
    }
}
