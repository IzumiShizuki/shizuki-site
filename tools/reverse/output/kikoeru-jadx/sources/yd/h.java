package yd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f26202d = new h(256, 256, 256);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26205c;

    public h(int i10, int i11, int i12) {
        this.f26203a = i10;
        this.f26204b = i11;
        this.f26205c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f26203a == hVar.f26203a && this.f26204b == hVar.f26204b && this.f26205c == hVar.f26205c;
    }

    public final int hashCode() {
        return (((this.f26203a * 31) + this.f26204b) * 31) + this.f26205c;
    }

    public final String toString() {
        int i10 = this.f26204b;
        int i11 = this.f26203a;
        int i12 = this.f26205c;
        if (i12 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i11);
            sb.append('.');
            sb.append(i10);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append('.');
        sb2.append(i10);
        sb2.append('.');
        sb2.append(i12);
        return sb2.toString();
    }
}
