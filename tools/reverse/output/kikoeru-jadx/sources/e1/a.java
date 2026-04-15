package e1;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6060a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6060a == ((a) obj).f6060a;
    }

    public final int hashCode() {
        return this.f6060a;
    }

    public final String toString() {
        return h0.m(new StringBuilder("DeltaCounter(count="), this.f6060a, ')');
    }
}
