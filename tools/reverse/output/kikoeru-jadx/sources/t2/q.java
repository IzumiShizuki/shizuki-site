package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.c f20384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20386c;

    public q(b3.c cVar, int i10, int i11) {
        this.f20384a = cVar;
        this.f20385b = i10;
        this.f20386c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f20384a.equals(qVar.f20384a) && this.f20385b == qVar.f20385b && this.f20386c == qVar.f20386c;
    }

    public final int hashCode() {
        return (((this.f20384a.hashCode() * 31) + this.f20385b) * 31) + this.f20386c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f20384a);
        sb.append(", startIndex=");
        sb.append(this.f20385b);
        sb.append(", endIndex=");
        return j2.h0.m(sb, this.f20386c, ')');
    }
}
