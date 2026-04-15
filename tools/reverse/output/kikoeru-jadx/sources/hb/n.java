package hb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f8329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f8331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb.z f8332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb.z f8333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8335h;

    public n(String str, Field field, Method method, eb.z zVar, eb.z zVar2, boolean z10, boolean z11) {
        this.f8331d = method;
        this.f8332e = zVar;
        this.f8333f = zVar2;
        this.f8334g = z10;
        this.f8335h = z11;
        this.f8328a = str;
        this.f8329b = field;
        this.f8330c = field.getName();
    }

    public final void a(mb.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f8331d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new eb.p(q.t0.D("Accessor ", jb.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            objInvoke = this.f8329b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.q(this.f8328a);
        this.f8332e.b(bVar, objInvoke);
    }
}
