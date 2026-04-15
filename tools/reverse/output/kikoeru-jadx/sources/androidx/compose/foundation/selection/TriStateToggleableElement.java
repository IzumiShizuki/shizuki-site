package androidx.compose.foundation.selection;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import i2.f;
import j1.p;
import jc.l;
import kotlin.Metadata;
import m0.m5;
import q2.h;
import s.r0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Li2/a1;", "Lf0/d;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class TriStateToggleableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2.a f603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a f608f;

    public TriStateToggleableElement(s2.a aVar, k kVar, m5 m5Var, boolean z10, h hVar, ic.a aVar2) {
        this.f603a = aVar;
        this.f604b = kVar;
        this.f605c = m5Var;
        this.f606d = z10;
        this.f607e = hVar;
        this.f608f = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f603a == triStateToggleableElement.f603a && l.a(this.f604b, triStateToggleableElement.f604b) && l.a(this.f605c, triStateToggleableElement.f605c) && this.f606d == triStateToggleableElement.f606d && this.f607e.equals(triStateToggleableElement.f607e) && this.f608f == triStateToggleableElement.f608f;
    }

    @Override // i2.a1
    public final p h() {
        f0.d dVar = new f0.d(this.f604b, this.f605c, this.f606d, null, this.f607e, this.f608f);
        dVar.H = this.f603a;
        return dVar;
    }

    public final int hashCode() {
        int iHashCode = this.f603a.hashCode() * 31;
        k kVar = this.f604b;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        r0 r0Var = this.f605c;
        return this.f608f.hashCode() + ((((((iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + (this.f606d ? 1231 : 1237)) * 31) + this.f607e.f17601a) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        f0.d dVar = (f0.d) pVar;
        s2.a aVar = dVar.H;
        s2.a aVar2 = this.f603a;
        if (aVar != aVar2) {
            dVar.H = aVar2;
            f.o(dVar);
        }
        dVar.L0(this.f604b, this.f605c, this.f606d, null, this.f607e, this.f608f);
    }
}
