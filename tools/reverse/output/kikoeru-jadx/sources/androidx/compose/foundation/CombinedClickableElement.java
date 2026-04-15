package androidx.compose.foundation;

import c2.j0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q2.h;
import s.r0;
import s.w;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Li2/a1;", "Ls/w;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class CombinedClickableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a f471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a f472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a f473f;

    public CombinedClickableElement(ic.a aVar, ic.a aVar2, ic.a aVar3, h hVar, r0 r0Var, k kVar) {
        this.f468a = kVar;
        this.f469b = r0Var;
        this.f470c = hVar;
        this.f471d = aVar;
        this.f472e = aVar2;
        this.f473f = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return l.a(this.f468a, combinedClickableElement.f468a) && l.a(this.f469b, combinedClickableElement.f469b) && l.a(this.f470c, combinedClickableElement.f470c) && this.f471d == combinedClickableElement.f471d && this.f472e == combinedClickableElement.f472e && this.f473f == combinedClickableElement.f473f;
    }

    @Override // i2.a1
    public final p h() {
        r0 r0Var = this.f469b;
        return new w(this.f471d, this.f472e, this.f473f, this.f470c, r0Var, this.f468a);
    }

    public final int hashCode() {
        k kVar = this.f468a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        r0 r0Var = this.f469b;
        int iHashCode2 = (((iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + 1231) * 961;
        h hVar = this.f470c;
        int iHashCode3 = (this.f471d.hashCode() + ((iHashCode2 + (hVar != null ? hVar.f17601a : 0)) * 31)) * 961;
        ic.a aVar = this.f472e;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ic.a aVar2 = this.f473f;
        return ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + 1231;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        boolean z10;
        j0 j0Var;
        w wVar = (w) pVar;
        wVar.J = true;
        boolean z11 = wVar.H == null;
        ic.a aVar = this.f472e;
        if (z11 != (aVar == null)) {
            wVar.G0();
            i2.f.o(wVar);
            z10 = true;
        } else {
            z10 = false;
        }
        wVar.H = aVar;
        boolean z12 = wVar.I == null;
        ic.a aVar2 = this.f473f;
        if (z12 != (aVar2 == null)) {
            z10 = true;
        }
        wVar.I = aVar2;
        boolean z13 = wVar.f19123u ? z10 : true;
        wVar.L0(this.f468a, this.f469b, true, null, this.f470c, this.f471d);
        if (!z13 || (j0Var = wVar.f19126x) == null) {
            return;
        }
        j0Var.D0();
    }
}
