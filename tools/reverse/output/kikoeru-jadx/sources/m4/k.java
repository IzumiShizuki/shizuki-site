package m4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f14309e = new j(0).c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14313i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14317d;

    static {
        int i10 = p4.c0.f16548a;
        f14310f = Integer.toString(0, 36);
        f14311g = Integer.toString(1, 36);
        f14312h = Integer.toString(2, 36);
        f14313i = Integer.toString(3, 36);
    }

    public k(j jVar) {
        this.f14314a = jVar.f14296b;
        this.f14315b = jVar.f14297c;
        this.f14316c = jVar.f14298d;
        this.f14317d = (String) jVar.f14299e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f14314a == kVar.f14314a && this.f14315b == kVar.f14315b && this.f14316c == kVar.f14316c) {
            String str = kVar.f14317d;
            int i10 = p4.c0.f16548a;
            if (Objects.equals(this.f14317d, str)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((527 + this.f14314a) * 31) + this.f14315b) * 31) + this.f14316c) * 31;
        String str = this.f14317d;
        return i10 + (str == null ? 0 : str.hashCode());
    }
}
