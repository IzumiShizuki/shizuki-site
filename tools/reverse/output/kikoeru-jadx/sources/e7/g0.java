package e7;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f6326k;

    public g0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f6326k = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // e7.k0
    public final Object a(String str, Bundle bundle) {
        jc.l.e(bundle, "bundle");
        return (Parcelable[]) bundle.get(str);
    }

    @Override // e7.k0
    public final String b() {
        return this.f6326k.getName();
    }

    @Override // e7.k0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // e7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        jc.l.e(str, "key");
        this.f6326k.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !g0.class.equals(obj.getClass())) {
            return false;
        }
        return jc.l.a(this.f6326k, ((g0) obj).f6326k);
    }

    public final int hashCode() {
        return this.f6326k.hashCode();
    }
}
