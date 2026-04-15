package ce;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3903f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3905b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f3906c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i0 f3908e;

    public c0(int i10) {
        this.f3904a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f3905b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f3905b
            java.lang.Object r2 = r2.get(r1)
            ce.g0 r2 = (ce.g0) r2
            java.lang.Comparable r2 = r2.f3932a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f3905b
            java.lang.Object r3 = r3.get(r2)
            ce.g0 r3 = (ce.g0) r3
            java.lang.Comparable r3 = r3.f3932a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.c0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f3907d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f3906c.isEmpty() ? f0.f3926b : this.f3906c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f3905b.isEmpty()) {
            this.f3905b.clear();
        }
        if (this.f3906c.isEmpty()) {
            return;
        }
        this.f3906c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f3906c.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f3906c.isEmpty() && !(this.f3906c instanceof TreeMap)) {
            this.f3906c = new TreeMap();
        }
        return (SortedMap) this.f3906c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((g0) this.f3905b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f3905b.isEmpty();
        int i10 = this.f3904a;
        if (zIsEmpty && !(this.f3905b instanceof ArrayList)) {
            this.f3905b = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return d().put(comparable, obj);
        }
        if (this.f3905b.size() == i10) {
            g0 g0Var = (g0) this.f3905b.remove(i10 - 1);
            d().put(g0Var.f3932a, g0Var.f3933b);
        }
        this.f3905b.add(i11, new g0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f3908e == null) {
            this.f3908e = new i0(this, 0);
        }
        return this.f3908e;
    }

    public final Object f(int i10) {
        b();
        Object obj = ((g0) this.f3905b.remove(i10)).f3933b;
        if (!this.f3906c.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f3905b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g0) this.f3905b.get(iA)).f3933b : this.f3906c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f3906c.isEmpty()) {
            return null;
        }
        return this.f3906c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3906c.size() + this.f3905b.size();
    }
}
