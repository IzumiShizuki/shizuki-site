package oc;

import gh.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16309c;

    public b(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f16307a = i10;
        this.f16308b = g.x(i10, i11, i12);
        this.f16309c = i12;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c iterator() {
        return new c(this.f16307a, this.f16308b, this.f16309c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f16307a == bVar.f16307a && this.f16308b == bVar.f16308b && this.f16309c == bVar.f16309c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f16307a * 31) + this.f16308b) * 31) + this.f16309c;
    }

    public boolean isEmpty() {
        int i10 = this.f16309c;
        int i11 = this.f16308b;
        int i12 = this.f16307a;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f16308b;
        int i11 = this.f16307a;
        int i12 = this.f16309c;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
