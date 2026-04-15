package f9;

import ac.i;
import ba.t;
import com.cnl.kikoeru.R;
import hf.e0;
import hf.y;
import ic.n;
import na.q;
import ub.a0;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f6949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6953i;

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        d dVar = new d(2, cVar);
        dVar.f6953i = obj;
        return dVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((d) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        e0 e0VarF;
        int iIntValue;
        int i10;
        y yVar = (y) this.f6953i;
        int i11 = this.f6952h;
        int i12 = 2;
        yb.c cVar = null;
        zb.a aVar = zb.a.f26667a;
        if (i11 == 0) {
            ub.a.f(obj);
            e0 e0VarF2 = hf.a0.f(yVar, null, new t(i12, cVar, 4), 3);
            e0VarF = hf.a0.f(yVar, null, new t(i12, cVar, 5), 3);
            this.f6953i = null;
            this.f6949e = e0VarF;
            this.f6952h = 1;
            obj = e0VarF2.r(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f6951g;
            iIntValue = this.f6950f;
            ub.a.f(obj);
            k kVar = (k) obj;
            ka.n.c(q.h(R.string.offline_metadata_tip, new Integer(iIntValue + ((Number) kVar.f21543a).intValue()), new Integer(i10 + ((Number) kVar.f21544b).intValue())), 0L, null, null, 511);
            return a0.f21526a;
        }
        e0VarF = this.f6949e;
        ub.a.f(obj);
        k kVar2 = (k) obj;
        iIntValue = ((Number) kVar2.f21543a).intValue();
        int iIntValue2 = ((Number) kVar2.f21544b).intValue();
        this.f6953i = null;
        this.f6949e = null;
        this.f6950f = iIntValue;
        this.f6951g = iIntValue2;
        this.f6952h = 2;
        Object objN = e0VarF.n(this);
        if (objN != aVar) {
            i10 = iIntValue2;
            obj = objN;
            k kVar3 = (k) obj;
            ka.n.c(q.h(R.string.offline_metadata_tip, new Integer(iIntValue + ((Number) kVar3.f21543a).intValue()), new Integer(i10 + ((Number) kVar3.f21544b).intValue())), 0L, null, null, 511);
            return a0.f21526a;
        }
        return aVar;
    }
}
