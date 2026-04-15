package h1;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Map.Entry, kc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f7984c;

    public b0(c0 c0Var) {
        this.f7984c = c0Var;
        Map.Entry entry = (Map.Entry) c0Var.f8001d;
        jc.l.b(entry);
        this.f7982a = entry.getKey();
        Map.Entry entry2 = (Map.Entry) c0Var.f8001d;
        jc.l.b(entry2);
        this.f7983b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7982a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7983b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c0 c0Var = this.f7984c;
        if (((v) c0Var.f7999b).d().f8070d != c0Var.f7998a) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f7983b;
        ((v) c0Var.f7999b).put(this.f7982a, obj);
        this.f7983b = obj;
        return obj2;
    }
}
