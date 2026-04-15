package wf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements uf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f24192a = new v0();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // uf.g
    public final List getAnnotations() {
        return vb.r.f22819a;
    }

    public final int hashCode() {
        return (uf.k.f21708e.hashCode() * 31) - 1818355776;
    }

    @Override // uf.g
    public final ud.n j() {
        return uf.k.f21708e;
    }

    @Override // uf.g
    public final boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return "kotlin.Nothing";
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final int p() {
        return 0;
    }

    @Override // uf.g
    public final String q(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final List r(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final boolean t(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
