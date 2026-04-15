package ba;

import com.cnl.kikoeru.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f2322b;

    public /* synthetic */ d(hf.y yVar, int i10) {
        this.f2321a = i10;
        switch (i10) {
            case 3:
                j9.u uVar = j9.u.f10753a;
            case 4:
                fa.v vVar = fa.v.f7039a;
                break;
            default:
                j9.u uVar2 = j9.u.f10753a;
                break;
        }
        this.f2322b = yVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f2321a;
        int i11 = 2;
        int i12 = 7;
        int i13 = 3;
        yb.c cVar = null;
        ub.a0 a0Var = ub.a0.f21526a;
        hf.y yVar = this.f2322b;
        switch (i10) {
            case 0:
                ka.j.b(na.q.g(R.string.delete_search_history_all), new aa.e(yVar, 1));
                break;
            case 1:
                hf.a0.y(yVar, null, null, new t(i11, cVar, 0), 3);
                break;
            case 2:
                j9.u uVar = j9.u.f10753a;
                hf.a0.y(yVar, null, null, new t(7, null), 3);
                break;
            case 3:
                j9.u uVar2 = j9.u.f10753a;
                fa.v vVar = fa.v.f7039a;
                if (!((List) j9.u.f10755c.getValue()).isEmpty()) {
                    hf.a0.y(yVar, null, null, new t(8, null), 3);
                } else {
                    ka.n.c(na.q.g(R.string.no_alt_lrc), 0L, null, null, 511);
                }
                break;
            case 4:
                fa.v vVar2 = fa.v.f7039a;
                hf.a0.y(yVar, null, null, new t(9, null), 3);
                break;
            case 5:
                ka.j.b(na.q.g(R.string.delete_history_all), new aa.e(yVar, i13));
                break;
            case 6:
                ka.j.b(na.q.g(R.string.delete_blacklist_all), new aa.e(yVar, 4));
                break;
            case 7:
                pf.e eVar = hf.l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new a0.c0(i11, cVar, 15), 2);
                break;
            default:
                ka.j.b(na.q.g(R.string.delete_subtitle_all), new aa.e(yVar, i12));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ d(hf.y yVar, int i10, boolean z10) {
        this.f2321a = i10;
        this.f2322b = yVar;
    }
}
