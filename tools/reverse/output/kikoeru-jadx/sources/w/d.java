package w;

import java.util.ArrayList;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements lf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f22971c;

    public /* synthetic */ d(ArrayList arrayList, w0 w0Var, int i10) {
        this.f22969a = i10;
        this.f22970b = arrayList;
        this.f22971c = w0Var;
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) {
        switch (this.f22969a) {
            case 0:
                j jVar = (j) obj;
                boolean z10 = jVar instanceof b;
                ArrayList arrayList = this.f22970b;
                if (z10) {
                    arrayList.add(jVar);
                } else if (jVar instanceof c) {
                    arrayList.remove(((c) jVar).f22968a);
                } else if (jVar instanceof a) {
                    arrayList.remove(((a) jVar).f22967a);
                }
                this.f22971c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                j jVar2 = (j) obj;
                boolean z11 = jVar2 instanceof f;
                ArrayList arrayList2 = this.f22970b;
                if (z11) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof g) {
                    arrayList2.remove(((g) jVar2).f22976a);
                }
                this.f22971c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return a0.f21526a;
    }
}
