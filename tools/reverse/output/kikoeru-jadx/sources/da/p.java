package da;

import ba.f1;
import bg.a2;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f5773b;

    public /* synthetic */ p(m0 m0Var, int i10) {
        this.f5772a = i10;
        this.f5773b = m0Var;
    }

    @Override // ic.a
    public final Object b() {
        boolean z10;
        switch (this.f5772a) {
            case 0:
                this.f5773b.c0(false);
                return ub.a0.f21526a;
            case 1:
                this.f5773b.f5743f.setValue(Boolean.TRUE);
                return ub.a0.f21526a;
            case 2:
                m0 m0Var = this.f5773b;
                b bVarZ = m0Var.z();
                List<s2.a> list = bVarZ.f5636a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    m0Var.e0();
                } else {
                    for (s2.a aVar : list) {
                        s2.a aVar2 = s2.a.f19356a;
                        if (aVar != aVar2) {
                            int i10 = 0;
                            for (Object obj : bVarZ.f5639d) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    ud.b.H();
                                    throw null;
                                }
                                m0.T(bVarZ, i10, aVar2);
                                i10 = i11;
                            }
                        }
                    }
                    m0Var.e0();
                }
                return ub.a0.f21526a;
            case 3:
                a2 a2VarA = this.f5773b.A();
                return Boolean.valueOf((a2VarA == null || (a2VarA.f2830m == null && a2VarA.f2840w == null && a2VarA.f2837t == null)) ? false : true);
            case 4:
                List list2 = this.f5773b.z().f5636a;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((s2.a) it.next()) != s2.a.f19357b) {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 5:
                this.f5773b.e0();
                return ub.a0.f21526a;
            case 6:
                if (g9.a.b()) {
                    this.f5773b.f5745h.setValue(Boolean.TRUE);
                }
                return ub.a0.f21526a;
            case 7:
                this.f5773b.f5744g.setValue(Boolean.TRUE);
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f5773b.c0(true);
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ArrayList arrayList = new ArrayList();
                m0 m0Var2 = this.f5773b;
                m0.a0(arrayList, m0Var2.z());
                if (arrayList.isEmpty()) {
                    ka.n.c(na.q.g(R.string.no_select_play), 0L, null, null, 511);
                } else {
                    h9.d.f8241a.setValue(m0Var2.A());
                    h1.s sVar = h9.d.f8243c;
                    sVar.clear();
                    vb.m.P(sVar, arrayList);
                    h9.d.e(0);
                }
                return ub.a0.f21526a;
            default:
                return new f1(androidx.lifecycle.m0.h(this.f5773b), "MUSIC_PAGE_NEIGHBORS");
        }
    }
}
