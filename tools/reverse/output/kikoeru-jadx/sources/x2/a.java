package x2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24550a;

    public a(int i10) {
        this.f24550a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f24550a == ((a) obj).f24550a;
    }

    public final int hashCode() {
        return this.f24550a;
    }

    public final String toString() {
        return h0.m(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f24550a, ')');
    }
}
