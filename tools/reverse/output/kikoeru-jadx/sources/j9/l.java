package j9;

import i2.j0;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10714b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f10713a = i10;
        this.f10714b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10713a) {
            case 0:
                int iCompare = ((k) this.f10714b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : ud.b.j(((f) obj).f10688b, ((f) obj2).f10688b);
            case 1:
                long jLongValue = ((Number) obj).longValue();
                o.a0 a0Var = (o.a0) this.f10714b;
                return ud.b.j(Integer.valueOf(a0Var.c(jLongValue)), Integer.valueOf(a0Var.c(((Number) obj2).longValue())));
            case 2:
                return ((Number) ((z9.o) this.f10714b).q(obj, obj2)).intValue();
            case 3:
                int iCompare2 = ((Comparator) this.f10714b).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                return j0.T.compare(((q2.o) obj).f17638c, ((q2.o) obj2).f17638c);
            case 4:
                int iCompare3 = ((l) this.f10714b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : ud.b.j(Integer.valueOf(((q2.o) obj).f17642g), Integer.valueOf(((q2.o) obj2).f17642g));
            default:
                se.w wVar = (se.w) obj;
                ic.k kVar = (ic.k) this.f10714b;
                jc.l.b(wVar);
                String string = kVar.a(wVar).toString();
                se.w wVar2 = (se.w) obj2;
                jc.l.b(wVar2);
                return ud.b.j(string, kVar.a(wVar2).toString());
        }
    }

    public l(Comparator comparator) {
        this.f10713a = 3;
        this.f10714b = comparator;
    }
}
