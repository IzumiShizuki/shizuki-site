package pd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17044b;

    public /* synthetic */ k(n nVar, int i10) {
        this.f17043a = i10;
        this.f17044b = nVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17043a) {
            case 0:
                Class<?>[] declaredClasses = this.f17044b.f17055o.f6508a.getDeclaredClasses();
                jc.l.d(declaredClasses, "getDeclaredClasses(...)");
                return vb.m.K0(df.m.g0(df.m.f0(new df.h(vb.l.d0(declaredClasses), false, ed.c.f6483d), ed.c.f6484e)));
            case 1:
                Collection collectionB = this.f17044b.f17055o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionB) {
                    if (((ed.u) obj).f6514a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iT = vb.w.t(vb.n.K(arrayList, 10));
                if (iT < 16) {
                    iT = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((ed.u) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                n nVar = this.f17044b;
                return ud.e.J(nVar.c(), nVar.g());
        }
    }
}
