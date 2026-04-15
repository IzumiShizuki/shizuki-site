package e7;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f6341k;

    public j0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f6341k = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // e7.k0
    public final Object a(String str, Bundle bundle) {
        jc.l.e(bundle, "bundle");
        return (Serializable) bundle.get(str);
    }

    @Override // e7.k0
    public String b() {
        return this.f6341k.getName();
    }

    @Override // e7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        jc.l.e(str, "key");
        jc.l.e(serializable, "value");
        this.f6341k.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return jc.l.a(this.f6341k, ((j0) obj).f6341k);
    }

    @Override // e7.k0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f6341k.hashCode();
    }

    public j0(Class cls, int i10) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f6341k = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
