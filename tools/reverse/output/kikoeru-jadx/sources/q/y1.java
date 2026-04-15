package q;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f17479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f17480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f17481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f17483e;

    public y1(s0 s0Var, w1 w1Var, z zVar, nd.h hVar, boolean z10, Map map) {
        this.f17479a = s0Var;
        this.f17480b = w1Var;
        this.f17481c = zVar;
        this.f17482d = z10;
        this.f17483e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return jc.l.a(this.f17479a, y1Var.f17479a) && jc.l.a(this.f17480b, y1Var.f17480b) && jc.l.a(this.f17481c, y1Var.f17481c) && jc.l.a(null, null) && this.f17482d == y1Var.f17482d && jc.l.a(this.f17483e, y1Var.f17483e);
    }

    public final int hashCode() {
        s0 s0Var = this.f17479a;
        int iHashCode = (s0Var == null ? 0 : s0Var.hashCode()) * 31;
        w1 w1Var = this.f17480b;
        int iHashCode2 = (iHashCode + (w1Var == null ? 0 : w1Var.hashCode())) * 31;
        z zVar = this.f17481c;
        return this.f17483e.hashCode() + ((((((iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31) + 0) * 31) + (this.f17482d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f17479a + ", slide=" + this.f17480b + ", changeSize=" + this.f17481c + ", scale=" + ((Object) null) + ", hold=" + this.f17482d + ", effectsMap=" + this.f17483e + ')';
    }

    public /* synthetic */ y1(s0 s0Var, w1 w1Var, z zVar, nd.h hVar, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : s0Var, (i10 & 2) != 0 ? null : w1Var, (i10 & 4) != 0 ? null : zVar, (i10 & 8) != 0 ? null : hVar, (i10 & 16) == 0, (i10 & 32) != 0 ? vb.s.f22820a : linkedHashMap);
    }
}
