package s1;

import f3.m;
import jc.l;
import q1.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f3.c f19341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f19342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f19343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19344d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f19341a, aVar.f19341a) && this.f19342b == aVar.f19342b && l.a(this.f19343c, aVar.f19343c) && p1.e.a(this.f19344d, aVar.f19344d);
    }

    public final int hashCode() {
        int iHashCode = (this.f19343c.hashCode() + ((this.f19342b.hashCode() + (this.f19341a.hashCode() * 31)) * 31)) * 31;
        long j10 = this.f19344d;
        return ((int) (j10 ^ (j10 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f19341a + ", layoutDirection=" + this.f19342b + ", canvas=" + this.f19343c + ", size=" + ((Object) p1.e.f(this.f19344d)) + ')';
    }
}
