package gb;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f7489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f7490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f7491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f7492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f7493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f7496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7497i;

    public m(boolean z10) {
        this.f7494f = null;
        this.f7495g = z10;
        this.f7493e = this;
        this.f7492d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f7494f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f7496h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7494f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7496h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f7494f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f7496h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f7495g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f7496h;
        this.f7496h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f7494f + "=" + this.f7496h;
    }

    public m(boolean z10, m mVar, Object obj, m mVar2, m mVar3) {
        this.f7489a = mVar;
        this.f7494f = obj;
        this.f7495g = z10;
        this.f7497i = 1;
        this.f7492d = mVar2;
        this.f7493e = mVar3;
        mVar3.f7492d = this;
        mVar2.f7493e = this;
    }
}
