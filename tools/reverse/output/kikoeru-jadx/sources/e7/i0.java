package e7;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f6332k;

    public i0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f6332k = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // e7.k0
    public final Object a(String str, Bundle bundle) {
        jc.l.e(bundle, "bundle");
        return (Serializable[]) bundle.get(str);
    }

    @Override // e7.k0
    public final String b() {
        return this.f6332k.getName();
    }

    @Override // e7.k0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // e7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r42 = (Serializable[]) obj;
        jc.l.e(str, "key");
        this.f6332k.cast(r42);
        bundle.putSerializable(str, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i0.class.equals(obj.getClass())) {
            return false;
        }
        return jc.l.a(this.f6332k, ((i0) obj).f6332k);
    }

    public final int hashCode() {
        return this.f6332k.hashCode();
    }
}
