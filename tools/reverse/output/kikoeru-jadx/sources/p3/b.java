package p3;

import android.graphics.Insets;
import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16524e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16528d;

    public b(int i10, int i11, int i12, int i13) {
        this.f16525a = i10;
        this.f16526b = i11;
        this.f16527c = i12;
        this.f16528d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f16525a, bVar2.f16525a), Math.max(bVar.f16526b, bVar2.f16526b), Math.max(bVar.f16527c, bVar2.f16527c), Math.max(bVar.f16528d, bVar2.f16528d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f16524e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return m2.a.h(this.f16525a, this.f16526b, this.f16527c, this.f16528d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16528d == bVar.f16528d && this.f16525a == bVar.f16525a && this.f16527c == bVar.f16527c && this.f16526b == bVar.f16526b;
    }

    public final int hashCode() {
        return (((((this.f16525a * 31) + this.f16526b) * 31) + this.f16527c) * 31) + this.f16528d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f16525a);
        sb.append(", top=");
        sb.append(this.f16526b);
        sb.append(", right=");
        sb.append(this.f16527c);
        sb.append(", bottom=");
        return h0.m(sb, this.f16528d, '}');
    }
}
