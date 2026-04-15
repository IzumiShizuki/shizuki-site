package h1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8002e;

    public d0(y1 y1Var, int i10, y1 y1Var2, int[] iArr, String str) {
        this.f7999b = y1Var;
        this.f7998a = i10;
        this.f8000c = y1Var2;
        this.f8001d = (int[]) iArr.clone();
        this.f8002e = str;
    }

    public void a() {
        this.f8001d = (Map.Entry) this.f8002e;
        Iterator it = (Iterator) this.f8000c;
        this.f8002e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public boolean hasNext() {
        return ((Map.Entry) this.f8002e) != null;
    }

    public void remove() {
        v vVar = (v) this.f7999b;
        if (vVar.d().f8070d != this.f7998a) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = (Map.Entry) this.f8001d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        vVar.remove(entry.getKey());
        this.f8001d = null;
        this.f7998a = vVar.d().f8070d;
    }

    public d0(v vVar, Iterator it) {
        this.f7999b = vVar;
        this.f8000c = it;
        this.f7998a = vVar.d().f8070d;
        a();
    }
}
