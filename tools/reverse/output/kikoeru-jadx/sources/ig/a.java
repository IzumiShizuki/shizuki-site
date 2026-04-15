package ig;

import b0.c1;
import com.tencent.mmkv.MMKV;
import g1.d;
import ic.k;
import java.util.concurrent.ConcurrentHashMap;
import jc.a0;
import jc.l;
import jc.z;
import pc.v;
import ub.m;
import ub.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends gg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9522c;

    public a(int i10) {
        this.f9521b = i10;
        switch (i10) {
            case 1:
                this.f9522c = new d(11);
                break;
            default:
                this.f9522c = new ConcurrentHashMap();
                break;
        }
    }

    @Override // gg.a
    public final Object a(hg.b bVar) {
        Object objA;
        Object objB;
        switch (this.f9521b) {
            case 0:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f9522c;
                String str = bVar.f8628c;
                if (concurrentHashMap.containsKey(str)) {
                    try {
                        return concurrentHashMap.get(str);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                gg.a aVar = this.f7542a;
                if (aVar == null || (objA = aVar.a(bVar)) == null) {
                    return null;
                }
                concurrentHashMap.put(str, objA);
                return objA;
            case 1:
                try {
                    gg.a aVar2 = this.f7542a;
                    objB = aVar2 != null ? aVar2.a(bVar) : null;
                    break;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = n.a(objB);
                if (thA != null) {
                    ((k) this.f9522c).a(thA);
                }
                if (objB instanceof m) {
                    return null;
                }
                return objB;
            default:
                c1 c1Var = (c1) this.f9522c;
                String str2 = bVar.f8628c;
                v vVar = bVar.f8629d;
                MMKV mmkv = (MMKV) c1Var.f1208b;
                l.e(str2, "key");
                l.e(vVar, "type");
                pc.d dVarC = vVar.c();
                a0 a0Var = z.f10839a;
                if (l.a(dVarC, a0Var.b(Integer.TYPE))) {
                    if (mmkv.a(str2)) {
                        return Integer.valueOf(mmkv.e(str2));
                    }
                } else if (l.a(dVarC, a0Var.b(Long.TYPE))) {
                    if (mmkv.a(str2)) {
                        return Long.valueOf(mmkv.f(str2));
                    }
                } else if (l.a(dVarC, a0Var.b(Float.TYPE))) {
                    if (mmkv.a(str2)) {
                        return Float.valueOf(mmkv.d(str2));
                    }
                } else if (!l.a(dVarC, a0Var.b(Double.TYPE))) {
                    if (!l.a(dVarC, a0Var.b(Boolean.TYPE))) {
                        if (l.a(dVarC, a0Var.b(String.class))) {
                            return mmkv.g(str2);
                        }
                        throw new IllegalStateException(("not support type " + vVar).toString());
                    }
                    if (mmkv.a(str2)) {
                        return Boolean.valueOf(mmkv.b(str2));
                    }
                } else if (mmkv.a(str2)) {
                    return Double.valueOf(mmkv.c(str2));
                }
                return null;
        }
    }

    @Override // gg.a
    public final void b(hg.b bVar, Object obj) {
        Object objB;
        switch (this.f9521b) {
            case 0:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f9522c;
                String str = bVar.f8628c;
                gg.a aVar = this.f7542a;
                if (aVar != null) {
                    aVar.b(bVar, obj);
                }
                if (obj == null) {
                    concurrentHashMap.remove(str);
                    return;
                } else {
                    concurrentHashMap.put(str, obj);
                    return;
                }
            case 1:
                try {
                    gg.a aVar2 = this.f7542a;
                    if (aVar2 != null) {
                        aVar2.b(bVar, obj);
                        objB = ub.a0.f21526a;
                    } else {
                        objB = null;
                    }
                    break;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = n.a(objB);
                if (thA != null) {
                    ((k) this.f9522c).a(thA);
                    return;
                }
                return;
            default:
                MMKV mmkv = (MMKV) ((c1) this.f9522c).f1208b;
                String str2 = bVar.f8628c;
                if (obj == null) {
                    l.e(str2, "key");
                    mmkv.q(str2);
                    return;
                }
                v vVar = bVar.f8629d;
                l.e(str2, "key");
                l.e(vVar, "type");
                pc.d dVarC = vVar.c();
                a0 a0Var = z.f10839a;
                if (l.a(dVarC, a0Var.b(Integer.TYPE))) {
                    mmkv.k(((Integer) obj).intValue(), str2);
                    return;
                }
                if (l.a(dVarC, a0Var.b(Long.TYPE))) {
                    mmkv.l(((Long) obj).longValue(), str2);
                    return;
                }
                if (l.a(dVarC, a0Var.b(Float.TYPE))) {
                    mmkv.m(str2, ((Float) obj).floatValue());
                    return;
                }
                if (l.a(dVarC, a0Var.b(Double.TYPE))) {
                    mmkv.j(((Double) obj).doubleValue(), str2);
                    return;
                }
                if (l.a(dVarC, a0Var.b(Boolean.TYPE))) {
                    mmkv.o(str2, ((Boolean) obj).booleanValue());
                    return;
                } else {
                    if (!l.a(dVarC, a0Var.b(String.class))) {
                        throw new IllegalStateException(("not support type " + vVar).toString());
                    }
                    mmkv.n(str2, (String) obj);
                    return;
                }
        }
    }

    public a(c1 c1Var) {
        this.f9521b = 2;
        this.f9522c = c1Var;
    }
}
