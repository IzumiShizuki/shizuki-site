package i1;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8644b;

    public h(int i10, Integer num) {
        this.f8643a = i10;
        this.f8644b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8643a == hVar.f8643a && l.a(this.f8644b, hVar.f8644b);
    }

    public final int hashCode() {
        int i10 = this.f8643a * 31;
        Integer num = this.f8644b;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f8643a + ", dataOffset=" + this.f8644b + ')';
    }
}
