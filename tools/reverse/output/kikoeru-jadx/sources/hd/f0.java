package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8384a;

    public f0(String str) {
        jc.l.e(str, "value");
        this.f8384a = str;
    }

    @Override // hd.c0
    public final Object a() {
        return this.f8384a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && jc.l.a(this.f8384a, ((f0) obj).f8384a);
    }

    public final int hashCode() {
        return this.f8384a.hashCode();
    }
}
