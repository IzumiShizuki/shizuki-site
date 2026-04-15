package w4;

import j5.d0;
import java.util.Arrays;
import m4.i1;
import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f23338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f23340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f23342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f23344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f23346j;

    public a(long j10, i1 i1Var, int i10, d0 d0Var, long j11, i1 i1Var2, int i11, d0 d0Var2, long j12, long j13) {
        this.f23337a = j10;
        this.f23338b = i1Var;
        this.f23339c = i10;
        this.f23340d = d0Var;
        this.f23341e = j11;
        this.f23342f = i1Var2;
        this.f23343g = i11;
        this.f23344h = d0Var2;
        this.f23345i = j12;
        this.f23346j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f23337a == aVar.f23337a && this.f23339c == aVar.f23339c && this.f23341e == aVar.f23341e && this.f23343g == aVar.f23343g && this.f23345i == aVar.f23345i && this.f23346j == aVar.f23346j && n.f(this.f23338b, aVar.f23338b) && n.f(this.f23340d, aVar.f23340d) && n.f(this.f23342f, aVar.f23342f) && n.f(this.f23344h, aVar.f23344h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23337a), this.f23338b, Integer.valueOf(this.f23339c), this.f23340d, Long.valueOf(this.f23341e), this.f23342f, Integer.valueOf(this.f23343g), this.f23344h, Long.valueOf(this.f23345i), Long.valueOf(this.f23346j)});
    }
}
