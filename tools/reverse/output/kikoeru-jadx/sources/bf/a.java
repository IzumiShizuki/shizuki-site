package bf;

import java.io.Serializable;
import jc.y;
import xc.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f2794d;

    public /* synthetic */ a(Object obj, Serializable serializable, int i10) {
        this.f2792b = i10;
        this.f2793c = obj;
        this.f2794d = serializable;
    }

    @Override // bf.m
    public void b(Object obj) {
        switch (this.f2792b) {
            case 1:
                yc.c cVar = (yc.c) obj;
                jc.l.e(cVar, "current");
                y yVar = (y) this.f2794d;
                if (yVar.f10838a == null && ((Boolean) ((ic.k) this.f2793c).a(cVar)).booleanValue()) {
                    yVar.f10838a = cVar;
                    break;
                }
                break;
        }
    }

    @Override // bf.m
    public final boolean c(Object obj) {
        switch (this.f2792b) {
            case 0:
                boolean[] zArr = (boolean[]) this.f2794d;
                if (((Boolean) ((ic.k) this.f2793c).a(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                jc.l.e((yc.c) obj, "current");
                return ((y) this.f2794d).f10838a == null;
            default:
                yc.e eVar = (yc.e) obj;
                y yVar = (y) this.f2794d;
                jc.l.e(eVar, "javaClassDescriptor");
                String strY = ua.j.y(eVar, (String) this.f2793c);
                if (o.f24957b.contains(strY)) {
                    yVar.f10838a = xc.k.f24936a;
                } else if (o.f24959d.contains(strY)) {
                    yVar.f10838a = xc.k.f24937b;
                } else if (o.f24958c.contains(strY)) {
                    yVar.f10838a = xc.k.f24938c;
                } else if (o.f24956a.contains(strY)) {
                    yVar.f10838a = xc.k.f24940e;
                }
                return yVar.f10838a == null;
        }
    }

    @Override // bf.m
    public final Object j() {
        switch (this.f2792b) {
            case 0:
                return Boolean.valueOf(((boolean[]) this.f2794d)[0]);
            case 1:
                return (yc.c) ((y) this.f2794d).f10838a;
            default:
                xc.k kVar = (xc.k) ((y) this.f2794d).f10838a;
                return kVar == null ? xc.k.f24939d : kVar;
        }
    }

    public a(y yVar, ic.k kVar) {
        this.f2792b = 1;
        this.f2794d = yVar;
        this.f2793c = kVar;
    }
}
