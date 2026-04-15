package c2;

import java.util.ArrayList;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3350k;

    public v(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j14, long j15) {
        this.f3340a = j10;
        this.f3341b = j11;
        this.f3342c = j12;
        this.f3343d = j13;
        this.f3344e = z10;
        this.f3345f = f10;
        this.f3346g = i10;
        this.f3347h = z11;
        this.f3348i = arrayList;
        this.f3349j = j14;
        this.f3350k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return s.d(this.f3340a, vVar.f3340a) && this.f3341b == vVar.f3341b && p1.b.c(this.f3342c, vVar.f3342c) && p1.b.c(this.f3343d, vVar.f3343d) && this.f3344e == vVar.f3344e && Float.compare(this.f3345f, vVar.f3345f) == 0 && this.f3346g == vVar.f3346g && this.f3347h == vVar.f3347h && this.f3348i.equals(vVar.f3348i) && p1.b.c(this.f3349j, vVar.f3349j) && p1.b.c(this.f3350k, vVar.f3350k);
    }

    public final int hashCode() {
        long j10 = this.f3340a;
        long j11 = this.f3341b;
        return p1.b.g(this.f3350k) + ((p1.b.g(this.f3349j) + ((this.f3348i.hashCode() + ((((t0.x(this.f3345f, (((p1.b.g(this.f3343d) + ((p1.b.g(this.f3342c) + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31)) * 31) + (this.f3344e ? 1231 : 1237)) * 31, 31) + this.f3346g) * 31) + (this.f3347h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f3340a + ')'));
        sb.append(", uptime=");
        sb.append(this.f3341b);
        sb.append(", positionOnScreen=");
        sb.append((Object) p1.b.k(this.f3342c));
        sb.append(", position=");
        sb.append((Object) p1.b.k(this.f3343d));
        sb.append(", down=");
        sb.append(this.f3344e);
        sb.append(", pressure=");
        sb.append(this.f3345f);
        sb.append(", type=");
        int i10 = this.f3346g;
        sb.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f3347h);
        sb.append(", historical=");
        sb.append(this.f3348i);
        sb.append(", scrollDelta=");
        sb.append((Object) p1.b.k(this.f3349j));
        sb.append(", originalEventPosition=");
        sb.append((Object) p1.b.k(this.f3350k));
        sb.append(')');
        return sb.toString();
    }
}
