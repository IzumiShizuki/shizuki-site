package ya;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25972b;

    public e0(Object obj, Object obj2) {
        this.f25971a = obj;
        this.f25972b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25971a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25972b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
