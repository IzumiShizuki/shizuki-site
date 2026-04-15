package t;

import q.t0;
import q1.q;
import ub.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20065e;

    public c(long j10, long j11, long j12, long j13, long j14) {
        this.f20061a = j10;
        this.f20062b = j11;
        this.f20063c = j12;
        this.f20064d = j13;
        this.f20065e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q.c(this.f20061a, cVar.f20061a) && q.c(this.f20062b, cVar.f20062b) && q.c(this.f20063c, cVar.f20063c) && q.c(this.f20064d, cVar.f20064d) && q.c(this.f20065e, cVar.f20065e);
    }

    public final int hashCode() {
        int i10 = q.f17576i;
        return v.a(this.f20065e) + t0.y(t0.y(t0.y(v.a(this.f20061a) * 31, 31, this.f20062b), 31, this.f20063c), 31, this.f20064d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        t0.K(this.f20061a, ", textColor=", sb);
        t0.K(this.f20062b, ", iconColor=", sb);
        t0.K(this.f20063c, ", disabledTextColor=", sb);
        t0.K(this.f20064d, ", disabledIconColor=", sb);
        sb.append((Object) q.i(this.f20065e));
        sb.append(')');
        return sb.toString();
    }
}
