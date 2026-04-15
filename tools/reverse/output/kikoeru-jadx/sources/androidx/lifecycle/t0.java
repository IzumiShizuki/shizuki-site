package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static t0 f815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final pe.d f816e = new pe.d(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f817c;

    public t0(Application application) {
        super(1);
        this.f817c = application;
    }

    @Override // androidx.lifecycle.l0, androidx.lifecycle.u0
    public final s0 a(Class cls) {
        Application application = this.f817c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.l0, androidx.lifecycle.u0
    public final s0 c(Class cls, i4.e eVar) {
        if (this.f817c != null) {
            return a(cls);
        }
        Application application = (Application) eVar.f9002a.get(f816e);
        if (application != null) {
            return d(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return android.support.v4.media.session.b.C(cls);
    }

    public final s0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return android.support.v4.media.session.b.C(cls);
        }
        try {
            s0 s0Var = (s0) cls.getConstructor(Application.class).newInstance(application);
            jc.l.b(s0Var);
            return s0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }
}
