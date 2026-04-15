package j9;

import ba.q0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f10762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f10765i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(List list, yb.c cVar, int i10) {
        super(1, cVar);
        this.f10761e = i10;
        this.f10765i = list;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f10761e) {
            case 0:
                return new w(this.f10765i, cVar, 0).u(ub.a0.f21526a);
            default:
                return new w(this.f10765i, cVar, 1).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Iterator it;
        int i10;
        Object obj2;
        zb.a aVar;
        Iterator it2;
        int i11;
        Object obj3;
        zb.a aVar2;
        switch (this.f10761e) {
            case 0:
                int i12 = this.f10764h;
                if (i12 == 0) {
                    ub.a.f(obj);
                    it = this.f10765i.iterator();
                    i10 = 0;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f10763g;
                    it = this.f10762f;
                    ub.a.f(obj);
                }
                do {
                    boolean zHasNext = it.hasNext();
                    obj2 = ub.a0.f21526a;
                    if (!zHasNext) {
                        return obj2;
                    }
                    List list = (List) it.next();
                    d9.s sVarU = a9.i.c().u();
                    this.f10762f = it;
                    this.f10763g = i10;
                    this.f10764h = 1;
                    Object objX = ua.l.X(sVarU.f5598a, false, true, new q0(1, sVarU, list), this);
                    aVar = zb.a.f26667a;
                    if (objX == aVar) {
                        obj2 = objX;
                    }
                } while (obj2 != aVar);
                return aVar;
            default:
                int i13 = this.f10764h;
                if (i13 == 0) {
                    ub.a.f(obj);
                    it2 = this.f10765i.iterator();
                    i11 = 0;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f10763g;
                    it2 = this.f10762f;
                    ub.a.f(obj);
                }
                do {
                    boolean zHasNext2 = it2.hasNext();
                    obj3 = ub.a0.f21526a;
                    if (!zHasNext2) {
                        return obj3;
                    }
                    List list2 = (List) it2.next();
                    d9.s sVarU2 = a9.i.c().u();
                    this.f10762f = it2;
                    this.f10763g = i11;
                    this.f10764h = 1;
                    Object objX2 = ua.l.X(sVarU2.f5598a, false, true, new q0(1, sVarU2, list2), this);
                    aVar2 = zb.a.f26667a;
                    if (objX2 == aVar2) {
                        obj3 = objX2;
                    }
                } while (obj3 != aVar2);
                return aVar2;
        }
    }
}
