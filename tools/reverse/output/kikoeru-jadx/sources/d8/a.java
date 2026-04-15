package d8;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import ce.j0;
import com.cnl.kikoeru.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f5543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f5544e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5547c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f5546b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5545a = new HashMap();

    public a(Context context) {
        this.f5547c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f5543d == null) {
            synchronized (f5544e) {
                try {
                    if (f5543d == null) {
                        f5543d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f5543d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f5547c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f5546b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new j0(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f5545a;
        if (a.a.H()) {
            try {
                a.a.t(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f5547c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th3) {
                throw new j0(th3);
            }
        }
        Trace.endSection();
        return objB;
    }
}
