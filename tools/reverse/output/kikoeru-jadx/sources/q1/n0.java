package q1;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17562a;

    public n0(long j10) {
        this.f17562a = j10;
    }

    @Override // q1.m
    public final void a(float f10, long j10, p4.p pVar) {
        pVar.g(1.0f);
        long jB = this.f17562a;
        if (f10 != 1.0f) {
            jB = q.b(q.d(jB) * f10, jB);
        }
        pVar.i(jB);
        if (((Shader) pVar.f16601c) != null) {
            pVar.l(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return q.c(this.f17562a, ((n0) obj).f17562a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = q.f17576i;
        return ub.v.a(this.f17562a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) q.i(this.f17562a)) + ')';
    }
}
