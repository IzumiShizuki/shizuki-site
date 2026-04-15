package c7;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3599b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3600a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public d(a aVar) {
        this.f3600a = aVar;
    }

    public static d a(AudioAttributes audioAttributes) {
        return Build.VERSION.SDK_INT >= 26 ? new d(new c(audioAttributes, 0)) : new d(new a(audioAttributes, 0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = ((d) obj).f3600a;
        a aVar2 = this.f3600a;
        return aVar2 == null ? aVar == null : aVar2.equals(aVar);
    }

    public final int hashCode() {
        return this.f3600a.hashCode();
    }

    public final String toString() {
        return this.f3600a.toString();
    }
}
