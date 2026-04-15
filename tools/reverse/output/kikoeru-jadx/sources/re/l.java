package re;

import j2.h0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f19009d = ef.n.V0(l.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f19010e = new b("NO_LOCKS", a.f18991a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19013c;

    public l(String str) {
        this(str, new y1(4, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!stackTrace[i10].getClassName().startsWith(f19009d)) {
                break;
            } else {
                i10++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public final i a(ic.a aVar) {
        return new i(this, aVar);
    }

    public final e b(ic.k kVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 1);
    }

    public final j c(ic.k kVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 0);
    }

    public k5.d d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return h0.n(sb, this.f19013c, ")");
    }

    public l(String str, n nVar) {
        a aVar = a.f18992b;
        this.f19011a = nVar;
        this.f19012b = aVar;
        this.f19013c = str;
    }
}
