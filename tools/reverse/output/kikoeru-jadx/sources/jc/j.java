package jc;

import j2.h0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j extends d implements i, pc.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10830h;

    public j(int i10, Class cls, String str, String str2, int i11) {
        this(i10, c.f10817a, cls, str, str2, i11, 0);
    }

    @Override // jc.i
    public final int c() {
        return this.f10829g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f10821d.equals(jVar.f10821d) && this.f10822e.equals(jVar.f10822e) && this.f10830h == jVar.f10830h && this.f10829g == jVar.f10829g && l.a(this.f10819b, jVar.f10819b) && l.a(i(), jVar.i());
        }
        if (obj instanceof pc.f) {
            return obj.equals(f());
        }
        return false;
    }

    @Override // jc.d
    public final pc.b h() {
        return z.f10839a.a(this);
    }

    public final int hashCode() {
        return this.f10822e.hashCode() + h0.e(i() == null ? 0 : i().hashCode() * 31, 31, this.f10821d);
    }

    @Override // jc.d
    public final pc.b j() {
        pc.b bVarF = f();
        if (bVarF != this) {
            return (pc.f) bVarF;
        }
        throw new hc.a();
    }

    public final String toString() {
        pc.b bVarF = f();
        if (bVarF != this) {
            return bVarF.toString();
        }
        String str = this.f10821d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : t0.D("function ", str, " (Kotlin reflection is not available)");
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f10829g = i10;
        this.f10830h = 0;
    }
}
