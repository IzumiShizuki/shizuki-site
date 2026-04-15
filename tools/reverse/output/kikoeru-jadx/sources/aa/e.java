package aa;

import a0.c0;
import a0.j;
import android.net.Uri;
import ba.v;
import d9.q;
import fa.s;
import hf.l0;
import hf.y;
import ic.k;
import j9.u;
import java.util.List;
import jc.l;
import ka.n;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f285b;

    public /* synthetic */ e(y yVar) {
        this.f284a = 2;
        u uVar = u.f10753a;
        this.f285b = yVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f284a;
        int i11 = 1;
        a0 a0Var = a0.f21526a;
        yb.c cVar = null;
        y yVar = this.f285b;
        int i12 = 2;
        switch (i10) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    pf.e eVar = l0.f8566a;
                    hf.a0.y(yVar, pf.d.f17138c, null, new a9.k(i12, uri, cVar), 2);
                }
                break;
            case 1:
                l.e((ka.g) obj, "it");
                pf.e eVar2 = l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new c0(i12, cVar, 7), 2);
                break;
            case 2:
                u uVar = u.f10753a;
                j jVar = (j) obj;
                l.e(jVar, "$this$LazyColumn");
                List list = (List) u.f10755c.getValue();
                jVar.m(list.size(), null, new v(2, list), new f1.f(new s(list, yVar), -1091073711, true));
                break;
            case 3:
                l.e((ka.g) obj, "it");
                pf.e eVar3 = l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new c0(i12, cVar, 12), 2);
                break;
            case 4:
                l.e((ka.g) obj, "it");
                pf.e eVar4 = l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new c0(i12, cVar, 13), 2);
                break;
            case 5:
                List list2 = (List) obj;
                l.e(list2, "it");
                n.c("开始导入配置文件:" + list2, 0L, null, null, 511);
                if (!list2.isEmpty()) {
                    hf.a0.y(yVar, pf.d.f17138c, null, new q(list2, cVar, i12), 2);
                }
                break;
            case 6:
                List list3 = (List) obj;
                l.e(list3, "it");
                n.c("开始导入数据库文件 db:" + list3, 0L, null, null, 511);
                if (!list3.isEmpty()) {
                    hf.a0.y(yVar, pf.d.f17138c, null, new q(list3, cVar, i11), 2);
                }
                break;
            default:
                l.e((ka.g) obj, "it");
                pf.e eVar5 = l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new c0(i12, cVar, 16), 2);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ e(y yVar, int i10) {
        this.f284a = i10;
        this.f285b = yVar;
    }
}
