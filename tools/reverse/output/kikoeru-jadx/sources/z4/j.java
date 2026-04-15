package z4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26433d;

    public j(String str, long j10, long j11) {
        this.f26432c = str == null ? "" : str;
        this.f26430a = j10;
        this.f26431b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String strX = p4.c.x(str, this.f26432c);
        if (jVar != null) {
            long j10 = jVar.f26431b;
            if (strX.equals(p4.c.x(str, jVar.f26432c))) {
                long j11 = this.f26431b;
                if (j11 != -1) {
                    long j12 = this.f26430a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.f26430a) {
                        return new j(strX, j12, j10 != -1 ? j11 + j10 : -1L);
                    }
                } else {
                    jVar2 = null;
                }
                if (j10 == -1) {
                    return jVar2;
                }
                long j13 = jVar.f26430a;
                if (j13 + j10 == this.f26430a) {
                    return new j(strX, j13, j11 != -1 ? j10 + j11 : -1L);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f26430a == jVar.f26430a && this.f26431b == jVar.f26431b && this.f26432c.equals(jVar.f26432c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26433d == 0) {
            this.f26433d = this.f26432c.hashCode() + ((((527 + ((int) this.f26430a)) * 31) + ((int) this.f26431b)) * 31);
        }
        return this.f26433d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f26432c);
        sb.append(", start=");
        sb.append(this.f26430a);
        sb.append(", length=");
        return a0.c.H(this.f26431b, ")", sb);
    }
}
