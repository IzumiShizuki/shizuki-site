package hd;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8458a;

    public t(ArrayList arrayList) {
        this.f8458a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f8458a.equals(((t) obj).f8458a);
    }

    public final int hashCode() {
        return this.f8458a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f8458a + ')';
    }
}
