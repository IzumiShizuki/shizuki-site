package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import f3.f;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import q.t0;
import y.m1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Li2/a1;", "Ly/m1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class SizeElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f548e;

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10) {
        this.f544a = f10;
        this.f545b = f11;
        this.f546c = f12;
        this.f547d = f13;
        this.f548e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f544a, sizeElement.f544a) && f.a(this.f545b, sizeElement.f545b) && f.a(this.f546c, sizeElement.f546c) && f.a(this.f547d, sizeElement.f547d) && this.f548e == sizeElement.f548e;
    }

    @Override // i2.a1
    public final p h() {
        m1 m1Var = new m1();
        m1Var.f25179o = this.f544a;
        m1Var.f25180p = this.f545b;
        m1Var.f25181q = this.f546c;
        m1Var.f25182r = this.f547d;
        m1Var.f25183s = this.f548e;
        return m1Var;
    }

    public final int hashCode() {
        return t0.x(this.f547d, t0.x(this.f546c, t0.x(this.f545b, Float.floatToIntBits(this.f544a) * 31, 31), 31), 31) + (this.f548e ? 1231 : 1237);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        m1 m1Var = (m1) pVar;
        m1Var.f25179o = this.f544a;
        m1Var.f25180p = this.f545b;
        m1Var.f25181q = this.f546c;
        m1Var.f25182r = this.f547d;
        m1Var.f25183s = this.f548e;
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, true);
    }
}
