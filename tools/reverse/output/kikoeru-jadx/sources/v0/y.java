package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.f f22342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.f f22343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f f22344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f f22345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.f f22346e;

    public y() {
        g0.f fVar = x.f22337a;
        g0.f fVar2 = x.f22338b;
        g0.f fVar3 = x.f22339c;
        g0.f fVar4 = x.f22340d;
        g0.f fVar5 = x.f22341e;
        this.f22342a = fVar;
        this.f22343b = fVar2;
        this.f22344c = fVar3;
        this.f22345d = fVar4;
        this.f22346e = fVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return jc.l.a(this.f22342a, yVar.f22342a) && jc.l.a(this.f22343b, yVar.f22343b) && jc.l.a(this.f22344c, yVar.f22344c) && jc.l.a(this.f22345d, yVar.f22345d) && jc.l.a(this.f22346e, yVar.f22346e);
    }

    public final int hashCode() {
        return this.f22346e.hashCode() + ((this.f22345d.hashCode() + ((this.f22344c.hashCode() + ((this.f22343b.hashCode() + (this.f22342a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f22342a + ", small=" + this.f22343b + ", medium=" + this.f22344c + ", large=" + this.f22345d + ", extraLarge=" + this.f22346e + ')';
    }
}
