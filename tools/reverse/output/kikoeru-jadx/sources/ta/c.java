package ta;

import com.tencent.bugly.beta.tinker.TinkerReport;
import g1.l;
import q.t0;
import q1.h0;
import sa.f;
import sa.g;
import sa.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20596e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20600d;

    static {
        l.b(a.f20594b, b.f20595b);
    }

    public c(float f10, float f11, float f12, float f13) {
        this.f20597a = f10;
        this.f20598b = f11;
        this.f20599c = f12;
        this.f20600d = f13;
    }

    public static c a(c cVar, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f10 = cVar.f20597a;
        }
        if ((i10 & 2) != 0) {
            f11 = cVar.f20598b;
        }
        if ((i10 & 4) != 0) {
            f12 = cVar.f20599c;
        }
        float f13 = cVar.f20600d;
        cVar.getClass();
        return new c(f10, f11, f12, f13);
    }

    public final long b() {
        g gVar;
        double d10 = this.f20598b;
        float f10 = this.f20599c;
        float f11 = this.f20600d;
        if (d10 < 1.0E-7d) {
            o oVar = (o) g.f19696f.f18634b;
            oVar.getClass();
            gVar = new g(f10, f10, f10, f11, oVar);
        } else {
            double d11 = f10;
            double d12 = ((double) (((this.f20597a % 360.0f) + 360.0f) % 360.0f)) / 60.0d;
            gVar = new g(f.a(d12, d11, d10, 5), f.a(d12, d11, d10, 3), f.a(d12, d11, d10, 1), f11, o.f19726a);
        }
        float f12 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        int iR = lc.b.R(gVar.f19697a * f12);
        int iR2 = lc.b.R(gVar.f19698b * f12);
        int iR3 = lc.b.R(gVar.f19699c * f12);
        float f13 = gVar.f19700d;
        if (Float.isNaN(f13)) {
            f13 = 1.0f;
        }
        return h0.d(iR, iR2, iR3, lc.b.R(f13 * f12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f20597a, cVar.f20597a) == 0 && Float.compare(this.f20598b, cVar.f20598b) == 0 && Float.compare(this.f20599c, cVar.f20599c) == 0 && Float.compare(this.f20600d, cVar.f20600d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f20600d) + t0.x(this.f20599c, t0.x(this.f20598b, Float.floatToIntBits(this.f20597a) * 31, 31), 31);
    }

    public final String toString() {
        return "HsvColor(hue=" + this.f20597a + ", saturation=" + this.f20598b + ", value=" + this.f20599c + ", alpha=" + this.f20600d + ")";
    }
}
