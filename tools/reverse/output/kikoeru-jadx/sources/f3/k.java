package f3;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f6661e = new k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6665d;

    public k(int i10, int i11, int i12, int i13) {
        this.f6662a = i10;
        this.f6663b = i11;
        this.f6664c = i12;
        this.f6665d = i13;
    }

    public final int a() {
        return this.f6665d - this.f6663b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6662a == kVar.f6662a && this.f6663b == kVar.f6663b && this.f6664c == kVar.f6664c && this.f6665d == kVar.f6665d;
    }

    public final int hashCode() {
        return (((((this.f6662a * 31) + this.f6663b) * 31) + this.f6664c) * 31) + this.f6665d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f6662a);
        sb.append(", ");
        sb.append(this.f6663b);
        sb.append(", ");
        sb.append(this.f6664c);
        sb.append(", ");
        return h0.m(sb, this.f6665d, ')');
    }
}
