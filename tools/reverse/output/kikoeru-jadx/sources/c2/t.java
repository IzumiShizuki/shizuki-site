package c2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f3332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f3336o;

    public t(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f3322a = j10;
        this.f3323b = j11;
        this.f3324c = j12;
        this.f3325d = z10;
        this.f3326e = f10;
        this.f3327f = j13;
        this.f3328g = j14;
        this.f3329h = z11;
        this.f3330i = i10;
        this.f3331j = j15;
        this.f3333l = 0L;
        this.f3334m = z12;
        this.f3335n = z12;
    }

    public final void a() {
        t tVar = this.f3336o;
        if (tVar == null) {
            this.f3334m = true;
            this.f3335n = true;
        } else if (tVar != null) {
            tVar.a();
        }
    }

    public final boolean b() {
        t tVar = this.f3336o;
        return tVar != null ? tVar.b() : this.f3334m || this.f3335n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f3322a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f3323b);
        sb.append(", position=");
        sb.append((Object) p1.b.k(this.f3324c));
        sb.append(", pressed=");
        sb.append(this.f3325d);
        sb.append(", pressure=");
        sb.append(this.f3326e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f3327f);
        sb.append(", previousPosition=");
        sb.append((Object) p1.b.k(this.f3328g));
        sb.append(", previousPressed=");
        sb.append(this.f3329h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f3330i;
        sb.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f3332k;
        if (obj == null) {
            obj = vb.r.f22819a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) p1.b.k(this.f3331j));
        sb.append(')');
        return sb.toString();
    }

    public t(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, ArrayList arrayList, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, j15);
        this.f3332k = arrayList;
        this.f3333l = j16;
    }
}
