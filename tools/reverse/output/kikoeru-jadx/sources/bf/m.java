package bf;

import b0.c1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f2812a = new k();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        jc.l.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return r.f22819a;
        }
        if (size == 1) {
            return ud.b.w(vb.m.Y(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static j e() {
        return new j(0);
    }

    public static Object f(Collection collection, b bVar, m mVar) {
        c1 c1Var = new c1(4);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g(it.next(), bVar, c1Var, mVar);
        }
        return mVar.j();
    }

    public static void g(Object obj, b bVar, c1 c1Var, m mVar) {
        if (obj != null) {
            if (((HashSet) c1Var.f1208b).add(obj) && mVar.c(obj)) {
                Iterator it = bVar.d(obj).iterator();
                while (it.hasNext()) {
                    g(it.next(), bVar, c1Var, mVar);
                }
                mVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "predicate";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "ifAny";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean h(Collection collection, b bVar, ic.k kVar) {
        return (Boolean) f(collection, bVar, new a(kVar, new boolean[1], 0));
    }

    public static final boolean i(Throwable th2) {
        Class<?> superclass = th2.getClass();
        while (!jc.l.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void k(Object obj) throws Throwable {
        if (obj instanceof l) {
            throw ((l) obj).f2811a;
        }
    }

    public abstract boolean c(Object obj);

    public abstract Object j();

    public void b(Object obj) {
    }
}
