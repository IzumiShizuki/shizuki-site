package e5;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6173d;

    public d(double d10, String str) {
        this.f6170a = str;
        this.f6171b = 2;
        this.f6172c = d10;
        this.f6173d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6171b == dVar.f6171b && Double.compare(this.f6172c, dVar.f6172c) == 0 && Objects.equals(this.f6170a, dVar.f6170a) && Objects.equals(this.f6173d, dVar.f6173d);
    }

    public final int hashCode() {
        return Objects.hash(this.f6170a, Integer.valueOf(this.f6171b), Double.valueOf(this.f6172c), this.f6173d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        p4.c.i(z10);
        this.f6170a = str;
        this.f6171b = i10;
        this.f6173d = str2;
        this.f6172c = 0.0d;
    }
}
