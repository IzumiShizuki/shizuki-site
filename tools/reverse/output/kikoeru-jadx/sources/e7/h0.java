package e7;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f6330k;

    public h0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f6330k = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // e7.k0
    public final Object a(String str, Bundle bundle) {
        jc.l.e(bundle, "bundle");
        return bundle.get(str);
    }

    @Override // e7.k0
    public final String b() {
        return this.f6330k.getName();
    }

    @Override // e7.k0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // e7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        jc.l.e(str, "key");
        this.f6330k.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h0.class.equals(obj.getClass())) {
            return false;
        }
        return jc.l.a(this.f6330k, ((h0) obj).f6330k);
    }

    public final int hashCode() {
        return this.f6330k.hashCode();
    }
}
