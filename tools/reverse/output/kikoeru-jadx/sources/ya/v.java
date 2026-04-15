package ya;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends y0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.i f26066a;

    public v(androidx.media3.exoplayer.offline.i iVar) {
        this.f26066a = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f26066a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return this.f26066a.equals(((v) obj).f26066a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26066a.hashCode();
    }

    public final String toString() {
        return this.f26066a.toString();
    }
}
