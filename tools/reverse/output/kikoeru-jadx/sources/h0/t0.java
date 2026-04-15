package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f7844c = new t0(0, 127);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7846b;

    public t0(int i10, int i11) {
        i10 = (i11 & 4) != 0 ? 0 : i10;
        int i12 = (i11 & 8) != 0 ? -1 : 3;
        this.f7845a = i10;
        this.f7846b = i12;
    }

    public final y2.j a(boolean z10) {
        y2.i iVar;
        int i10 = this.f7845a;
        y2.k kVar = new y2.k(i10);
        if (i10 == 0) {
            kVar = null;
            iVar = null;
        } else {
            iVar = null;
        }
        int i11 = kVar != null ? kVar.f25416a : 1;
        int i12 = this.f7846b;
        y2.i iVar2 = new y2.i(i12);
        if (i12 == -1) {
            iVar2 = iVar;
        }
        return new y2.j(z10, 0, true, i11, iVar2 != null ? iVar2.f25408a : 1, a3.c.f195c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f7845a == t0Var.f7845a && this.f7846b == t0Var.f7846b;
    }

    public final int hashCode() {
        return (((((-31) * 31) + this.f7845a) * 31) + this.f7846b) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) y2.k.a(this.f7845a)) + ", imeAction=" + ((Object) y2.i.a(this.f7846b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
