package n;

import androidx.lifecycle.w;
import androidx.lifecycle.y;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f15229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f15231d;

    public c(w wVar, y yVar) {
        this.f15228a = wVar;
        this.f15229b = yVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15228a.equals(cVar.f15228a) && this.f15229b.equals(cVar.f15229b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15228a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15229b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15228a.hashCode() ^ this.f15229b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15228a + "=" + this.f15229b;
    }
}
