package ya;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f26054c;

    public t(u uVar, int i10) {
        this.f26054c = uVar;
        Object obj = u.f26055j;
        this.f26052a = uVar.i()[i10];
        this.f26053b = i10;
    }

    public final void a() {
        int i10 = this.f26053b;
        Object obj = this.f26052a;
        u uVar = this.f26054c;
        if (i10 != -1 && i10 < uVar.size()) {
            if (ud.n.f(obj, uVar.i()[this.f26053b])) {
                return;
            }
        }
        Object obj2 = u.f26055j;
        this.f26053b = uVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26052a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        u uVar = this.f26054c;
        Map mapB = uVar.b();
        if (mapB != null) {
            return mapB.get(this.f26052a);
        }
        a();
        int i10 = this.f26053b;
        if (i10 == -1) {
            return null;
        }
        return uVar.j()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        u uVar = this.f26054c;
        Map mapB = uVar.b();
        Object obj2 = this.f26052a;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i10 = this.f26053b;
        if (i10 == -1) {
            uVar.put(obj2, obj);
            return null;
        }
        Object obj3 = uVar.j()[i10];
        uVar.j()[this.f26053b] = obj;
        return obj3;
    }
}
