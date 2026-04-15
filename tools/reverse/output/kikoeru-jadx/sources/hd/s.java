package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8453c;

    public s(int i10, String str) {
        jc.l.e(str, "className");
        this.f8451a = str;
        this.f8452b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f8451a);
        int i12 = this.f8452b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb.append(">");
        }
        sb.append(")");
        this.f8453c = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return jc.l.a(this.f8451a, sVar.f8451a) && this.f8452b == sVar.f8452b;
    }

    public final int hashCode() {
        return (this.f8451a.hashCode() * 31) + this.f8452b;
    }

    public final String toString() {
        return this.f8453c;
    }
}
