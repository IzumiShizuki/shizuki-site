package z4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26388d;

    public b(String str, int i10, int i11, String str2) {
        this.f26385a = str;
        this.f26386b = str2;
        this.f26387c = i10;
        this.f26388d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26387c == bVar.f26387c && this.f26388d == bVar.f26388d && ud.n.f(this.f26385a, bVar.f26385a) && ud.n.f(this.f26386b, bVar.f26386b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26385a, this.f26386b, Integer.valueOf(this.f26387c), Integer.valueOf(this.f26388d)});
    }
}
