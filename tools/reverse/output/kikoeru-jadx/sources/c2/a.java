package c2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3242b;

    public a(int i10) {
        this.f3242b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jc.l.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f3242b == ((a) obj).f3242b;
    }

    public final int hashCode() {
        return this.f3242b;
    }

    public final String toString() {
        return j2.h0.m(new StringBuilder("AndroidPointerIcon(type="), this.f3242b, ')');
    }
}
